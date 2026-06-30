package ln0;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f401201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f401202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401203f;

    public o(ln0.p pVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        this.f401201d = pVar;
        this.f401202e = h0Var;
        this.f401203f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ((java.lang.String) this.f401202e.f391656d) + this.f401203f;
        ln0.p pVar = this.f401201d;
        pVar.getClass();
        com.p314xaae8f345.mm.p971x6de15a2e.h2 h2Var = null;
        try {
            h2Var = com.p314xaae8f345.mm.p971x6de15a2e.n.d(str + "&token=" + pVar.f401206b, null);
            h2Var.g(10000);
            h2Var.k(10000);
            h2Var.a();
            int f17 = h2Var.f();
            if (f17 == 200) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update video cache: " + f17 + " url: " + str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update video cache error, statusCode: " + f17 + " url: " + str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMXp2pWrapper", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update video cache error " + str);
        }
        if (h2Var != null) {
            h2Var.mo48348x1f9d589c();
        }
    }
}
