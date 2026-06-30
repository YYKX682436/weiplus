package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* renamed from: com.tencent.mm.plugin.component.editor.EditorUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC13156x6363e8e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements mx1.a, kx1.a, nx1.i {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f178029J = 0;
    public float B;
    public float C;
    public o72.r2 F;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f178030d;

    /* renamed from: e, reason: collision with root package name */
    public fx1.b f178031e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f178032f;

    /* renamed from: g, reason: collision with root package name */
    public qx1.q f178033g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f178034h;

    /* renamed from: i, reason: collision with root package name */
    public nx1.j f178035i;

    /* renamed from: m, reason: collision with root package name */
    public nx1.z f178036m;

    /* renamed from: o, reason: collision with root package name */
    public int f178038o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f178039p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f178041r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f178042s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f178043t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f178044u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f178045v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f178047x;

    /* renamed from: y, reason: collision with root package name */
    public android.app.ProgressDialog f178048y;

    /* renamed from: z, reason: collision with root package name */
    public r45.gp0 f178049z;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f178037n = true;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f178040q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: w, reason: collision with root package name */
    public int f178046w = -1;
    public final java.util.HashMap A = new java.util.HashMap();
    public final android.view.View.OnTouchListener D = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.d1(this);
    public java.lang.Runnable E = null;
    public final java.util.LinkedList G = new java.util.LinkedList();
    public final java.util.concurrent.ConcurrentHashMap H = new java.util.concurrent.ConcurrentHashMap();
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e I = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.i1(this);

    public void U3() {
    }

    public boolean U6() {
        this.E = null;
        qx1.q qVar = this.f178033g;
        if (qVar != null && qVar.f448848i) {
            h7();
            return true;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap.size() <= 0) {
            return false;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar : concurrentHashMap.values()) {
            boolean z17 = cVar.f178077j;
            java.lang.String str = cVar.f178069b;
            if (z17) {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "cancelCurTask send: %s", str);
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "cancelCurTask recv: %s", str);
            }
        }
        concurrentHashMap.clear();
        return true;
    }

    public final void V6(java.util.ArrayList arrayList) {
        if (nx1.d.q().f(0, arrayList.size())) {
            f7();
        } else {
            this.f178048y = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.m1(this));
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n1(this, arrayList));
        }
    }

    public final void W6(java.lang.String str) {
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "mediaInfo is null, videoPath is %s", objArr);
            return;
        }
        int a17 = d17.a();
        ix1.m mVar = new ix1.m();
        mVar.f376861q = true;
        mVar.f376879s = "";
        mVar.f376862r = str;
        mVar.f376880t = a17;
        mVar.f376860p = 6;
        mVar.f376856l = nx1.d.q().k();
        mVar.f376881u = com.p314xaae8f345.mm.vfs.w6.n(str);
        mVar.f376859o = com.p314xaae8f345.mm.vfs.w6.k(str);
        mVar.f376844a = hx1.b.a(mVar.toString(), 18);
        r45.gp0 gp0Var = new r45.gp0();
        this.f178049z = gp0Var;
        gp0Var.h0(4);
        this.f178049z.e0(mVar.f376844a);
        this.f178049z.i0(mVar.f376881u);
        r45.gp0 gp0Var2 = this.f178049z;
        mVar.f376858n = gp0Var2;
        java.lang.String e17 = hx1.b.e(gp0Var2);
        java.lang.String c17 = hx1.b.c(this.f178049z);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "video is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        ts.e eVar = (ts.e) i95.n0.c(ts.e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.o1(this);
        ((ss.a) eVar).getClass();
        nx1.n nVar = new nx1.n(arrayList, e17, c17, mVar, o1Var);
        this.A.put(mVar.f376844a, nVar);
        s75.d.b(nVar, "NoteEditor_importVideo");
    }

    public abstract long X6();

    public abstract r45.jq0 Y6(o72.r2 r2Var);

    public void Z6() {
        ix1.l lVar = new ix1.l();
        lVar.f376871s = "";
        lVar.f376845b = true;
        lVar.f376850g = false;
        lVar.f376846c = 0;
        nx1.d.q().h(false);
        nx1.d.q().b(lVar, false);
        d7();
        k7(true, 50L);
        j7(1, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0485  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7() {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1.a7():void");
    }

    public void b5() {
        int i17;
        nx1.d q17 = nx1.d.q();
        synchronized (q17) {
            if (q17.f422815a != null) {
                i17 = 0;
                while (i17 < q17.f422815a.size()) {
                    if (((ix1.a) q17.f422815a.get(i17)).f376845b) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            i17 = -1;
        }
        ix1.a l17 = nx1.d.q().l(i17);
        if (l17 != null) {
            l17.f376845b = false;
            l17.f376850g = false;
            j3(i17, 0L);
        }
        this.f178040q.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a1(this));
        k7(false, 0L);
        j7(0, 0L);
    }

    public abstract void b7(java.lang.String str, java.lang.String str2, boolean z17);

    public int c7() {
        android.widget.LinearLayout linearLayout = this.f178032f;
        int i17 = (linearLayout == null || linearLayout.getVisibility() != 0) ? 0 : this.f178038o + 0;
        return this.f178033g.f448843d.getVisibility() == 0 ? i17 + this.f178038o : i17;
    }

    public void d5(int i17) {
        try {
            this.f178031e.m8149x8b456734(i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditorActivityUI", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemInserted error,positionStart:%d", java.lang.Integer.valueOf(i17));
        }
    }

    public void d7() {
        this.f178040q.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.q1(this));
    }

    public void e7(int i17, int i18) {
        try {
            this.f178031e.m8151xc67946d3(i17, i18);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public void f3(android.widget.TextView textView) {
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.r(textView.getContext(), textView, (int) textView.getTextSize(), null, null, 0);
    }

    public void f7() {
        b5();
        if (this.f178037n) {
            ox1.s.h().c();
        }
        android.app.ProgressDialog progressDialog = this.f178048y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f178048y = null;
        }
        this.f178040q.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.s0(this), 100L);
    }

    public void g7() {
        db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.t0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a5v;
    }

    public void h7() {
        db5.e1.s(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574308ht3), null);
    }

    public void i0(int i17, int i18) {
        try {
            this.f178031e.m8153xd399a4d9(i17, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditorActivityUI", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemRangeInserted error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public void i7(boolean z17) {
        nx1.z zVar = this.f178036m;
        this.f178043t = z17;
        zVar.f422867d = z17;
        ox1.s.h().f431148a = z17;
        ix1.a l17 = nx1.d.q().l(0);
        if (l17 != null) {
            nx1.d.q().i();
            l17.f376845b = true;
            l17.f376850g = false;
            l17.f376846c = -1;
        } else {
            ix1.l lVar = new ix1.l();
            lVar.f376871s = "";
            lVar.f376845b = true;
            lVar.f376850g = false;
            nx1.d.q().b(lVar, false);
        }
        k7(true, 300L);
        j7(1, 0L);
        this.f178030d.setOnTouchListener(this.D);
        d7();
    }

    public void j3(int i17, long j17) {
        this.f178040q.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1(this, i17), j17);
    }

    public void j7(int i17, long j17) {
        if (this.f178043t) {
            this.f178033g.c(i17, j17);
        }
    }

    public void k7(boolean z17, long j17) {
        if (this.f178043t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "setVKBVisibility setShow[%b], delay[%d]", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
            this.f178040q.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.x0(this, z17), j17);
        }
    }

    public final void l7(r45.gp0 gp0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a aVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u)) {
            java.lang.String wi6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi();
            gp0Var.a0(wi6);
            gp0Var.c0(((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "local not exist cdn data key, generate CDNkey:%s, thumbKey:%s", wi6, gp0Var.f456953m);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c(gp0Var, true, aVar, 0);
        this.H.put(cVar.f178069b, cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d.c(cVar);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f178046w = i17;
        if (i18 != -1) {
            this.f178045v = false;
            return;
        }
        this.f178045v = true;
        switch (i17) {
            case 4096:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "onActivityResult back from gallery");
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "no pic selected");
                } else {
                    V6(stringArrayListExtra);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                java.lang.String stringExtra = intent.getStringExtra("K_SEGMENTVIDEOPATH");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && stringArrayListExtra2 == null) {
                    stringArrayListExtra2 = new java.util.ArrayList<>();
                    stringArrayListExtra2.add(stringExtra);
                }
                if (stringArrayListExtra2 == null || stringArrayListExtra2.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "no video selected");
                    return;
                } else if (nx1.d.q().f(0, stringArrayListExtra2.size())) {
                    f7();
                    return;
                } else {
                    W6(stringArrayListExtra2.get(0));
                    return;
                }
            case 4097:
            default:
                return;
            case 4098:
                if (nx1.d.q().f(0, 1)) {
                    f7();
                    return;
                }
                ix1.e eVar = new ix1.e();
                eVar.f376864t = (float) intent.getDoubleExtra("kwebmap_slat", 0.0d);
                eVar.f376865u = (float) intent.getDoubleExtra("kwebmap_lng", 0.0d);
                eVar.f376866v = intent.getIntExtra("kwebmap_scale", 0);
                java.lang.String stringExtra2 = intent.getStringExtra("Kwebmap_locaion");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                eVar.f376867w = stringExtra2;
                eVar.f376863s = intent.getStringExtra("kPoiName");
                eVar.f376856l = nx1.d.q().k();
                eVar.f376860p = 3;
                eVar.f376861q = true;
                eVar.f376862r = "";
                java.lang.String stringExtra3 = intent.getStringExtra("kPoiid");
                eVar.f376868x = stringExtra3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                    eVar.f376868x = intent.getStringExtra("kNearByPoiid");
                }
                eVar.f376869y = intent.getBooleanExtra("KIsFromPoiList", false);
                eVar.f376870z = intent.getStringExtra("KPoiCategoryTips");
                eVar.A = intent.getStringExtra("kPoiBusinessHour");
                eVar.B = intent.getStringExtra("KPoiPhone");
                eVar.C = intent.getFloatExtra("KPoiPriceTips", 0.0f);
                eVar.D = intent.getStringExtra("kBuildingID");
                eVar.E = intent.getStringExtra("kFloorName");
                nx1.d.q().r(eVar, this.f178036m.c(), true, true, false, false, false);
                return;
            case 4099:
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("selected_file_lst");
                java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("selected_file_title_lst");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(stringArrayListExtra3) || stringArrayListExtra3.size() == 0) {
                    return;
                }
                for (int i19 = 0; i19 < stringArrayListExtra3.size(); i19++) {
                    java.lang.String str = stringArrayListExtra3.get(i19);
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
                    if (!r6Var.m()) {
                        return;
                    }
                    if (r6Var.C() >= ip.c.g()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "exceed MaxFileSize");
                        f7();
                        return;
                    } else {
                        if (nx1.d.q().f(0, stringArrayListExtra3.size())) {
                            f7();
                            return;
                        }
                        java.lang.String str2 = stringArrayListExtra4.get(i19);
                        if (this.f178048y == null) {
                            this.f178048y = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.k1(this));
                        }
                        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.l1(this, str, str2));
                    }
                }
                return;
            case 4100:
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                if (c16991x15ced046 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "sight capture result is null!");
                    return;
                }
                java.lang.String str3 = c16991x15ced046.f237194e;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    W6(str3);
                }
                if (!c16991x15ced046.f237197h.booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16991x15ced046.f237195f)) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(c16991x15ced046.f237195f);
                V6(arrayList);
                return;
            case 4101:
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
                if (c16527xe4fc886 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "sight capture result is null!");
                    return;
                }
                java.lang.String str4 = c16527xe4fc886.f230342g;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    W6(str4);
                }
                if (!c16527xe4fc886.f230340e || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16527xe4fc886.f230348p)) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(c16527xe4fc886.f230348p);
                V6(arrayList2);
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onCancel */
    public void mo2293x3d6f0539() {
        super.mo2293x3d6f0539();
        if (this.f178037n) {
            ox1.s.h().x(false);
            ox1.s.h().z(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78497xc03943d(true);
        super.onCreate(bundle);
        this.f178043t = getIntent().getBooleanExtra("KEY_EDITABLE", true);
        this.f178044u = getIntent().getStringExtra("KEY_CONTENT_XML");
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_CONTENT_PURE_TEXT", false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178044u)) {
            this.f178044u = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "mCollectEditable: %s, mCollectContentXml: %s, pureText:%b", java.lang.Boolean.valueOf(this.f178043t), this.f178044u, java.lang.Boolean.valueOf(booleanExtra));
        nx1.d q17 = nx1.d.q();
        q17.getClass();
        q17.f422815a = new java.util.ArrayList();
        q17.f422816b = this;
        q17.f422817c = new r45.gp0();
        q17.f422818d = 0;
        q17.f422819e = 0;
        q17.f422820f = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d.b(this.I);
        m78513xc2a54588().getRootView().setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        nx1.z zVar = new nx1.z(this);
        this.f178036m = zVar;
        zVar.f422867d = this.f178043t;
        this.f178030d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.d7x);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.c2m);
        this.f178032f = linearLayout;
        this.f178033g = new qx1.q(this.f178036m, linearLayout, this, X6());
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.d8m);
        this.f178034h = relativeLayout;
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.j1(this));
        this.f178035i = new nx1.j(this, this.f178034h, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f.C13157x77477b31 c13157x77477b31 = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f.C13157x77477b31(this);
        c13157x77477b31.f178056w = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.f(this)[1];
        this.f178030d.mo7967x900dcbe1(c13157x77477b31);
        this.f178030d.m7963x830bc99d(true);
        this.f178030d.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.r1(this));
        fx1.b bVar = new fx1.b(this.f178036m);
        this.f178031e = bVar;
        this.f178030d.mo7960x6cab2c8d(bVar);
        this.f178030d.m7949x5701d990().f93701c = 0L;
        this.f178030d.m7949x5701d990().f93704f = 0L;
        this.f178030d.m7949x5701d990().f93703e = 0L;
        this.f178030d.m7949x5701d990().f93702d = 120L;
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) this.f178030d.m7949x5701d990()).f93715g = false;
        this.f178038o = i65.a.b(this, 48);
        if (this.f178037n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "use multiselect");
            int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560439kd);
            ox1.s h17 = ox1.s.h();
            boolean z17 = this.f178043t;
            h17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "onInit start");
            h17.f431148a = z17;
            h17.f431151d = 14;
            h17.f431152e = 32;
            h17.f431153f = i65.a.b(this, 21) - h17.f431152e;
            h17.f431154g = i65.a.b(this, 40) + (h17.f431152e * 2);
            h17.f431155h = i65.a.b(this, 240) + (h17.f431152e * 2);
            h17.f431149b = i65.a.b(this, 22);
            h17.f431150c = i65.a.b(this, 2);
            h17.f431157j = getResources().getDisplayMetrics().heightPixels;
            h17.f431158k = getResources().getDisplayMetrics().widthPixels;
            h17.f431161n = new int[]{-1, -1};
            h17.f431162o = new int[]{-1, -1};
            h17.f431163p = new int[]{-1, -1};
            h17.f431164q = new int[]{-1, -1};
            ox1.b bVar2 = new ox1.b(this, 2, h17.f431149b, h17.f431150c, color, h17);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) bVar2, bVar2.m157333xa135536b(), bVar2.m157331x6ba62022(), false);
            h17.f431165r = popupWindow;
            popupWindow.setClippingEnabled(false);
            h17.f431165r.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576307vu);
            h17.f431159l = bVar2.m157329xf3330e72();
            h17.f431160m = i65.a.b(this, 6);
            ox1.b bVar3 = new ox1.b(this, 3, h17.f431149b, h17.f431150c, color, h17);
            android.widget.PopupWindow popupWindow2 = new android.widget.PopupWindow((android.view.View) bVar3, bVar3.m157333xa135536b(), bVar2.m157331x6ba62022(), false);
            h17.f431166s = popupWindow2;
            popupWindow2.setClippingEnabled(false);
            h17.f431166s.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576306vt);
            ox1.b bVar4 = new ox1.b(this, 4, h17.f431149b, h17.f431150c, color, h17);
            android.widget.PopupWindow popupWindow3 = new android.widget.PopupWindow((android.view.View) bVar4, bVar4.m157333xa135536b(), bVar2.m157331x6ba62022(), false);
            h17.f431167t = popupWindow3;
            popupWindow3.setClippingEnabled(false);
            h17.f431167t.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576308vv);
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5m, (android.view.ViewGroup) null);
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            android.widget.PopupWindow popupWindow4 = new android.widget.PopupWindow(inflate, -2, -2, false);
            h17.f431168u = popupWindow4;
            popupWindow4.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cfs));
            h17.f431168u.setClippingEnabled(false);
            h17.f431168u.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576310vx);
            h17.B = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ke7);
            h17.C = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567697kf2);
            h17.D = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kex);
            h17.E = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kew);
            h17.F = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.keg);
            h17.G = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kef);
            h17.H = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kee);
            h17.I = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kes);
            h17.w(h17.B, h17.f431151d);
            h17.w(h17.C, h17.f431151d);
            h17.w(h17.D, h17.f431151d);
            h17.w(h17.E, h17.f431151d);
            h17.w(h17.F, h17.f431151d);
            h17.w(h17.G, h17.f431151d);
            h17.w(h17.H, h17.f431151d);
            h17.w(h17.I, h17.f431151d);
            h17.B.setOnClickListener(new ox1.o(h17));
            h17.C.setOnClickListener(new ox1.p(h17));
            h17.D.setOnClickListener(new ox1.q(h17));
            h17.E.setOnClickListener(new ox1.r(h17));
            h17.F.setOnClickListener(new ox1.f(h17));
            h17.G.setOnClickListener(new ox1.g(h17));
            h17.H.setOnClickListener(new ox1.h(h17));
            h17.I.setOnClickListener(new ox1.i(h17));
            h17.f431156i = bVar2.m157332xa9348c76();
            h17.f431169v = this;
            h17.f431170w = new ox1.e();
            h17.f431171x = new ox1.c();
            h17.A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
            ox1.s.K = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "onInit end");
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e1(this);
            this.f178039p = e1Var;
            this.f178030d.i(e1Var);
        }
        if (getF147381t()) {
            m78735x28280f95().m81450x8e764904(false);
        }
        if (booleanExtra || this.f178044u.isEmpty()) {
            if (!this.f178044u.isEmpty()) {
                ix1.l lVar = new ix1.l();
                lVar.f376871s = this.f178044u;
                lVar.f376845b = false;
                lVar.f376850g = false;
                nx1.d.q().b(lVar, false);
                d7();
            }
        } else if (this.f178044u.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "no need update ui by xml!!! xml is empty.");
        } else {
            this.F = o72.x1.B(this.f178044u, 18);
            java.util.LinkedList linkedList = this.G;
            linkedList.clear();
            linkedList.addAll(this.F.f67640x5ab01132.f452497f);
            if (linkedList.size() != 0) {
                this.H.clear();
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        a7();
                        break;
                    }
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    if ("WeNoteHtmlFile".equals(gp0Var.P1)) {
                        java.lang.String c17 = hx1.b.c(gp0Var);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) && !com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c((r45.gp0) linkedList.get(0), false, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a.TYPE_FILE, -1));
                            break;
                        }
                    }
                }
            }
        }
        if (this.f178043t) {
            i7(true);
        } else {
            this.f178032f.setVisibility(8);
        }
        gh5.d.a(this).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.z0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f178037n) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f178030d;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.V0(this.f178039p);
            }
            ox1.s h17 = ox1.s.h();
            h17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "onDestroy");
            ox1.s.K = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = h17.f431172y;
            if (b4Var != null) {
                b4Var.d();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = h17.f431173z;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            android.widget.PopupWindow popupWindow = h17.f431165r;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            android.widget.PopupWindow popupWindow2 = h17.f431166s;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            android.widget.PopupWindow popupWindow3 = h17.f431167t;
            if (popupWindow3 != null) {
                popupWindow3.dismiss();
            }
            android.widget.PopupWindow popupWindow4 = h17.f431168u;
            if (popupWindow4 != null) {
                popupWindow4.dismiss();
            }
            ox1.s.f431147J = null;
        }
        rx1.d b17 = rx1.d.b();
        b17.e();
        b17.f482486o = null;
        b17.f482483i = null;
        ((java.util.LinkedList) b17.f482487p).clear();
        rx1.d.f482477q = null;
        if (hx1.g.f367155q != null) {
            hx1.g.f367155q = null;
        }
        nx1.d q17 = nx1.d.q();
        q17.f422816b = null;
        java.util.ArrayList arrayList = q17.f422815a;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ix1.a aVar = (ix1.a) it.next();
                aVar.f376849f = null;
                aVar.f376847d = null;
                aVar.f376848e = null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d;
        ((java.util.ArrayList) fVar.f178087a).remove(this.I);
        fVar.d();
        fVar.d();
        fVar.f178088b.clear();
        ((java.util.ArrayList) fVar.f178087a).clear();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onDrag */
    public void mo2294xc398a7b3() {
        super.mo2294xc398a7b3();
        if (this.f178037n) {
            ox1.s.h().n();
            ox1.s.h().p();
        }
        if (this.f178042s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "onSwipeBack close vkb");
            mo48674x36654fab();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        qx1.q qVar = this.f178033g;
        if (qVar != null) {
            qVar.d(this);
        }
        if (rx1.d.b().c()) {
            rx1.d.b().e();
        }
        this.f178047x = this.f178042s;
        k7(false, 0L);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64) {
            if (i17 == 80 && iArr[0] != 0) {
                g7();
                return;
            }
            return;
        }
        if (!u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null)) || iArr[0] == 0) {
            return;
        }
        db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.v0(this), null);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f178043t) {
            int i17 = this.f178046w;
            if (i17 != -1) {
                if (i17 != 4096) {
                    switch (i17) {
                        case 4098:
                        case 4099:
                            k7(true, 100L);
                            j7(1, 0L);
                            break;
                    }
                }
                if (!this.f178045v) {
                    k7(true, 100L);
                    j7(1, 0L);
                }
            } else if (this.f178047x) {
                k7(true, 100L);
                j7(1, 0L);
            }
        }
        this.f178046w = -1;
        this.f178045v = false;
    }

    public void q0(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.t1.class);
    }

    public void x1(int i17) {
        try {
            this.f178031e.m8155x27702c4(i17);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemRemoved error,positionStart:%d", java.lang.Integer.valueOf(i17));
        }
    }
}
