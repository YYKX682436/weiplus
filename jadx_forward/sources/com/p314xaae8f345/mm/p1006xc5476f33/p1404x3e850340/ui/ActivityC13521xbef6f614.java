package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectUI */
/* loaded from: classes14.dex */
public class ActivityC13521xbef6f614 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements i72.x, d72.e {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f181602z = 0;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f181612p;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f181621y;

    /* renamed from: d, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f181603d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f181604e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f181605f = -1;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0 f181606g = null;

    /* renamed from: h, reason: collision with root package name */
    public g72.a0 f181607h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f181608i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f181609m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f181610n = false;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f181611o = null;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 f181613q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13532x4b66ef9e f181614r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f181615s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 f181616t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.content.ServiceConnection f181617u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f181618v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f181619w = false;

    /* renamed from: x, reason: collision with root package name */
    public i72.z f181620x = null;

    public void T6(int i17, int i18, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "finishWithResult errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 && i18 != 0 && h72.s.e().h() && h72.s.e().f361007h) {
            h72.s.e().d();
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("key_parcelable_reporter", com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a());
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt("err_type", i17);
        bundle3.putInt("err_code", i18);
        bundle3.putString("err_msg", str);
        bundle3.putAll(bundle2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle3);
        setResult(-1, intent);
        finish();
    }

    public final void U6(int i17, int i18, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "onProcessingError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("show_err_msg", str2);
        X6();
        T6(i17, i18, str, bundle);
    }

