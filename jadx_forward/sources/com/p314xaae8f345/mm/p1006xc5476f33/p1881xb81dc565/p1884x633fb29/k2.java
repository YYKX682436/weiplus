package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c0 f231561a;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f231563c;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.ArrayMap f231562b = new android.util.ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f231564d = kz5.c1.k(new jz5.l(100, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.g2(this)), new jz5.l(101, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.i2(this)), new jz5.l(102, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h2(this)), new jz5.l(104, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j2(this)));

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 k2Var, java.lang.String wxUserName) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c0 c0Var = k2Var.f231561a;
        if (c0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a) c0Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
            if (n17 != null) {
                n17.j(wxUserName);
            }
            aVar.f231406a.l(wxUserName, 3);
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 k2Var, java.lang.String wxUserName) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c0 c0Var = k2Var.f231561a;
        if (c0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a) c0Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
            if (n17 != null) {
                n17.k();
            }
            aVar.f231406a.l(wxUserName, 0);
        }
    }

    public final int c(java.lang.String wxUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        java.lang.Integer num = (java.lang.Integer) this.f231562b.get(wxUserName);
        if (num == null) {
            return 100;
        }
        return num.intValue();
    }

    public final void d(java.lang.String wxUserName) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c0 c0Var = this.f231561a;
        if (c0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a) c0Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
            if (n17 != null) {
                n17.j(wxUserName);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = aVar.f231406a;
            jVar.l(wxUserName, 3);
            sj3.j jVar2 = jVar.f231541h;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((jVar2 == null || (c16587x33e31ed = jVar2.f490110d) == null) ? null : c16587x33e31ed.getF231877m(), wxUserName)) {
                jVar.l(wxUserName, 4);
            }
        }
    }
}
