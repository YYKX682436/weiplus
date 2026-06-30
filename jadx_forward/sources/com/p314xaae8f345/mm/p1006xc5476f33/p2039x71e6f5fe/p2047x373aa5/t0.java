package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes14.dex */
public final class t0 extends com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f241515p1 = 0;
    public final float A;
    public int B;
    public boolean C;
    public byte[] D;
    public int E;
    public boolean F;
    public boolean G;
    public byte[] H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f241516J;
    public boolean K;
    public boolean L;
    public boolean M;
    public byte[] N;
    public int P;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 Q;
    public boolean R;
    public android.widget.RelativeLayout S;
    public android.widget.TextView T;
    public android.animation.AnimatorSet U;
    public int V;
    public int W;

    /* renamed from: l1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t f241517l1;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f241518p;

    /* renamed from: p0, reason: collision with root package name */
    public int f241519p0;

    /* renamed from: q, reason: collision with root package name */
    public long f241520q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f241521r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.u f241522s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f241523t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f241524u;

    /* renamed from: v, reason: collision with root package name */
    public ny4.d f241525v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f241526w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f241527x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f241528x0;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f241529y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f241530y0;

    /* renamed from: z, reason: collision with root package name */
    public final float f241531z;

    public t0(android.content.Context context) {
        super(context);
        this.f241518p = "MicroMsg.ScanPassportView";
        this.f241521r = kz5.q0.f395534d;
        this.f241527x = true;
        this.f241529y = new java.util.ArrayList();
        this.f241531z = 0.33f;
        this.A = 1.4394367f;
        this.E = Integer.MAX_VALUE;
        this.I = Integer.MAX_VALUE;
        this.P = Integer.MAX_VALUE;
        this.f241517l1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t();
    }

    /* renamed from: getScreenOrientation */
    private final int m68915x60c5290e() {
        java.lang.Object systemService = getContext().getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    public static final void l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = t0Var.f241526w;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = t0Var.f241516J;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = t0Var.Q;
        if (b4Var3 != null) {
            b4Var3.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.u uVar = t0Var.f241522s;
        if (uVar != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e c5968xe69f472e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e();
            c5968xe69f472e.f136266g.f89852a = 2;
            c5968xe69f472e.e();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p1) uVar).f241142a.finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] m(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 r26, ny4.c r27, java.nio.ByteBuffer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.m(com.tencent.mm.plugin.scanner.view.t0, ny4.c, java.nio.ByteBuffer, int, int):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean n(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 r2, ny4.c r3, int r4) {
        /*
            r2.getClass()
            r0 = 0
            if (r4 != 0) goto L7
            goto L38
        L7:
            ny4.b r1 = r3.f422981b
            if (r1 == 0) goto L20
            ny4.b r3 = r3.f422982c
            if (r3 == 0) goto L18
            float r3 = r2.s(r1, r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L19
        L18:
            r3 = 0
        L19:
            if (r3 == 0) goto L20
            float r3 = r3.floatValue()
            goto L21
        L20:
            r3 = 0
        L21:
            android.view.View r1 = r2.f241523t
            if (r1 == 0) goto L2a
            int r1 = r1.getHeight()
            goto L2b
        L2a:
            r1 = r0
        L2b:
            float r1 = (float) r1
            float r4 = (float) r4
            float r4 = r1 / r4
            float r3 = r3 * r4
            float r3 = r3 / r1
            float r2 = r2.f241531z
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L38
            r0 = 1
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.n(com.tencent.mm.plugin.scanner.view.t0, ny4.c, int):boolean");
    }

    public static final void o(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var) {
        android.widget.TextView textView = t0Var.f241524u;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = t0Var.T;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout = t0Var.S;
        if (relativeLayout != null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(relativeLayout, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(1000L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "rotationX", 0.0f, 10.0f);
            ofFloat2.setDuration(2000L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "rotationX", 10.0f);
            ofFloat3.setDuration(1000L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
            t0Var.U = animatorSet;
            animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q0(t0Var, relativeLayout, animatorSet));
            animatorSet.start();
        }
    }

    public static final void p(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var) {
        t0Var.getClass();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_passport_scan_lean_front_timeout_value, 10);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = t0Var.f241516J;
        if (b4Var != null) {
            long j17 = Ni * 1000;
            b4Var.c(j17, j17);
        }
    }

    public static final void q(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var, java.lang.String str) {
        t0Var.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s0(t0Var, str, null), 3, null);
    }

    /* renamed from: setupFixedScanFrame */
    private final void m68916x4b923bb9(android.view.View view) {
        android.widget.TextView textView;
        this.S = view != null ? (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f566537q45) : null;
        int i17 = com.p314xaae8f345.mm.ui.bl.b(getContext()).x;
        int i18 = com.p314xaae8f345.mm.ui.bl.b(getContext()).y;
        android.widget.RelativeLayout relativeLayout = this.S;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        if (t()) {
            layoutParams2.width = i17 - i65.a.b(getContext(), 64);
            layoutParams2.height = (int) ((i17 - i65.a.b(getContext(), 64)) * 0.7d);
            layoutParams2.addRule(13);
        } else {
            int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
            int i19 = 0;
            int dimensionPixelSize = identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0;
            android.widget.TextView textView2 = this.f241524u;
            if (!(textView2 != null && textView2.getVisibility() == 0) ? (textView = this.T) != null : (textView = this.f241524u) != null) {
                i19 = textView.getMeasuredHeight();
            }
            layoutParams2.height = ((i18 - i19) - dimensionPixelSize) - i65.a.b(getContext(), 72);
            layoutParams2.width = (int) ((r1 - i65.a.b(getContext(), 72)) / 0.7d);
            layoutParams2.removeRule(13);
            layoutParams2.addRule(14);
            layoutParams2.topMargin = i65.a.b(getContext(), 56) + i19;
        }
        android.widget.RelativeLayout relativeLayout2 = this.S;
        if (relativeLayout2 == null) {
            return;
        }
        relativeLayout2.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.CharSequence] */
    /* renamed from: setupScanTv */
    private final void m68917xa49ebabc(android.view.View view) {
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568633ni2) : null;
        this.f241524u = textView;
        if (textView != null) {
            textView.setShadowLayer(3.0f, 0.0f, 0.0f, -16777216);
        }
        android.widget.TextView textView2 = this.f241524u;
        if (textView2 != null) {
            textView2.setTextSize(22.0f);
        }
        java.util.Map map = this.f241521r;
        java.lang.String str = map != null ? (java.lang.String) map.get("center_of_screen") : null;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.String str2 = str;
        if (K0) {
            str2 = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575191n36);
        }
        android.widget.TextView textView3 = this.f241524u;
        java.lang.String str3 = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(textView3 != null ? textView3.getText() : null)) {
            android.widget.TextView textView4 = this.f241524u;
            str3 = textView4 != null ? textView4.getText() : null;
        }
        android.widget.TextView textView5 = this.f241524u;
        if (textView5 != null) {
            textView5.setText(str3);
        }
        android.widget.TextView textView6 = this.f241524u;
        com.p314xaae8f345.mm.ui.bk.r0(textView6 != null ? textView6.getPaint() : null, 0.8f);
        android.widget.TextView textView7 = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.r_o) : null;
        this.T = textView7;
        if (textView7 != null) {
            textView7.setShadowLayer(3.0f, 0.0f, 0.0f, -16777216);
        }
        android.widget.TextView textView8 = this.T;
        if (textView8 != null) {
            textView8.setTextSize(22.0f);
        }
        android.widget.TextView textView9 = this.T;
        com.p314xaae8f345.mm.ui.bk.r0(textView9 != null ? textView9.getPaint() : null, 0.8f);
        android.widget.TextView textView10 = this.T;
        if (textView10 != null) {
            textView10.setVisibility(8);
        }
        android.widget.TextView textView11 = this.f241524u;
        android.view.ViewGroup.LayoutParams layoutParams = textView11 != null ? textView11.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        if (t()) {
            layoutParams2.topMargin = i65.a.b(getContext(), 160);
        } else {
            layoutParams2.topMargin = i65.a.b(getContext(), 24);
        }
        android.widget.TextView textView12 = this.f241524u;
        if (textView12 != null) {
            textView12.setLayoutParams(layoutParams2);
        }
        android.widget.TextView textView13 = this.T;
        if (textView13 == null) {
            return;
        }
        textView13.setLayoutParams(layoutParams2);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void b() {
        this.f296835e = new xy3.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01b8, code lost:
    
        if (r1 != false) goto L65;
     */
    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0.d():void");
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void e() {
        super.e();
        yy3.f.f550000m.d(this.f241520q);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f241526w;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void f() {
        super.f();
        if (!((qt5.c) this.f296835e).f448190b) {
            g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.l0(this));
        } else if (((qt5.c) this.f296835e).f448191c) {
            k(0L);
        } else {
            i(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.m0(this));
        }
        z();
        this.C = true;
    }

    /* renamed from: getCurSession */
    public final long m68918x45bd482c() {
        return this.f241520q;
    }

    /* renamed from: getScanDetailMsgMap */
    public final java.util.Map<java.lang.String, java.lang.String> m68919xec953c5f() {
        return this.f241521r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.Point point = new android.graphics.Point();
        getDisplay().getSize(point);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f241518p, "screenSize %s", point);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f241518p, "onAutoFocus %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            k(0L);
        }
        c(1000);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m68917xa49ebabc(this.f241523t);
        m68916x4b923bb9(this.f241523t);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        byte[] bArr2;
        boolean z17;
        byte[] bArr3;
        int i17;
        android.hardware.Camera.Parameters parameters;
        android.hardware.Camera.Size previewSize;
        android.hardware.Camera.Parameters parameters2;
        android.hardware.Camera.Size previewSize2;
        android.hardware.Camera.Parameters parameters3;
        android.hardware.Camera.Size previewSize3;
        android.hardware.Camera.Parameters parameters4;
        android.hardware.Camera.Size previewSize4;
        android.hardware.Camera.Parameters parameters5;
        android.hardware.Camera.Size previewSize5;
        android.hardware.Camera.Parameters parameters6;
        android.hardware.Camera.Size previewSize6;
        byte[] bArr4 = bArr;
        this.f296838h = 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPreviewFrame null data:");
        sb6.append(bArr4 == null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f241518p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (bArr4 != null && bArr4.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPreviewFrame empty data:");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = (camera == null || (parameters6 = camera.getParameters()) == null || (previewSize6 = parameters6.getPreviewSize()) == null) ? 0 : previewSize6.width;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var2.f391649d = (camera == null || (parameters5 = camera.getParameters()) == null || (previewSize5 = parameters5.getPreviewSize()) == null) ? 0 : previewSize5.height;
        int m68915x60c5290e = m68915x60c5290e();
        if (bArr4 != null) {
            if (m68915x60c5290e == 0) {
                bArr4 = y(bArr4, f0Var.f391649d, f0Var2.f391649d, 90);
                f0Var.f391649d = (camera == null || (parameters2 = camera.getParameters()) == null || (previewSize2 = parameters2.getPreviewSize()) == null) ? 0 : previewSize2.height;
                f0Var2.f391649d = (camera == null || (parameters = camera.getParameters()) == null || (previewSize = parameters.getPreviewSize()) == null) ? 0 : previewSize.width;
            } else if (m68915x60c5290e != 2) {
                if (m68915x60c5290e == 3) {
                    bArr4 = y(bArr4, f0Var.f391649d, f0Var2.f391649d, 180);
                }
                z17 = false;
                bArr2 = bArr4;
            } else {
                bArr4 = y(bArr4, f0Var.f391649d, f0Var2.f391649d, 270);
                f0Var.f391649d = (camera == null || (parameters4 = camera.getParameters()) == null || (previewSize4 = parameters4.getPreviewSize()) == null) ? 0 : previewSize4.height;
                f0Var2.f391649d = (camera == null || (parameters3 = camera.getParameters()) == null || (previewSize3 = parameters3.getPreviewSize()) == null) ? 0 : previewSize3.width;
            }
            z17 = true;
            bArr2 = bArr4;
        } else {
            bArr2 = bArr4;
            z17 = false;
        }
        if (camera != null) {
            android.hardware.Camera.Size previewSize7 = camera.getParameters().getPreviewSize();
            int i18 = previewSize7.width;
            int i19 = previewSize7.height;
            if (z17) {
                i17 = i18;
            } else {
                i17 = i19;
                i19 = i18;
            }
            android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr2, 17, i19, i17, null);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, i19, i17), 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(byteArray);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/ScanPassportView", "toRGB", "([BLandroid/hardware/Camera;Z)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/scanner/view/ScanPassportView", "toRGB", "([BLandroid/hardware/Camera;Z)[B", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(decodeByteArray.getByteCount());
            decodeByteArray.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            bArr3 = new byte[(array.length / 4) * 3];
            int a17 = sz5.b.a(0, array.length - 1, 4);
            if (a17 >= 0) {
                int i27 = 0;
                int i28 = 0;
                while (true) {
                    int i29 = i27 + 1;
                    bArr3[i27] = array[i28];
                    int i37 = i29 + 1;
                    bArr3[i29] = array[i28 + 1];
                    int i38 = i37 + 1;
                    bArr3[i37] = array[i28 + 2];
                    if (i28 == a17) {
                        break;
                    }
                    i28 += 4;
                    i27 = i38;
                }
            }
        } else {
            bArr3 = null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr3 != null ? bArr3.length : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allocateDirect, "allocateDirect(...)");
        if (bArr3 != null) {
            allocateDirect.put(bArr3);
        }
        allocateDirect.flip();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.g0(this, allocateDirect, f0Var2, f0Var);
        this.B++;
        g0Var.run();
        k(0L);
        if (this.B % 10 == 9) {
            ((qt5.c) this.f296835e).j("auto");
            c(100L);
        }
    }

    public final float r(java.util.ArrayList arrayList) {
        java.lang.Float f17;
        java.util.Iterator it = arrayList.iterator();
        double d17 = 0.0d;
        while (it.hasNext()) {
            d17 += ((ny4.b) it.next()) != null ? r5.f422978a : 0.0d;
        }
        java.util.Iterator it6 = arrayList.iterator();
        double d18 = 0.0d;
        while (it6.hasNext()) {
            d18 += ((ny4.b) it6.next()) != null ? r7.f422979b : 0.0d;
        }
        float size = (float) (d17 / arrayList.size());
        float size2 = (float) (d18 / arrayList.size());
        java.util.Iterator it7 = arrayList.iterator();
        float f18 = 0.0f;
        while (it7.hasNext()) {
            if (((ny4.b) it7.next()) != null) {
                double d19 = 2;
                f17 = java.lang.Float.valueOf((float) java.lang.Math.sqrt(((float) java.lang.Math.pow(r5.f422978a - size, d19)) + ((float) java.lang.Math.pow(r5.f422979b - size2, d19))));
            } else {
                f17 = null;
            }
            f18 += f17 != null ? f17.floatValue() : 0.0f;
        }
        return f18 / arrayList.size();
    }

    public final float s(ny4.b bVar, ny4.b bVar2) {
        double d17 = 2;
        return (float) java.lang.Math.sqrt(((float) java.lang.Math.pow(bVar2.f422978a - bVar.f422978a, d17)) + ((float) java.lang.Math.pow(bVar2.f422979b - bVar.f422979b, d17)));
    }

    /* renamed from: setCurSession */
    public final void m68920x73e19638(long j17) {
        this.f241520q = j17;
    }

    /* renamed from: setScanCallback */
    public final void m68921xdf4c0b64(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.u uVar) {
        this.f241522s = uVar;
    }

    /* renamed from: setScanDetailMsgMap */
    public final void m68922x9091d16b(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f241521r = map;
    }

    public final boolean t() {
        return m68915x60c5290e() == 0 || m68915x60c5290e() == 2;
    }

    public void u() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onDestroy");
        this.f296834d.setSurfaceTextureListener(null);
    }

    public final void v() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 E = db5.e1.E(getContext(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n38), "", getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n37), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.f0(this));
        if (E != null) {
            E.setCanceledOnTouchOutside(false);
        }
    }

    public void w() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onStop");
        a();
        uo.n.f511055a.b();
        ny4.d dVar = this.f241525v;
        if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPayScanpassportManager", "release");
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27759x6f4fe5d c27759x6f4fe5d = dVar.f422988a;
            if (c27759x6f4fe5d != null) {
                c27759x6f4fe5d.m119895x5cd39ffa();
                dVar.f422988a = null;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f241526w;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public final void x(int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        bundle.putInt("scan_detail", i17);
        bundle.putLong("scan_time", currentTimeMillis);
        bundle.putInt("is_vertical_screen", t() ? 1 : 2);
        if (this.f241522s != null) {
            long j17 = this.f241520q;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e c5968xe69f472e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e();
            am.ws wsVar = c5968xe69f472e.f136266g;
            wsVar.f89852a = 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("scan_detail", java.lang.Integer.valueOf(bundle.getInt("scan_detail")));
            jSONObject.put("scan_time", java.lang.Long.valueOf(bundle.getLong("scan_time")));
            jSONObject.put("scan_session_id", java.lang.String.valueOf(j17));
            jSONObject.put("is_vertical_screen", java.lang.Integer.valueOf(bundle.getInt("is_vertical_screen")));
            wsVar.f89853b = jSONObject.toString();
            c5968xe69f472e.e();
        }
    }

    public final byte[] y(byte[] nv21Data, int i17, int i18, int i19) {
        int i27;
        int i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nv21Data, "nv21Data");
        int i29 = i17 * i18;
        if (i19 != 90) {
            if (i19 == 180) {
                byte[] bArr = new byte[nv21Data.length];
                for (int i37 = 0; i37 < i18; i37++) {
                    for (int i38 = 0; i38 < i17; i38++) {
                        bArr[(((i18 - i37) - 1) * i17) + ((i17 - i38) - 1)] = nv21Data[(i37 * i17) + i38];
                    }
                }
                int i39 = i18 / 2;
                for (int i47 = 0; i47 < i39; i47++) {
                    int i48 = i17 / 2;
                    for (int i49 = 0; i49 < i48; i49++) {
                        int i57 = (i47 * i17) + (i49 * 2);
                        int i58 = (((i39 - i47) - 1) * i17) + ((i17 - r10) - 2);
                        bArr[i29 + i58] = nv21Data[i29 + i57];
                        bArr[i58 + 1 + i29] = nv21Data[i57 + 1 + i29];
                    }
                }
                return bArr;
            }
            if (i19 != 270) {
                throw new java.lang.IllegalArgumentException("Rotation degrees must be 90, 180, or 270");
            }
        }
        byte[] bArr2 = new byte[nv21Data.length];
        for (int i59 = 0; i59 < i18; i59++) {
            for (int i66 = 0; i66 < i17; i66++) {
                bArr2[i19 == 90 ? (i66 * i18) + ((i18 - i59) - 1) : (((i17 - i66) - 1) * i18) + i59] = nv21Data[(i59 * i17) + i66];
            }
        }
        int i67 = i18 / 2;
        for (int i68 = 0; i68 < i67; i68++) {
            int i69 = i17 / 2;
            for (int i76 = 0; i76 < i69; i76++) {
                int i77 = (i68 * i17) + (i76 * 2);
                int i78 = i29 + i77;
                int i79 = i77 + 1 + i29;
                if (i19 == 90) {
                    i27 = i76 * i18;
                    i28 = (i18 - (i68 * 2)) - 2;
                } else {
                    i27 = ((i17 - r13) - 2) * i18;
                    i28 = i68 * 2;
                }
                int i86 = i27 + i28 + i29;
                bArr2[i86] = nv21Data[i78];
                bArr2[i86 + 1] = nv21Data[i79];
            }
        }
        return bArr2;
    }

    public final void z() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_passport_scan_image_timeout_value, 10);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f241526w;
        if (b4Var != null) {
            long j17 = Ni * 1000;
            b4Var.c(j17, j17);
        }
    }
}
