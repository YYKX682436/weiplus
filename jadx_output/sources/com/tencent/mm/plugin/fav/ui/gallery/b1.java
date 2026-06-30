package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final o72.r2 f100897a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.gp0 f100898b;

    public b1(o72.r2 r2Var, r45.gp0 gp0Var) {
        this.f100897a = r2Var;
        this.f100898b = gp0Var;
    }

    public java.lang.String a() {
        boolean b17 = b();
        r45.gp0 gp0Var = this.f100898b;
        if (b17) {
            return gp0Var.G;
        }
        if (d() || c()) {
            return o72.x1.X(gp0Var);
        }
        java.lang.String x17 = o72.x1.x(gp0Var);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(x17);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return m17.a() ? m17.f213266a.F(m17.f213267b) : false ? x17 : o72.x1.X(gp0Var);
    }

    public boolean b() {
        r45.hp0 hp0Var;
        r45.gp0 gp0Var = this.f100898b;
        return (gp0Var.I != 4 || (hp0Var = gp0Var.J1) == null || hp0Var.f376370x == null) ? false : true;
    }

    public boolean c() {
        return this.f100898b.I == 15;
    }

    public boolean d() {
        return this.f100898b.I == 4;
    }
}
