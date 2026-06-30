package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView */
/* loaded from: classes15.dex */
public class C17689x58a87b4f extends com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a {
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f244022J;
    public int K;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 L;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s M;
    public boolean N;
    public boolean P;
    public int Q;

    public C17689x58a87b4f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = true;
        this.P = false;
        this.Q = 0;
        this.M = new m34.g(0, this);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayImageView", "mController %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    public void d(java.lang.String str, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", java.lang.Integer.valueOf(sVar.hashCode()), str, sVar.f243980c, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(sVar.f243982e), java.lang.Boolean.valueOf(sVar.D), java.lang.Boolean.valueOf(sVar.f243999v));
        if (sVar.D) {
            sVar.j(false);
            return;
        }
        sVar.g();
        if (!sVar.f243999v) {
            sVar.c();
            return;
        }
        if (z17) {
            sVar.f243981d = str;
            sVar.j(false);
            return;
        }
        if (sVar.f243980c.equals(str)) {
            sVar.f243981d = "ERROR#PATH";
            sVar.j(false);
            sVar.i();
            return;
        }
        sVar.c();
        if (str == null) {
            str = "";
        }
        sVar.f243980c = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
            sVar.d(null);
        } else {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s.b(sVar.f243980c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                sVar.c();
                return;
            }
            sVar.f243991n = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.n(sVar, null);
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.n nVar = sVar.f243991n;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(nVar, 0L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    public void e(int i17, int i18) {
        this.N = false;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        this.H = i17;
        int i19 = (i18 * i17) / i17;
        this.I = i19;
        layoutParams.width = i17;
        layoutParams.height = i19;
        setLayoutParams(layoutParams);
        postInvalidate();
    }

    /* renamed from: getController */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s m69285x143f1b92() {
        return this.M;
    }

    /* renamed from: getDuration */
    public int mo69286x51e8b0a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        if (sVar == null) {
            return 0;
        }
        return (int) (sVar.f243982e == -1 ? 0.0d : ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10220x36bbd779(sVar.f243982e));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    /* renamed from: getTagObject */
    public java.lang.Object mo69271x5fc924c3() {
        return getTag();
    }

    /* renamed from: getUIContext */
    public android.content.Context m69287xfdd9c5e5() {
        return getContext();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    /* renamed from: getVideoPath */
    public java.lang.String mo69272x4edea88a() {
        return this.M.f243980c;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2, android.view.View
    public void onAttachedToWindow() {
        hashCode();
        super.onAttachedToWindow();
        this.M.f().mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", java.lang.Integer.valueOf(hashCode()));
        p();
        this.M.f().mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    public void p() {
        this.M.c();
    }

    public void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "configure: need sound %B", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (sVar.f243993p == null) {
                sVar.f243993p = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.p(sVar, null);
                return;
            }
            return;
        }
        if (sVar.f243993p != null) {
            sVar.f243993p.f243971e = 0;
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.p pVar = sVar.f243993p;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(pVar, 0L);
        }
        sVar.f243993p = null;
    }

    public void r() {
        this.P = true;
    }

    public void s(android.graphics.Bitmap bitmap) {
        super.mo69290xd44890a8(bitmap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    /* renamed from: setCanPlay */
    public void mo69273xd201a062(boolean z17) {
        this.M.f243999v = z17;
    }

    /* renamed from: setDrawWidthAndHeightFix */
    public void m69288xf333b617(boolean z17) {
        this.P = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    /* renamed from: setDrawableWidth */
    public void mo69274xd5e29286(int i17) {
        this.N = false;
        this.H = i17;
        if (this.f244022J <= 0 || this.K <= 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i18 = this.H;
        int i19 = (this.K * i18) / this.f244022J;
        this.I = i19;
        if (layoutParams.width == i18 && layoutParams.height == i19) {
            return;
        }
        layoutParams.width = i18;
        layoutParams.height = i19;
        setLayoutParams(layoutParams);
    }

    /* renamed from: setForceRecordState */
    public void m69289xade31b57(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f
    /* renamed from: setImageBitmap */
    public void mo69290xd44890a8(android.graphics.Bitmap bitmap) {
        int height;
        int width;
        super.mo69290xd44890a8(bitmap);
        if (this.P) {
            return;
        }
        if (bitmap == null) {
            height = this.I;
            if (height == 0) {
                height = 240;
            }
        } else {
            height = bitmap.getHeight();
        }
        if (bitmap == null) {
            width = this.H;
            if (width == 0) {
                width = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
            }
        } else {
            width = bitmap.getWidth();
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i17 = layoutParams.height;
        int i18 = this.H;
        float f17 = width;
        if (i17 != ((int) ((i18 * height) / f17))) {
            layoutParams.width = i18;
            layoutParams.height = (int) ((i18 * height) / f17);
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f
    /* renamed from: setImageDrawable */
    public void mo46895x706225d7(android.graphics.drawable.Drawable drawable) {
        int intrinsicHeight;
        int intrinsicWidth;
        super.mo46895x706225d7(drawable);
        if (this.P) {
            return;
        }
        if (drawable == null) {
            intrinsicHeight = this.I;
            if (intrinsicHeight == 0) {
                intrinsicHeight = 240;
            }
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (drawable == null) {
            intrinsicWidth = this.H;
            if (intrinsicWidth == 0) {
                intrinsicWidth = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
            }
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0 || intrinsicWidth == 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i17 = layoutParams.height;
        int i18 = this.H;
        float f17 = intrinsicHeight;
        float f18 = intrinsicWidth;
        if (i17 == ((int) ((i18 * f17) / f18)) || this.Q != 0) {
            return;
        }
        layoutParams.width = i18;
        layoutParams.height = (int) ((i18 * f17) / f18);
        setLayoutParams(layoutParams);
    }

    /* renamed from: setIsAdVideo */
    public void m69291xf400af4c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        if (sVar != null) {
            sVar.f244000w = z17;
        }
    }

    /* renamed from: setIsForbidLoopAnim */
    public void m69292x6f91eed5(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        if (sVar != null) {
            sVar.f244001x = z17;
        }
    }

    /* renamed from: setIsWhatsNew */
    public void m69293x606ece3d(boolean z17) {
        this.M.f244002y = z17;
    }

    /* renamed from: setLoopImp */
    public void m69294xc619afc6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        if (sVar != null) {
            sVar.f244003z = z17;
        }
    }

    /* renamed from: setMaskID */
    public void m69295x17d95c09(int i17) {
    }

    /* renamed from: setOnCompletionListener */
    public void m69296xa4560c71(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.k kVar) {
        this.M.F = kVar;
    }

    /* renamed from: setOnDecodeDurationListener */
    public void m69297x8a3eafb7(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        if (lVar == null) {
            sVar.G = sVar.f243997t;
        }
        sVar.G = lVar;
    }

    /* renamed from: setOnSightCompletionAction */
    public void m69298x5aa57d8e(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.m mVar) {
        this.M.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    /* renamed from: setPosition */
    public void mo69275xa32537ab(int i17) {
        this.M.C = i17;
    }

    /* renamed from: setScaleMode */
    public void m69299xebcf33cb(int i17) {
        this.Q = i17;
    }

    /* renamed from: setSightInfoView */
    public void m69300x417fee(android.widget.TextView textView) {
        this.M.getClass();
        new java.lang.ref.WeakReference(textView);
    }

    /* renamed from: setTagObject */
    public void m69301xbc1ce537(java.lang.Object obj) {
        setTag(obj);
    }

    /* renamed from: setThumbBgView */
    public void m69302xda70303e(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        sVar.getClass();
        sVar.f243986i = new java.lang.ref.WeakReference(view);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    /* renamed from: setThumbBmp */
    public void mo69276xd3f79a51(android.graphics.Bitmap bitmap) {
        mo69290xd44890a8(bitmap);
    }

    /* renamed from: stop */
    public void mo69303x360802() {
        p();
    }

    public C17689x58a87b4f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
