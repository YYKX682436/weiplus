package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMWebView */
/* loaded from: classes8.dex */
public class C22633x83752a59 extends com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 implements pq5.a {
    public static final java.util.concurrent.CopyOnWriteArrayList F = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.Set A;
    public al5.o2 B;
    public final java.util.concurrent.CopyOnWriteArrayList C;
    public boolean D;
    public final java.util.List E;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f292903s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f292904t;

    /* renamed from: u, reason: collision with root package name */
    public final o25.k2 f292905u;

    /* renamed from: v, reason: collision with root package name */
    public int f292906v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f292907w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.z7 f292908x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f292909y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnTouchListener f292910z;

    public C22633x83752a59(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE);
    }

    public static void H0(boolean z17) {
        java.util.Iterator it = F.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) ((java.lang.ref.WeakReference) it.next()).get();
            if (c22633x83752a59 != null) {
                if (z17) {
                    c22633x83752a59.mo120153xd15cf999().B(2);
                } else {
                    c22633x83752a59.mo120153xd15cf999().B(0);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9
    public void A0(int i17, int i18, int i19, int i27) {
        al5.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.F3(i17, i18, i19, i27);
        }
        java.util.Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((al5.o2) it.next()).F3(i17, i18, i19, i27);
        }
    }

    public void D0(al5.o2 o2Var) {
        this.C.add(o2Var);
    }

    public void E0() {
    }

    public void F0() {
        super.setOnTouchListener(new al5.k2(this));
    }

    public void G0() {
        setScrollbarFadingEnabled(true);
        setScrollBarStyle(0);
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

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1.remove(r3);
     */
    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: destroy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo52095x5cd39ffa() {
        /*
            r5 = this;
            r0 = 1
            super.mo52095x5cd39ffa()     // Catch: java.lang.Throwable -> L29
            java.util.Set r1 = r5.A     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.CopyOnWriteArrayList r1 = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59.F     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Lf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L29
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L29
            com.tencent.mm.ui.widget.MMWebView r4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) r4     // Catch: java.lang.Throwable -> L29
            if (r4 != r5) goto Lf
            r1.remove(r3)     // Catch: java.lang.Throwable -> L29
        L26:
            r5.f292909y = r0
            goto L35
        L29:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.MMWebView"
            java.lang.String r3 = "catch in destroy()"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L36
            goto L26
        L35:
            return
        L36:
            r1 = move-exception
            r5.f292909y = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59.mo52095x5cd39ffa():void");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (this.f292909y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMWebView", "EvaluateJavascript can not after destroy. %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            if (fp.h.c(19)) {
                super.mo14660x738236e6(str, valueCallback);
                return;
            }
            try {
                if (!str.startsWith("javascript:")) {
                    str = "javascript:".concat(str);
                }
                super.mo32265x141096a9(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebView", "evaluateJavascript failed : %s", e17.getMessage());
            }
        }
    }

    /* renamed from: getActivityContextIfHas */
    public android.content.Context m81400x569210f3() {
        return getContext() instanceof android.content.MutableContextWrapper ? ((android.content.MutableContextWrapper) getContext()).getBaseContext() : getContext();
    }

    /* renamed from: getMMDensity */
    public float m81401x1f106092() {
        float f17 = j65.f.f();
        com.p314xaae8f345.p3210x3857dc.f1 m120143xc7aa84d5 = m120143xc7aa84d5();
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_CW;
        com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
        if (m120143xc7aa84d5 != f1Var && m120143xc7aa84d5() != f1Var2) {
            return f17;
        }
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        return com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() == f1Var2 && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c) ? org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429508h : false ? getResources().getDisplayMetrics().density : f17;
    }

    /* renamed from: getPerformanceHelper */
    public o25.k2 m81402xac35af48() {
        return this.f292905u;
    }

    /* renamed from: getRandomStr */
    public java.lang.String m81403xce19f7b8() {
        return this.f292903s;
    }

    /* renamed from: getWebViewContextType */
    public int m81404x7e4349a6() {
        android.content.Context context = getContext();
        if (context instanceof android.content.MutableContextWrapper) {
            context = ((android.content.MutableContextWrapper) context).getBaseContext();
        }
        if (context == null) {
            return 0;
        }
        return context instanceof android.app.Activity ? 1 : 2;
    }

    public void i(android.content.Context context) {
        if (context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) {
            context = ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context).m81186xd24c19fa();
        }
        if (getContext() instanceof android.content.MutableContextWrapper) {
            android.content.MutableContextWrapper mutableContextWrapper = (android.content.MutableContextWrapper) getContext();
            if (mutableContextWrapper.getBaseContext() == context) {
                return;
            }
            mutableContextWrapper.setBaseContext(context);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f, pf.b
    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        super.mo32265x141096a9(str);
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (android.os.Build.VERSION.SDK_INT >= 30 && windowInsets != null) {
            android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars());
            android.graphics.Insets insets2 = windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars());
            android.graphics.Insets insets3 = windowInsets.getInsets(android.view.WindowInsets.Type.tappableElement());
            java.lang.Object[] objArr = new java.lang.Object[5];
            boolean z17 = false;
            objArr[0] = java.lang.Integer.valueOf(insets.top);
            objArr[1] = java.lang.Integer.valueOf(insets.bottom);
            objArr[2] = java.lang.Integer.valueOf(insets2.bottom);
            objArr[3] = java.lang.Integer.valueOf(insets3.bottom);
            if (insets3.bottom > 0 && insets2.bottom == 0) {
                z17 = true;
            }
            objArr[4] = java.lang.Boolean.valueOf(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebView", "onApplyWindowInsets systemBars.top:%d bottom:%d, navigationBars.bottom:%d, tappableElement.bottom:%d, isGestureNav:%b", objArr);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebView", "onCreateInputConnection");
        if (this.f292908x == null) {
            return super.onCreateInputConnection(editorInfo);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWebView", "use inputConnectionWrapperHelper");
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        ((fy4.e) this.f292908x).getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("if_support_wx_emoji", true);
        bundle.putBoolean("if_support_new_wxkb", true);
        bundle.putInt("wechat_scene", 7);
        bundle.putLong("if_support_file_ability", 7L);
        bundle.putLong("if_support_identity_ability", 7L);
        bundle.putLong("wechat_support_ability", 33L);
        editorInfo.extras.putAll(bundle);
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        fy4.e eVar = (fy4.e) this.f292908x;
        eVar.getClass();
        if (onCreateInputConnection == null) {
            onCreateInputConnection = new android.view.inputmethod.BaseInputConnection(eVar.f348792d.f265348f, false);
        }
        return new fy4.a(onCreateInputConnection, eVar);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: onHide */
    public final void mo81405xc39a57c1() {
        if (this.D) {
            return;
        }
        super.mo81405xc39a57c1();
        this.D = true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: onShow */
    public final void mo81406xc39f557c() {
        super.mo81406xc39f557c();
        this.D = false;
    }

    /* renamed from: setCleanOnDetached */
    public void mo74799x7d1824d8(boolean z17) {
    }

    /* renamed from: setInputConnectionWrapperHelper */
    public void m81407xb4a4763b(com.p314xaae8f345.mm.ui.z7 z7Var) {
        this.f292908x = z7Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f292910z = onTouchListener;
    }

    /* renamed from: setPreload */
    public void m81408x9e42f747(boolean z17) {
        this.f292904t = z17;
    }

    /* renamed from: setRandomStr */
    public void m81409x2a6db82c(java.lang.String str) {
        this.f292903s = str;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: setWebChromeClient */
    public void mo81410x6fd49b97(com.p314xaae8f345.p3210x3857dc.s0 s0Var) {
        boolean z17 = s0Var instanceof al5.n2;
        java.util.List list = this.E;
        if (z17) {
            ((al5.n2) s0Var).f87496a = list;
        }
        if (s0Var == null) {
            ((java.util.ArrayList) list).clear();
        }
        super.mo81410x6fd49b97(s0Var);
    }

    public C22633x83752a59(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE);
    }

    public C22633x83752a59(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        super(context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context).m81186xd24c19fa() : context, attributeSet, i17, f1Var);
        this.f292905u = new o25.k2();
        this.f292906v = 0;
        this.f292907w = "MMWebView_" + java.lang.System.currentTimeMillis();
        this.A = new java.util.HashSet();
        this.B = null;
        this.C = new java.util.concurrent.CopyOnWriteArrayList();
        this.D = false;
        this.E = new java.util.ArrayList();
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebView", "MMWebView create not in main thread, stack: %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        try {
            mo120173x7af55728("searchBoxJavaBridge_");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebView", "removeConfigJsInterface, ex = %s", e17.getMessage());
        }
        F.add(new java.lang.ref.WeakReference(this));
    }
}
