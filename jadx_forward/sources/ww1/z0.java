package ww1;

/* loaded from: classes15.dex */
public class z0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f531902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f531903b;

    public z0(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f531903b = l1Var;
        this.f531902a = k1Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "no need to play money this time");
        ww1.l1 l1Var = this.f531903b;
        ww1.l1.b(l1Var);
        l1Var.f531769g = false;
        l1Var.f531766d = null;
        boolean z17 = tw1.f.Di().f503984d;
        ww1.k1 k1Var = this.f531902a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14404, 4, k1Var.f531757c, "", "", java.lang.Integer.valueOf(k1Var.f531756b));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14404, 4, k1Var.f531757c, "", "", java.lang.Integer.valueOf(k1Var.f531756b));
        }
        if (l1Var.f531768f.isEmpty()) {
            ww1.l1.i();
        } else {
            l1Var.u();
        }
    }
}
