package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.VolumeMeter */
/* loaded from: classes14.dex */
public class RunnableC16292x2e41dc6f extends android.widget.ImageView implements java.lang.Runnable {
    public final float A;
    public final java.lang.Runnable B;

    /* renamed from: d, reason: collision with root package name */
    public boolean f226206d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f226207e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f226208f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f226209g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f226210h;

    /* renamed from: i, reason: collision with root package name */
    public int f226211i;

    /* renamed from: m, reason: collision with root package name */
    public int f226212m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f226213n;

    /* renamed from: o, reason: collision with root package name */
    public float f226214o;

    /* renamed from: p, reason: collision with root package name */
    public float f226215p;

    /* renamed from: q, reason: collision with root package name */
    public float f226216q;

    /* renamed from: r, reason: collision with root package name */
    public final int f226217r;

    /* renamed from: s, reason: collision with root package name */
    public final int f226218s;

    /* renamed from: t, reason: collision with root package name */
    public final float f226219t;

    /* renamed from: u, reason: collision with root package name */
    public final float f226220u;

    /* renamed from: v, reason: collision with root package name */
    public final int f226221v;

    /* renamed from: w, reason: collision with root package name */
    public float f226222w;

    /* renamed from: x, reason: collision with root package name */
    public float f226223x;

    /* renamed from: y, reason: collision with root package name */
    public float f226224y;

    /* renamed from: z, reason: collision with root package name */
    public final float f226225z;

    public RunnableC16292x2e41dc6f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226206d = false;
        this.f226207e = false;
        this.f226211i = -1;
        this.f226212m = -1;
        this.f226213n = null;
        this.f226217r = -6751336;
        this.f226218s = 70;
        this.f226219t = 0.5f;
        this.f226220u = 0.001f;
        this.f226221v = 20;
        this.f226224y = 0.0f;
        this.f226225z = 40.0f;
        this.A = 30.0f;
        this.B = new za3.k1(this);
        this.f226209g = context;
        this.f226208f = new android.graphics.Paint();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        getWidth();
        getHeight();
        android.view.View view = this.f226210h;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            if (iArr[0] != 0 && iArr[1] != 0) {
                int width = this.f226210h.getWidth();
                int height = this.f226210h.getHeight();
                if (width != 0 && height != 0) {
                    int i17 = width / 2;
                    this.f226211i = iArr[0] + i17;
                    this.f226212m = iArr[1] + (height / 2);
                    float f17 = i17;
                    this.f226223x = f17;
                    this.f226222w = f17 * 2.0f;
                }
            }
        }
        if (this.f226211i < 0 || this.f226212m < 0) {
            return;
        }
        this.f226208f.setColor(this.f226217r);
        this.f226208f.setAlpha(this.f226218s);
        float d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this.f226209g, this.f226224y);
        float f18 = this.f226222w;
        if (d17 > f18) {
            d17 = f18;
        }
        float f19 = this.f226223x;
        if (d17 < f19) {
            d17 = f19;
        }
        canvas.drawCircle(this.f226211i, this.f226212m, d17, this.f226208f);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f226206d) {
            float f17 = this.f226216q;
            float f18 = this.f226215p;
            float f19 = this.f226214o;
            float f27 = this.f226220u;
            float f28 = this.f226219t;
            if (f18 > f19) {
                float f29 = (f18 - f19) / this.A;
                if (f29 > f28) {
                    f27 = f28;
                } else if (f29 >= f27) {
                    f27 = f29;
                }
                f17 += f27;
            } else if (f18 <= f19) {
                float f37 = (f19 - f18) / this.f226225z;
                if (f37 > f28) {
                    f27 = f28;
                } else if (f37 >= f27) {
                    f27 = f37;
                }
                f17 -= f27;
            }
            this.f226216q = f17;
            this.f226224y = ((float) ((java.lang.Math.sqrt(f17) * 260.0d) - (this.f226216q * 130.0f))) / 1.5f;
            postInvalidate();
            this.f226213n.mo50297x7c4d7ca2(this, this.f226221v);
        }
    }

    /* renamed from: setArchView */
    public void m65953x103d029d(android.view.View view) {
        this.f226210h = view;
    }

    /* renamed from: setVolume */
    public void m65954x27f73e1c(float f17) {
        this.f226214o = this.f226215p;
        this.f226215p = f17;
    }

    public RunnableC16292x2e41dc6f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226206d = false;
        this.f226207e = false;
        this.f226211i = -1;
        this.f226212m = -1;
        this.f226213n = null;
        this.f226217r = -6751336;
        this.f226218s = 70;
        this.f226219t = 0.5f;
        this.f226220u = 0.001f;
        this.f226221v = 20;
        this.f226224y = 0.0f;
        this.f226225z = 40.0f;
        this.A = 30.0f;
        this.B = new za3.k1(this);
        this.f226209g = context;
        this.f226208f = new android.graphics.Paint();
    }
}
