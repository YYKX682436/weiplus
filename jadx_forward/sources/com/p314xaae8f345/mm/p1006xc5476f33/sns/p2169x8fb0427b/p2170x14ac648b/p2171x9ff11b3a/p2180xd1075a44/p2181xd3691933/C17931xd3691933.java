package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView */
/* loaded from: classes14.dex */
public class C17931xd3691933 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b {
    public static final /* synthetic */ int W = 0;
    public android.view.GestureDetector A;
    public float B;
    public long C;
    public boolean D;
    public float E;
    public boolean F;
    public jb4.b0 G;
    public int H;
    public final android.os.Handler I;

    /* renamed from: J, reason: collision with root package name */
    public int f247435J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public android.view.View.OnClickListener P;
    public android.view.View.OnLongClickListener Q;
    public android.graphics.Bitmap R;
    public boolean S;
    public java.lang.String T;
    public final android.view.TextureView.SurfaceTextureListener U;
    public jb4.c0 V;

    /* renamed from: s, reason: collision with root package name */
    public float f247436s;

    /* renamed from: t, reason: collision with root package name */
    public float f247437t;

    /* renamed from: u, reason: collision with root package name */
    public float f247438u;

    /* renamed from: v, reason: collision with root package name */
    public float f247439v;

    /* renamed from: w, reason: collision with root package name */
    public jb4.e0 f247440w;

    /* renamed from: x, reason: collision with root package name */
    public android.hardware.SensorManager f247441x;

    /* renamed from: y, reason: collision with root package name */
    public android.hardware.Sensor f247442y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f247443z;

    public C17931xd3691933(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247443z = new float[3];
        this.B = 0.4f;
        this.C = 0L;
        this.D = true;
        this.F = false;
        this.I = new jb4.w(this);
        this.L = true;
        this.M = false;
        this.N = false;
        jb4.x xVar = new jb4.x(this);
        this.R = null;
        this.S = false;
        this.T = "";
        jb4.a0 a0Var = new jb4.a0(this);
        this.U = a0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        m70281xdbab8186(2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSurfaceTextureListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        ((java.util.ArrayList) this.f247434q).add(a0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSurfaceTextureListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
        jb4.e0 e0Var = new jb4.e0(context);
        this.f247440w = e0Var;
        m70287x5913df45(e0Var);
        m70286x638e3a5b(0);
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f247441x = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        this.f247442y = defaultSensor;
        if (defaultSensor == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereView", "device has no Gyroscope sensor, model=" + wo.w0.m() + ", brand=" + android.os.Build.BRAND);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", "has Gyroscope sensor, model=" + wo.w0.m() + ", brand=" + android.os.Build.BRAND + ", sensor=" + this.f247442y);
        }
        this.G = new jb4.b0(this);
        int scaledTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop() / 4;
        this.H = scaledTouchSlop;
        if (scaledTouchSlop < 4) {
            this.H = 4;
        }
        this.A = new android.view.GestureDetector(context, xVar);
        this.E = context.getResources().getDisplayMetrics().density;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", "init, displayDensity=" + this.E + ", apiLevel=" + android.os.Build.VERSION.SDK_INT + ", touchSlop=" + this.H);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public static /* synthetic */ float[] f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 c17931xd3691933) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        float[] fArr = c17931xd3691933.f247443z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return fArr;
    }

    public static /* synthetic */ jb4.e0 g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 c17931xd3691933) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        jb4.e0 e0Var = c17931xd3691933.f247440w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return e0Var;
    }

    /* renamed from: getCurAngle */
    public android.graphics.PointF m70288x9b77abe9() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurAngle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        android.graphics.PointF pointF = new android.graphics.PointF();
        jb4.e0 e0Var = this.f247440w;
        pointF.x = e0Var.f380329k;
        pointF.y = e0Var.f380330l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurAngle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return pointF;
    }

    public float h(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("px2Angle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (this.E == 0.0f) {
            this.E = 3.0f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereView", "px2Angle , mDisplayDensity==0");
        }
        float f18 = (f17 / this.E) * this.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("px2Angle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        return f18;
    }

    public void i(float f17, float f18, float f19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        jb4.e0 e0Var = this.f247440w;
        e0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "setScaleParams, near=" + f17 + ", far=" + f18 + ", z=" + f19);
        if (f17 >= f18 || f18 < 20.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        } else {
            e0Var.f380333o = f17;
            e0Var.f380334p = f18;
            e0Var.f380335q = f19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRenderParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void j(android.graphics.Bitmap bitmap, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        boolean isAvailable = isAvailable();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", "updateImage, isAvailable=" + isAvailable + ", hasPendingImage=" + this.S);
        if (isAvailable) {
            this.R = null;
            this.S = false;
            this.T = "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            jb4.z zVar = new jb4.z(this, bitmap, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            c(zVar);
        } else {
            this.R = bitmap;
            this.S = true;
            this.T = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("zero", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", "zero, hash=" + hashCode());
        jb4.e0 e0Var = this.f247440w;
        e0Var.f380330l = 90.0f;
        e0Var.f380329k = 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("zero", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        super.onAttachedToWindow();
        this.F = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", "onAttachedToWindow, hash=" + hashCode() + ", apiLevel=" + android.os.Build.VERSION.SDK_INT);
        k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttachedToWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        super.onDetachedFromWindow();
        this.F = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", "onDetachedFromWindow, hash=" + hashCode());
        this.R = null;
        this.S = false;
        this.T = "";
        m70291xc4a52ce5(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        jb4.z zVar = new jb4.z(this, null, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newUpdateRunnable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        c(zVar);
        k();
        jb4.c0 c0Var = this.V;
        if (c0Var != null) {
            c0Var.mo70209x8876e98b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0068, code lost:
    
        if (r14 != 3) goto L47;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setEventListener */
    public void m70289x2eac842c(jb4.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.V = c0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.P = onClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.Q = onLongClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* renamed from: setOnlyHorizontalScroll */
    public void m70290x75222b5f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnlyHorizontalScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        this.N = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnlyHorizontalScroll", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* renamed from: setSensorEnabled */
    public void m70291xc4a52ce5(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (z17 && this.F) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereView", "setSensorEnabled when isDetachedFromWindow");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enableSensor, enabled=");
        sb6.append(z17);
        sb6.append(", hash=");
        sb6.append(hashCode());
        sb6.append(", hasSensor=");
        sb6.append(this.f247442y != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", sb6.toString());
        try {
            android.hardware.Sensor sensor = this.f247442y;
            if (sensor != null) {
                if (z17) {
                    jb4.b0 b0Var = this.G;
                    b0Var.f380306d = 0L;
                    this.f247441x.registerListener(b0Var, sensor, 0);
                } else {
                    this.f247441x.unregisterListener(this.G);
                    this.G.f380306d = 0L;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereView", "setSensorEnabled exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSensorEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* renamed from: setTouchEnabled */
    public void m70292xd5adfc84(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereView", "setTouchEnabled：" + z17 + ", hash=" + hashCode());
        this.D = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchEnabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }

    /* renamed from: setTouchSensitivity */
    public void m70293x94523662(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchSensitivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
        if (f17 > 0.0f) {
            this.B = f17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchSensitivity", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView");
    }
}
