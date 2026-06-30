package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p827xe72625ab;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/live/core/core/trtc/screencast/LiveScreenCastForegroundService;", "Landroid/app/Service;", "<init>", "()V", "un0/c", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService */
/* loaded from: classes13.dex */
public final class ServiceC10832x7101a4bb extends android.app.Service {

    /* renamed from: g, reason: collision with root package name */
    public static final un0.c f150093g = new un0.c(null);

    /* renamed from: d, reason: collision with root package name */
    public un0.h f150094d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f150095e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f150096f = new un0.d(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundService", "#onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        yz5.l lVar;
        java.util.List list;
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundService", "#onDestroy");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f150095e;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        un0.h hVar = this.f150094d;
        if (hVar != null && (list = hVar.f510896l) != null) {
            list.remove(this.f150096f);
        }
        un0.h hVar2 = this.f150094d;
        if (hVar2 == null || (lVar = hVar2.f510898n) == null) {
            return;
        }
        lVar.mo146xb9724478("LiveScreenCastForegroundService-onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        java.lang.Class<com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f> cls;
        android.app.Notification b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        int intExtra = intent.getIntExtra("START_SERVICE_FROM_KEY", 0);
        int intExtra2 = intent.getIntExtra("NOTICE_LAUNCH_KEY", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundService", "#onStartCommand Service onStartCommand() startFrom=" + intExtra + " launchTo=" + intExtra2);
        if (intExtra2 == 1) {
            jz2.x0 x0Var = jz2.x0.f384287a;
            cls = (java.lang.Class) ((jz5.n) jz2.x0.f384291e).mo141623x754a37bb();
        } else if (intExtra2 != 2) {
            cls = com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.class;
        } else {
            jz2.x0 x0Var2 = jz2.x0.f384287a;
            cls = (java.lang.Class) ((jz5.n) jz2.x0.f384292f).mo141623x754a37bb();
        }
        android.content.Intent intent2 = new android.content.Intent(this, cls);
        intent2.setFlags(603979776);
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 47, intent2, 201326592);
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.e(string2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(string);
        k0Var.f550996g = activity;
        notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        k0Var.h(2, true);
        if (fp.h.a(16)) {
            b17 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        } else {
            b17 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            startForeground(47, b17, 32);
        } else {
            startForeground(47, b17);
        }
        if (intExtra != 1) {
            return 2;
        }
        if (in0.q.f374302b2 == null) {
            in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
        }
        in0.q qVar = in0.q.f374302b2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        un0.h hVar = qVar.G1;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundService", "#onStartCommand communication is null");
            return 2;
        }
        this.f150095e = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new un0.e(hVar, this, null), 3, null);
        return 2;
    }
}
