package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.VolumeMeter */
/* loaded from: classes3.dex */
public class RunnableC22654x2e41dc6f extends android.widget.ImageView implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f293010d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f293011e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f293012f;

    /* renamed from: g, reason: collision with root package name */
    public int f293013g;

    /* renamed from: h, reason: collision with root package name */
    public int f293014h;

    /* renamed from: i, reason: collision with root package name */
    public final int f293015i;

    /* renamed from: m, reason: collision with root package name */
    public final int f293016m;

    /* renamed from: n, reason: collision with root package name */
    public float f293017n;

    /* renamed from: o, reason: collision with root package name */
    public float f293018o;

    public RunnableC22654x2e41dc6f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293013g = -1;
        this.f293014h = -1;
        this.f293015i = -6751336;
        this.f293016m = 70;
        this.f293011e = context;
        this.f293010d = new android.graphics.Paint();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        getWidth();
        getHeight();
        android.view.View view = this.f293012f;
        android.content.Context context = this.f293011e;
        if (view != null && view.getVisibility() != 4) {
            int[] iArr = new int[2];
            this.f293012f.getLocationInWindow(iArr);
            if (iArr[0] != 0 && iArr[1] != 0) {
                int width = this.f293012f.getWidth();
                int height = this.f293012f.getHeight();
                if (width != 0 && height != 0) {
                    int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 50.0f);
                    int i17 = width / 2;
                    this.f293013g = iArr[0] + i17;
                    this.f293014h = (iArr[1] + (height / 2)) - (d17 / 2);
                    float f17 = i17;
                    this.f293018o = f17;
                    this.f293017n = f17 * 2.0f;
                }
            }
        }
        if (this.f293013g < 0 || this.f293014h < 0) {
            return;
        }
        this.f293010d.setColor(this.f293015i);
        this.f293010d.setAlpha(this.f293016m);
        float d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 0.0f);
        float f18 = this.f293017n;
        if (d18 > f18) {
            d18 = f18;
        }
        float f19 = this.f293018o;
        if (d18 < f19) {
            d18 = f19;
        }
        canvas.drawCircle(this.f293013g, this.f293014h, d18, this.f293010d);
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    /* renamed from: setArchView */
    public void m81486x103d029d(android.view.View view) {
        this.f293012f = view;
    }

    /* renamed from: setVolume */
    public void m81487x27f73e1c(float f17) {
    }

    public RunnableC22654x2e41dc6f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293013g = -1;
        this.f293014h = -1;
        this.f293015i = -6751336;
        this.f293016m = 70;
        this.f293011e = context;
        this.f293010d = new android.graphics.Paint();
    }
}
