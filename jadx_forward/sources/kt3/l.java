package kt3;

/* loaded from: classes10.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce implements ju3.d0 {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab B;
    public final android.graphics.Point C;
    public int D;
    public float E;

    /* renamed from: h, reason: collision with root package name */
    public final int f393524h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.WindowManager f393525i;

    /* renamed from: m, reason: collision with root package name */
    public int f393526m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea f393527n;

    /* renamed from: o, reason: collision with root package name */
    public st3.b f393528o;

    /* renamed from: p, reason: collision with root package name */
    public at0.n f393529p;

    /* renamed from: q, reason: collision with root package name */
    public di3.d f393530q;

    /* renamed from: r, reason: collision with root package name */
    public bi3.i f393531r;

    /* renamed from: s, reason: collision with root package name */
    public bi3.j f393532s;

    /* renamed from: t, reason: collision with root package name */
    public bi3.c f393533t;

    /* renamed from: u, reason: collision with root package name */
    public bi3.f f393534u;

    /* renamed from: v, reason: collision with root package name */
    public bi3.e f393535v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.i f393536w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m f393537x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f393538y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f393539z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f393524h = 1;
        this.f393526m = 0;
        this.f393538y = true;
        this.C = new android.graphics.Point(0, 0);
    }

    /* renamed from: getScreenRotation */
    private final int m144357xe50fd500() {
        if (this.f393525i == null) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f393525i = (android.view.WindowManager) systemService;
        }
        android.view.WindowManager windowManager = this.f393525i;
        if (windowManager == null) {
            return 0;
        }
        android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        java.lang.Integer valueOf = defaultDisplay != null ? java.lang.Integer.valueOf(defaultDisplay.getRotation()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            return 0;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return 90;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            return 180;
        }
        return (valueOf != null && valueOf.intValue() == 3) ? 270 : 0;
    }

    /* renamed from: getCameraRotation */
    public final int m144358xa3f60eb9() {
        at0.n nVar = this.f393529p;
        if (nVar != null) {
            return nVar.f95127b.d();
        }
        return 90;
    }

    /* renamed from: getCurrentFramePicture */
    public final android.graphics.Bitmap m144359x97c7b4() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        at0.n nVar = this.f393529p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        nVar.o(new kt3.a(this, h0Var));
        return (android.graphics.Bitmap) h0Var.f391656d;
    }

    /* renamed from: getDisplayRatio */
    public final float m144360xc07a02df() {
        return this.E;
    }

    /* renamed from: getDrawSizePoint */
    public final android.graphics.Point m144361xe2adb975() {
        return this.C;
    }

    /* renamed from: getFlashMode */
    public final int m144362xbb0896fd() {
        at0.n nVar = this.f393529p;
        if (nVar != null) {
            return nVar.f95127b.mo167001xbb0896fd();
        }
        return 0;
    }

    /* renamed from: getPictureSize */
    public final android.graphics.Point m144363x8dfb48e9() {
        st3.b bVar = this.f393528o;
        return new android.graphics.Point(0, 0);
    }

    /* renamed from: getPreviewSize */
    public final android.graphics.Point m144364x8cdf5ab3() {
        android.graphics.Point v17;
        at0.n nVar = this.f393529p;
        return (nVar == null || (v17 = nVar.f95127b.v(false)) == null) ? new android.graphics.Point() : v17;
    }

    /* renamed from: getSupportZoomRatios */
    public final float[] m144365x656303f4() {
        at0.n nVar = this.f393529p;
        if (nVar == null || nVar.f95137l != 0) {
            return null;
        }
        return nVar.f95127b.A();
    }

    /* renamed from: getVideoSize */
    public final android.graphics.Point m144366x4ee02466() {
        st3.b bVar = this.f393528o;
        return new android.graphics.Point(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        super.mo11000xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraPluginLayout", "onPause");
        at0.n nVar = this.f393529p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        nVar.k();
        di3.d dVar = this.f393530q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        dVar.disable();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        super.mo11001x57429eec();
        di3.d dVar = this.f393530q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        dVar.enable();
        at0.n nVar = this.f393529p;
        if (nVar != null) {
            kt3.f fVar = new kt3.f(this);
            ts0.r rVar = nVar.f95127b;
            ((ts0.b) rVar).f503061j = true;
            rVar.k(new at0.a(fVar));
        }
        at0.n nVar2 = this.f393529p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar2);
        at0.n.i(nVar2, this.f393538y, null, new kt3.g(this), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        super.mo9065x41012807();
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea = this.f393527n;
        if (c10905xfb961aea != null) {
            c10905xfb961aea.setOnTouchListener(null);
        }
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea2 = this.f393527n;
        if (c10905xfb961aea2 != null) {
            c10905xfb961aea2.mo8984x41012807();
        }
        this.f393527n = null;
        at0.n nVar = this.f393529p;
        if (nVar != null) {
            nVar.d();
        }
        this.f393529p = null;
        di3.d dVar = this.f393530q;
        if (dVar != null) {
            dVar.f314222g = null;
        }
        if (dVar != null) {
            dVar.disable();
        }
        this.f393530q = null;
        this.f393528o = null;
    }

    /* renamed from: setDisplayRatio */
    public final void m144367xf6c2fdeb(float f17) {
        this.E = f17;
    }

    /* renamed from: setFlashMode */
    public final void m144368x175c5771(int i17) {
        at0.n nVar = this.f393529p;
        if (nVar != null) {
            nVar.f95127b.mo167003x175c5771(i17);
        }
    }

    /* renamed from: setForceZoomTargetRatio */
    public final void m144369x76d9b83e(float f17) {
        at0.n nVar = this.f393529p;
        if (nVar == null || nVar.f95137l != 0) {
            return;
        }
        nVar.f95127b.l(f17);
    }

    /* renamed from: setFrameDataCallback */
    public final void m144370x6554ffda(bi3.c cVar) {
        this.f393533t = cVar;
    }

    /* renamed from: setInitDoneCallback */
    public final void m144371x2ec5a399(bi3.e eVar) {
        this.f393535v = eVar;
    }

    /* renamed from: setInitErrorCallback */
    public final void m144372x54cde6fb(bi3.f fVar) {
        this.f393534u = fVar;
    }

    /* renamed from: setPreviewMode */
    public final void m144373x234227c9(int i17) {
        this.f393526m = i17;
    }

    /* renamed from: setRGBSizeLimit */
    public final void m144374xdeb1636f(int i17) {
        this.D = i17;
    }

    /* renamed from: setRecordCallback */
    public final void m144375x9ae644b8(bi3.j jVar) {
        this.f393532s = jVar;
    }

    /* renamed from: setTouchListener */
    public final void m144376xce6c7bd1(com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.h callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.i();
        this.f393536w = iVar;
        iVar.f156281g = callback;
    }

    /* renamed from: setUseBackCamera */
    public final void m144377x6e2af291(boolean z17) {
        this.f393538y = z17;
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        boolean z17;
        bi3.f fVar;
        ht0.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            if (bundle != null) {
                at0.n nVar = this.f393529p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
                int i17 = bundle.getInt("PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT");
                if (nVar.f95137l == 0) {
                    nVar.f95127b.u(i17, 10);
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (bundle != null) {
                at0.n nVar2 = this.f393529p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar2);
                nVar2.p(bundle.getBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true), bundle.getBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true), bundle.getInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT"));
                return;
            }
            return;
        }
        if (ordinal == 2) {
            z17 = bundle != null ? bundle.getBoolean("PARAM_PREPARE_CAMERA_IGNORE_FLIP_CHECK_BOOLEAN", false) : false;
            at0.n nVar3 = this.f393529p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar3);
            nVar3.m(z17);
            z();
            return;
        }
        if (ordinal == 4) {
            if (bundle != null) {
                float f17 = bundle.getFloat("PARAM_POINT_X");
                float f18 = bundle.getFloat("PARAM_POINT_Y");
                at0.n nVar4 = this.f393529p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar4);
                com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea = this.f393527n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10905xfb961aea);
                int width = c10905xfb961aea.getWidth();
                com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea2 = this.f393527n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10905xfb961aea2);
                nVar4.c(f17, f18, width, c10905xfb961aea2.getHeight(), 400L);
                return;
            }
            return;
        }
        if (ordinal == 5) {
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_RECORD_RESULT_MIRROR_BOOLEAN", true) : true;
            z17 = bundle != null ? bundle.getBoolean("PARAM_RECORD_MUTED_BOOLEAN", false) : false;
            at0.n nVar5 = this.f393529p;
            if (nVar5 != null) {
                nVar5.f95143r = z18;
            }
            if (nVar5 != null && (bVar = nVar5.f95128c) != null) {
                bVar.mo127749x764d819b(z17);
            }
            at0.n nVar6 = this.f393529p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar6);
            di3.d dVar = this.f393530q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            boolean c17 = dVar.c();
            di3.d dVar2 = this.f393530q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
            if (nVar6.j(c17, dVar2.a()) || (fVar = this.f393534u) == null) {
                return;
            }
            fVar.a();
            return;
        }
        if (ordinal == 6) {
            at0.n nVar7 = this.f393529p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar7);
            if (nVar7.l(new kt3.k(this))) {
                return;
            }
            bi3.j jVar = this.f393532s;
            if (jVar != null) {
                jVar.a(true);
            }
            at0.n nVar8 = this.f393529p;
            if (nVar8 != null) {
                nVar8.e();
                return;
            }
            return;
        }
        if (ordinal != 15) {
            return;
        }
        at0.n nVar9 = this.f393529p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar9);
        nVar9.f95127b.s(this.f393539z);
        at0.n nVar10 = this.f393529p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar10);
        boolean z19 = this.A;
        kt3.j jVar2 = new kt3.j(this);
        if (z19) {
            nVar10.o(new at0.m(nVar10, jVar2));
        } else {
            nVar10.o(new at0.j(jVar2));
        }
    }

    public final boolean y(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        if (this.f393537x != null) {
            int m144357xe50fd500 = m144357xe50fd500();
            com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar = this.f393537x;
            if (mVar != null && (mVar.f156297j || mVar.f156290c != null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.k(mVar, bArr, m144357xe50fd500);
                if (mVar.f156288a.isAlive()) {
                    mVar.f156289b.mo50293x3498a0(kVar);
                }
            }
        }
        if (this.f393533t == null) {
            return true;
        }
        android.graphics.Point m144364x8cdf5ab3 = m144364x8cdf5ab3();
        bi3.c cVar = this.f393533t;
        if (cVar == null) {
            return true;
        }
        cVar.a(bArr, m144364x8cdf5ab3.x, m144364x8cdf5ab3.y);
        return true;
    }

    public final void z() {
        android.graphics.Point m144364x8cdf5ab3 = m144364x8cdf5ab3();
        android.graphics.Point point = this.C;
        int i17 = this.D;
        point.y = i17;
        point.x = (m144364x8cdf5ab3.x * i17) / m144364x8cdf5ab3.y;
        if (m144357xe50fd500() == 0 || m144357xe50fd500() == 180) {
            int i18 = point.y;
            point.y = point.x;
            point.x = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar = this.f393537x;
        if (mVar != null) {
            int i19 = m144364x8cdf5ab3.x;
            int i27 = m144364x8cdf5ab3.y;
            at0.n nVar = this.f393529p;
            int d17 = nVar != null ? nVar.f95127b.d() : 0;
            int i28 = point.x;
            int i29 = point.y;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YUVDateRenderToRBGBufferThread", "setFrameInfo, width: %s, height: %s, rotate: %s ,targetWidth:%d ,targetHeight:%d , this: %s ", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), mVar);
            if (i19 != mVar.f156292e || i27 != mVar.f156293f || d17 != mVar.f156294g) {
                mVar.f156292e = i19;
                mVar.f156293f = i27;
                mVar.f156294g = d17;
            }
            mVar.f156295h = i28;
            mVar.f156296i = i29;
        }
    }
}
