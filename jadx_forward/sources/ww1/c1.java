package ww1;

/* loaded from: classes15.dex */
public class c1 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f531696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f531697b;

    public c1(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f531697b = l1Var;
        this.f531696a = k1Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.F2fRcvVoiceListener", "play money error: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ww1.l1 l1Var = this.f531697b;
        l1Var.f531769g = false;
        l1Var.f531767e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        ww1.k1 k1Var = this.f531696a;
        g0Var.d(14404, 3, k1Var.f531757c, 7, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k1Var.f531756b));
        ww1.l1.b(l1Var);
        if (l1Var.f531768f.isEmpty()) {
            ww1.l1.i();
        } else {
            l1Var.u();
        }
        return false;
    }
}
