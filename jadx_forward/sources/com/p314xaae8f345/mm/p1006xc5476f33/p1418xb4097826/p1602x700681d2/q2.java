package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes14.dex */
public final class q2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.p2 f203942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4u;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f203942d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.p2(m80379x76847179());
        android.app.Activity m80379x76847179 = m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.p2 p2Var = this.f203942d;
        if (p2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s2 s2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s2(m80379x76847179, p2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.p2 p2Var2 = this.f203942d;
        if (p2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        p2Var2.f203933f = p2Var2.f203928a.getIntent().getStringExtra("finder_username");
        p2Var2.f203934g = p2Var2.f203928a.getIntent().getIntExtra("finder_collection_business_type", 0);
        byte[] byteArrayExtra = p2Var2.f203928a.getIntent().getByteArrayExtra("KEY_LAST_BUFFER");
        if (byteArrayExtra != null) {
            p2Var2.f203935h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArrayExtra, 0, byteArrayExtra.length);
        }
        p2Var2.f203930c = s2Var;
        android.app.Activity activity = s2Var.f203978a;
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        s2Var.f203980c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66 c15425x2593fa66 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66(activity, null);
        c15425x2593fa66.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsd);
        s2Var.d().D(c15425x2593fa66);
        android.view.View findViewById2 = activity.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        s2Var.f203981d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById2;
        s2Var.b().m7963x830bc99d(true);
        s2Var.b().m7965x440a0e9(4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = s2Var.b().m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        s2Var.b().mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(activity));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b17 = s2Var.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.p2 p2Var3 = s2Var.f203979b;
        p2Var3.getClass();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter$getAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.e.class.hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d();
                }
                hc2.l.a("Finder.FinderPlayListPresenter", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, p2Var3.f203929b, false);
        p2Var3.f203931d = c22848x6ddd90cf;
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.g2(p2Var3);
        b17.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.View findViewById3 = activity.findViewById(com.p314xaae8f345.mm.R.id.kxr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        s2Var.f203982e = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = activity.findViewById(com.p314xaae8f345.mm.R.id.oai);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        s2Var.f203983f = findViewById4;
        android.view.View findViewById5 = activity.findViewById(com.p314xaae8f345.mm.R.id.oao);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        s2Var.f203984g = findViewById5;
        android.view.View findViewById6 = activity.findViewById(com.p314xaae8f345.mm.R.id.oav);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        s2Var.f203985h = findViewById6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s2 s2Var2 = p2Var2.f203930c;
        if (s2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        s2Var2.d().m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.h2(p2Var2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.s2 s2Var3 = p2Var2.f203930c;
        if (s2Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        s2Var3.e();
        p2Var2.b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.p2 p2Var = this.f203942d;
        if (p2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        p3325xe03a0797.p3326xc267989b.z0.d(p2Var.f203932e, p2Var + " onDetach", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
