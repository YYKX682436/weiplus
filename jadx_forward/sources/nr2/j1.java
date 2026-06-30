package nr2;

/* loaded from: classes2.dex */
public final class j1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public nr2.i1 f420773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570587di3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.Set set;
        java.util.Set set2;
        this.f420773d = new nr2.i1(m80379x76847179());
        android.app.Activity m80379x76847179 = m80379x76847179();
        nr2.i1 i1Var = this.f420773d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        nr2.l1 l1Var = new nr2.l1(m80379x76847179, i1Var);
        nr2.i1 i1Var2 = this.f420773d;
        if (i1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        r45.do2 do2Var = new r45.do2();
        android.app.Activity activity = i1Var2.f420743a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = do2Var.mo11468x92b714fd(activity.getIntent().getByteArrayExtra("paid_collection_info"));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPaidCollectionInfo");
        nr2.m mVar = new nr2.m((r45.do2) mo11468x92b714fd);
        i1Var2.f420748f = mVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPaidCollectionPresenter", "collectionTopicId %s", pm0.v.u(mVar.l()));
        nr2.m mVar2 = i1Var2.f420748f;
        if ((mVar2 == null || mVar2.g()) ? false : true) {
            nr2.m mVar3 = i1Var2.f420748f;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar3 != null ? mVar3.o() : null, xy2.c.e(activity))) {
                pf5.z zVar = pf5.z.f435481a;
                boolean z17 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
                nr2.u0 u0Var = (nr2.u0) zVar.a(activityC0065xcd7aa112).e(nr2.u0.class);
                yz5.a aVar = i1Var2.f420751i;
                if (u0Var != null && (set2 = u0Var.f420852m) != null) {
                    set2.remove(aVar);
                }
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                nr2.u0 u0Var2 = (nr2.u0) zVar.a(activityC0065xcd7aa112).e(nr2.u0.class);
                if (u0Var2 != null && (set = u0Var2.f420852m) != null) {
                    set.add(aVar);
                }
            }
        }
        i1Var2.f420745c = l1Var;
        android.app.Activity activity2 = l1Var.f420793a;
        android.view.View findViewById = activity2.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        l1Var.f420795c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66 c15425x2593fa66 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1673x40b292db.C15425x2593fa66(activity2, null);
        c15425x2593fa66.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.bsd);
        l1Var.d().D(c15425x2593fa66);
        android.view.View findViewById2 = activity2.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        l1Var.f420796d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById2;
        l1Var.b().m7963x830bc99d(true);
        l1Var.b().m7965x440a0e9(4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = l1Var.b().m7949x5701d990();
        if (m7949x5701d990 != null) {
            m7949x5701d990.f93704f = 0L;
        }
        l1Var.b().mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(activity2));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b17 = l1Var.b();
        nr2.i1 i1Var3 = l1Var.f420794b;
        i1Var3.getClass();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.paidcollection.FinderPaidCollectionPresenter$getAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1.class.getName().hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1(false, false, true, false, 11, null);
                }
                hc2.l.a("Finder.FinderPaidCollectionPresenter", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, i1Var3.f420744b, false);
        i1Var3.f420746d = c22848x6ddd90cf;
        c22848x6ddd90cf.f374638o = new nr2.w0(i1Var3);
        b17.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.View findViewById3 = activity2.findViewById(com.p314xaae8f345.mm.R.id.kxr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        l1Var.f420797e = (android.widget.FrameLayout) findViewById3;
        android.view.View findViewById4 = activity2.findViewById(com.p314xaae8f345.mm.R.id.oai);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        l1Var.f420798f = findViewById4;
        android.view.View findViewById5 = activity2.findViewById(com.p314xaae8f345.mm.R.id.oao);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        l1Var.f420799g = findViewById5;
        android.view.View findViewById6 = activity2.findViewById(com.p314xaae8f345.mm.R.id.oav);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        l1Var.f420800h = findViewById6;
        nr2.l1 l1Var2 = i1Var2.f420745c;
        if (l1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l1Var2.d().m82945xba09cf09(new nr2.z0(i1Var2));
        nr2.l1 l1Var3 = i1Var2.f420745c;
        if (l1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        l1Var3.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.rj0 tk6 = ((c61.l7) i95.n0.c(c61.l7.class)).tk();
        nr2.m mVar4 = i1Var2.f420748f;
        long l17 = mVar4 != null ? mVar4.l() : 0L;
        tk6.getClass();
        if (l17 != 0) {
            p75.n0 n0Var = dm.e5.f318148o;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.m0 i17 = dm.e5.f318151r.i(java.lang.Long.valueOf(l17));
            p75.i0 g17 = dm.e5.f318148o.g(linkedList);
            g17.f434190d = i17;
            g17.f434192f = linkedList2;
            g17.f434193g = linkedList3;
            java.util.List k17 = g17.a().k(tk6.f209029d, dm.e5.class);
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ey2.v2 v2Var = (ey2.v2) a17;
            java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
            while (it.hasNext()) {
                dm.e5 e5Var = (dm.e5) it.next();
                long j17 = e5Var.f66380xf9a02e3e;
                ey2.t2 t2Var = ey2.t2.f339050g;
                ey2.q2 R6 = v2Var.R6(j17, false, t2Var);
                if ((R6 != null ? R6.f339013c : 0) == 0) {
                    long j18 = e5Var.f66380xf9a02e3e;
                    int i18 = e5Var.f66383xe217cbd2;
                    int i19 = e5Var.f66381xa9367fec;
                    v2Var.W6(j18, 0, i18 < i19 ? i19 : i18, e5Var.f66382x189d520c, 0L, e5Var.f66384xde17a869, (r28 & 64) != 0 ? 1 : 0, (r28 & 128) != 0 ? false : false, (r28 & 256) != 0 ? ey2.t2.f339056p : t2Var);
                }
                long j19 = e5Var.f66380xf9a02e3e;
                int i27 = e5Var.f66378x8c3448d7;
                int i28 = e5Var.f66381xa9367fec;
                java.util.HashMap hashMap = v2Var.f339090g;
                ey2.r2 r2Var = (ey2.r2) hashMap.get(java.lang.Long.valueOf(j19));
                if (r2Var == null) {
                    hashMap.put(java.lang.Long.valueOf(j19), new ey2.r2(i27, 0, i28));
                } else {
                    if (r2Var.f339026a < i27) {
                        r2Var.f339026a = i27;
                    }
                    if (r2Var.f339028c < i28) {
                        r2Var.f339028c = i28;
                    }
                }
            }
        }
        i1Var2.c();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        nr2.i1 i1Var = this.f420773d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        p3325xe03a0797.p3326xc267989b.z0.d(i1Var.f420747e, i1Var + " onDetach", null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        nr2.i1 i1Var = this.f420773d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = i1Var.f420746d;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8152xc67946d3(0, c22848x6ddd90cf.m82898xfb7e5820().size(), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1.f204030n), 1));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
