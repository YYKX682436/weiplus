package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class w9 extends com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb, sf.g, ni1.f, cf.h {
    public gg.c A;
    public boolean B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa C;
    public final java.util.LinkedList D;
    public final com.p314xaae8f345.p3210x3857dc.h1 E;
    public final com.p314xaae8f345.p3210x3857dc.s0 F;
    public final com.p314xaae8f345.p3210x3857dc.g1 G;
    public final com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 H;
    public java.lang.Boolean I;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma f168735s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja f168736t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la f168737u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 f168738v;

    /* renamed from: w, reason: collision with root package name */
    public xi1.m f168739w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.Animator f168740x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f168741y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f168742z;

    static {
        hm1.b[] bVarArr = hm1.b.f363726d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandXWebSameLayerPluginInstaller", "<clinit>");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w9(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9.<init>(android.content.Context):void");
    }

    public static com.p314xaae8f345.p3210x3857dc.y0 E0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var, java.lang.String str) {
        android.webkit.WebResourceResponse a17;
        w9Var.getClass();
        if (android.text.TextUtils.isEmpty(str) || (a17 = w9Var.f168738v.a(str)) == null) {
            return null;
        }
        return new com.p314xaae8f345.p3210x3857dc.y0(a17.getMimeType(), a17.getEncoding(), a17.getStatusCode(), a17.getReasonPhrase(), a17.getResponseHeaders(), a17.getData());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean A() {
        return this.B;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void E(int i17, long j17) {
        android.animation.Animator animator = this.f168740x;
        if (animator != null) {
            animator.cancel();
            this.f168740x = null;
        }
        if (u(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111)) {
            mo120193x328cce1b(mo120161x95a6d12d(), i17, j17);
            return;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(mo120162x95a6d12e(), i17);
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q9(this));
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.setDuration(j17);
        ofInt.start();
        this.f168740x = ofInt;
    }

    public final void F0(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        try {
            super.mo14660x738236e6(str, valueCallback);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWebView", "evaluateJavascript get exception:%s", e17);
        }
    }

    @Override // cf.h
    public final java.lang.String I() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandWebView(%s)@%d", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.l1.a(null), java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str3, valueCallback);
    }

    @Override // ni1.f
    public final void P() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "restoreRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        mo81406xc39f557c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str, valueCallback);
    }

    @Override // ni1.f
    public final void V() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "pauseRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        mo81405xc39a57c1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean b0() {
        java.lang.Boolean bool = this.I;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()) {
                try {
                    com.p314xaae8f345.p3210x3857dc.b3.f301746a = com.p314xaae8f345.p3210x3857dc.q2.a("remote-debugging");
                } catch (java.lang.Exception e17) {
                    by5.c4.d("XWebSdkInternal", "getEnableRemoteDebug, xweb error:", e17);
                }
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.p3210x3857dc.b3.f301746a);
            this.I = valueOf;
            return valueOf.booleanValue();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        if (m120171x1f05d274()) {
            s0(canvas);
            return true;
        }
        draw(canvas);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: destroy */
    public void mo52095x5cd39ffa() {
        if (this.f168741y) {
            return;
        }
        java.util.LinkedList linkedList = this.D;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "fireAllPendingReRenderedTasks size=%d", java.lang.Integer.valueOf(linkedList.size()));
        while (!linkedList.isEmpty()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v9) linkedList.pollFirst()).run();
        }
        try {
            super.mo52095x5cd39ffa();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandWebView", e17, "[CAUGHT CRASH]", new java.lang.Object[0]);
        }
        android.animation.Animator animator = this.f168740x;
        if (animator != null) {
            animator.cancel();
            this.f168740x = null;
        }
        xi1.m mVar = this.f168739w;
        if (mVar != null) {
            mVar.b(null);
            this.f168739w.mo53823x41012807();
        }
        this.f168739w = null;
        try {
            i(getContext().getApplicationContext());
        } catch (java.lang.Exception unused) {
        }
        if (getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) getParent()).removeView(this);
        }
        this.f168741y = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "destroyed hash[%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWebView", "dispatchDraw %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void e0(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.f168741y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWebView", "postOnReRendered webview destroyed, stack=%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v9 v9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v9(this, runnable, null);
        if (m120171x1f05d274()) {
            postDelayed(v9Var, 200L);
        } else {
            postOnAnimation(v9Var);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            F0(str, valueCallback);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p9(this, str, valueCallback));
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public android.graphics.Bitmap f() {
        return super.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void g0(java.lang.String str, java.lang.String str2) {
        mo64581x9b341568(str, str2, "text/html", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, null);
    }

    /* renamed from: getAppBrandWebViewClient */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 m52235xea59348() {
        return this.f168738v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getContentView */
    public android.view.View mo14662xc2a54588() {
        return super.mo120158xfb86a31b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getFullscreenImpl */
    public xi1.m mo14663xe55fc971() {
        return this.f168739w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getPageView */
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo52157xaf156f4a() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getUserAgentString */
    public java.lang.String mo14665xb9044875() {
        return this.f168742z;
    }

    @Override // sf.g
    /* renamed from: getWebViewPluginClientProxy */
    public gg.c mo52236xa4c58e8d() {
        return this.A;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: getWrapperView */
    public android.view.View mo14669x50cdf8a2() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        if (cls != ni1.f.class) {
            if (cls.isInstance(this)) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u) cls.cast(this);
            }
            return null;
        }
        hm1.m mVar = hm1.m.f363736a;
        if (u(1040)) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u) cls.cast(this);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public abstract void i(android.content.Context context);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void n(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.db dbVar) {
        boolean k17 = com.p314xaae8f345.p3210x3857dc.a3.k(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46354x528304bf);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "getImageFromDiskCache, url = %s, supportFeature = %b", str, java.lang.Boolean.valueOf(k17));
        if (k17) {
            mo120148x7a5ae7b6(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k9(this, dbVar, str));
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6) dbVar).a(str, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public void o0() {
        mo120158xfb86a31b().scrollTo(mo120161x95a6d12d(), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (java.lang.SecurityException unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja jaVar = this.f168736t;
        if (jaVar != null) {
            jaVar.j(z17, i17, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean p0() {
        return (!m120171x1f05d274() || org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d() < 472) ? mo120162x95a6d12e() == 0 : y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandInfo */
    public void mo14670xce3b1136(java.util.Map<java.lang.String, java.lang.String> map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o9 o9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o9(this, map);
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            o9Var.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(o9Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandWebViewClient */
    public void mo52160xdeb845bc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x9 x9Var) {
        this.f168738v = x9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setAppBrandWebViewContentsSizeLogEnabled */
    public /* bridge */ /* synthetic */ void mo52161x9ae7be9(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setDisableContextMenuItems */
    public void mo52158xb80428f8(int i17) {
        mo120153xd15cf999().x(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setFullscreenImpl */
    public void mo14672xad56317d(xi1.m mVar) {
        this.f168739w = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: setJsExceptionHandler */
    public void mo14673x29497b66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setOnScrollChangedListener */
    public void mo14674x6fa959a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma maVar) {
        this.f168735s = maVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setOnTrimListener */
    public void mo14675x9d811b77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ka kaVar) {
    }

    /* renamed from: setOverScrolledListener */
    public void m52237x6df8f576(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la laVar) {
        this.f168737u = laVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setWebViewLayoutListener */
    public void mo14677x7f6cbb35(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja jaVar) {
        this.f168736t = jaVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    /* renamed from: setXWebKeyboardImpl */
    public void mo14678x12a97505(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar) {
        this.C = oaVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb
    public boolean w() {
        return true;
    }
}
