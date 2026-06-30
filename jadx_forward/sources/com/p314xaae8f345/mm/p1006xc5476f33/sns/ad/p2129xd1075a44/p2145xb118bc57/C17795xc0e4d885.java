package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer */
/* loaded from: classes4.dex */
public class C17795xc0e4d885 extends android.widget.FrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f245091w = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f245092d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f245093e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f245094f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f245095g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f245096h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f245097i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f245098m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245099n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f245100o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f245101p;

    /* renamed from: q, reason: collision with root package name */
    public int f245102q;

    /* renamed from: r, reason: collision with root package name */
    public int f245103r;

    /* renamed from: s, reason: collision with root package name */
    public s84.j f245104s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f245105t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f245106u;

    /* renamed from: v, reason: collision with root package name */
    public final int f245107v;

    public C17795xc0e4d885(android.content.Context context) {
        super(context);
        this.f245093e = new android.graphics.Rect();
        this.f245094f = new android.graphics.Rect();
        this.f245095g = new android.graphics.Rect();
        this.f245096h = new android.graphics.Rect();
        this.f245097i = new android.graphics.Rect();
        this.f245099n = false;
        this.f245100o = false;
        this.f245101p = false;
        this.f245104s = new s84.i(this);
        this.f245106u = false;
        this.f245107v = android.graphics.Color.parseColor("#33000000");
        c(context);
    }

    public static /* synthetic */ android.widget.ImageView a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 c17795xc0e4d885) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        android.widget.ImageView imageView = c17795xc0e4d885.f245098m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        return imageView;
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (this.f245098m.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragViewContainer", "hideDragView, anim=" + z17);
            if (z17) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f245098m, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.addListener(new s84.h(this));
                ofFloat.start();
            } else {
                this.f245098m.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public void c(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        this.f245092d = context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragViewContainer", "init, new dragView");
        android.widget.ImageView imageView = new android.widget.ImageView(this.f245092d);
        this.f245098m = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        this.f245098m.setVisibility(8);
        addView(this.f245098m, new android.widget.FrameLayout.LayoutParams(0, 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initTestSwitch", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        try {
            if (ca4.m0.c0() && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19912x2703af7b()) == 1) {
                this.f245106u = true;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDragViewContainer", "initTestSwitch, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTestSwitch", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetDragState", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragViewContainer", "resetDragState");
        this.f245100o = false;
        this.f245101p = false;
        this.f245097i.set(this.f245096h);
        this.f245098m.setScaleX(1.0f);
        this.f245098m.setScaleY(1.0f);
        android.widget.ImageView imageView = this.f245098m;
        android.graphics.Rect rect = this.f245093e;
        imageView.setX(rect.left);
        this.f245098m.setY(rect.top);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetDragState", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        super.dispatchDraw(canvas);
        if (this.f245106u) {
            canvas.drawColor(this.f245107v);
            if (this.f245105t == null) {
                android.graphics.Paint paint = new android.graphics.Paint();
                this.f245105t = paint;
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                this.f245105t.setStrokeWidth(3.0f);
            }
            android.graphics.Rect rect = this.f245093e;
            if (rect != null) {
                this.f245105t.setColor(-16776961);
                canvas.drawRect(rect, this.f245105t);
            }
            android.graphics.Rect rect2 = this.f245094f;
            if (rect2 != null) {
                this.f245105t.setColor(-16776961);
                canvas.drawRect(rect2, this.f245105t);
            }
            android.graphics.Rect rect3 = this.f245097i;
            if (rect3 != null) {
                this.f245105t.setColor(-256);
                canvas.drawRect(rect3, this.f245105t);
            }
            android.graphics.Rect rect4 = this.f245095g;
            if (rect4 != null) {
                if (this.f245101p) {
                    this.f245105t.setColor(-65536);
                } else {
                    this.f245105t.setColor(-256);
                }
                canvas.drawRect(rect4, this.f245105t);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r5 != 3) goto L59;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setDragEnabled */
    public void m69582x5f152dab(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDragEnabled", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        if (this.f245099n != z17) {
            this.f245099n = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragViewContainer", "setDragEnabled, enabled=" + z17);
            if (!z17 && this.f245100o && this.f245104s != null) {
                this.f245100o = false;
                this.f245101p = false;
                this.f245097i.set(this.f245096h);
                this.f245104s.d();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDragEnabled", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    /* renamed from: setDragEventCallback */
    public void m69583xc40e67e9(s84.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDragEventCallback", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        this.f245104s = jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDragEventCallback", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    /* renamed from: setDragViewImg */
    public void m69584xda184948(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDragViewImg", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDragViewContainer", "setDragViewImg");
        this.f245098m.setImageBitmap(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDragViewImg", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
    }

    public C17795xc0e4d885(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245093e = new android.graphics.Rect();
        this.f245094f = new android.graphics.Rect();
        this.f245095g = new android.graphics.Rect();
        this.f245096h = new android.graphics.Rect();
        this.f245097i = new android.graphics.Rect();
        this.f245099n = false;
        this.f245100o = false;
        this.f245101p = false;
        this.f245104s = new s84.i(this);
        this.f245106u = false;
        this.f245107v = android.graphics.Color.parseColor("#33000000");
        c(context);
    }

    public C17795xc0e4d885(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f245093e = new android.graphics.Rect();
        this.f245094f = new android.graphics.Rect();
        this.f245095g = new android.graphics.Rect();
        this.f245096h = new android.graphics.Rect();
        this.f245097i = new android.graphics.Rect();
        this.f245099n = false;
        this.f245100o = false;
        this.f245101p = false;
        this.f245104s = new s84.i(this);
        this.f245106u = false;
        this.f245107v = android.graphics.Color.parseColor("#33000000");
        c(context);
    }
}
