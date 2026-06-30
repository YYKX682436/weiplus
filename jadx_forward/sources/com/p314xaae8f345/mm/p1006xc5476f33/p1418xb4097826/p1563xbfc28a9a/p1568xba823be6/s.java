package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6;

/* loaded from: classes2.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f202877d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f202878e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 f202879f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w f202880g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.d f202881h;

    /* renamed from: i, reason: collision with root package name */
    public long f202882i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f202883m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.C14470xad1ab6b8 f202884n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.C14471x2f099ba8 f202885o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 f202886p;

    /* renamed from: q, reason: collision with root package name */
    public final cw2.f8 f202887q;

    /* JADX WARN: Type inference failed for: r4v1, types: [com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$memberManagerListener$1] */
    public s(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, java.lang.String authorFinderUsername, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 feedLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        this.f202877d = context;
        this.f202878e = authorFinderUsername;
        this.f202879f = feedLoader;
        this.f202883m = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f202884n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f135783g;
                sb6.append(gaVar.f88282a);
                sb6.append(", progress:");
                sb6.append(gaVar.f88283b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderQAPresenter", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s.this.f202879f.m56136x5a0b1819(gaVar.f88282a);
                return true;
            }
        };
        this.f202885o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5506x4ab0ff64>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.question.FinderMemberQAPresenter$memberManagerListener$1
            {
                this.f39173x3fe91575 = -372620460;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5506x4ab0ff64 c5506x4ab0ff64) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5506x4ab0ff64 event = c5506x4ab0ff64;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("memberManagerListener username:");
                am.jc jcVar = event.f135837g;
                sb6.append(jcVar.f88557a);
                sb6.append(", operationType:");
                sb6.append(jcVar.f88558b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderQAPresenter", sb6.toString());
                if (jcVar.f88558b == 2) {
                    java.lang.String str = jcVar.f88557a;
                    if (!(str == null || str.length() == 0)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s.this;
                        pm0.v.b0(sVar.f202879f.m56388xcaeb60d0(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.p(event));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar = sVar.f202880g;
                        if (wVar != null && (m62367x4905e9fa = wVar.a().m62367x4905e9fa()) != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
                            mo7946xf939df19.m8146xced61ae5();
                        }
                    }
                }
                return true;
            }
        };
        this.f202886p = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y2();
        this.f202887q = new cw2.f8(0, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.o4 A0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.g.f202858d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.t4 D1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, int i17, in5.s0 holder, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.j.f202862d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    /* renamed from: H1 */
    public cw2.f8 getF204186q() {
        return this.f202887q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.s4 K0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, int i17, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.i.f202861a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public void W4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.o4 Y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.h(this, feed);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.t4 c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.o(this, feed, holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public boolean d0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 e2() {
        return this.f202886p;
    }

    public final boolean g() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f202877d;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f202878e, abstractActivityC21394xb3d2c0cf != null ? xy2.c.e(abstractActivityC21394xb3d2c0cf) : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf getF204176d() {
        return this.f202877d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 j2() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f202877d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class)).P6();
        return P6 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5() : P6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public void n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, int i17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        mo48814x2efc64();
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401 = this.f202879f;
        c13875x75a8b401.mo56109xc39876e3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.d dVar = this.f202881h;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("actionCallback");
            throw null;
        }
        c13875x75a8b401.m56401x31d4943c(dVar);
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.e.f202668a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1565x38b81db3.e.f202668a.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.o4 p1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.f.f202857d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public void s0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public void u2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (s0Var == null) {
            return;
        }
        so2.v0.f492177a.c(this.f202877d, feed, z17, 2, i17, this.f202878e, bc1Var);
        if ((!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) && z17) {
            java.lang.String d17 = cu2.f0.f303924a.d("FinderObjectDynamicItemKey_FinderNoFinderUserFavToast");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f202877d;
            if (d17 == null) {
                d17 = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.er_);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getString(...)");
            }
            db5.t7.m123883x26a183b(abstractActivityC21394xb3d2c0cf, d17, 0).show();
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_fav_click", s0Var.p(com.p314xaae8f345.mm.R.id.f568621ng5), kz5.b1.e(new jz5.l("is_action_fav", java.lang.Integer.valueOf(z17 ? 1 : 0))), 24617);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.o4 w4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.e.f202856d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.r4 z6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.k.f202863a;
    }
}
