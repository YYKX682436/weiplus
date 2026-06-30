package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$showPopupMenu$1 */
/* loaded from: classes2.dex */
final class C14654x11a02e0d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f204172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback f204173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.v1 f204174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14654x11a02e0d(ya2.b2 b2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback, so2.v1 v1Var) {
        super(0);
        this.f204172d = b2Var;
        this.f204173e = followListViewCallback;
        this.f204174f = v1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        r45.fw0 fw0Var;
        java.util.LinkedList m75941xfb8219142;
        r45.xk xkVar;
        ya2.b2 b2Var = this.f204172d;
        int i17 = b2Var.K2 & 4;
        so2.v1 v1Var = this.f204174f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = this.f204173e;
        if (i17 > 0) {
            rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
            r45.xk b17 = ya2.d.b(b2Var, false);
            java.lang.String m75945x2fec8307 = b17 != null ? b17.m75945x2fec8307(0) : null;
            ((qv.q) v2Var).getClass();
            qk.o b18 = r01.z.b(m75945x2fec8307);
            rv.m2 m2Var = (rv.m2) i95.n0.c(rv.m2.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = followListViewCallback.f204153d;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            r45.aw0 aw0Var = b2Var.f69303xb62cee;
            if (aw0Var != null && (m75941xfb821914 = aw0Var.m75941xfb821914(0)) != null) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r45.zv0) obj).m75939xb282bd08(0) == 1) {
                        break;
                    }
                }
                r45.zv0 zv0Var = (r45.zv0) obj;
                if (zv0Var != null && (fw0Var = (r45.fw0) zv0Var.m75936x14adae67(1)) != null && (m75941xfb8219142 = fw0Var.m75941xfb821914(0)) != null && (xkVar = (r45.xk) kz5.n0.Z(m75941xfb8219142)) != null) {
                    z3Var.M1(xkVar.m75945x2fec8307(1));
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.lang.String m75945x2fec83072 = xkVar.m75945x2fec8307(1);
                    ((ke0.e) xVar).getClass();
                    z3Var.J2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83072);
                    z3Var.X1(xkVar.m75945x2fec8307(0));
                }
            }
            ((qv.e) m2Var).wi(b18, abstractActivityC21394xb3d2c0cf, z3Var, false);
            followListViewCallback.f204155f.f204136g.remove(v1Var);
            followListViewCallback.o(false, -1, -1);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(followListViewCallback.f204156g, "oldFollowCnt %d", java.lang.Integer.valueOf(r17));
            if (r17 > 0) {
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 - 1));
            }
        } else {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = followListViewCallback.f204153d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            V6.set(7, 12);
            so2.z1 z1Var = so2.z1.f492263a;
            java.lang.String D0 = b2Var.D0();
            v1Var.getClass();
            so2.z1.c(z1Var, V6, D0, 2, 0L, null, false, 0, null, null, 0L, 992, null);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(followListViewCallback.f204153d);
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f216918q : null);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = followListViewCallback.f204153d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(abstractActivityC21394xb3d2c0cf2);
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(abstractActivityC21394xb3d2c0cf2);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(abstractActivityC21394xb3d2c0cf2);
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f216913n) : null);
        ((cy1.a) rVar).Cj("un_follow_click", null, kz5.c1.k(lVarArr), 24617);
        ((nv2.v) ((nv2.g0) i95.n0.c(nv2.g0.class))).Ai(1, b2Var.D0(), true);
        if (followListViewCallback.f204158i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20911, 3, b2Var.D0(), b2Var.w0());
        }
        return jz5.f0.f384359a;
    }
}
