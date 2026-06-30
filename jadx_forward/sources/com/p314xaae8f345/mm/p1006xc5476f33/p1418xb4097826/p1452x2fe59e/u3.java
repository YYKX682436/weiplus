package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class u3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f190666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190667b;

    public u3(so2.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f190666a = y0Var;
        this.f190667b = a7Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DrawerPresenter", "loadMoreLevel2Comments resp null");
            return new jz5.l(-2, p0Var);
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0 || fVar.f152151d == null) {
            return fVar.f152149b == -4032 ? new jz5.l(-1, p0Var) : new jz5.l(0, p0Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments after lastBuffer ");
        so2.y0 y0Var = this.f190666a;
        if (y0Var.f492236d.u0().m76078x44e5026c() == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m76078x44e5026c = y0Var.f492236d.u0().m76078x44e5026c();
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m76078x44e5026c != null ? m76078x44e5026c.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb6.toString());
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m75941xfb821914 = ((r45.j51) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCommentInfo(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190667b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
            if (c14994x9b99c079 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = a7Var.f187745i;
            if (c14994x9b99c0792 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            java.lang.String m59229xb5af1dd5 = c14994x9b99c0792.m59229xb5af1dd5();
            long mo2128x1ed62e84 = y0Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
            yj0Var.f68959xf9a02e3e = m59251x5db1b11;
            yj0Var.f68957xec748fc6 = m59229xb5af1dd5;
            yj0Var.f68965x29d3a50c = 2;
            yj0Var.f68953x27838069.set(1, c19781xd1c47b87);
            yj0Var.n1(mo2128x1ed62e84);
            arrayList.add(new so2.y0(yj0Var));
        }
        return new jz5.l(0, arrayList);
    }
}
