package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.SendDataToDeviceProgressBar */
/* loaded from: classes3.dex */
public class C21638xd3693063 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f279838d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f279839e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f279840f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f279841g;

    /* renamed from: h, reason: collision with root package name */
    public final int f279842h;

    /* renamed from: i, reason: collision with root package name */
    public final int f279843i;

    /* renamed from: m, reason: collision with root package name */
    public int f279844m;

    /* renamed from: n, reason: collision with root package name */
    public int f279845n;

    /* renamed from: o, reason: collision with root package name */
    public final int f279846o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f279847p;

    public C21638xd3693063(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getProgress */
    public int m79401x402effa3() {
        return (int) ((this.f279841g / 360.0f) * 100.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        this.f279840f.setColor(this.f279839e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a1z));
        this.f279840f.setStrokeWidth(this.f279846o);
        if (this.f279844m == -1) {
            this.f279844m = (width * 2) - this.f279842h;
        }
        if (this.f279845n == -1) {
            this.f279845n = this.f279844m;
        }
        android.graphics.RectF rectF = new android.graphics.RectF(this.f279842h, this.f279843i, this.f279844m, this.f279845n);
        canvas.drawArc(rectF, 270.0f, this.f279841g, false, this.f279840f);
        int i17 = this.f279841g + 270;
        if (i17 > 360) {
            i17 += org.p3343x72743996.net.InterfaceC29524x4f65168b.f73983x984b3535;
        }
        this.f279840f.setColor(this.f279839e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a1x));
        canvas.drawArc(rectF, i17, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 - this.f279841g, false, this.f279840f);
    }

    /* renamed from: setProgress */
    public void m79402x3ae760af(int i17) {
        if (i17 >= 100) {
            i17 = 100;
        }
        this.f279841g = (int) ((i17 / 100.0f) * 360.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f279838d;
        java.lang.Runnable runnable = this.f279847p;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 0);
    }

    public C21638xd3693063(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279841g = 2;
        this.f279842h = -1;
        this.f279843i = -1;
        this.f279844m = -1;
        this.f279845n = -1;
        this.f279846o = -1;
        this.f279847p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.rc(this);
        setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.avs);
        this.f279839e = context;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f279840f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a9n);
        this.f279842h = dimensionPixelSize;
        this.f279843i = dimensionPixelSize;
        this.f279846o = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a9o);
        this.f279838d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }
}
