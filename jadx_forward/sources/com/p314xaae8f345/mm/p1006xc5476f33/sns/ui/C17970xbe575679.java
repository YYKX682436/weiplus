package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.LocationWidget */
/* loaded from: classes4.dex */
public class C17970xbe575679 extends android.widget.LinearLayout {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f247862J = 0;
    public float A;
    public float B;
    public float C;
    public int D;
    public final i11.e E;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f5 F;
    public java.lang.String G;
    public final i11.c H;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g5 I;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f247863d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f247864e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f247865f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f247866g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView[] f247867h;

    /* renamed from: i, reason: collision with root package name */
    public int f247868i;

    /* renamed from: m, reason: collision with root package name */
    public int f247869m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f247870n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f247871o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f247872p;

    /* renamed from: q, reason: collision with root package name */
    public float f247873q;

    /* renamed from: r, reason: collision with root package name */
    public float f247874r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f247875s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f247876t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f247877u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f247878v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f247879w;

    /* renamed from: x, reason: collision with root package name */
    public int f247880x;

    /* renamed from: y, reason: collision with root package name */
    public r45.c64 f247881y;

    /* renamed from: z, reason: collision with root package name */
    public int f247882z;

    public C17970xbe575679(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f247866g = new int[]{com.p314xaae8f345.mm.R.id.mav, com.p314xaae8f345.mm.R.id.maw, com.p314xaae8f345.mm.R.id.max, com.p314xaae8f345.mm.R.id.maz, com.p314xaae8f345.mm.R.id.f568269mb0};
        this.f247867h = new android.widget.ImageView[5];
        this.f247873q = -1000.0f;
        this.f247874r = -1000.0f;
        this.f247880x = 0;
        this.f247881y = null;
        this.f247882z = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = -1;
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.E = i11.h.e();
        this.F = null;
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e5(this);
        this.I = null;
        c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
    }

