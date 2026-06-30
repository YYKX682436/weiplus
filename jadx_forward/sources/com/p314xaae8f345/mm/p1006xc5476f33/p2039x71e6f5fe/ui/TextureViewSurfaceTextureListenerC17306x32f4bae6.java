package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI */
/* loaded from: classes12.dex */
public class TextureViewSurfaceTextureListenerC17306x32f4bae6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.TextureView.SurfaceTextureListener, android.hardware.Camera.PreviewCallback, com.p314xaae8f345.mm.p944x882e457a.u0, e04.v2 {
    public static final /* synthetic */ int S = 0;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 A;
    public android.animation.ValueAnimator C;
    public android.animation.ValueAnimator D;
    public android.view.View E;
    public int F;
    public int G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f240882J;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 f240883d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.SurfaceTexture f240884e;

    /* renamed from: f, reason: collision with root package name */
    public xy3.a f240885f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f240886g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f240887h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f240888i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f240889m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f240890n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f240891o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f240892p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f240893q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f240894r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f240895s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f240896t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f240897u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f240898v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f240899w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f240900x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f240901y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a3 f240902z;
    public boolean B = true;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 N = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039();
    public final long[] P = new long[2];
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d Q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5840x97d39b2c>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.1
        {
            this.f39173x3fe91575 = 352096572;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5840x97d39b2c c5840x97d39b2c) {
            android.graphics.Bitmap J2;
            if (c5840x97d39b2c.f136150g.f88705a != 2) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "receive play open translate anim event");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6.this;
            java.lang.String stringExtra = textureViewSurfaceTextureListenerC17306x32f4bae6.getIntent().getStringExtra("key_first_background");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(stringExtra, new android.graphics.BitmapFactory.Options())) != null) {
                textureViewSurfaceTextureListenerC17306x32f4bae6.A.setVisibility(0);
                textureViewSurfaceTextureListenerC17306x32f4bae6.c7(J2);
                com.p314xaae8f345.mm.vfs.w6.h(stringExtra);
            }
            android.view.View view = textureViewSurfaceTextureListenerC17306x32f4bae6.E;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$1", "callback", "(Lcom/tencent/mm/autogen/events/PlayScanTranslateAnimEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$1", "callback", "(Lcom/tencent/mm/autogen/events/PlayScanTranslateAnimEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            textureViewSurfaceTextureListenerC17306x32f4bae6.D.start();
            textureViewSurfaceTextureListenerC17306x32f4bae6.f240883d.setVisibility(0);
            textureViewSurfaceTextureListenerC17306x32f4bae6.f240882J = true;
            return true;
        }
    };
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 R = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.q2(this);

    public final void L0() {
        xy3.a aVar;
        android.hardware.Camera camera;
        try {
            if (this.f240885f.f448191c && (camera = (aVar = this.f240885f).f448189a) != null) {
                camera.stopPreview();
                aVar.f448191c = false;
                aVar.f448193e = false;
                aVar.f448194f = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
        }
        if (gm0.j1.d().n() != 6 && gm0.j1.d().n() != 4) {
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_o), "");
            U6();
            return;
        }
        this.N.f141280f = 2L;
        this.G = (int) ((c01.z1.r().hashCode() + java.lang.System.currentTimeMillis()) & (-1));
        this.H = 1;
        m78602x5a7a36a0();
        e7();
        b7();
        if (this.I.equalsIgnoreCase("zh_CN")) {
            this.f240891o.setImageResource(com.p314xaae8f345.mm.R.raw.f81248xcb6cbe19);
        } else {
            this.f240891o.setImageResource(com.p314xaae8f345.mm.R.raw.f81251x3f593f9c);
        }
        android.view.View view = this.f240893q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f240894r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f240890n;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f240896t.setVisibility(0);
        android.view.View view4 = this.f240889m;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.setVisibility(0);
        this.f240895s.setVisibility(8);
        this.C.setRepeatMode(1);
        this.C.setRepeatCount(-1);
        this.C.start();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f240899w) && this.f240897u != null) {
                this.f240901y = e04.t2.c(this.f240899w);
                java.lang.String str = this.f240899w;
                int i17 = this.L;
                if (i17 == 0) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(this.f240897u, 80, android.graphics.Bitmap.CompressFormat.JPEG, this.f240899w, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "save img cost %d", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis)));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "fileSize %d", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(this.f240899w)));
                } else if (i17 == 1) {
                    dm.aa y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).cj().y0(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f240899w + com.p314xaae8f345.mm.vfs.w6.l(this.f240899w)));
                    if (y07 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "already has translation result");
                        java.lang.String str2 = y07.f65916x970b0f9e;
                        this.f240900x = str2;
                        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, new android.graphics.BitmapFactory.Options());
                        this.f240898v = J2;
                        if (J2 != null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.z1(this), 500L);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanTranslationCaptureUI", "can not find old translation result!");
                        }
                    }
                    if (this.M != 0) {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0.class))).Ai("jpg");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(this.f240897u, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "save img cost %d", java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis2)));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "fileSize %d", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(str)));
                    }
                }
                this.P[1] = java.lang.System.currentTimeMillis();
                e04.t2.a(this.f240901y, str, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f2(this, str));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslationCaptureUI", e18, "", new java.lang.Object[0]);
        }
        gm0.j1.d().a(294, this);
    }

    public final void T6() {
        xy3.a aVar;
        android.hardware.Camera camera;
        try {
            try {
                if (this.f240885f.f448191c && (camera = (aVar = this.f240885f).f448189a) != null) {
                    camera.stopPreview();
                    aVar.f448191c = false;
                    aVar.f448193e = false;
                    aVar.f448194f = null;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
            }
            this.f240885f.a();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationCaptureUI", e18.getMessage());
        }
    }

    public final void U6() {
        getWindow().addFlags(2097280);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        try {
            if (this.f240884e == null || !this.f240885f.f448190b || this.f240885f.f448191c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "can not start preview");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "start preview");
                this.f240885f.m(this.f240884e);
                if (this.f240885f.f448194f == null || this.f240885f.f448194f.f448210a == 0) {
                    this.f240887h.setEnabled(true);
                } else {
                    d7();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
            d7();
        }
        m78531x8f8cf1fb();
        this.P[0] = java.lang.System.currentTimeMillis();
        if (this.L == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f240899w)) {
            com.p314xaae8f345.mm.vfs.w6.h(this.f240899w);
        }
        this.H = 0;
        this.L = 0;
        this.f240899w = null;
        this.f240900x = null;
        this.f240897u = null;
        this.f240898v = null;
        this.M = 0;
        android.view.View view = this.f240893q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f240894r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f240889m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f240890n;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterPreviewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.A.setVisibility(8);
        this.f240883d.setVisibility(0);
        this.f240895s.setVisibility(0);
        this.f240896t.setVisibility(8);
        this.C.setRepeatMode(1);
        this.C.setRepeatCount(0);
        this.C.end();
        gm0.j1.d().q(294, this);
    }

    public final void V6() {
        e7();
        this.H = 3;
        android.view.View view = this.f240890n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.I.equalsIgnoreCase("zh_CN")) {
            this.f240891o.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563720b81);
        } else {
            this.f240891o.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563722b83);
        }
        this.f240896t.setVisibility(8);
        this.C.setRepeatMode(1);
        this.C.setRepeatCount(0);
        this.C.end();
        if (this.L == 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f240900x)) {
            java.lang.String Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).Zi("jpg");
            this.f240900x = Zi;
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(this.f240898v, 80, android.graphics.Bitmap.CompressFormat.JPEG, Zi, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o2 o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o2();
                o2Var.f65913x8ebc8b93 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f240899w + com.p314xaae8f345.mm.vfs.w6.l(this.f240899w));
                java.lang.String str = this.f240900x;
                o2Var.f65916x970b0f9e = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "insert translate result %s", str);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).cj().z0(o2Var);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslationCaptureUI", e17, "save translate result file error", new java.lang.Object[0]);
            }
        }
    }

    public final void W6() {
        e04.w2 aj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).aj();
        aj6.f327682a = 0;
        aj6.f327683b = null;
        int i17 = this.H;
        if (i17 == 0) {
            if (this.f240882J) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "is playing animation");
                return;
            }
            this.D.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.g2(this));
            this.D.reverse();
            this.f240882J = true;
            return;
        }
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = this.N;
            if (i17 == 1) {
                c6797x4bb2039.f141283i = (int) (java.lang.System.currentTimeMillis() - this.P[1]);
            }
            if (c6797x4bb2039.f141280f != 0) {
                c6797x4bb2039.k();
            }
            U6();
        }
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "curState %d", java.lang.Integer.valueOf(this.H));
        if (!this.f240885f.f448190b) {
            a7();
        }
        if (this.H == 0 && this.f240885f.f448190b) {
            U6();
        }
    }

    public final void Y6() {
        if (zo.e.d()) {
            X6();
        } else {
            db5.e1.E(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572098yn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572030wr), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572031ws), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.h2(this));
        }
    }

    public final void Z6(java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = this.N;
        c6797x4bb2039.f141280f = 5L;
        c6797x4bb2039.f141283i = (int) (java.lang.System.currentTimeMillis() - this.P[1]);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = string;
        }
        db5.e1.G(this, str, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2(this));
    }

    public final void a7() {
        try {
            if (this.f240885f.f448190b) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f240885f.i(getWindowManager().getDefaultDisplay().getRotation());
            this.f240885f.n(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.i2(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "open camera cost %s, failed count %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.K));
            this.f240885f.u();
            android.graphics.Rect rect = new android.graphics.Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            this.f240885f.l(new android.graphics.Point(rect.width(), rect.height()));
            if (this.H == 0) {
                U6();
            }
            this.K = 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationCaptureUI", e17.getMessage());
            int i17 = this.K + 1;
            this.K = i17;
            if (i17 >= 5) {
                d7();
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.j2(this), 30L);
            }
        }
    }

    public final void b7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equalsIgnoreCase("zh_CN")) {
            this.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this);
        } else {
            this.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "targetLang %s", this.I);
    }

    public final void c7(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a3 a3Var = this.f240902z;
        a3Var.f241036d = bitmap;
        a3Var.notifyDataSetChanged();
    }

    public final void d7() {
        db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_y), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.l2(this));
    }

    public final void e7() {
        mo78514x143f1b92().E0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        getWindow().getDecorView().setSystemUiVisibility(1796);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570960ci1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7j);
        this.E = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI", "initView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 c21518xd171d8a0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0) findViewById(com.p314xaae8f345.mm.R.id.oja);
        this.f240883d = c21518xd171d8a0;
        c21518xd171d8a0.setOpaque(false);
        this.f240883d.setSurfaceTextureListener(this);
        this.A = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.ojc);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a3 a3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a3(this, null);
        this.f240902z = a3Var;
        this.A.setAdapter((android.widget.SpinnerAdapter) a3Var);
        this.f240889m = findViewById(com.p314xaae8f345.mm.R.id.b6k);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ma7);
        this.f240886g = findViewById2;
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.r2(this));
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.m_b);
        this.f240887h = findViewById3;
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.s2(this));
        this.f240887h.setEnabled(false);
        this.f240895s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m_c);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ma8);
        this.f240888i = findViewById4;
        findViewById4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.t2(this));
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.m9v);
        this.f240890n = findViewById5;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5.findViewById(com.p314xaae8f345.mm.R.id.ojh);
        this.f240891o = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.u2(this));
        this.f240893q = findViewById(com.p314xaae8f345.mm.R.id.ojg);
        this.f240894r = findViewById(com.p314xaae8f345.mm.R.id.oj_);
        m78531x8f8cf1fb();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i9e);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f240896t = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.m_h);
        android.view.View findViewById6 = this.f240890n.findViewById(com.p314xaae8f345.mm.R.id.ojb);
        this.f240892p = findViewById6;
        findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.x2(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.y2(this));
        this.F = getWindowManager().getDefaultDisplay().getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = ofFloat;
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.z2(this));
        this.C.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.u1(this));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f240890n.getLayoutParams();
        layoutParams.bottomMargin += com.p314xaae8f345.mm.ui.bk.j(this);
        this.f240890n.setLayoutParams(layoutParams);
        this.C.setDuration(5000L);
        db5.f.c(this, null);
        this.E.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w1(this));
        b7();
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.D = ofFloat2;
        ofFloat2.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.x1(this));
        this.D.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.y1(this));
        this.D.setDuration(300L);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5840x97d39b2c c5840x97d39b2c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5840x97d39b2c();
        c5840x97d39b2c.f136150g.f88705a = 1;
        c5840x97d39b2c.e();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 561 && i18 == -1) {
            java.lang.String b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(this, intent, g83.a.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "select: [%s]", b17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                return;
            }
            this.f240899w = b17;
            this.L = 1;
            this.N.f141278d = 2L;
            int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(b17).m43592x7a249f0b();
            this.M = m43592x7a249f0b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "degree %s", java.lang.Integer.valueOf(m43592x7a249f0b));
            android.graphics.Bitmap K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K(b17);
            if (K != null) {
                this.f240897u = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(K, this.M);
                L0();
                c7(this.f240897u);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78497xc03943d(true);
        super.onCreate(bundle);
        this.f240885f = new xy3.a();
        mo43517x10010bd5();
        this.Q.mo48813x58998cd();
        this.N.f141278d = 3L;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.D.removeAllUpdateListeners();
        this.C.removeAllUpdateListeners();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        qp1.h0.b();
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "get preview frame success, length %d", java.lang.Integer.valueOf(bArr.length));
        try {
            if (bArr.length > 0) {
                this.f240897u = null;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                android.graphics.Point point = this.f240885f.f448195g;
                android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr, 17, point.x, point.y, null);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
                android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(byteArrayOutputStream.toByteArray());
                int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
                if (G != null) {
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                    this.f240897u = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(G, this.f240885f.f448200l);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "decode cost %d, rotate cost %d", java.lang.Integer.valueOf(currentTimeMillis2), java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis3)));
                    if (this.f240897u != null) {
                        this.f240899w = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0.class))).wi("jpg");
                        L0();
                        c7(this.f240897u);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanTranslationCaptureUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            Y6();
        } else {
            this.B = false;
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.m2(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
        getWindow().addFlags(2097280);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        gm0.j1.d().a(294, this);
        gm0.j1.n().a(this.R);
        if (!this.B) {
            X6();
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 16, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", java.lang.Boolean.valueOf(a17));
        if (a17) {
            Y6();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "errType %s, errCode %s, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            Z6(str);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e0) m1Var;
        java.util.List list = e0Var.f240411g;
        if (list == null || e0Var.f240412h != this.G) {
            return;
        }
        long currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - e0Var.f240413i);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = this.N;
        c6797x4bb2039.f141282h = currentTimeMillis;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "angle %f, translationInfos length %d", java.lang.Float.valueOf(e0Var.H()), java.lang.Integer.valueOf(linkedList.size()));
        if (linkedList.size() <= 0) {
            c6797x4bb2039.f141283i = (int) (java.lang.System.currentTimeMillis() - this.P[1]);
            db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw), "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o2(this));
            return;
        }
        c6797x4bb2039.f141280f = 1L;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).aj().e(this.G, list, e0Var.H(), this.f240897u, this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.I())) {
            return;
        }
        this.I = e0Var.I();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        T6();
        gm0.j1.d().q(294, this);
        this.Q.mo48814x2efc64();
        gm0.j1.n().d(this.R);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "surface texture available");
        this.f240883d.C();
        this.f240884e = surfaceTexture;
        if (!this.B) {
            if (this.f240885f.f448190b) {
                U6();
                return;
            } else {
                a7();
                return;
            }
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 16, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "summerper checkPermission checkCamera[%b]", java.lang.Boolean.valueOf(a17));
        if (a17) {
            Y6();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // e04.v2
    public void v5(final int i17, final android.graphics.Bitmap bitmap) {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6.this;
                textureViewSurfaceTextureListenerC17306x32f4bae6.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drawTranslationResult() called with: session = [");
                int i19 = i17;
                sb6.append(i19);
                sb6.append("], newBitmap = [");
                android.graphics.Bitmap bitmap2 = bitmap;
                sb6.append(bitmap2);
                sb6.append("]");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", sb6.toString());
                if (i19 == textureViewSurfaceTextureListenerC17306x32f4bae6.G) {
                    textureViewSurfaceTextureListenerC17306x32f4bae6.N.f141283i = (int) (java.lang.System.currentTimeMillis() - textureViewSurfaceTextureListenerC17306x32f4bae6.P[1]);
                    if (bitmap2 == null) {
                        textureViewSurfaceTextureListenerC17306x32f4bae6.Z6(null);
                        return;
                    }
                    textureViewSurfaceTextureListenerC17306x32f4bae6.f240898v = bitmap2;
                    textureViewSurfaceTextureListenerC17306x32f4bae6.V6();
                    textureViewSurfaceTextureListenerC17306x32f4bae6.c7(textureViewSurfaceTextureListenerC17306x32f4bae6.f240898v);
                }
            }
        });
    }
}
