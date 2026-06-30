package jh;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jh.s f381273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jh.t f381274e;

    public q(jh.t tVar, jh.s sVar) {
        this.f381274e = tVar;
        this.f381273d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jh.t tVar = this.f381274e;
        jh.s sVar = this.f381273d;
        int ordinal = tVar.f381290h.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            int ordinal2 = sVar.ordinal();
            android.os.Handler handler = tVar.f381288f;
            long j17 = tVar.f381291i;
            if (ordinal2 == 0) {
                oj.j.c("Matrix.WarmUpScheduler", "Schedule warm-up in %ss", java.lang.Long.valueOf(j17 / 1000));
                handler.sendMessageDelayed(android.os.Message.obtain(handler, 1, new android.os.CancellationSignal()), j17);
                return;
            } else if (ordinal2 == 1) {
                oj.j.c("Matrix.WarmUpScheduler", "Schedule clean-up in %ss", java.lang.Long.valueOf(j17 / 1000));
                handler.sendMessageDelayed(android.os.Message.obtain(handler, 3, new android.os.CancellationSignal()), j17);
                return;
            } else {
                if (ordinal2 != 2) {
                    return;
                }
                oj.j.c("Matrix.WarmUpScheduler", "Schedule request consuming in %ss", java.lang.Long.valueOf(j17 / 1000));
                handler.sendMessageDelayed(android.os.Message.obtain(handler, 2, new android.os.CancellationSignal()), j17);
                return;
            }
        }
        android.content.Context context = tVar.f381289g;
        synchronized (tVar) {
            jh.r rVar = tVar.f381286d;
            if (rVar != null) {
                synchronized (rVar) {
                    if (!((java.util.HashSet) rVar.f381280f).contains(sVar)) {
                        ((java.util.HashSet) rVar.f381280f).add(sVar);
                    }
                }
                return;
            }
            jh.r rVar2 = new jh.r(context, tVar.f381288f, tVar.f381290h, tVar.f381291i);
            tVar.f381286d = rVar2;
            synchronized (rVar2) {
                if (!((java.util.HashSet) rVar2.f381280f).contains(sVar)) {
                    ((java.util.HashSet) rVar2.f381280f).add(sVar);
                }
            }
            oj.j.c("Matrix.WarmUpScheduler", "Register idle receiver.", new java.lang.Object[0]);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                context.registerReceiver(tVar.f381286d, intentFilter);
            } else {
                context.registerReceiver(tVar.f381286d, intentFilter, 4);
            }
            tVar.f381286d.a(context);
            return;
        }
    }
}
