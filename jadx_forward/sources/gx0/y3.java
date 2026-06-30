package gx0;

/* loaded from: classes5.dex */
public final class y3 extends jv0.g {
    public final gx0.g3 A;
    public final gx0.j3 B;
    public final gx0.u3 C;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f358726t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f358727u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358728v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f358729w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f358730x;

    /* renamed from: y, reason: collision with root package name */
    public final gx0.l3 f358731y;

    /* renamed from: z, reason: collision with root package name */
    public final gx0.w3 f358732z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358726t = jz5.h.b(new gx0.x2(this));
        this.f358727u = jz5.h.b(new gx0.k3(this));
        this.f358729w = jz5.h.b(new gx0.x3(this));
        this.f358730x = jz5.h.b(new gx0.m3(this));
        this.f358731y = new gx0.l3(this);
        this.f358732z = new gx0.w3(this);
        this.A = new gx0.g3(this);
        this.B = new gx0.j3(this);
        this.C = new gx0.u3(this);
    }

    public final ex0.a0 A7() {
        return ((gx0.kh) ((jz5.n) this.f358729w).mo141623x754a37bb()).f358175r;
    }

    public final void B7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        ex0.r K;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = this.f358728v;
        boolean z17 = false;
        if (c4128x879fba0a2 != null && c4128x879fba0a2.m33975x22a7969a(c4128x879fba0a)) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f358728v = c4128x879fba0a;
        java.util.List<com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78> list = (java.util.List) ((java.util.LinkedHashMap) this.f383723s).get(java.lang.Long.valueOf(c4128x879fba0a.m33976x194898be()));
        if (list != null) {
            java.util.ArrayList<com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713> arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 : list) {
                ex0.a0 A7 = A7();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = (A7 == null || (K = A7.K(c3971x241f78)) == null) ? null : K.f338700a;
                if (c4190xd8dd3713 != null) {
                    arrayList.add(c4190xd8dd3713);
                }
            }
            y7().w7();
            gx0.x4 y76 = y7();
            y76.getClass();
            com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f c4050x944e439f = new com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(1.0f, 0.7607843f, 0.14509805f, 1.0f), j65.q.a(y76.m80379x76847179()).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.afy), new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(0.0f, 0.0f, 0.0f, 0.1f), 0.0f, new com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4049xc286580e(new float[]{3.0f, 3.0f}, 0.0f));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd37132 : arrayList) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 b17 = cv0.h.b(c4190xd8dd37132, y76.m80379x76847179());
                java.lang.String m32425x6ac9171 = c4190xd8dd37132.f130065a.m32425x6ac9171();
                kz5.p0 p0Var = kz5.p0.f395529d;
                ug.m C = c4190xd8dd37132.C();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
                arrayList2.add(new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4140x124a1dfd(m32425x6ac9171, p0Var, y76.Z6(av0.a.a(C)), b17, c4050x944e439f));
            }
            y76.q7(arrayList2);
        }
    }

    @Override // jv0.g
    public java.util.List k7() {
        ex0.a0 A7 = A7();
        if (A7 != null) {
            return A7.f338630g.f338711f;
        }
        return null;
    }

    @Override // jv0.g
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l7(ex0.f vm6, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 captionItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vm6, "vm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
        ex0.a0 A7 = A7();
        if (A7 == null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
            return ZeroTime;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = vm6.k();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = vm6.l().m34007xde00a612();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = A7.f338625b.b(captionItem.m34367xdd1fba().m34007xde00a612().add(k17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "alignTimeToVideoFrameBoundaryForward(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a a17 = ou0.f.a(b17, k17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34007xde00a612);
        return ou0.f.b(a17, m34007xde00a612);
    }

    @Override // jv0.g
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m7(ex0.f vm6, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 captionItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vm6, "vm");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captionItem, "captionItem");
        ex0.a0 A7 = A7();
        if (A7 == null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
            return ZeroTime;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = vm6.k();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = vm6.l().m34007xde00a612();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = A7.f338625b.b(captionItem.m34367xdd1fba().m34009x8082fb99().add(k17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "alignTimeToVideoFrameBoundaryForward(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a a17 = ou0.f.a(b17, k17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34007xde00a612);
        return ou0.f.b(a17, m34007xde00a612);
    }

    @Override // jv0.g
    public ex0.f n7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        ex0.a0 A7 = A7();
        if (A7 == null) {
            return null;
        }
        ex0.r K = A7.K(c3971x241f78);
        if (K instanceof ex0.f) {
            return (ex0.f) K;
        }
        return null;
    }

    @Override // jv0.g
    public void p7() {
        ex0.f fVar;
        ex0.a0 A7 = A7();
        if (A7 == null || (fVar = this.f383721q) == null) {
            return;
        }
        ex0.r n17 = A7.n();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17 != null ? n17.f338701b : null, fVar.f338701b)) {
            ex0.i0.k(A7, fVar);
        }
        if (A7.r() != ax0.e.f96513i) {
            ex0.i0.m(A7);
            ex0.i0.k(A7, fVar);
        }
    }

    @Override // jv0.g
    public void q7() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        ex0.a0 A7 = A7();
        if (A7 != null) {
            ex0.i0.m(A7);
        }
        ex0.a0 A72 = A7();
        if (A72 != null) {
            A72.H();
        }
        ex0.a0 A73 = A7();
        if (A73 != null && (j0Var2 = A73.f338648y) != null) {
            j0Var2.mo7806x9d92d11c(W6(), new gx0.y2(this));
        }
        ex0.a0 A74 = A7();
        if (A74 != null && (j0Var = A74.A) != null) {
            j0Var.mo7806x9d92d11c(W6(), new gx0.z2(this));
        }
        ((gx0.gf) ((jz5.n) this.f358730x).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new gx0.a3(this));
    }

    @Override // jv0.g
    public void r7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 destSegmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destSegmentID, "destSegmentID");
        A7();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ex0.a0 A7 = A7();
        if (A7 == null) {
            return;
        }
        o7().post(new gx0.b3(this, A7, destSegmentID));
    }

    @Override // jv0.g
    public void s7() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.d3(this, null), 3, null);
    }

    @Override // jv0.g
    public void w7() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.p3(this, null), 3, null);
    }

    @Override // jv0.g
    public void x7() {
        gx0.kh khVar = (gx0.kh) ((jz5.n) this.f358729w).mo141623x754a37bb();
        java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        khVar.r7(string, null);
    }

    public final gx0.x4 y7() {
        return (gx0.x4) ((jz5.n) this.f358726t).mo141623x754a37bb();
    }

    public final gx0.bf z7() {
        return (gx0.bf) ((jz5.n) this.f358727u).mo141623x754a37bb();
    }
}
