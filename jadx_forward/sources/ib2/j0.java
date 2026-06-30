package ib2;

/* loaded from: classes2.dex */
public final class j0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public ib2.i0 f371661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5w;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f371661d = new ib2.i0(m80379x76847179());
        android.app.Activity m80379x76847179 = m80379x76847179();
        ib2.i0 i0Var = this.f371661d;
        if (i0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        ib2.l0 l0Var = new ib2.l0(m80379x76847179, i0Var);
        ib2.i0 i0Var2 = this.f371661d;
        if (i0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        r45.vx0 vx0Var = new r45.vx0();
        android.app.Activity activity = i0Var2.f371652a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = vx0Var.mo11468x92b714fd(activity.getIntent().getByteArrayExtra("collection_info"));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCollectionInfo");
        i0Var2.f371657f = (r45.vx0) mo11468x92b714fd;
        activity.getIntent().getStringExtra("collection_author_username");
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.vx0 vx0Var2 = i0Var2.f371657f;
        objArr[0] = pm0.v.u(vx0Var2 != null ? vx0Var2.m75942xfb822ef2(0) : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionPresenter", "collectionTopicId %s", objArr);
        i0Var2.f371654c = l0Var;
        android.app.Activity activity2 = l0Var.f371666a;
        android.view.View findViewById = activity2.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        l0Var.f371668c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66 c15425x2593fa66 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66(activity2, null);
        c15425x2593fa66.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsd);
        l0Var.d().D(c15425x2593fa66);
        android.view.View findViewById2 = activity2.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        l0Var.f371669d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById2;
        l0Var.b().m7963x830bc99d(true);
        l0Var.b().m7965x440a0e9(4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = l0Var.b().m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        l0Var.b().mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(activity2));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b17 = l0Var.b();
        ib2.i0 i0Var3 = l0Var.f371667b;
        i0Var3.getClass();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.collection.FinderCollectionPresenter$getAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1.class.getName().hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1(false, false, true, false, 11, null);
                }
                hc2.l.a("Finder.FinderPaidCollectionPresenter", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, i0Var3.f371653b, false);
        i0Var3.f371655d = c22848x6ddd90cf;
        c22848x6ddd90cf.f374638o = new ib2.y(i0Var3);
        b17.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.View findViewById3 = activity2.findViewById(com.p314xaae8f345.mm.R.id.svu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        l0Var.f371670e = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = activity2.findViewById(com.p314xaae8f345.mm.R.id.oai);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        l0Var.f371671f = findViewById4;
        android.view.View findViewById5 = activity2.findViewById(com.p314xaae8f345.mm.R.id.oao);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        l0Var.f371672g = findViewById5;
        android.view.View findViewById6 = activity2.findViewById(com.p314xaae8f345.mm.R.id.oav);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        l0Var.f371673h = findViewById6;
        ib2.l0 l0Var2 = i0Var2.f371654c;
        if (l0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l0Var2.d().m82945xba09cf09(new ib2.z(i0Var2));
        ib2.l0 l0Var3 = i0Var2.f371654c;
        if (l0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l0Var3.e();
        i0Var2.c();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ib2.i0 i0Var = this.f371661d;
        if (i0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        p3325xe03a0797.p3326xc267989b.z0.d(i0Var.f371656e, i0Var + " onDetach", null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ib2.i0 i0Var = this.f371661d;
        if (i0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = i0Var.f371655d;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8152xc67946d3(0, c22848x6ddd90cf.m82898xfb7e5820().size(), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1.f204030n), 1));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
