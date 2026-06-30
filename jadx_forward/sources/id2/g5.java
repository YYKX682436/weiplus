package id2;

/* loaded from: classes10.dex */
public final class g5 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi f372123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372123d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703(true));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onCreate");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi yiVar = this.f372123d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zi ziVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zi((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, m80380x71e92c1d, yiVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReservedNoticeListContract", "onAttach");
        yiVar.f192706e = ziVar;
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderLiveReservedNoticeListContract$ReservedNoticeListPresenter$onAttach$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == -12) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wm();
                }
                hc2.l.a("FinderLiveReservedNoticeListContract", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = yiVar.f192705d;
        yiVar.f192707f = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, abstractC13919x46aff122.m56388xcaeb60d0(), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zi ziVar2 = yiVar.f192706e;
        if (ziVar2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReservedNoticeListContract", "=== initView ===");
            android.view.View view = ziVar2.f192803f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.lq8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi yiVar2 = ziVar2.f192801d;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
                c1163xf1deaba4.mo7960x6cab2c8d(yiVar2.f192707f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReservedNoticeList.ReservedNoticeListViewCallback", "RecyclerView setup completed");
            }
            yiVar2.f192705d.mo56155xd210094c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703 c13871x2b246703 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703) abstractC13919x46aff122 : null;
        if (c13871x2b246703 == null) {
            return;
        }
        c13871x2b246703.f189026e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xi(yiVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onDestroy");
        this.f372123d.mo979x3f5eee52();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f372123d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yi(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13871x2b246703(true));
    }
}
