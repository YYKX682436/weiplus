package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "ka2/c", "ka2/d", "ka2/e", "ka2/f", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI */
/* loaded from: classes10.dex */
public class ActivityC13659x4f0951e4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int P = 0;
    public final i11.e A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public r45.gd1 G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public ka2.e f183325J;
    public ka2.f K;
    public final ka2.d L;
    public boolean M;
    public final i11.c N;

    /* renamed from: t, reason: collision with root package name */
    public boolean f183326t;

    /* renamed from: u, reason: collision with root package name */
    public ha2.a f183327u;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f183329w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f183330x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f183331y;

    /* renamed from: v, reason: collision with root package name */
    public int f183328v = -1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f183332z = "";

    public ActivityC13659x4f0951e4() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.A = i11.h.e();
        this.H = jz5.h.b(new ka2.h(this));
        this.I = jz5.h.b(ka2.z.f387586d);
        this.f183325J = ka2.e.f387558d;
        this.K = ka2.f.f387563f;
        this.L = new ka2.d();
        this.N = new ka2.y(this);
    }

    public static final java.lang.String c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4) {
        activityC13659x4f0951e4.getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        java.lang.String m76327x23a7af9b = c19783xd9a946b7 != null ? c19783xd9a946b7.m76327x23a7af9b() : null;
        return m76327x23a7af9b == null ? "" : m76327x23a7af9b;
    }

    public static void n7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4, java.lang.String str, boolean z17, boolean z18, boolean z19, ka2.f fVar, int i17, int i18, java.lang.Object obj) {
        r45.gd1 gd1Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        r45.gd1 gd1Var2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        java.lang.String keyword = (i18 & 1) != 0 ? "" : str;
        boolean z27 = (i18 & 2) != 0 ? false : z17;
        boolean z28 = (i18 & 4) != 0 ? false : z18;
        boolean z29 = (i18 & 8) != 0 ? false : z19;
        ka2.f streamType = (i18 & 16) != 0 ? ka2.f.f387563f : fVar;
        int i19 = (i18 & 32) != 0 ? 0 : i17;
        activityC13659x4f0951e4.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamType, "streamType");
        activityC13659x4f0951e4.B = true;
        activityC13659x4f0951e4.o7(streamType);
        ka2.d dVar = activityC13659x4f0951e4.L;
        ka2.c cVar = z27 ? dVar.f387552d : dVar.f387551c;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = null;
        if (streamType == ka2.f.f387561d || streamType == ka2.f.f387563f) {
            gd1Var = activityC13659x4f0951e4.G;
            if (gd1Var == null) {
                jz5.l P6 = ((ey2.k0) ((jz5.n) activityC13659x4f0951e4.I).mo141623x754a37bb()).P6();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[lastLocation] isSearchIng:");
                sb6.append(activityC13659x4f0951e4.f183326t);
                sb6.append(" longitude:");
                java.lang.Number number = (java.lang.Number) P6.f384366d;
                sb6.append(number.floatValue());
                sb6.append(" latitude:");
                java.lang.Number number2 = (java.lang.Number) P6.f384367e;
                sb6.append(number2.floatValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiNormalLbsListUI", sb6.toString());
                r45.gd1 gd1Var3 = new r45.gd1();
                gd1Var3.set(0, java.lang.Float.valueOf(number.floatValue()));
                gd1Var3.set(1, java.lang.Float.valueOf(number2.floatValue()));
                gd1Var = gd1Var3;
            }
            r45.dd1 dd1Var = cVar.f387547a;
            m75934xbce7f2f = dd1Var != null ? dd1Var.m75934xbce7f2f(1) : null;
        } else {
            m75934xbce7f2f = null;
            gd1Var = null;
        }
        if (streamType == ka2.f.f387562e || streamType == ka2.f.f387563f) {
            gd1Var2 = dVar.f387555g;
            r45.dd1 dd1Var2 = cVar.f387548b;
            if (dd1Var2 != null) {
                gVar = dd1Var2.m75934xbce7f2f(1);
            }
        } else {
            gd1Var2 = null;
        }
        boolean z37 = z29;
        db2.i1.f309548t.a(keyword, gd1Var, m75934xbce7f2f, gd1Var2, gVar, z37, i19, new db2.f1(activityC13659x4f0951e4, new ka2.a0(activityC13659x4f0951e4, z27, cVar, z28, z37, streamType)));
    }

    public final java.util.ArrayList d7(java.util.List list, java.lang.String str) {
        java.util.List<r45.hd1> arrayList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (f7()) {
            arrayList = list;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((r45.hd1) obj).m75939xb282bd08(5) == 0) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (r45.hd1 hd1Var : arrayList) {
            int i17 = 3;
            if (((r45.ad1) hd1Var.m75936x14adae67(6)) != null) {
                r45.ad1 ad1Var = (r45.ad1) hd1Var.m75936x14adae67(6);
                i17 = ad1Var != null && ad1Var.m75939xb282bd08(1) == 3 ? 8 : 4;
            } else {
                java.lang.String m75945x2fec8307 = hd1Var.m75945x2fec8307(0);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    i17 = 1;
                }
            }
            arrayList3.add(new ha2.a(hd1Var, i17, false, str, this.f183332z, null, false, 100, null));
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    /* renamed from: e7, reason: from getter */
    public ka2.f getS() {
        return this.K;
    }

    public final boolean f7() {
        return ((java.lang.Boolean) ((jz5.n) this.H).mo141623x754a37bb()).booleanValue();
    }

    public ka2.f g7() {
        return ka2.f.f387561d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dln;
    }

    public ha2.a h7() {
        r45.hd1 hd1Var = new r45.hd1();
        hd1Var.set(1, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbe));
        return new ha2.a(hd1Var, 0, false, null, null, null, false, 124, null);
    }

    public java.lang.String i7() {
        if (f7()) {
            java.lang.String string = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573517m14);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        java.lang.String string2 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return string2;
    }

    public ka2.f j7() {
        return ka2.f.f387563f;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k7() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.k7():void");
    }

    public void l7() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qvz);
        if (textView != null) {
            dq4.c.f323902a.f(textView);
            textView.setOnClickListener(new ka2.r(this));
            hc2.v0.e(textView, "poi_store_choose_cancel", 8, 0, false, false, null, new ka2.s(this), 60, null);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567879qw1);
        if (textView2 != null) {
            dq4.c.f323902a.f(textView2);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
            textView2.setText(i7());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById(com.p314xaae8f345.mm.R.id.f567878qw0);
        if (c22661xa3a2b3c0 != null) {
            this.f183331y = c22661xa3a2b3c0;
            c22661xa3a2b3c0.setEnabled(this.f183327u != null);
            c22661xa3a2b3c0.setOnClickListener(new ka2.t(this));
            hc2.v0.e(c22661xa3a2b3c0, "poi_store_choose_finish", 8, 0, false, false, null, new ka2.u(this), 60, null);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.qvx);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.qvu);
        android.view.View findViewById = linearLayout != null ? linearLayout.findViewById(com.p314xaae8f345.mm.R.id.qvy) : null;
        if (editText != null) {
            editText.setOnClickListener(ka2.o.f387574d);
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new ka2.p(editText));
        }
        if (editText != null) {
            editText.addTextChangedListener(new ka2.q(findViewById, this));
        }
        android.view.View findViewById2 = linearLayout != null ? linearLayout.findViewById(com.p314xaae8f345.mm.R.id.qvr) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ka2.v vVar = new ka2.v(this);
        ka2.d dVar = this.L;
        dVar.getClass();
        dVar.f387553e = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) vVar.mo146xb9724478(dVar.f387549a);
        dVar.f387554f = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) vVar.mo146xb9724478(dVar.f387550b);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.qvs);
        this.f183330x = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.N(new ka2.i());
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179());
            c1162x665295de.Q(1);
            c22849x81a93d25.mo7967x900dcbe1(c1162x665295de);
            c22849x81a93d25.mo7960x6cab2c8d(dVar.f387553e);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        this.f183329w = c22851x22587864;
        if (c22851x22587864 == null) {
            return;
        }
        c22851x22587864.m82945xba09cf09(new ka2.w(this));
    }

    public final void m7(ha2.a aVar, java.lang.String str, boolean z17) {
        r45.gd1 gd1Var;
        android.content.Intent intent = new android.content.Intent();
        if (aVar.f361325e != 0) {
            r45.hd1 hd1Var = aVar.f361324d;
            intent.putExtra("get_poi_classify_type", hd1Var.m75939xb282bd08(5));
            intent.putExtra("get_poi_address", hd1Var.m75945x2fec8307(3));
            intent.putExtra("get_poi_classify_id", hd1Var.m75945x2fec8307(0));
            intent.putExtra("get_poi_name", hd1Var.m75945x2fec8307(1));
            intent.putExtra("get_city", aVar.f361326f);
            intent.putExtra("get_poi_is_search", false);
            intent.putExtra("key_product_id", str);
            intent.putExtra("key_is_multi_store_promotion", z17);
            java.lang.String m75945x2fec8307 = hd1Var.m75945x2fec8307(0);
            if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && (gd1Var = this.G) != null) {
                intent.putExtra("get_lat", gd1Var.m75938x746dc8a6(1));
                intent.putExtra("get_lng", gd1Var.m75938x746dc8a6(0));
            }
        }
        setResult(-1, intent);
        finish();
    }

    public void o7(ka2.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
        this.K = fVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList parcelableArrayListExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        java.lang.String str;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 10001) {
            if (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_mix_media_list")) == null || (abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) kz5.n0.Z(parcelableArrayListExtra)) == null || (str = abstractC15633xee433078.f219963e) == null) {
                return;
            }
            boolean z17 = abstractC15633xee433078.mo63659xfb85f7b0() == 2;
            android.content.Intent intent2 = new android.content.Intent();
            ka2.e eVar = ka2.e.f387558d;
            intent2.putExtra("key_page_type_ordinal", 1);
            intent2.putExtra("key_media_path", str);
            intent2.putExtra("key_is_video", z17);
            intent2.putExtra("key_media_item", abstractC15633xee433078);
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = this;
            cVar.d(intent2);
            cVar.a("com.tencent.mm.plugin.finder.activity.poi.ui.FInderPoiMediaLbsListUI");
            cVar.h(10002);
            return;
        }
        if (i17 == 10002 && i18 == -1) {
            android.content.Intent intent3 = new android.content.Intent();
            pm0.v.g(intent3, intent, "get_poi_classify_type", 0);
            pm0.v.k(intent3, intent, "get_poi_address");
            pm0.v.k(intent3, intent, "get_poi_classify_id");
            pm0.v.k(intent3, intent, "get_poi_name");
            pm0.v.k(intent3, intent, "get_city");
            pm0.v.k(intent3, intent, "key_product_id");
            pm0.v.d(intent3, intent, "get_poi_is_search", false);
            pm0.v.d(intent3, intent, "key_is_multi_store_promotion", false);
            pm0.v.f(intent3, intent, "get_lat", 0.0f, 4, null);
            pm0.v.f(intent3, intent, "get_lng", 0.0f, 4, null);
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("get_poi_name") : null;
            intent3.putExtra("key_is_from_media", !(stringExtra == null || stringExtra.length() == 0));
            setResult(-1, intent3);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        mo48674x36654fab();
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        i11.e eVar;
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m81170xebf830dc();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderPoiLbsListUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.Tj(this, 12, 1, false);
        aVar.dk(this, getClass().getSimpleName());
        aVar.Ai(this, new ka2.n(this));
        k7();
        l7();
        if (!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13657xd63179af)) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new ka2.g(this)) || (eVar = this.A) == null) {
                return;
            }
            ((i11.h) eVar).l(this.N, true, false, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.util.List list;
        super.onDestroy();
        this.C = true;
        this.f183327u = null;
        i11.e eVar = this.A;
        if (eVar != null) {
            ((i11.h) eVar).m(this.N);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f183330x;
        if (c22849x81a93d25 != null && (list = c22849x81a93d25.H1) != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f183330x = null;
        ka2.d dVar = this.L;
        dVar.f387553e = null;
        dVar.f387554f = null;
        dVar.f387549a.clear();
        dVar.f387550b.clear();
    }
}
