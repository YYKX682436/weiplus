package sc3;

/* loaded from: classes7.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(sc3.k1 k1Var) {
        super(1);
        this.f488055d = k1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List mainScripts = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScripts, "mainScripts");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f488055d.Q, "hy: on main scripts provided from parallel setup!");
        oc3.a N0 = this.f488055d.N0();
        sc3.k1 k1Var = this.f488055d;
        if (((java.lang.Boolean) ((jz5.n) k1Var.F).mo141623x754a37bb()).booleanValue()) {
            for (java.lang.String str : N0.f425861b.keySet()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "hy: preloading public service " + str);
                k1Var.f488010f.f(str, true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "hy: not preload public service, just load");
        }
        sc3.k1 k1Var2 = this.f488055d;
        synchronized (k1Var2) {
            yz5.l lVar = k1Var2.C;
            if (lVar != null) {
                lVar.mo146xb9724478(mainScripts);
            } else {
                k1Var2.B = mainScripts;
            }
        }
        return jz5.f0.f384359a;
    }
}
