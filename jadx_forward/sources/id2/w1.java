package id2;

/* loaded from: classes10.dex */
public final class w1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vh {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh f372396d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f372397e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f372398f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372398f = "FinderLiveMentionNotifyUIC." + hashCode();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eac;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar;
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14009x25c8700f) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveMentionsUI");
            uhVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14009x25c8700f) m158354x19263085).f190918v;
        } else {
            uhVar = null;
        }
        this.f372396d = uhVar;
        if (uhVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f372398f, "initView presenter is null");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar2 = this.f372396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uhVar2);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852, m80380x71e92c1d, uhVar2, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar3 = this.f372396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uhVar3);
        uhVar3.f190721m = liVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyPresenter", "onAttach " + uhVar3.f190716e);
        android.view.View view = liVar.f188831h;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        liVar.f188834n = c22801x87cbdc00;
        if (liVar.f188829f) {
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.m82690xd3a27e96(false);
                c22801x87cbdc00.m82696x5dd8f4d3(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aoh)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu)));
                c22801x87cbdc00.m82702xfa5d1e8f(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aoh)));
                c22801x87cbdc00.m82686x6e84640(1.85f);
                liVar.f188835o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view.findViewById(com.p314xaae8f345.mm.R.id.m6l);
                c22801x87cbdc00.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zh(c22801x87cbdc00, liVar));
                c22801x87cbdc00.m82562xefb63abb(liVar);
            }
        } else if (c22801x87cbdc00 != null) {
            c22801x87cbdc00.m82690xd3a27e96(false);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = liVar.f188830g;
        liVar.f188837q = new rl5.r(abstractActivityC21394xb3d2c0cf);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.kge);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        liVar.f188833m = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kgf);
        liVar.f188836p = textView;
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ai(liVar));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderLiveMentionNotifyContract$NotifyViewCallback$initView$2
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li.this.f188827d;
                int i17 = uhVar4.f190715d;
                if (i17 == 2) {
                    cd2.a[] aVarArr = cd2.a.f122187d;
                    if (type == 2) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.am(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bm(i17, uhVar4.f190716e));
                    }
                    hc2.l.a("FinderLiveMention.NotifyViewCallback", type);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zl();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMention.NotifyViewCallback", "Not support scene " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li.this.f188827d + ".finderViewScene");
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zl();
            }
        }, liVar.f188827d.f190724p, true);
        liVar.f188832i = c22848x6ddd90cf;
        c22848x6ddd90cf.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bi();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = liVar.f188833m;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = liVar.f188832i;
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ci(liVar);
        }
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.di(liVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = liVar.f188833m;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        ym5.a1.g(c1163xf1deaba43, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ji(liVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", "initRefresh.");
        pm0.v.V(200L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xh(liVar));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = liVar.f188833m;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        ym5.a1.g(c1163xf1deaba44, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ji(liVar));
        this.f372397e = liVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f372397e;
        if (liVar == null || (c22848x6ddd90cf = liVar.f188832i) == null) {
            return;
        }
        c22848x6ddd90cf.z0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f372397e;
        if (liVar == null || (c22848x6ddd90cf = liVar.f188832i) == null) {
            return;
        }
        c22848x6ddd90cf.A0();
    }
}
