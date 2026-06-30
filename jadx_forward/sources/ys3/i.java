package ys3;

@j95.b
/* loaded from: classes9.dex */
public class i extends jm0.o implements zs3.q {

    /* renamed from: m, reason: collision with root package name */
    public zs3.w f546741m;

    /* renamed from: n, reason: collision with root package name */
    public zs3.u f546742n;

    /* renamed from: o, reason: collision with root package name */
    public bt3.t2 f546743o = null;

    /* renamed from: p, reason: collision with root package name */
    public bt3.p1 f546744p = null;

    public static void Zi() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("record/");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(sb6.toString());
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.J();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb7.append(gm0.j1.u().d());
        sb7.append("record/record2/");
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(sb7.toString());
        if (r6Var2.m() && r6Var2.y()) {
            return;
        }
        r6Var2.J();
    }

    @Override // jm0.o
    public void Di(java.util.HashSet hashSet) {
        hashSet.add(bt3.h1.class);
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        Zi();
        cj().f(null, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginRecord", "onAccountInitialized start recordMsgSendService");
    }

    @Override // jm0.o
    public void Vi() {
        bt3.t2 t2Var = this.f546743o;
        if (t2Var != null) {
            t2Var.f105949h.clear();
            t2Var.f105948g.clear();
            t2Var.f105945d = false;
            gm0.j1.n().f354821b.q(632, t2Var);
            gm0.j1.n().f354821b.q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, t2Var);
        }
        bt3.p1 p1Var = this.f546744p;
        if (p1Var != null) {
            p1Var.f105841e.clear();
            p1Var.f105840d.clear();
            p1Var.f105837a = false;
        }
    }

    public zs3.r aj() {
        gm0.j1.b().c();
        if (this.f546744p == null) {
            this.f546744p = new bt3.p1();
        }
        return this.f546744p;
    }

    public zs3.u bj() {
        if (this.f546742n == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f546742n == null) {
                    this.f546742n = new bt3.t1(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f546742n;
    }

    public bt3.t2 cj() {
        gm0.j1.b().c();
        if (this.f546743o == null) {
            this.f546743o = new bt3.t2();
        }
        return this.f546743o;
    }

    public zs3.w fj() {
        if (this.f546741m == null && gm0.j1.a()) {
            synchronized (this) {
                if (this.f546741m == null) {
                    this.f546741m = new bt3.c2(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f546741m;
    }
}