    public void V6(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: face detect result: %d", java.lang.Integer.valueOf(i17));
        if (i17 > 0 && i17 < 10) {
            if (i17 == 3) {
                U6(4, 90017, "face detect time out", str);
                return;
            }
            if (i17 == 6 || i17 == 5) {
                U6(4, 90023, "face track failed or not stable", str);
                return;
            } else if (i17 == 7) {
                U6(4, 90009, "audio permission not granted", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn));
                return;
            } else {
                U6(4, 90018, "system error", str);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.b0 b0Var = this.f181606g;
        if (b0Var.f181527a >= b0Var.f181528b - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: collect data ok");
            this.f181613q.f(true, null);
            android.graphics.Bitmap m55279xcdcc8b7d = this.f181613q.m55279xcdcc8b7d();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(m55279xcdcc8b7d == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "bitmap == null: %b", objArr);
            s75.d.b(new g72.w(this, m55279xcdcc8b7d, new g72.x(this)), "save_face_bitmap");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE.f181576d.f181577i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: move to next motion no instance");
        b0Var.f181527a++;
        int i18 = b0Var.a().f181519a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", java.lang.Integer.valueOf(i18));
        if (this.f181606g.a().f181525g) {
            this.f181614r.a(new g72.y(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", java.lang.Integer.valueOf(i18));
            W6();
        }
    }

    public final void W6() {
        e72.h kVar;
        if (this.f181609m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: start capture face");
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45 = this.f181613q;
            android.graphics.Rect rect = new android.graphics.Rect(this.f181614r.getLeft(), this.f181614r.getTop(), this.f181614r.getRight(), this.f181614r.getBottom());
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.a0 a17 = this.f181606g.a();
            c13528xdd12ba45.getClass();
            if (a17.f181519a == 100) {
                return;
            }
            e72.h hVar = c13528xdd12ba45.f181658m;
            if (hVar != null) {
                hVar.h();
            }
            c13528xdd12ba45.f181660o = false;
            c13528xdd12ba45.f181661p = false;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c13528xdd12ba45.f181664s = android.os.SystemClock.elapsedRealtime();
            c13528xdd12ba45.f181662q = a17.f181523e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectView", "carson logic");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectView", "item.hintStr" + a17.f181522d);
            c13528xdd12ba45.f181663r = a17.f181524f;
            if (a17.f181519a == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IFaceMotion.Factory", "hy: is read number");
                kVar = new e72.v(null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IFaceMotion.Factory", "hy: is normal");
                kVar = new e72.k(a17.f181522d, a17.f181521c);
            }
            c13528xdd12ba45.f181658m = kVar;
            android.view.ViewGroup viewGroup = c13528xdd12ba45.f181655g;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            android.view.ViewGroup viewGroup2 = c13528xdd12ba45.f181656h;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            c13528xdd12ba45.f181658m.e(c13528xdd12ba45.getContext(), c13528xdd12ba45.f181655g, c13528xdd12ba45.f181656h);
            c13528xdd12ba45.f181658m.b(c13528xdd12ba45.f181659n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = c13528xdd12ba45.f181652d;
            if (textureViewSurfaceTextureListenerC13526x5bf79f0a != null) {
                long j17 = a17.f181520b;
                synchronized (textureViewSurfaceTextureListenerC13526x5bf79f0a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.f181574f.mo50302x6b17ad39(null);
                    textureViewSurfaceTextureListenerC13526x5bf79f0a.f181641v = rect;
                    textureViewSurfaceTextureListenerC13526x5bf79f0a.G();
                    ((i72.m) textureViewSurfaceTextureListenerC13526x5bf79f0a.f181645z).c(j17);
                }
            }
        }
    }

    public final void X6() {
        wo.d1 d1Var;
        this.f181609m = false;
        this.f181613q.f(false, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: stopped scan");
        this.f181608i = false;
        i72.m mVar = (i72.m) this.f181613q.f181652d.f181645z;
        synchronized (mVar.f370960d.f181640u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var = mVar.f370957a;
            if (n0Var != null && n0Var.f181550c && (d1Var = n0Var.f181549b) != null) {
                d1Var.l();
                n0Var.f181550c = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d.c();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: stopped preview");
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "unbindService, mBound: %b", java.lang.Boolean.valueOf(this.f181618v));
        if (this.f181618v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "unbindService");
            l85.h1.g(this.f181617u, "tools", true, j45.l.e("tools"));
            this.f181618v = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "finish");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "FaceDetectUI release");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "releaseFaceDetect");
        if (!this.f181610n) {
            this.f181620x = null;
            this.f181610n = true;
            if (this.f181607h.f350757a) {
                X6();
                i72.m mVar = (i72.m) this.f181613q.f181652d.f181645z;
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = mVar.f370960d;
                if (!textureViewSurfaceTextureListenerC13526x5bf79f0a.f181635p) {
                    textureViewSurfaceTextureListenerC13526x5bf79f0a.f181635p = true;
                    s75.d.b(new i72.i(mVar), "FaceDetectCameraView_Camera");
                }
            }
            android.os.PowerManager.WakeLock wakeLock = this.f181603d;
            if (wakeLock != null && wakeLock.isHeld()) {
                android.os.PowerManager.WakeLock wakeLock2 = this.f181603d;
                yj0.a.c(wakeLock2, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                yj0.a.f(wakeLock2, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                this.f181603d = null;
            }
            s75.d.b(new g72.p(this), "Face_active_gc");
        }
        Y6();
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aai;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "onBackPressed and cancel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "onUserCancel");
        e72.g m55278x19468201 = this.f181613q.m55278x19468201();
        T6(1, m55278x19468201.f331436a, m55278x19468201.f331437b, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        this.f181604e = getIntent().getStringExtra("k_user_name");
        this.f181605f = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
        this.f181621y = getIntent().getStringExtra("business_tips");
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481 c13516xe45e9481 = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481) getIntent().getBundleExtra("key_reporter_bundle").getParcelable("key_parcelable_reporter");
        if (c13516xe45e9481 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().g(c13516xe45e9481);
        }
        int i17 = this.f181605f;
        android.os.Bundle extras = getIntent().getExtras();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectControllerFactory", "getController serverScene: %d", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case 0:
            case 1:
            case 3:
            case 4:
                new d72.b(this, this, i17, 0, extras);
                break;
            case 2:
            case 5:
                new d72.c(this, this, i17, 0, extras);
                break;
            case 6:
                new d72.d(this, this, i17, 0, extras);
                break;
        }
        getWindow().setFlags(1024, 1024);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567068i05)).setOnClickListener(new g72.q(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565812dn3);
        this.f181611o = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f181612p = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.dnz);
        this.f181614r = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13532x4b66ef9e) findViewById(com.p314xaae8f345.mm.R.id.dnj);
        this.f181613q = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45) findViewById(com.p314xaae8f345.mm.R.id.dni);
        this.f181615s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhc);
        this.f181613q.m55281x6c4ebec7(this);
        this.f181613q.m55280xb9432af9(this.f181621y);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45 = this.f181613q;
        android.widget.RelativeLayout relativeLayout = this.f181612p;
        android.view.ViewGroup m55288x6f64c0be = this.f181614r.m55288x6f64c0be();
        c13528xdd12ba45.f181655g = relativeLayout;
        c13528xdd12ba45.f181656h = m55288x6f64c0be;
        this.f181613q.m55282xc5ad0835(this.f181615s);
        this.f181613q.d(true, this.f181604e);
        this.f181614r.m55289xde6eb192(new g72.r(this));
        this.f181614r.setVisibility(4);
        this.f181607h = new g72.a0(this, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: current %d instance not destroyed", java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "onStart");
        if (this.f181603d == null) {
            this.f181603d = ((android.os.PowerManager) getSystemService("power")).newWakeLock(10, "Scan Lock");
        }
        if (!this.f181603d.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "acquire wakeLock");
            android.os.PowerManager.WakeLock wakeLock = this.f181603d;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6.class);
        intent.putExtra("key_face_service_connection_from", 2);
        this.f181617u = new g72.s(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "bindService");
        l85.h1.a(intent, this.f181617u, 1, "tools", true, j45.l.e("tools"));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: onStop, finish");
        Y6();
        if (this.f181619w) {
            finish();
        } else {
            T6(1, 90006, "cancel with on stop", null);
        }
    }
}
