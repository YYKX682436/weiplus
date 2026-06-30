package ac2;

/* loaded from: classes2.dex */
public final class h implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f84563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f84564e;

    public h(ac2.t tVar, long j17) {
        this.f84563d = tVar;
        this.f84564e = j17;
    }

    @Override // cw2.ea
    /* renamed from: onVideoPause */
    public void mo1057x65d3157a() {
    }

    @Override // cw2.ea
    /* renamed from: onVideoPlay */
    public void mo1058x4d9b9b30() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56387xe6796cde;
        int i17;
        ac2.t tVar = this.f84563d;
        long j19 = tVar.P;
        long j27 = this.f84564e;
        if (j19 == j27 && j18 > 0) {
            long j28 = j18 - j17;
            tVar.getClass();
            float a17 = ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).a(java.lang.Long.valueOf(tVar.f84590y), java.lang.Integer.valueOf(tVar.f187955e));
            if (a17 <= 0.0f) {
                a17 = 1.0f;
            }
            long j29 = ((float) 3000) * a17;
            if (j29 < 3000) {
                j29 = 3000;
            }
            if (!(1 <= j28 && j28 <= j29) || tVar.N == j27) {
                if (j17 <= j29 || j28 <= j29 || tVar.M == null) {
                    return;
                }
                tVar.i0("progress");
                tVar.P = j27;
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = tVar.f188103t;
            if (abstractC13919x46aff122 == null || (m56387xe6796cde = abstractC13919x46aff122.m56387xe6796cde()) == 0) {
                return;
            }
            java.util.Iterator it = m56387xe6796cde.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                } else {
                    if (((so2.j5) it.next()).mo2128x1ed62e84() == j27) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = null;
            if (i18 >= 0 && (i17 = i18 + 1) < m56387xe6796cde.size()) {
                java.lang.Object obj = m56387xe6796cde.get(i17);
                if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
                }
            }
            if (abstractC14490x69736cb5 == null || !abstractC14490x69736cb5.getFeedObject().m59319xdd99097b()) {
                return;
            }
            tVar.N = j27;
            long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.B, "onProgress edge-trigger show showPromotionCountDownToast, remainMs=" + j28 + ", thresholdMs=" + j29 + ", speedRatio=" + a17 + ", nextFeedId=" + pm0.v.u(mo2128x1ed62e84));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = tVar.f187954d;
            if (abstractActivityC21394xb3d2c0cf.isDestroyed() || abstractActivityC21394xb3d2c0cf.isFinishing()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var = tVar.M;
            if (w2Var != null && w2Var.isShowing()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2 w2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w2(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570581ed2);
            tVar.M = w2Var2;
            w2Var2.setOnKeyListener(ac2.n.f84577d);
            w2Var2.setCancelable(false);
            w2Var2.show();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d) w2Var2.findViewById(com.p314xaae8f345.mm.R.id.ukc);
            if (c15272xcb1f133d != null) {
                c15272xcb1f133d.m61980xc2385d6(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4p));
                c15272xcb1f133d.m61979x2b925a75(3000L);
                c15272xcb1f133d.m61972x2093cc58(-1);
                c15272xcb1f133d.m61973x5416327a(false);
                c15272xcb1f133d.m61970xf664cfe7(new ac2.o(tVar, j27));
                c15272xcb1f133d.b();
            }
        }
    }
}
