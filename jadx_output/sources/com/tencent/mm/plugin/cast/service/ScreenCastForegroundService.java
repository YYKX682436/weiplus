package com.tencent.mm.plugin.cast.service;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/cast/service/ScreenCastForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-cast_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ScreenCastForegroundService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (!gm0.j1.b().m()) {
            stopSelf();
            return;
        }
        if (fp.h.c(26)) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.cast.ui.ScreenCastActivity.class);
            intent.setFlags(603979776);
            java.lang.String string = getResources().getString(com.tencent.mm.R.string.ibe);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            z2.y1.a(this, 47, bv1.c.a(intent, string, "", ""), android.os.Build.VERSION.SDK_INT >= 29 ? 32 : 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastForegroundService", "Service onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastForegroundService", "Service onStartCommand() is called");
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastForegroundService", "error called foreground service in startNotification process");
            stopSelf();
            return 2;
        }
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastForegroundService", "error called screen cast foreground service in setNotification process");
            stopSelf();
            return 2;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.cast.ui.ScreenCastActivity.class);
        intent2.setFlags(603979776);
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.ibe);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(47, bv1.c.a(intent2, string, "", ""), false);
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f340170e;
        if (oVar != null) {
            oVar.f422114e = (android.content.Intent) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        }
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar2 = nu1.n.f340170e;
        if (oVar2 != null) {
            oVar2.f422113d = intent.getIntExtra("code", -1);
        }
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar3 = nu1.n.f340170e;
        if (oVar3 != null) {
            try {
                pu1.b bVar = oVar3.f422110a;
                if (bVar != null) {
                    oVar3.a(this, bVar);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markStartScreenCastReport");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 7L, 1L);
                ((ku5.t0) ku5.t0.f312615d).B(tu1.m.f422108d);
                oVar3.f422120k = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ScreenCastManager", "start foregound service failed cause " + e17 + " and stack is %s", e17.getStackTrace());
                yz5.l lVar = oVar3.f422128s;
                if (lVar != null) {
                    lVar.invoke(xu1.c.f457195i);
                }
            }
        }
        return 2;
    }
}
