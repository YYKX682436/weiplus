package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9;

/* renamed from: com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView */
/* loaded from: classes8.dex */
public abstract class AbstractC19224x1fe3df6e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 {
    public final android.content.Context G;
    public android.graphics.Bitmap H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f263237J;
    public boolean K;

    public AbstractC19224x1fe3df6e(android.content.Context context, com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        super(context, null, 0, f1Var);
        this.H = null;
        this.I = false;
        this.f263237J = 0;
        this.K = false;
        this.G = context;
        I0();
    }

    public final void I0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchWebView", "init WebSearchWebView");
        if (fp.h.c(19)) {
            return;
        }
        try {
            java.lang.Object a17 = new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(this, "mSysWebView", null).a(), "mProvider", null).a(), "mWebViewCore", null).a(), "sWebCoreHandler", null).a(), "mLooper", null).a(), "mThread", null).a();
            if (a17 instanceof java.lang.Thread) {
                java.lang.Thread thread = (java.lang.Thread) a17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                if (thread.getState() == java.lang.Thread.State.WAITING) {
                    thread.interrupt();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", e17);
        }
    }

    public void J0(com.p314xaae8f345.p3210x3857dc.s0 s0Var, com.p314xaae8f345.p3210x3857dc.h1 h1Var) {
        mo120153xd15cf999().z(true);
        mo120153xd15cf999().E(true);
        mo120153xd15cf999().r(false);
        mo120153xd15cf999().I(true);
        mo120153xd15cf999().J(0);
        mo120153xd15cf999().Q(mo14849xb9044875());
        mo120153xd15cf999().P(true);
        mo120153xd15cf999().G(true);
        mo120153xd15cf999().M(false);
        mo120153xd15cf999().L(false);
        mo120153xd15cf999().C(true);
        mo120153xd15cf999().D(true);
        mo120153xd15cf999().J(0);
        mo120153xd15cf999().l(10485760L);
        mo120153xd15cf999().m(this.G.getDir("webviewcache", 0).getAbsolutePath());
        mo120153xd15cf999().k(true);
        mo120153xd15cf999().t(true);
        mo120153xd15cf999().u(lp0.b.X() + "databases/");
        mo120153xd15cf999().h(true);
        mo120153xd15cf999().i(true);
        com.p314xaae8f345.p3210x3857dc.d.g().d(true);
        com.p314xaae8f345.p3210x3857dc.d.g().f(this, true);
        mo120158xfb86a31b().setHorizontalScrollBarEnabled(false);
        mo120158xfb86a31b().setVerticalScrollBarEnabled(true);
        m74097xeed5daa9((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window"));
        if (s0Var != null) {
            super.mo81410x6fd49b97(s0Var);
        }
        if (h1Var != null) {
            super.mo74800x23d27c02(h1Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchWebView", "current webview core %s", m120143xc7aa84d5());
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        G0();
        getContext().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        float b17 = j65.c.b(getContext());
        if (b17 >= i65.a.v(getContext())) {
            mo120153xd15cf999().O(132);
        } else if (b17 >= i65.a.u(getContext())) {
            mo120153xd15cf999().O(132);
        } else if (b17 >= i65.a.t(getContext())) {
            mo120153xd15cf999().O(132);
        } else if (b17 >= i65.a.s(getContext())) {
            mo120153xd15cf999().O(124);
        } else if (b17 >= i65.a.z(getContext())) {
            mo120153xd15cf999().O(116);
        } else if (b17 >= i65.a.w(getContext())) {
            mo120153xd15cf999().O(108);
        } else {
            i65.a.x(getContext());
            if (b17 >= 1.0f) {
                mo120153xd15cf999().O(100);
            } else if (b17 >= i65.a.y(getContext())) {
                mo120153xd15cf999().O(92);
            } else {
                mo120153xd15cf999().O(80);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchWebView", "SetFontSize, fontSize = %f", java.lang.Float.valueOf(b17));
    }

    /* renamed from: getUserAgentString */
    public abstract java.lang.String mo14849xb9044875();

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.H;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        } else {
            super.onDraw(canvas);
            this.K = true;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f263237J;
        if (i19 <= 0) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: onPause */
    public void mo74095xb01dfb57() {
        if (this.I) {
            android.graphics.Bitmap bitmap = this.H;
            if (bitmap != null) {
                bitmap.recycle();
                this.H = null;
            }
            try {
                this.H = m120139x12501425();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchWebView", "setBitmap, exception = %s", e17);
                this.H = null;
            }
        }
        super.mo74095xb01dfb57();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: onResume */
    public void mo74096x57429eec() {
        super.mo74096x57429eec();
        ((ku5.t0) ku5.t0.f394148d).B(new aw4.RunnableC1287x321854(this));
    }

    /* renamed from: setConfigCallback */
    public void m74097xeed5daa9(android.view.WindowManager windowManager) {
        try {
            java.lang.reflect.Field declaredField = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            if (obj == null) {
                return;
            }
            java.lang.reflect.Field declaredField2 = declaredField.getType().getDeclaredField("mWindowManager");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, windowManager);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: setFlutterWidget */
    public void m74098xa8f51c3e(boolean z17) {
        this.I = z17;
        ((ku5.t0) ku5.t0.f394148d).B(new aw4.RunnableC1287x321854(this));
    }

    /* renamed from: setOnTouchUp */
    public void m74099x67c34919(aw4.n nVar) {
    }

    /* renamed from: setRealHeight */
    public void m74100x9229ae67(int i17) {
        this.f263237J = i17;
    }

    public AbstractC19224x1fe3df6e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = null;
        this.I = false;
        this.f263237J = 0;
        this.K = false;
        this.G = context;
        I0();
    }

    public AbstractC19224x1fe3df6e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = null;
        this.I = false;
        this.f263237J = 0;
        this.K = false;
        this.G = context;
        I0();
    }

    public AbstractC19224x1fe3df6e(android.content.Context context) {
        super(context, null);
        this.H = null;
        this.I = false;
        this.f263237J = 0;
        this.K = false;
        this.G = context;
        I0();
    }
}
