package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI */
/* loaded from: classes15.dex */
public class ActivityC16728x9d7ca51d extends com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k V;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k W;
    public java.util.ArrayList X;

    /* renamed from: x0, reason: collision with root package name */
    public r45.c64 f233787x0;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f233789y0;
    public u60.f Y = null;
    public java.lang.String Z = "";

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f233785p0 = "";

    /* renamed from: l1, reason: collision with root package name */
    public boolean f233784l1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f233786p1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f233788x1 = true;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f233790y1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public final android.view.View.OnClickListener f233791z1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.m(this);
    public final android.view.View.OnClickListener A1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.n(this);
    public final u60.e B1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.o(this);

    public static void f7(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16728x9d7ca51d activityC16728x9d7ca51d, android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 c20989xcfc00935;
        int h17;
        activityC16728x9d7ca51d.getClass();
        if (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.l) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.l) view.getTag();
            dn3.i iVar = lVar.f233865b;
            android.content.Intent intent = new android.content.Intent();
            try {
                intent.putExtra("get_poi_item_buf", iVar.f323547i.mo14344x5f01b1f6());
                intent.putExtra("location_ctx", iVar.f323544f.f453374f.f273689a);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CheckInLifeUI", e17, "", new java.lang.Object[0]);
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar = activityC16728x9d7ca51d.W;
                java.lang.String str = lVar.f233871h;
                java.util.HashMap hashMap = (java.util.HashMap) kVar.f233840o;
                c20989xcfc00935 = hashMap.containsKey(str) ? (com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935) hashMap.get(str) : null;
                h17 = activityC16728x9d7ca51d.W.h(lVar.f233871h);
                activityC16728x9d7ca51d.Z6(h17, true, lVar.f233871h, activityC16728x9d7ca51d.f233784l1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar2 = activityC16728x9d7ca51d.V;
                java.lang.String str2 = lVar.f233871h;
                java.util.HashMap hashMap2 = (java.util.HashMap) kVar2.f233840o;
                c20989xcfc00935 = hashMap2.containsKey(str2) ? (com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935) hashMap2.get(str2) : null;
                h17 = activityC16728x9d7ca51d.V.h(lVar.f233871h);
                activityC16728x9d7ca51d.Z6(h17, false, lVar.f233871h, activityC16728x9d7ca51d.f233784l1);
            }
            intent.putExtra("report_index", h17);
            intent.putExtra("first_start_time", activityC16728x9d7ca51d.f233783z);
            intent.putExtra("lastSuccStamp", activityC16728x9d7ca51d.B);
            intent.putExtra("firstSuccStamp", activityC16728x9d7ca51d.A);
            intent.putExtra("reqLoadCnt", activityC16728x9d7ca51d.C);
            intent.putExtra("entry_time", activityC16728x9d7ca51d.P);
            intent.putExtra("search_id", iVar.f323539a);
            intent.putExtra("request_id", iVar.f323546h);
            if (c20989xcfc00935 == null) {
                r45.d64 d64Var = activityC16728x9d7ca51d.f233777t;
                c20989xcfc00935 = d64Var == null ? new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(-85.0f, -1000.0f) : new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(d64Var.f453708e, d64Var.f453707d);
            }
            int i17 = iVar.f323543e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckInLifeUI", "lbs.Type %d", java.lang.Integer.valueOf(i17));
            int i18 = lVar.f233864a;
            if (i18 == 0) {
                intent.putExtra("get_poi_data_type", 2);
                intent.putExtra("get_lat", c20989xcfc00935.f273942d);
                intent.putExtra("get_lng", c20989xcfc00935.f273943e);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16728x9d7ca51d.Z)) {
                    intent.putExtra("get_city", activityC16728x9d7ca51d.Z);
                }
                intent.putExtra("get_poi_classify_type", i17);
                intent.putExtra("get_poi_address", com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a.f(iVar.f323542d));
                intent.putExtra("get_poi_classify_id", iVar.f323540b);
                intent.putExtra("get_poi_name", iVar.f323541c);
                intent.putExtra("get_poi_showflag", iVar.f323545g);
                intent.putExtra("get_poi_city", iVar.f323550l);
            } else if (i18 == 1) {
                intent.putExtra("get_poi_data_type", 1);
                intent.putExtra("get_lat", c20989xcfc00935.f273942d);
                intent.putExtra("get_lng", c20989xcfc00935.f273943e);
                intent.putExtra("get_city", iVar.f323541c);
                intent.putExtra("get_poi_city", iVar.f323541c);
                intent.putExtra("get_ad_code", iVar.f323552n);
            } else if (i18 == 2) {
                intent.putExtra("get_poi_data_type", 0);
            }
            intent.putExtra("get_cur_lat", activityC16728x9d7ca51d.f233778u);
            intent.putExtra("get_cur_lng", activityC16728x9d7ca51d.f233779v);
            intent.putExtra("get_accuracy", activityC16728x9d7ca51d.f233781x);
            intent.putExtra("get_loctype", activityC16728x9d7ca51d.f233780w);
            intent.putExtra("get_is_mars", activityC16728x9d7ca51d.f233782y);
            intent.putExtra("get_poi_is_search", z17);
            activityC16728x9d7ca51d.setResult(-1, intent);
            activityC16728x9d7ca51d.finish();
        }
        activityC16728x9d7ca51d.mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1
    public boolean V6() {
        return getIntent().getBooleanExtra("can_show_create_poi_tips", true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a X6() {
        if (this.X == null) {
            this.X = g7(getIntent().getStringArrayListExtra("lat_long_list"));
        }
        if (getIntent().getStringExtra("select_radio_icon_color") != null) {
            this.f233789y0 = getIntent().getStringExtra("select_radio_icon_color");
        }
        if (getIntent().getStringExtra("select_radio_icon_color") != null && getIntent().getStringExtra("get_poi_from_scene").equals("story")) {
            this.f233784l1 = true;
            this.f233763J = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar = this.V;
        if (kVar != null) {
            return kVar;
        }
        this.V = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k(this, this.f233791z1, "viewlist", this.Q, false, this.f233789y0, this.f233786p1);
        java.util.ArrayList arrayList = this.X;
        if (arrayList != null && arrayList.size() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = this.X;
            arrayList2.add((com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935) arrayList3.get(arrayList3.size() - 1));
            com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar2 = this.V;
            kVar2.f233837i = arrayList2;
            kVar2.f233842q = false;
        }
        return this.V;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.a Y6() {
        if (this.X == null) {
            this.X = g7(getIntent().getStringArrayListExtra("lat_long_list"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar = this.W;
        if (kVar != null) {
            return kVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k(this, this.A1, "searchlist", this.Q, true, this.f233789y0, this.f233786p1);
        this.W = kVar2;
        java.util.ArrayList arrayList = this.X;
        if (arrayList != null) {
            kVar2.f233837i = arrayList;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar3 = this.W;
        kVar3.f233842q = true;
        return kVar3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1
    public void a7(double d17, double d18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckInLifeUI", "checkinLife got address %f %f", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18));
        if (this.Y == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Z)) {
            return;
        }
        u60.h hVar = new u60.h(d17, d18);
        ((i11.g) this.Y).b(hVar, this.B1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1
    public void b7(double d17, double d18) {
        if (this.f233790y1) {
            double[] dArr = {d17, d18};
            double[] dArr2 = new double[2];
            com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34971xde5778f6(dArr, dArr2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckInLifeUI", "onSelfLatLng: wgs[%f,%f] -> gcj[%f,%f]", java.lang.Double.valueOf(dArr[0]), java.lang.Double.valueOf(dArr[1]), java.lang.Double.valueOf(dArr2[0]), java.lang.Double.valueOf(dArr2[1]));
            double d19 = dArr2[0];
            double d27 = dArr2[1];
            this.V.m(d19, d27);
            this.W.m(d19, d27);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1
    public void c7() {
        super.c7();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g7(java.util.ArrayList r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L60
            int r0 = r6.size()
            if (r0 != 0) goto L9
            goto L60
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "\n"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 2
            if (r3 == r2) goto L29
            goto L12
        L29:
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData r2 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData     // Catch: java.lang.NumberFormatException -> L12
            r3 = 0
            r3 = r1[r3]     // Catch: java.lang.NumberFormatException -> L12
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L12
            float r3 = r3.floatValue()     // Catch: java.lang.NumberFormatException -> L12
            r4 = 1
            r1 = r1[r4]     // Catch: java.lang.NumberFormatException -> L12
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L12
            float r1 = r1.floatValue()     // Catch: java.lang.NumberFormatException -> L12
            r2.<init>(r3, r1)     // Catch: java.lang.NumberFormatException -> L12
            r0.add(r2)     // Catch: java.lang.NumberFormatException -> L12
            goto L12
        L48:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "parse list end, size: "
            r6.<init>(r1)
            int r1 = r0.size()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "MicroMsg.CheckInLifeUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
            return r0
        L60:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16728x9d7ca51d.g7(java.util.ArrayList):java.util.ArrayList");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c5y;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f233786p1 = getIntent().getBooleanExtra("is_force_dark_mode", false);
        this.f233788x1 = getIntent().getBooleanExtra("show_city", true);
        this.f233790y1 = getIntent().getBooleanExtra("show_distance", false);
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.h5n);
        this.Y = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();
        this.f233787x0 = new r45.c64();
        this.f233785p0 = getIntent().getStringExtra("get_poi_classify_id");
        try {
            r45.c64 c64Var = (r45.c64) this.f233787x0.mo11468x92b714fd(getIntent().getByteArrayExtra("get_poi_item_buf"));
            this.f233787x0 = c64Var;
            if (c64Var != null) {
                this.f233785p0 = c64Var.f452843d;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CheckInLifeUI", e17, "", new java.lang.Object[0]);
            this.f233787x0 = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f233785p0)) {
            this.Z = getIntent().getStringExtra("get_city");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Z) && this.f233788x1) {
            this.f233785p0 = this.V.l(this.Z, "", "").f323540b;
        }
        this.V.f233858v = this.f233785p0;
        r45.c64 c64Var2 = this.f233787x0;
        if (c64Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c64Var2.f452843d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.k kVar = this.V;
            dn3.i iVar = new dn3.i("", this.f233787x0);
            if (kVar.f233857u == null) {
                kVar.a(iVar, 1);
            } else {
                kVar.a(iVar, 2);
            }
        }
        if (this.f233786p1) {
            mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7));
            m78559x68e5fd88(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
            mo54451xb23a6b0d(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
            this.f233764d.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u);
            m78567x3bd95720(true);
            this.H.f291860l = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u60.f fVar = this.Y;
        if (fVar != null) {
            ((i11.g) fVar).c(this.B1);
        }
        dx1.g.f326022a.j("SnsPublishProcess", "poiPageStaytime_", java.lang.Long.valueOf(mo78509x4b0ac5a2()), bx1.u.f117843e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