    public static /* synthetic */ android.app.Activity a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17970xbe575679 c17970xbe575679) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        android.app.Activity activity = c17970xbe575679.f247863d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return activity;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClickAfterPermission", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("near_life_scene", 1);
        try {
            r45.c64 c64Var = this.f247881y;
            if (c64Var != null) {
                intent.putExtra("get_poi_item_buf", c64Var.mo14344x5f01b1f6());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocationWidget", e17, "", new java.lang.Object[0]);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247879w)) {
            intent.putExtra("get_poi_classify_id", this.f247879w);
        }
        intent.putExtra("get_lat", this.f247873q);
        intent.putExtra("get_lng", this.f247874r);
        intent.putExtra("request_id", this.G);
        intent.putExtra("show_distance", true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f5 f5Var = this.F;
        if (f5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) f5Var;
            activityC18133x39856dcd.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4 z4Var = activityC18133x39856dcd.f249069u;
            if (z4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7) z4Var;
                p7Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.PicWidget");
                java.util.ArrayList d17 = p7Var.f251697g.d();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = d17.iterator();
                while (it.hasNext()) {
                    fp.n nVar = (fp.n) ((java.util.HashMap) p7Var.f251700j).get((java.lang.String) it.next());
                    if (nVar != null) {
                        arrayList.add(nVar);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.PicWidget");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else if (z4Var instanceof de4.a) {
                de4.a aVar = (de4.a) z4Var;
                aVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
                ee4.b1 b1Var = (ee4.b1) aVar.k(ee4.b1.class);
                b1Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                java.util.List d18 = b1Var.f333211n.d();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = ((java.util.ArrayList) d18).iterator();
                while (it6.hasNext()) {
                    fp.n nVar2 = (fp.n) b1Var.f333212o.get((java.lang.String) it6.next());
                    if (nVar2 != null) {
                        arrayList2.add(nVar2);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicLatLongList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.MultiPicWidget");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reqPicLatLongList", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            }
        }
        j45.l.n(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 10);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(12, 10);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClickAfterPermission", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public final void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        this.f247863d = abstractActivityC21394xb3d2c0cf;
        android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, mo70588x8e08264e(), this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567223in5);
        this.f247864e = findViewById;
        this.f247870n = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.inx);
        this.f247871o = (android.widget.TextView) this.f247864e.findViewById(com.p314xaae8f345.mm.R.id.inm);
        this.f247872p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f247864e.findViewById(com.p314xaae8f345.mm.R.id.inc);
        this.f247865f = inflate.findViewById(com.p314xaae8f345.mm.R.id.mat);
        for (int i17 = 0; i17 < 5; i17++) {
            android.widget.ImageView imageView = (android.widget.ImageView) this.f247865f.findViewById(this.f247866g[i17]);
            android.widget.ImageView[] imageViewArr = this.f247867h;
            imageViewArr[i17] = imageView;
            imageViewArr[i17].setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c5(this, i17));
        }
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d5(this));
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("kpoi_id");
        this.f247879w = stringExtra;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f247873q = abstractActivityC21394xb3d2c0cf.getIntent().getFloatExtra("k_lat", -1000.0f);
            this.f247874r = abstractActivityC21394xb3d2c0cf.getIntent().getFloatExtra("k_lng", -1000.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationWidget", "init: classifyId:%s, lat:%f, lng:%f", this.f247879w, java.lang.Float.valueOf(this.f247873q), java.lang.Float.valueOf(this.f247874r));
            this.f247877u = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("kpoi_name");
            this.f247876t = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Kpoi_address");
            e();
        }
        if (gm0.j1.b().m()) {
            this.f247869m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsPostPOICommentSwitch"), 0);
        } else {
            this.f247869m = 0;
        }
        f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public boolean d(int i17, int i18, android.content.Intent intent) {
        ox.e0 e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (intent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            return true;
        }
        this.f247880x = intent.getIntExtra("get_poi_classify_type", 0);
        this.f247882z = intent.getIntExtra("get_poi_showflag", 0);
        java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!stringExtra.isEmpty()) {
            this.f247877u = stringExtra;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("get_poi_city");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f247878v = stringExtra2;
        float floatExtra = intent.getFloatExtra("get_lat", -1000.0f);
        if (floatExtra != -1000.0f) {
            this.f247873q = floatExtra;
        }
        float floatExtra2 = intent.getFloatExtra("get_lng", -1000.0f);
        if (floatExtra2 != -1000.0f) {
            this.f247874r = floatExtra2;
        }
        this.A = intent.getFloatExtra("get_cur_lat", 0.0f);
        this.B = intent.getFloatExtra("get_cur_lng", 0.0f);
        this.D = intent.getIntExtra("get_loctype", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationWidget", "onActivityResult: lat:%f lng:%f curlat:%f curlng:%f", java.lang.Float.valueOf(this.f247873q), java.lang.Float.valueOf(this.f247874r), java.lang.Float.valueOf(this.A), java.lang.Float.valueOf(this.B));
        this.C = intent.getFloatExtra("get_accuracy", 0.0f);
        intent.getBooleanExtra("get_is_mars", true);
        this.G = intent.getStringExtra("request_id");
        this.f247875s = intent.getByteArrayExtra("location_ctx");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247877u)) {
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            if (!stringExtra3.isEmpty()) {
                this.f247876t = stringExtra3;
            }
            java.lang.String stringExtra4 = intent.getStringExtra("get_poi_classify_id");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            if (!stringExtra4.isEmpty()) {
                this.f247879w = stringExtra4;
            }
            r45.c64 c64Var = new r45.c64();
            this.f247881y = c64Var;
            double d17 = this.f247873q;
            double d18 = this.f247874r;
            try {
                r45.c64 c64Var2 = (r45.c64) c64Var.mo11468x92b714fd(intent.getByteArrayExtra("get_poi_item_buf"));
                this.f247881y = c64Var2;
                d17 = c64Var2.f452862z;
                d18 = c64Var2.f452861y;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocationWidget", e17, "", new java.lang.Object[0]);
                this.f247881y = null;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247879w)) {
                r45.c64 c64Var3 = new r45.c64();
                this.f247881y = c64Var3;
                c64Var3.f452843d = this.f247879w;
                c64Var3.f452852p = this.f247880x;
                c64Var3.f452844e = this.f247877u;
                c64Var3.A = this.f247878v;
                c64Var3.f452862z = d17;
                c64Var3.f452861y = d18;
                java.util.LinkedList linkedList = c64Var3.f452849m;
                r45.du5 du5Var = new r45.du5();
                du5Var.f454289d = this.f247876t;
                du5Var.f454290e = true;
                linkedList.add(du5Var);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247878v)) {
            this.f247873q = -1000.0f;
            this.f247874r = -1000.0f;
            this.f247877u = "";
            this.f247876t = "";
            this.f247878v = "";
            this.f247879w = "";
            this.f247881y = null;
        } else {
            this.f247877u = "";
            this.f247876t = "";
            this.f247879w = "";
            this.f247881y = null;
        }
        java.lang.String str = this.f247877u;
        wa4.l lVar = wa4.l.f525788a;
        java.lang.String str2 = this.f247879w;
        float f17 = this.f247873q;
        float f18 = this.f247874r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkToPreloadPoiBizSource", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPoiPostBizToFeedPageExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPoiPostBizToFeedPageExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        if (wa4.l.f525789b && lVar.a(str2, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsBizPostManager", "checkIsNeedToPreloadPoiBizSource >> isPoiValid");
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((ox.g) oVar).getClass();
            i95.m c17 = i95.n0.c(ox.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ox.e0 e0Var2 = (ox.e0) c17;
            e0Var2.f430999g = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo, poiId=" + str2 + ", poiName=" + str + ", poiLatitude=" + f17 + ", poiLongitude=" + f18 + ", mpPublished=false");
            if (str2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo, poiId is empty");
            } else {
                ox.h0 h0Var = (ox.h0) i95.n0.c(ox.h0.class);
                h0Var.getClass();
                if (str2.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSnsPublishMonitor", "recordRequestStart: poiId is empty");
                    e0Var = e0Var2;
                } else {
                    e0Var = e0Var2;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    h0Var.f431016d.put(str2, java.lang.Long.valueOf(currentTimeMillis));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSnsPublishMonitor", "recordRequestStart: poiId=" + str2 + ", startTime=" + currentTimeMillis);
                }
                r45.aj3 aj3Var = new r45.aj3();
                r45.zp4 zp4Var = new r45.zp4();
                zp4Var.f473806d = str2;
                zp4Var.f473807e = str;
                zp4Var.f473808f = f17;
                zp4Var.f473809g = f18;
                aj3Var.f451583d = zp4Var;
                aj3Var.f451584e = false;
                com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar2.f152200d = 26723;
                lVar2.f152199c = "/cgi-bin/mmbiz-bin/appmsg/getmomentpoiinfo";
                lVar2.f152197a = aj3Var;
                lVar2.f152198b = new r45.bj3();
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), new ox.c0(e0Var, str2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPoiPreload", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Ej("sns_location_request_svr", new java.util.LinkedHashMap(), 36244);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPoiPreload", "com.tencent.mm.plugin.sns.report.SnsTimelineFooterReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkToPreloadPoiBizSource", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        e();
        f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g5 g5Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g5(this);
        this.I = g5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("feed", "com.tencent.mm.plugin.sns.ui.LocationWidget$ReportInfo");
        g5Var.f249934a = intent.getIntExtra("report_index", -1);
        g5Var.f249935b = intent.getLongExtra("first_start_time", 0L);
        g5Var.f249936c = intent.getLongExtra("lastSuccStamp", 0L);
        g5Var.f249937d = intent.getLongExtra("firstSuccStamp", 0L);
        g5Var.f249938e = intent.getIntExtra("reqLoadCnt", 0);
        g5Var.f249939f = intent.getIntExtra("entry_time", 0);
        g5Var.f249940g = intent.getStringExtra("search_id");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("feed", "com.tencent.mm.plugin.sns.ui.LocationWidget$ReportInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return true;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updatePoiName", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (this.f247870n != null && this.f247871o != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247877u)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247878v)) {
                    this.f247870n.setText(this.f247877u);
                } else {
                    this.f247870n.setText(this.f247878v + "\u2006·\u2006" + this.f247877u);
                }
                this.f247870n.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
                this.f247871o.setVisibility(8);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247878v)) {
                this.f247870n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jce);
                this.f247870n.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                this.f247871o.setVisibility(8);
            } else {
                this.f247870n.setText(this.f247878v);
                this.f247870n.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
                this.f247871o.setVisibility(8);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247877u) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247878v)) {
            this.f247872p.s(com.p314xaae8f345.mm.R.raw.f78395x783191b3, com.p314xaae8f345.mm.R.C30859x5a72f63.f560798ui);
        } else {
            this.f247872p.s(com.p314xaae8f345.mm.R.raw.f78396xfc3770d6, com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updatePoiName", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public final void f() {
        int i17;
        android.widget.ImageView[] imageViewArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationWidget", "updateScoreItem scoreSwtich:%d, classifyId:%s, poiClassifyType:%d, showFlag:%d, isOverSea:%b", java.lang.Integer.valueOf(this.f247869m), this.f247879w, java.lang.Integer.valueOf(this.f247880x), java.lang.Integer.valueOf(this.f247882z), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.u9.a()));
        int i18 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u9.a() || this.f247869m == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247879w) || this.f247880x == 1 || (this.f247882z & 1) == 0) {
            android.view.View view = this.f247865f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
            return;
        }
        android.view.View view2 = this.f247865f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/LocationWidget", "updateScoreItem", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        while (true) {
            i17 = this.f247868i;
            imageViewArr = this.f247867h;
            if (i18 >= i17) {
                break;
            }
            imageViewArr[i18].setImageResource(m70592x2c02d946());
            i18++;
        }
        while (i17 < 5) {
            imageViewArr[i17].setImageResource(m70590x87393afa());
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateScoreItem", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    /* renamed from: getCurLocation */
    public r45.ed4 m70587x8f7b8cdf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        r45.ed4 ed4Var = new r45.ed4();
        ed4Var.f454845e = this.A;
        ed4Var.f454844d = this.B;
        ed4Var.f454855r = this.C;
        ed4Var.f454854q = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return ed4Var;
    }

    /* renamed from: getLayoutResource */
    public int mo70588x8e08264e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bss;
    }

    /* renamed from: getLocation */
    public r45.ed4 m70589xed29dd2b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        r45.ed4 ed4Var = new r45.ed4();
        ed4Var.f454845e = this.f247873q;
        ed4Var.f454844d = this.f247874r;
        ed4Var.f454853p = 0;
        ed4Var.f454857t = this.f247868i;
        if (this.f247875s != null) {
            ed4Var.f454856s = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f247875s);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247877u)) {
            ed4Var.f454848h = this.f247876t;
            ed4Var.f454847g = this.f247877u;
            ed4Var.f454849i = this.f247879w;
            ed4Var.f454846f = this.f247878v;
            int i17 = this.f247880x;
            if (i17 == 0) {
                ed4Var.f454850m = 1;
            } else if (i17 == 1) {
                ed4Var.f454850m = 2;
            } else {
                ed4Var.f454850m = 1;
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247878v)) {
            ed4Var.f454846f = this.f247878v;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        if (this.I == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        } else {
            java.lang.String format = java.lang.String.format("%f/%f", java.lang.Float.valueOf(ed4Var.f454845e), java.lang.Float.valueOf(ed4Var.f454844d));
            new java.lang.StringBuilder("index ").append(this.I.f249934a);
            new java.lang.StringBuilder("firstStartStamp ").append(this.I.f249935b);
            new java.lang.StringBuilder("lastSuccStamp ").append(this.I.f249937d);
            new java.lang.StringBuilder("firstSuccStamp ").append(this.I.f249936c);
            new java.lang.StringBuilder("reqLoadCnt ").append(this.I.f249938e);
            new java.lang.StringBuilder("classifyId ").append(this.f247879w);
            new java.lang.StringBuilder("entryTime ").append(this.I.f249939f);
            new java.lang.StringBuilder("searchId").append(this.I.f249940g);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11135, 5, java.lang.Integer.valueOf(this.I.f249934a + 1), java.lang.Long.valueOf(this.I.f249935b), java.lang.Long.valueOf(this.I.f249937d), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(this.I.f249936c), java.lang.Integer.valueOf(this.I.f249938e), format, this.f247879w, java.lang.Integer.valueOf(this.I.f249939f), this.I.f249940g, wo.w0.g(true));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDirectly", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationWidget", "getLocation: lat:%f lng:%f", java.lang.Float.valueOf(this.f247873q), java.lang.Float.valueOf(this.f247874r));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return ed4Var;
    }

    /* renamed from: getNormalStarImageResource */
    public int m70590x87393afa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNormalStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNormalStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.p314xaae8f345.mm.R.raw.f81116xa0c5384d;
    }

    /* renamed from: getNormalStateImageResource */
    public int mo70591x724ba435() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.p314xaae8f345.mm.R.raw.f78395x783191b3;
    }

    /* renamed from: getSelectedStarImageResource */
    public int m70592x2c02d946() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectedStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectedStarImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.p314xaae8f345.mm.R.raw.f81117x70132c81;
    }

    /* renamed from: getSelectedStateImageResource */
    public int mo70593x66b5cf69() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return com.p314xaae8f345.mm.R.raw.f78396xfc3770d6;
    }

    /* renamed from: getShowFlag */
    public int m70594x67a1c57f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowFlag", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        int i17 = this.f247882z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowFlag", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        return i17;
    }

    /* renamed from: setLocationWidgetListener */
    public void m70595x49da5d2f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f5 f5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLocationWidgetListener", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        this.F = f5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLocationWidgetListener", "com.tencent.mm.plugin.sns.ui.LocationWidget");
    }

    public C17970xbe575679(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247866g = new int[]{com.p314xaae8f345.mm.R.id.mav, com.p314xaae8f345.mm.R.id.maw, com.p314xaae8f345.mm.R.id.max, com.p314xaae8f345.mm.R.id.maz, com.p314xaae8f345.mm.R.id.f568269mb0};
        this.f247867h = new android.widget.ImageView[5];
        this.f247873q = -1000.0f;
        this.f247874r = -1000.0f;
        this.f247880x = 0;
        this.f247881y = null;
        this.f247882z = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = -1;
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.E = i11.h.e();
        this.F = null;
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e5(this);
        this.I = null;
        c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
    }
}
