package yj5;

/* loaded from: classes5.dex */
public final class d extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe f544243f;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f544244g = new yj5.c(this);

    /* renamed from: h, reason: collision with root package name */
    public boolean f544245h;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        xj5.c cVar;
        java.lang.ref.WeakReference weakReference = vb5.l.f516388q;
        vb5.l lVar = weakReference != null ? (vb5.l) weakReference.get() : null;
        if (lVar != null) {
            java.util.Iterator it = lVar.f516396o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                xj5.a aVar = (xj5.a) it.next();
                if (aVar instanceof xj5.c) {
                    cVar = (xj5.c) aVar;
                    break;
                }
            }
            if (cVar != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_detach", null, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_close_scene", 5)), cVar.b()), 26356);
            }
        }
        if (this.f280113d.D()) {
            java.util.List list = this.f544236e;
            if ((list != null ? list.size() : 0) > 0 && this.f544245h) {
                c01.v1.F(this.f280113d.u().d1());
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe c7002x3df26ffe = this.f544243f;
        if (c7002x3df26ffe != null) {
            c7002x3df26ffe.k();
        }
        this.f544243f = null;
    }

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536421m;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(talkerInfo.f542275a);
        if (context.f542250l.f39297xd5f7591a || z07 == null) {
            return null;
        }
        boolean z17 = true;
        if (z07.f69083xf6ef0cb0 != 1) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String str = z07.f69090xb4fe86b0;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (!z17) {
            linkedList.add(new xj5.c(z07));
        }
        return linkedList;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.i(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        c01.d9.b().l().add(this.f544244g);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (gm0.j1.b().m()) {
            c01.d9.b().l().mo49775xc84af884(this.f544244g);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        this.f544245h = false;
    }
}
