package nq5;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class})
/* loaded from: classes12.dex */
public class e extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        oq5.i iVar = oq5.i.f428948c;
        iVar.getClass();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96().getClass() != com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StartupLogcatCatcher", "impl is not xlog!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartupLogcatCatcher", "Log.consoleLogOpen:" + com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39993xc6c32446);
            if (!com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39993xc6c32446.booleanValue()) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_logcat_startup_v2, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartupLogcatCatcher", "is need work :" + Ni);
                if (Ni != 0) {
                    ((ku5.t0) ku5.t0.f394148d).h(iVar.f428950b, "LogcatCatcher");
                }
            }
        }
        oq5.f fVar = oq5.f.f428939g;
        fVar.getClass();
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96().getClass() != com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LogcatCatcher", "impl is not xlog!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LogcatCatcher", "Log.consoleLogOpen:" + com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39993xc6c32446);
        if (com.p314xaae8f345.mm.p2828x382fcc.app.C22986x72b79e11.f39993xc6c32446.booleanValue()) {
            return;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_logcat, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LogcatCatcher", "work clicfg_logcat:%d", java.lang.Integer.valueOf(Ni2));
        if (Ni2 != 1 || o45.wf.f424567l) {
            return;
        }
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_logcat_alpha, 0);
        if (!o45.wf.f424566k && Ni3 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LogcatCatcher", "id alpha false");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LogcatCatcher", "is need work :" + Ni2);
        if (Ni2 == 0) {
            return;
        }
        android.os.HandlerThread handlerThread = fVar.f428944e;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        fVar.f428945f = handler;
        handler.post(new oq5.e(fVar));
    }
}
