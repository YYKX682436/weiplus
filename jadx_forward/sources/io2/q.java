package io2;

/* loaded from: classes2.dex */
public final class q extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final io2.i f375031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f375031d = new io2.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        io2.i iVar = this.f375031d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5 = iVar.f375010d;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        c14459x792f41a5.m56374x2cb672ca(nyVar != null ? nyVar.V6() : null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        io2.p pVar = new io2.p((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, iVar, m80380x71e92c1d());
        iVar.f375011e = pVar;
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$MemberCardListPresenter$onAttach$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == so2.j3.class.getName().hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.co();
                }
                hc2.l.a("Finder.FinderMemberCardListContract", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a52 = iVar.f375010d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, c14459x792f41a52.m56388xcaeb60d0(), false);
        c22848x6ddd90cf.f374638o = new io2.g(iVar);
        iVar.f375012f = c22848x6ddd90cf;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = pVar.f375027d;
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getRootView().getContext()));
        c22849x81a93d25.mo7960x6cab2c8d(pVar.f375024a.c());
        pVar.f375026c.m82683xb165a19d(new io2.j(pVar));
        ym5.a1.h(c22849x81a93d25, new io2.k());
        c22849x81a93d25.N(new io2.l(pVar));
        ym5.a1.g(c22849x81a93d25, new io2.m());
        pVar.a(true);
        pVar.f375025b.postDelayed(new io2.n(pVar), 300L);
        c14459x792f41a52.f202691d = new io2.h(iVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(c14459x792f41a52, iVar.f().f375030g, false, 2, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(m158358x197d1fc6(), iy1.c.FinderMemberCardListUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(m158358x197d1fc6(), 12, 27010);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_tab_context_id", nyVar2 != null ? nyVar2.f216919r : null);
        lVarArr[1] = new jz5.l("finder_context_id", nyVar2 != null ? nyVar2.f216915p : null);
        lVarArr[2] = new jz5.l("behaviour_session_id", nyVar2 != null ? nyVar2.f216918q : null);
        lVarArr[3] = new jz5.l("tabtype", "会员专区");
        ((cy1.a) rVar).gk(m158358x197d1fc6, kz5.c1.k(lVarArr));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f375031d.mo979x3f5eee52();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f375031d = new io2.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5());
    }
}
