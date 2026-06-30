package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class l7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f274373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274374f;

    public l7(android.content.Context context, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f274372d = context;
        this.f274373e = weakReference;
        this.f274374f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        final android.content.Context context = this.f274372d;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = ((p012xc85e97e9.p093xedfae76a.y) context).mo273xed6858b4();
        final java.lang.ref.WeakReference weakReference = this.f274373e;
        final java.lang.String str = this.f274374f;
        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.sdk.platformtools.ScreenShotUtil$register$runnable$1$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274393e;
                copyOnWriteArrayList.remove(weakReference);
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                java.lang.String str3 = str;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str2)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.e7 e7Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274392d;
                    if (e7Var != null) {
                        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.p) e7Var).a(str3, false);
                    }
                } else if (copyOnWriteArrayList.isEmpty()) {
                    r26.t tVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274389a;
                    try {
                        context.getContentResolver().unregisterContentObserver(com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.f274396h);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenShotUtil", th6, "unregisterContentObserver failed", new java.lang.Object[0]);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "unregisterContentObserver");
                }
                owner.mo273xed6858b4().c(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "removeLifecycleObserver, owner: " + owner);
            }
        });
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", "addLifecycleObserver, owner: " + context);
    }
}
