package ww1;

/* loaded from: classes15.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f531703a;

    public d1(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f531703a = k1Var;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(1143L, 41L, 1L, false);
        boolean z17 = tw1.f.Di().f503984d;
        ww1.k1 k1Var = this.f531703a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play isForground");
            if (k1Var.f531758d) {
                g0Var.d(14404, 1, k1Var.f531757c, "", "", java.lang.Integer.valueOf(k1Var.f531756b), "", "", "", com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().e());
                return;
            } else {
                g0Var.d(14404, 1, k1Var.f531757c, "", "", java.lang.Integer.valueOf(k1Var.f531756b));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play isBackground");
        if (k1Var.f531758d) {
            g0Var.d(14404, 2, k1Var.f531757c, "", "", java.lang.Integer.valueOf(k1Var.f531756b), "", "", "", com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1332x633fb29.p1333x6b2e132.m.d().e());
        } else {
            g0Var.d(14404, 2, k1Var.f531757c, "", "", java.lang.Integer.valueOf(k1Var.f531756b));
        }
    }
}
