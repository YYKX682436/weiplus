package nr2;

/* loaded from: classes2.dex */
public final class j0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public final yz5.a A;
    public final android.view.ViewOutlineProvider B;
    public final v92.g C;
    public final nr2.i0 D;

    /* renamed from: d, reason: collision with root package name */
    public nr2.m f420753d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f420754e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f420755f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f420756g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f420757h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f420758i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f420759m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f420760n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f420761o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f420762p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f420763q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f420764r;

    /* renamed from: s, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f420765s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f420766t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f420767u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f420768v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f420769w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f420770x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f420771y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f420772z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.A = new nr2.c0(this);
        this.B = new nr2.u();
        this.C = new nr2.t(this, m158354x19263085());
        this.D = new nr2.i0(this, m158354x19263085());
    }

    public static final java.util.Map O6(nr2.j0 j0Var) {
        android.app.Activity context = j0Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        int intExtra = j0Var.m158359x1e885992().getIntExtra("collection_ref_comment_scene", 0);
        if (V6 == null) {
            return null;
        }
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2));
        lVarArr[1] = new jz5.l("finder_context_id", V6.m75945x2fec8307(1));
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        lVarArr[3] = new jz5.l("ref_commentscene", java.lang.Integer.valueOf(intExtra));
        nr2.m mVar = j0Var.f420753d;
        lVarArr[4] = new jz5.l("collection_id", pm0.v.u(mVar != null ? mVar.l() : 0L));
        return kz5.c1.k(lVarArr);
    }

    public static final r45.ev2 P6(nr2.j0 j0Var) {
        nr2.m mVar = j0Var.f420753d;
        if (mVar == null) {
            return null;
        }
        int i17 = 0;
        int intExtra = j0Var.m158359x1e885992().getIntExtra("collection_ref_comment_scene", 0);
        r45.ev2 ev2Var = new r45.ev2();
        ev2Var.set(0, java.lang.Long.valueOf(mVar.l()));
        ev2Var.set(1, mVar.k());
        ev2Var.set(2, mVar.e());
        ev2Var.set(3, mVar.c());
        ev2Var.set(4, java.lang.Integer.valueOf(mVar.f()));
        ev2Var.set(6, java.lang.Integer.valueOf(mVar.n()));
        ev2Var.set(7, java.lang.Integer.valueOf(mVar.i()));
        ev2Var.set(8, mVar.o());
        if (intExtra >= 0) {
            i17 = intExtra;
        } else {
            android.app.Activity m80379x76847179 = j0Var.m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m80379x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m80379x76847179 : null;
            if (abstractActivityC15087xee12defa != null) {
                i17 = abstractActivityC15087xee12defa.getD();
            }
        }
        ev2Var.set(13, java.lang.Integer.valueOf(i17));
        return ev2Var;
    }

    public final v92.g Q6() {
        r45.do2 do2Var;
        ya2.g gVar = ya2.h.f542017a;
        nr2.m mVar = this.f420753d;
        ya2.b2 b2Var = null;
        ya2.b2 b17 = gVar.b(mVar != null ? mVar.o() : null);
        boolean z17 = true;
        if (b17 == null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f420772z;
            if (c19782x23db1cfa != null) {
                java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
                if (m76197x6c03c64c == null) {
                    m76197x6c03c64c = "";
                }
                b2Var = ya2.d.g(c19782x23db1cfa, gVar.b(m76197x6c03c64c), true);
            }
            b17 = b2Var;
        }
        nr2.m mVar2 = this.f420753d;
        boolean z18 = (((mVar2 == null || (do2Var = mVar2.f420801d) == null) ? 0 : do2Var.m75939xb282bd08(3)) & 1) == 1;
        if (!((b17 == null || ya2.d.f(b17)) ? false : true) && !z18) {
            z17 = false;
        }
        return z17 ? this.D : this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x074c  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.j0.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.D.getClass();
        this.C.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.A = new nr2.c0(this);
        this.B = new nr2.u();
        this.C = new nr2.t(this, m158354x19263085());
        this.D = new nr2.i0(this, m158354x19263085());
    }
}
