package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final o72.r2 f182430a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.gp0 f182431b;

    public b1(o72.r2 r2Var, r45.gp0 gp0Var) {
        this.f182430a = r2Var;
        this.f182431b = gp0Var;
    }

    public java.lang.String a() {
        boolean b17 = b();
        r45.gp0 gp0Var = this.f182431b;
        if (b17) {
            return gp0Var.G;
        }
        if (d() || c()) {
            return o72.x1.X(gp0Var);
        }
        java.lang.String x17 = o72.x1.x(gp0Var);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(x17);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return m17.a() ? m17.f294799a.F(m17.f294800b) : false ? x17 : o72.x1.X(gp0Var);
    }

    public boolean b() {
        r45.hp0 hp0Var;
        r45.gp0 gp0Var = this.f182431b;
        return (gp0Var.I != 4 || (hp0Var = gp0Var.J1) == null || hp0Var.f457903x == null) ? false : true;
    }

    public boolean c() {
        return this.f182431b.I == 15;
    }

    public boolean d() {
        return this.f182431b.I == 4;
    }
}
