package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public class u1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad {

    /* renamed from: p, reason: collision with root package name */
    public ir2.a1 f183486p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 f183487q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 f183488r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.s1 f183489s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f183489s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.s1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public void X6(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593 c5444xabe18593) {
        if (c5444xabe18593 != null && c5444xabe18593.f135784g.f88361a == 1001 && this.f183274d == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var = this.f183487q;
            if (c2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            ir2.a1 a1Var = c2Var.f188146e;
            a1Var.getClass();
            pf5.e.m158343xd39de650(a1Var, null, null, new ir2.x0(a1Var, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public void Y6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = this.f183488r;
        if (h2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.widget.TextView textView = h2Var.f188420v;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public void Z6(r45.e21 e21Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = this.f183488r;
        if (h2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        if (e21Var == null || (str = e21Var.m75945x2fec8307(5)) == null) {
            str = "";
        }
        h2Var.o(str);
    }

    public final int a7() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 c13646x818616e5 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5) m158358x197d1fc6 : null;
        if (c13646x818616e5 != null) {
            return c13646x818616e5.f183285t;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ado;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        in5.s sVar;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        android.view.View m7474xfb86a31b;
        android.view.View m7474xfb86a31b2;
        super.mo450x3e5a77bb(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCampaignContentUIC", "topic:" + this.f183275e + " topicType:7 tabType:" + this.f183274d + " eventTopicId:" + this.f183277g + " encryptedEventTopicId:" + this.f183278h);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, 2, 59, false, this instanceof ea2.j0, null, 40, null);
        java.lang.String str = this.f183275e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        h2Var.f188412n = str;
        h2Var.f188411m = 7;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = (m158358x197d1fc6 == null || (m7474xfb86a31b2 = m158358x197d1fc6.m7474xfb86a31b()) == null) ? null : (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) m7474xfb86a31b2.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        if (rlLayout == null) {
            rlLayout = U6().f516056b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rlLayout, "rlLayout");
        }
        h2Var.f190496g = rlLayout;
        rlLayout.m82565x6107557d(true);
        if (m158359x1e885992().getBooleanExtra("key_has_cover", false)) {
            h2Var.f190496g.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        h2Var.f188415q = this.f183274d;
        h2Var.f188419u = a7();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        h2Var.f188417s = (m158358x197d1fc62 == null || (m7474xfb86a31b = m158358x197d1fc62.m7474xfb86a31b()) == null) ? null : m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
        this.f183488r = h2Var;
        long longExtra = m158359x1e885992().getLongExtra("key_feed_ref_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_feed_ref_dup_flag");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc63);
        pf5.z zVar = pf5.z.f435481a;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(m158358x197d1fc63).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        int a76 = a7();
        int i17 = this.f183274d;
        r45.a34 a34Var = new r45.a34();
        a34Var.set(0, java.lang.Integer.valueOf(m158359x1e885992().getIntExtra("KEY_JSAPI_SOURCE_TYPE", 0)));
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("KEY_JSAPI_SOURCE_BUFFER");
        if (stringExtra2 != null) {
            a34Var.set(1, stringExtra2);
        }
        java.lang.String b17 = ey2.o2.b(ey2.p2.f339000g, this.f183277g, this.f183278h, null, a76, i17, 4, null);
        ba2.a aVar = new ba2.a(O6(this.f183274d), this.f183277g, java.lang.Long.valueOf(longExtra), stringExtra, this.f183278h, this.f183274d, null, V6, this.f183276f, b17, a7(), a34Var);
        ba2.d dVar = new ba2.d(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCampaignContentUIC", "finderEventTopicId:" + this.f183277g + " refObjectId:" + longExtra + " cacheKey:" + b17 + " tabType:" + this.f183274d + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var2 = this.f183488r;
        if (h2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        ir2.z1 z1Var = new ir2.z1(h2Var2.f190496g, true, null, null);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc64 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc64);
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.b(m158358x197d1fc64).a(ir2.a1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>");
        ir2.a1 a1Var = (ir2.a1) a17;
        a1Var.f375626f = dVar;
        a1Var.f375627g = null;
        a1Var.f375628h = aVar;
        a1Var.f375629i = aVar;
        a1Var.f375630m = aVar;
        a1Var.f375631n = z1Var;
        this.f183486p = a1Var;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc65 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc65);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.r1 r1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.r1(this, a1Var, m158358x197d1fc65, a7());
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f413094a.a(r1Var);
        r1Var.f375725h.mo48813x58998cd();
        r1Var.f375727m.mo48813x58998cd();
        r1Var.f375728n.mo48813x58998cd();
        r1Var.f375726i.mo48813x58998cd();
        r1Var.f375730p.mo48813x58998cd();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
        ir2.a1 a1Var2 = this.f183486p;
        if (a1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newLoader");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2(abstractActivityC21394xb3d2c0cf, 2, 59, a1Var2);
        java.lang.String str2 = this.f183275e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        c2Var.f187979m = str2;
        c2Var.f187978i = 7;
        a7();
        this.f183487q = c2Var;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc66 = m158358x197d1fc6();
        if (m158358x197d1fc66 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var3 = this.f183488r;
            if (h2Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.b(m158358x197d1fc66).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a18).Z6(-1);
            if (Z6 != null) {
                Z6.d(h2Var3.f190496g.m82555x4905e9fa());
            }
            h2Var3.f188416r = m158358x197d1fc66;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) zVar.b(m158358x197d1fc66).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class)).P6("activityid", pm0.v.u(this.f183277g));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var4 = this.f183488r;
        if (h2Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var2 = this.f183487q;
        if (c2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        h2Var4.f190495f = c2Var2;
        c2Var2.f188147f = h2Var4;
        ir2.a1 a1Var3 = c2Var2.f188146e;
        java.util.List list = a1Var3.f375624d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed> }");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = h2Var4.f190496g.m82555x4905e9fa();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = h2Var4.f190493d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 vj0Var = h2Var4.f188423y;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager d17 = vj0Var.d(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "<set-?>");
        h2Var4.f190498i = d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
        android.view.Window window = context.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc.a(vcVar, context, window, 1, false, false, 24, null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = h2Var4.f190498i;
        if (layoutManager == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderManager");
            throw null;
        }
        m82555x4905e9fa.mo7967x900dcbe1(layoutManager);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2) h2Var4.g();
        if (c2Var3.f187978i == 7) {
            sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$buildCampaignConvert$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    if (type == -5) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xh();
                    }
                    if (type == -3) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik();
                    }
                    if (type == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh ehVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh(0, null, null, null, 15, null);
                        ehVar.f184602o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2.this.f187980n;
                        ehVar.f184596f.f503664a = false;
                        return ehVar;
                    }
                    if (type != 4 && type != 9) {
                        if (type == 3001) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh ehVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh(0, null, null, null, 15, null);
                            ehVar2.f184602o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2.this.f187980n;
                            ehVar2.f184596f.f503664a = false;
                            return ehVar2;
                        }
                        if (type != 3002) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk zkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk(0, null, null, null, 15, null);
                    zkVar.f184602o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2.this.f187980n;
                    zkVar.f184596f.f503664a = false;
                    return zkVar;
                }
            };
        } else {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v1(c2Var3);
            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x1(c2Var3);
            sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$buildItemCoverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2.this.f188145d, null, 0, null, 14, null).g(type, v1Var, x1Var);
                }
            };
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f1(arrayList, h2Var4, sVar, false);
        h2Var4.f190497h = f1Var;
        m82555x4905e9fa.mo7960x6cab2c8d(f1Var);
        m82555x4905e9fa.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.oj0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.pj0) vj0Var));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = h2Var4.f190497h;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g1(h2Var4);
        h2Var4.f190496g.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.l1(h2Var4));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        int i18 = h2Var4.f190494e;
        fc2.o Z62 = nyVar.Z6(i18);
        if (Z62 != null) {
            Z62.d(m82555x4905e9fa);
        }
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1(h2Var4));
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.S1().r()).intValue() == 1) {
            m82555x4905e9fa.i(new sc2.c8("Finder.FinderBaseGridFeedUIContract.ViewCallback", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m1(h2Var4)));
        }
        p012xc85e97e9.p093xedfae76a.c1 a19 = zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a19;
        r45.qt2 W6 = nyVar2.n7() ? nyVar2.W6(i18) : nyVar2.V6();
        boolean j17 = h2Var4.j(W6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r1 r1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r1.f190397d;
        if (j17) {
            in5.o.b(m82555x4905e9fa, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q1(W6, null, null), r1Var2);
        }
        if (h2Var4.j(W6)) {
            in5.o.b(m82555x4905e9fa, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q1(W6, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.o1(h2Var4, W6), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n1(h2Var4, W6)), r1Var2);
        } else {
            h2Var4.g().f188149h.b(m82555x4905e9fa, W6);
        }
        h2Var4.f188420v = (android.widget.TextView) context.findViewById(com.p314xaae8f345.mm.R.id.m2g);
        h2Var4.f188421w = (android.widget.FrameLayout) context.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
        h2Var4.f188422x = (android.widget.ProgressBar) context.findViewById(com.p314xaae8f345.mm.R.id.f564152ji);
        android.widget.TextView textView = h2Var4.f188420v;
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e2(h2Var4));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var = c2Var2.f188147f;
        if (s1Var != null && (c22801x87cbdc00 = s1Var.f190496g) != null) {
            c2Var2.f188148g = new ir2.z1(c22801x87cbdc00, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b1(c2Var2), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c1(c2Var2));
        }
        ir2.z1 z1Var2 = c2Var2.f188148g;
        if (z1Var2 != null) {
            a1Var3.f375631n = z1Var2;
            a1Var3.R6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d1(z1Var2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var2 = c2Var2.f188147f;
        if (s1Var2 != null) {
            if (c2Var2.f187978i == 7) {
                final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$initListener$1
                    {
                        this.f39173x3fe91575 = -478908231;
                    }

                    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                    /* renamed from: callback */
                    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9 c5150x445b2cc9) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9 event = c5150x445b2cc9;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y1(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2.this));
                        return false;
                    }
                };
                c2Var2.f187981o = abstractC20980x9b9ad01d;
                abstractC20980x9b9ad01d.mo48813x58998cd();
            }
            a1Var3.R6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b2(c2Var2));
            s1Var2.m56551x4905e9fa();
            ((gp2.v0) ((ws5.e) pf5.u.f435469a.e(ws5.g.class).c(ws5.e.class))).N6(c2Var2.f188145d);
        }
        pf5.e.m158343xd39de650(a1Var3, null, null, new ir2.m0(a1Var3, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var5 = this.f183488r;
        if (h2Var5 != null) {
            h2Var5.m56551x4905e9fa().i(this.f183489s);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = this.f183488r;
        if (h2Var != null) {
            zy2.zb.Kh(zbVar, h2Var.m56551x4905e9fa(), ml2.x1.f409735f, "59", ml2.y.f409774f, 0, 0L, 0, 112, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        super.mo47482x6fa9d635();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var = this.f183487q;
        if (c2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        c2Var.mo979x3f5eee52();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = this.f183488r;
        if (h2Var != null) {
            h2Var.m56551x4905e9fa().V0(this.f183489s);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = this.f183488r;
        if (h2Var != null) {
            zy2.zb.Kh(zbVar, h2Var.m56551x4905e9fa(), ml2.x1.f409735f, "59", ml2.y.f409773e, 0, 0L, 0, 112, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    /* renamed from: setCoveredStyle */
    public void mo55423x97a1a3d() {
        m80380x71e92c1d().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.t1(this));
    }
}
