package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public abstract class EditorUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements mx1.a, kx1.a, nx1.i {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f96496J = 0;
    public float B;
    public float C;
    public o72.r2 F;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f96497d;

    /* renamed from: e, reason: collision with root package name */
    public fx1.b f96498e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f96499f;

    /* renamed from: g, reason: collision with root package name */
    public qx1.q f96500g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f96501h;

    /* renamed from: i, reason: collision with root package name */
    public nx1.j f96502i;

    /* renamed from: m, reason: collision with root package name */
    public nx1.z f96503m;

    /* renamed from: o, reason: collision with root package name */
    public int f96505o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f96506p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f96508r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f96509s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f96510t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f96511u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f96512v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f96514x;

    /* renamed from: y, reason: collision with root package name */
    public android.app.ProgressDialog f96515y;

    /* renamed from: z, reason: collision with root package name */
    public r45.gp0 f96516z;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f96504n = true;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f96507q = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: w, reason: collision with root package name */
    public int f96513w = -1;
    public final java.util.HashMap A = new java.util.HashMap();
    public final android.view.View.OnTouchListener D = new com.tencent.mm.plugin.component.editor.d1(this);
    public java.lang.Runnable E = null;
    public final java.util.LinkedList G = new java.util.LinkedList();
    public final java.util.concurrent.ConcurrentHashMap H = new java.util.concurrent.ConcurrentHashMap();
    public final com.tencent.mm.plugin.component.editor.e I = new com.tencent.mm.plugin.component.editor.i1(this);

    public void U3() {
    }

    public boolean U6() {
        this.E = null;
        qx1.q qVar = this.f96500g;
        if (qVar != null && qVar.f367315i) {
            h7();
            return true;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap.size() <= 0) {
            return false;
        }
        for (com.tencent.mm.plugin.component.editor.c cVar : concurrentHashMap.values()) {
            boolean z17 = cVar.f96544j;
            java.lang.String str = cVar.f96536b;
            if (z17) {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "cancelCurTask send: %s", str);
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "cancelCurTask recv: %s", str);
            }
        }
        concurrentHashMap.clear();
        return true;
    }

    public final void V6(java.util.ArrayList arrayList) {
        if (nx1.d.q().f(0, arrayList.size())) {
            f7();
        } else {
            this.f96515y = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.component.editor.m1(this));
            gm0.j1.e().j(new com.tencent.mm.plugin.component.editor.n1(this, arrayList));
        }
    }

    public final void W6(java.lang.String str) {
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "mediaInfo is null, videoPath is %s", objArr);
            return;
        }
        int a17 = d17.a();
        ix1.m mVar = new ix1.m();
        mVar.f295328q = true;
        mVar.f295346s = "";
        mVar.f295329r = str;
        mVar.f295347t = a17;
        mVar.f295327p = 6;
        mVar.f295323l = nx1.d.q().k();
        mVar.f295348u = com.tencent.mm.vfs.w6.n(str);
        mVar.f295326o = com.tencent.mm.vfs.w6.k(str);
        mVar.f295311a = hx1.b.a(mVar.toString(), 18);
        r45.gp0 gp0Var = new r45.gp0();
        this.f96516z = gp0Var;
        gp0Var.h0(4);
        this.f96516z.e0(mVar.f295311a);
        this.f96516z.i0(mVar.f295348u);
        r45.gp0 gp0Var2 = this.f96516z;
        mVar.f295325n = gp0Var2;
        java.lang.String e17 = hx1.b.e(gp0Var2);
        java.lang.String c17 = hx1.b.c(this.f96516z);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "video is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        ts.e eVar = (ts.e) i95.n0.c(ts.e.class);
        com.tencent.mm.plugin.component.editor.o1 o1Var = new com.tencent.mm.plugin.component.editor.o1(this);
        ((ss.a) eVar).getClass();
        nx1.n nVar = new nx1.n(arrayList, e17, c17, mVar, o1Var);
        this.A.put(mVar.f295311a, nVar);
        s75.d.b(nVar, "NoteEditor_importVideo");
    }

    public abstract long X6();

    public abstract r45.jq0 Y6(o72.r2 r2Var);

    public void Z6() {
        ix1.l lVar = new ix1.l();
        lVar.f295338s = "";
        lVar.f295312b = true;
        lVar.f295317g = false;
        lVar.f295313c = 0;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.component.editor.EditorUI.a7():void");
    }

    public void b5() {
        int i17;
        nx1.d q17 = nx1.d.q();
        synchronized (q17) {
            if (q17.f341282a != null) {
                i17 = 0;
                while (i17 < q17.f341282a.size()) {
                    if (((ix1.a) q17.f341282a.get(i17)).f295312b) {
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
            l17.f295312b = false;
            l17.f295317g = false;
            j3(i17, 0L);
        }
        this.f96507q.post(new com.tencent.mm.plugin.component.editor.a1(this));
        k7(false, 0L);
        j7(0, 0L);
    }

    public abstract void b7(java.lang.String str, java.lang.String str2, boolean z17);

    public int c7() {
        android.widget.LinearLayout linearLayout = this.f96499f;
        int i17 = (linearLayout == null || linearLayout.getVisibility() != 0) ? 0 : this.f96505o + 0;
        return this.f96500g.f367310d.getVisibility() == 0 ? i17 + this.f96505o : i17;
    }

    public void d5(int i17) {
        try {
            this.f96498e.notifyItemInserted(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditorActivityUI", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemInserted error,positionStart:%d", java.lang.Integer.valueOf(i17));
        }
    }

    public void d7() {
        this.f96507q.post(new com.tencent.mm.plugin.component.editor.q1(this));
    }

    public void e7(int i17, int i18) {
        try {
            this.f96498e.notifyItemRangeChanged(i17, i18);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public void f3(android.widget.TextView textView) {
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.c0.r(textView.getContext(), textView, (int) textView.getTextSize(), null, null, 0);
    }

    public void f7() {
        b5();
        if (this.f96504n) {
            ox1.s.h().c();
        }
        android.app.ProgressDialog progressDialog = this.f96515y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f96515y = null;
        }
        this.f96507q.postDelayed(new com.tencent.mm.plugin.component.editor.s0(this), 100L);
    }

    public void g7() {
        db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.component.editor.t0(this), new com.tencent.mm.plugin.component.editor.u0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a5v;
    }

    public void h7() {
        db5.e1.s(getContext(), getString(com.tencent.mm.R.string.f492775ht3), null);
    }

    public void i0(int i17, int i18) {
        try {
            this.f96498e.notifyItemRangeInserted(i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditorActivityUI", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemRangeInserted error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public void i7(boolean z17) {
        nx1.z zVar = this.f96503m;
        this.f96510t = z17;
        zVar.f341334d = z17;
        ox1.s.h().f349615a = z17;
        ix1.a l17 = nx1.d.q().l(0);
        if (l17 != null) {
            nx1.d.q().i();
            l17.f295312b = true;
            l17.f295317g = false;
            l17.f295313c = -1;
        } else {
            ix1.l lVar = new ix1.l();
            lVar.f295338s = "";
            lVar.f295312b = true;
            lVar.f295317g = false;
            nx1.d.q().b(lVar, false);
        }
        k7(true, 300L);
        j7(1, 0L);
        this.f96497d.setOnTouchListener(this.D);
        d7();
    }

    public void j3(int i17, long j17) {
        this.f96507q.postDelayed(new com.tencent.mm.plugin.component.editor.p1(this, i17), j17);
    }

    public void j7(int i17, long j17) {
        if (this.f96510t) {
            this.f96500g.c(i17, j17);
        }
    }

    public void k7(boolean z17, long j17) {
        if (this.f96510t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "setVKBVisibility setShow[%b], delay[%d]", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
            this.f96507q.postDelayed(new com.tencent.mm.plugin.component.editor.x0(this, z17), j17);
        }
    }

    public final void l7(r45.gp0 gp0Var, com.tencent.mm.plugin.component.editor.a aVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375438u)) {
            java.lang.String wi6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi();
            gp0Var.a0(wi6);
            gp0Var.c0(((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi());
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "local not exist cdn data key, generate CDNkey:%s, thumbKey:%s", wi6, gp0Var.f375420m);
        }
        com.tencent.mm.plugin.component.editor.c cVar = new com.tencent.mm.plugin.component.editor.c(gp0Var, true, aVar, 0);
        this.H.put(cVar.f96536b, cVar);
        com.tencent.mm.plugin.component.editor.f.f96553d.c(cVar);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f96513w = i17;
        if (i18 != -1) {
            this.f96512v = false;
            return;
        }
        this.f96512v = true;
        switch (i17) {
            case 4096:
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "onActivityResult back from gallery");
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "no pic selected");
                } else {
                    V6(stringArrayListExtra);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                java.lang.String stringExtra = intent.getStringExtra("K_SEGMENTVIDEOPATH");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && stringArrayListExtra2 == null) {
                    stringArrayListExtra2 = new java.util.ArrayList<>();
                    stringArrayListExtra2.add(stringExtra);
                }
                if (stringArrayListExtra2 == null || stringArrayListExtra2.size() <= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "no video selected");
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
                eVar.f295331t = (float) intent.getDoubleExtra("kwebmap_slat", 0.0d);
                eVar.f295332u = (float) intent.getDoubleExtra("kwebmap_lng", 0.0d);
                eVar.f295333v = intent.getIntExtra("kwebmap_scale", 0);
                java.lang.String stringExtra2 = intent.getStringExtra("Kwebmap_locaion");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                eVar.f295334w = stringExtra2;
                eVar.f295330s = intent.getStringExtra("kPoiName");
                eVar.f295323l = nx1.d.q().k();
                eVar.f295327p = 3;
                eVar.f295328q = true;
                eVar.f295329r = "";
                java.lang.String stringExtra3 = intent.getStringExtra("kPoiid");
                eVar.f295335x = stringExtra3;
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                    eVar.f295335x = intent.getStringExtra("kNearByPoiid");
                }
                eVar.f295336y = intent.getBooleanExtra("KIsFromPoiList", false);
                eVar.f295337z = intent.getStringExtra("KPoiCategoryTips");
                eVar.A = intent.getStringExtra("kPoiBusinessHour");
                eVar.B = intent.getStringExtra("KPoiPhone");
                eVar.C = intent.getFloatExtra("KPoiPriceTips", 0.0f);
                eVar.D = intent.getStringExtra("kBuildingID");
                eVar.E = intent.getStringExtra("kFloorName");
                nx1.d.q().r(eVar, this.f96503m.c(), true, true, false, false, false);
                return;
            case 4099:
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("selected_file_lst");
                java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("selected_file_title_lst");
                if (com.tencent.mm.sdk.platformtools.t8.L0(stringArrayListExtra3) || stringArrayListExtra3.size() == 0) {
                    return;
                }
                for (int i19 = 0; i19 < stringArrayListExtra3.size(); i19++) {
                    java.lang.String str = stringArrayListExtra3.get(i19);
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
                    if (!r6Var.m()) {
                        return;
                    }
                    if (r6Var.C() >= ip.c.g()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "exceed MaxFileSize");
                        f7();
                        return;
                    } else {
                        if (nx1.d.q().f(0, stringArrayListExtra3.size())) {
                            f7();
                            return;
                        }
                        java.lang.String str2 = stringArrayListExtra4.get(i19);
                        if (this.f96515y == null) {
                            this.f96515y = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.component.editor.k1(this));
                        }
                        gm0.j1.e().j(new com.tencent.mm.plugin.component.editor.l1(this, str, str2));
                    }
                }
                return;
            case 4100:
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                if (captureDataManager$CaptureVideoNormalModel == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "sight capture result is null!");
                    return;
                }
                java.lang.String str3 = captureDataManager$CaptureVideoNormalModel.f155661e;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    W6(str3);
                }
                if (!captureDataManager$CaptureVideoNormalModel.f155664h.booleanValue() || com.tencent.mm.sdk.platformtools.t8.K0(captureDataManager$CaptureVideoNormalModel.f155662f)) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(captureDataManager$CaptureVideoNormalModel.f155662f);
                V6(arrayList);
                return;
            case 4101:
                com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
                if (sightCaptureResult == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "sight capture result is null!");
                    return;
                }
                java.lang.String str4 = sightCaptureResult.f148809g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    W6(str4);
                }
                if (!sightCaptureResult.f148807e || com.tencent.mm.sdk.platformtools.t8.K0(sightCaptureResult.f148815p)) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(sightCaptureResult.f148815p);
                V6(arrayList2);
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onCancel() {
        super.onCancel();
        if (this.f96504n) {
            ox1.s.h().x(false);
            ox1.s.h().z(false);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        this.f96510t = getIntent().getBooleanExtra("KEY_EDITABLE", true);
        this.f96511u = getIntent().getStringExtra("KEY_CONTENT_XML");
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_CONTENT_PURE_TEXT", false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96511u)) {
            this.f96511u = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "mCollectEditable: %s, mCollectContentXml: %s, pureText:%b", java.lang.Boolean.valueOf(this.f96510t), this.f96511u, java.lang.Boolean.valueOf(booleanExtra));
        nx1.d q17 = nx1.d.q();
        q17.getClass();
        q17.f341282a = new java.util.ArrayList();
        q17.f341283b = this;
        q17.f341284c = new r45.gp0();
        q17.f341285d = 0;
        q17.f341286e = 0;
        q17.f341287f = 0;
        com.tencent.mm.plugin.component.editor.f.f96553d.b(this.I);
        getContentView().getRootView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        nx1.z zVar = new nx1.z(this);
        this.f96503m = zVar;
        zVar.f341334d = this.f96510t;
        this.f96497d = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.d7x);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.c2m);
        this.f96499f = linearLayout;
        this.f96500g = new qx1.q(this.f96503m, linearLayout, this, X6());
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.d8m);
        this.f96501h = relativeLayout;
        relativeLayout.setOnClickListener(new com.tencent.mm.plugin.component.editor.j1(this));
        this.f96502i = new nx1.j(this, this.f96501h, this);
        com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager editorLinearLayoutManager = new com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager(this);
        editorLinearLayoutManager.f96523w = com.tencent.mm.sdk.platformtools.d2.f(this)[1];
        this.f96497d.setLayoutManager(editorLinearLayoutManager);
        this.f96497d.setHasFixedSize(true);
        this.f96497d.i(new com.tencent.mm.plugin.component.editor.r1(this));
        fx1.b bVar = new fx1.b(this.f96503m);
        this.f96498e = bVar;
        this.f96497d.setAdapter(bVar);
        this.f96497d.getItemAnimator().f12168c = 0L;
        this.f96497d.getItemAnimator().f12171f = 0L;
        this.f96497d.getItemAnimator().f12170e = 0L;
        this.f96497d.getItemAnimator().f12169d = 120L;
        ((androidx.recyclerview.widget.o3) this.f96497d.getItemAnimator()).f12182g = false;
        this.f96505o = i65.a.b(this, 48);
        if (this.f96504n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "use multiselect");
            int color = getResources().getColor(com.tencent.mm.R.color.f478906kd);
            ox1.s h17 = ox1.s.h();
            boolean z17 = this.f96510t;
            h17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "onInit start");
            h17.f349615a = z17;
            h17.f349618d = 14;
            h17.f349619e = 32;
            h17.f349620f = i65.a.b(this, 21) - h17.f349619e;
            h17.f349621g = i65.a.b(this, 40) + (h17.f349619e * 2);
            h17.f349622h = i65.a.b(this, 240) + (h17.f349619e * 2);
            h17.f349616b = i65.a.b(this, 22);
            h17.f349617c = i65.a.b(this, 2);
            h17.f349624j = getResources().getDisplayMetrics().heightPixels;
            h17.f349625k = getResources().getDisplayMetrics().widthPixels;
            h17.f349628n = new int[]{-1, -1};
            h17.f349629o = new int[]{-1, -1};
            h17.f349630p = new int[]{-1, -1};
            h17.f349631q = new int[]{-1, -1};
            ox1.b bVar2 = new ox1.b(this, 2, h17.f349616b, h17.f349617c, color, h17);
            android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) bVar2, bVar2.getViewWidth(), bVar2.getViewHeight(), false);
            h17.f349632r = popupWindow;
            popupWindow.setClippingEnabled(false);
            h17.f349632r.setAnimationStyle(com.tencent.mm.R.style.f494774vu);
            h17.f349626l = bVar2.getOffsetForCursorMid();
            h17.f349627m = i65.a.b(this, 6);
            ox1.b bVar3 = new ox1.b(this, 3, h17.f349616b, h17.f349617c, color, h17);
            android.widget.PopupWindow popupWindow2 = new android.widget.PopupWindow((android.view.View) bVar3, bVar3.getViewWidth(), bVar2.getViewHeight(), false);
            h17.f349633s = popupWindow2;
            popupWindow2.setClippingEnabled(false);
            h17.f349633s.setAnimationStyle(com.tencent.mm.R.style.f494773vt);
            ox1.b bVar4 = new ox1.b(this, 4, h17.f349616b, h17.f349617c, color, h17);
            android.widget.PopupWindow popupWindow3 = new android.widget.PopupWindow((android.view.View) bVar4, bVar4.getViewWidth(), bVar2.getViewHeight(), false);
            h17.f349634t = popupWindow3;
            popupWindow3.setClippingEnabled(false);
            h17.f349634t.setAnimationStyle(com.tencent.mm.R.style.f494775vv);
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.a5m, (android.view.ViewGroup) null);
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            android.widget.PopupWindow popupWindow4 = new android.widget.PopupWindow(inflate, -2, -2, false);
            h17.f349635u = popupWindow4;
            popupWindow4.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.cfs));
            h17.f349635u.setClippingEnabled(false);
            h17.f349635u.setAnimationStyle(com.tencent.mm.R.style.f494777vx);
            h17.B = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ke7);
            h17.C = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486164kf2);
            h17.D = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kex);
            h17.E = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kew);
            h17.F = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.keg);
            h17.G = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kef);
            h17.H = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kee);
            h17.I = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kes);
            h17.w(h17.B, h17.f349618d);
            h17.w(h17.C, h17.f349618d);
            h17.w(h17.D, h17.f349618d);
            h17.w(h17.E, h17.f349618d);
            h17.w(h17.F, h17.f349618d);
            h17.w(h17.G, h17.f349618d);
            h17.w(h17.H, h17.f349618d);
            h17.w(h17.I, h17.f349618d);
            h17.B.setOnClickListener(new ox1.o(h17));
            h17.C.setOnClickListener(new ox1.p(h17));
            h17.D.setOnClickListener(new ox1.q(h17));
            h17.E.setOnClickListener(new ox1.r(h17));
            h17.F.setOnClickListener(new ox1.f(h17));
            h17.G.setOnClickListener(new ox1.g(h17));
            h17.H.setOnClickListener(new ox1.h(h17));
            h17.I.setOnClickListener(new ox1.i(h17));
            h17.f349623i = bVar2.getViewPadding();
            h17.f349636v = this;
            h17.f349637w = new ox1.e();
            h17.f349638x = new ox1.c();
            h17.A = new com.tencent.mm.sdk.platformtools.n3();
            ox1.s.K = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "onInit end");
            com.tencent.mm.plugin.component.editor.e1 e1Var = new com.tencent.mm.plugin.component.editor.e1(this);
            this.f96506p = e1Var;
            this.f96497d.i(e1Var);
        }
        if (getF65848t()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        if (booleanExtra || this.f96511u.isEmpty()) {
            if (!this.f96511u.isEmpty()) {
                ix1.l lVar = new ix1.l();
                lVar.f295338s = this.f96511u;
                lVar.f295312b = false;
                lVar.f295317g = false;
                nx1.d.q().b(lVar, false);
                d7();
            }
        } else if (this.f96511u.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "no need update ui by xml!!! xml is empty.");
        } else {
            this.F = o72.x1.B(this.f96511u, 18);
            java.util.LinkedList linkedList = this.G;
            linkedList.clear();
            linkedList.addAll(this.F.field_favProto.f370964f);
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
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(c17) && !com.tencent.mm.vfs.w6.j(c17)) {
                            com.tencent.mm.plugin.component.editor.f.f96553d.c(new com.tencent.mm.plugin.component.editor.c((r45.gp0) linkedList.get(0), false, com.tencent.mm.plugin.component.editor.a.TYPE_FILE, -1));
                            break;
                        }
                    }
                }
            }
        }
        if (this.f96510t) {
            i7(true);
        } else {
            this.f96499f.setVisibility(8);
        }
        gh5.d.a(this).f(new com.tencent.mm.plugin.component.editor.z0(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f96504n) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f96497d;
            if (recyclerView != null) {
                recyclerView.V0(this.f96506p);
            }
            ox1.s h17 = ox1.s.h();
            h17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "onDestroy");
            ox1.s.K = false;
            com.tencent.mm.sdk.platformtools.b4 b4Var = h17.f349639y;
            if (b4Var != null) {
                b4Var.d();
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = h17.f349640z;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            android.widget.PopupWindow popupWindow = h17.f349632r;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            android.widget.PopupWindow popupWindow2 = h17.f349633s;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            android.widget.PopupWindow popupWindow3 = h17.f349634t;
            if (popupWindow3 != null) {
                popupWindow3.dismiss();
            }
            android.widget.PopupWindow popupWindow4 = h17.f349635u;
            if (popupWindow4 != null) {
                popupWindow4.dismiss();
            }
            ox1.s.f349614J = null;
        }
        rx1.d b17 = rx1.d.b();
        b17.e();
        b17.f400953o = null;
        b17.f400950i = null;
        ((java.util.LinkedList) b17.f400954p).clear();
        rx1.d.f400944q = null;
        if (hx1.g.f285622q != null) {
            hx1.g.f285622q = null;
        }
        nx1.d q17 = nx1.d.q();
        q17.f341283b = null;
        java.util.ArrayList arrayList = q17.f341282a;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ix1.a aVar = (ix1.a) it.next();
                aVar.f295316f = null;
                aVar.f295314d = null;
                aVar.f295315e = null;
            }
        }
        com.tencent.mm.plugin.component.editor.f fVar = com.tencent.mm.plugin.component.editor.f.f96553d;
        ((java.util.ArrayList) fVar.f96554a).remove(this.I);
        fVar.d();
        fVar.d();
        fVar.f96555b.clear();
        ((java.util.ArrayList) fVar.f96554a).clear();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onDrag() {
        super.onDrag();
        if (this.f96504n) {
            ox1.s.h().n();
            ox1.s.h().p();
        }
        if (this.f96509s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "onSwipeBack close vkb");
            hideVKB();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        qx1.q qVar = this.f96500g;
        if (qVar != null) {
            qVar.d(this);
        }
        if (rx1.d.b().c()) {
            rx1.d.b().e();
        }
        this.f96514x = this.f96509s;
        k7(false, 0L);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
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
        db5.e1.C(getContext(), getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.component.editor.v0(this), null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f96510t) {
            int i17 = this.f96513w;
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
                if (!this.f96512v) {
                    k7(true, 100L);
                    j7(1, 0L);
                }
            } else if (this.f96514x) {
                k7(true, 100L);
                j7(1, 0L);
            }
        }
        this.f96513w = -1;
        this.f96512v = false;
    }

    public void q0(long j17) {
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.component.editor.t1.class);
    }

    public void x1(int i17) {
        try {
            this.f96498e.notifyItemRemoved(i17);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "onNotifyItemRemoved error,positionStart:%d", java.lang.Integer.valueOf(i17));
        }
    }
}
