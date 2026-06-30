package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.TabIconView */
/* loaded from: classes5.dex */
public class C21442x4f06d53 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f278630d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f278631e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f278632f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f278633g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f278634h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f278635i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f278636m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f278637n;

    /* renamed from: o, reason: collision with root package name */
    public int f278638o;

    /* renamed from: p, reason: collision with root package name */
    public float f278639p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f278640q;

    public C21442x4f06d53(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278638o = 0;
        this.f278639p = 1.1666666f;
        this.f278640q = context;
    }

    public void a(int i17, int i18, int i19, boolean z17) {
        if (z17) {
            this.f278639p *= 1.2f;
        }
        this.f278630d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.d0(i17, this.f278639p);
        this.f278631e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.d0(i19, this.f278639p);
        this.f278632f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.d0(i18, this.f278639p);
        if (this.f278630d != null) {
            this.f278633g = new android.graphics.Rect(0, 0, this.f278630d.getWidth(), this.f278630d.getHeight());
        }
        if (this.f278631e != null) {
            this.f278634h = new android.graphics.Rect(0, 0, this.f278631e.getWidth(), this.f278631e.getHeight());
        }
        if (this.f278632f != null) {
            this.f278635i = new android.graphics.Rect(0, 0, this.f278632f.getWidth(), this.f278632f.getHeight());
        }
        this.f278636m = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f278637n = paint;
        android.content.Context context = this.f278640q;
        paint.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), android.graphics.PorterDuff.Mode.SRC_ATOP));
        this.f278636m.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq), android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f278636m;
        if (paint == null) {
            return;
        }
        int i17 = this.f278638o;
        if (i17 < 128) {
            this.f278637n.setAlpha(255 - i17);
            canvas.drawBitmap(this.f278631e, (android.graphics.Rect) null, this.f278634h, this.f278637n);
            this.f278636m.setAlpha(this.f278638o);
            canvas.drawBitmap(this.f278632f, (android.graphics.Rect) null, this.f278635i, this.f278636m);
            return;
        }
        paint.setAlpha(255 - i17);
        canvas.drawBitmap(this.f278632f, (android.graphics.Rect) null, this.f278635i, this.f278636m);
        this.f278636m.setAlpha(this.f278638o);
        canvas.drawBitmap(this.f278630d, (android.graphics.Rect) null, this.f278633g, this.f278636m);
    }

    /* renamed from: setFocusAlpha */
    public void m78822xdca5b968(int i17) {
        this.f278638o = i17;
        invalidate();
    }

    public C21442x4f06d53(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278638o = 0;
        this.f278639p = 1.1666666f;
        this.f278640q = context;
    }
}
