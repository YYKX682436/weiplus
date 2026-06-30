package com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.p1318x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/cast/service/ScreenCastForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-cast_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.cast.service.ScreenCastForegroundService */
/* loaded from: classes13.dex */
public final class ServiceC13083xe7c89147 extends android.app.Service {
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
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a.class);
            intent.setFlags(603979776);
            java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibe);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            z2.y1.a(this, 47, bv1.c.a(intent, string, "", ""), android.os.Build.VERSION.SDK_INT >= 29 ? 32 : 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastForegroundService", "Service onDestroy");
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastForegroundService", "Service onStartCommand() is called");
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastForegroundService", "error called foreground service in startNotification process");
            stopSelf();
            return 2;
        }
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastForegroundService", "error called screen cast foreground service in setNotification process");
            stopSelf();
            return 2;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a.class);
        intent2.setFlags(603979776);
        java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).n(47, bv1.c.a(intent2, string, "", ""), false);
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f421703e;
        if (oVar != null) {
            oVar.f503647e = (android.content.Intent) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        }
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar2 = nu1.n.f421703e;
        if (oVar2 != null) {
            oVar2.f503646d = intent.getIntExtra("code", -1);
        }
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar3 = nu1.n.f421703e;
        if (oVar3 != null) {
            try {
                pu1.b bVar = oVar3.f503643a;
                if (bVar != null) {
                    oVar3.a(this, bVar);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markStartScreenCastReport");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 7L, 1L);
                ((ku5.t0) ku5.t0.f394148d).B(tu1.m.f503641d);
                oVar3.f503653k = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ScreenCastManager", "start foregound service failed cause " + e17 + " and stack is %s", e17.getStackTrace());
                yz5.l lVar = oVar3.f503661s;
                if (lVar != null) {
                    lVar.mo146xb9724478(xu1.c.f538728i);
                }
            }
        }
        return 2;
    }
}
