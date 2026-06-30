package com.tencent.mm.live.core.core.trtc.screencast;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/live/core/core/trtc/screencast/LiveScreenCastForegroundService;", "Landroid/app/Service;", "<init>", "()V", "un0/c", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class LiveScreenCastForegroundService extends android.app.Service {

    /* renamed from: g, reason: collision with root package name */
    public static final un0.c f68560g = new un0.c(null);

    /* renamed from: d, reason: collision with root package name */
    public un0.h f68561d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f68562e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f68563f = new un0.d(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundService", "#onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        yz5.l lVar;
        java.util.List list;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundService", "#onDestroy");
        kotlinx.coroutines.r2 r2Var = this.f68562e;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        un0.h hVar = this.f68561d;
        if (hVar != null && (list = hVar.f429363l) != null) {
            list.remove(this.f68563f);
        }
        un0.h hVar2 = this.f68561d;
        if (hVar2 == null || (lVar = hVar2.f429365n) == null) {
            return;
        }
        lVar.invoke("LiveScreenCastForegroundService-onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        java.lang.Class<com.tencent.mm.ui.MMFragmentActivity> cls;
        android.app.Notification b17;
        kotlin.jvm.internal.o.g(intent, "intent");
        int intExtra = intent.getIntExtra("START_SERVICE_FROM_KEY", 0);
        int intExtra2 = intent.getIntExtra("NOTICE_LAUNCH_KEY", 0);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundService", "#onStartCommand Service onStartCommand() startFrom=" + intExtra + " launchTo=" + intExtra2);
        if (intExtra2 == 1) {
            jz2.x0 x0Var = jz2.x0.f302754a;
            cls = (java.lang.Class) ((jz5.n) jz2.x0.f302758e).getValue();
        } else if (intExtra2 != 2) {
            cls = com.tencent.mm.ui.MMFragmentActivity.class;
        } else {
            jz2.x0 x0Var2 = jz2.x0.f302754a;
            cls = (java.lang.Class) ((jz5.n) jz2.x0.f302759f).getValue();
        }
        android.content.Intent intent2 = new android.content.Intent(this, cls);
        intent2.setFlags(603979776);
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.mtb);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getResources().getString(com.tencent.mm.R.string.mtc);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 47, intent2, 201326592);
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.e(string2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(string);
        k0Var.f469463g = activity;
        notification.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.h(2, true);
        if (fp.h.a(16)) {
            b17 = k0Var.b();
            kotlin.jvm.internal.o.f(b17, "build(...)");
        } else {
            b17 = k0Var.b();
            kotlin.jvm.internal.o.f(b17, "build(...)");
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            startForeground(47, b17, 32);
        } else {
            startForeground(47, b17);
        }
        if (intExtra != 1) {
            return 2;
        }
        if (in0.q.f292769b2 == null) {
            in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
        }
        in0.q qVar = in0.q.f292769b2;
        kotlin.jvm.internal.o.d(qVar);
        un0.h hVar = qVar.G1;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundService", "#onStartCommand communication is null");
            return 2;
        }
        this.f68562e = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new un0.e(hVar, this, null), 3, null);
        return 2;
    }
}
