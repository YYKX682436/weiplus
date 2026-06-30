package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.HighlightRectSideView */
/* loaded from: classes4.dex */
public class C17296x9dcc6554 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f240823d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f240824e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f240825f;

    /* renamed from: g, reason: collision with root package name */
    public final int f240826g;

    /* renamed from: h, reason: collision with root package name */
    public final int f240827h;

    /* renamed from: i, reason: collision with root package name */
    public final int f240828i;

    /* renamed from: m, reason: collision with root package name */
    public int f240829m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f240830n;

    public C17296x9dcc6554(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240829m = 0;
        this.f240830n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o(this), true);
        android.graphics.Bitmap m10969xb866ec1c = bp.b.m10969xb866ec1c(getResources(), com.p314xaae8f345.mm.R.C30861xcebc809e.ceu, null);
        int width = m10969xb866ec1c.getWidth();
        this.f240826g = width;
        int height = m10969xb866ec1c.getHeight();
        this.f240827h = height;
        if (height != width) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HighlightRectSideView", "width is not same as height");
        }
        int i17 = (width * 6) / 24;
        this.f240828i = i17;
        this.f240823d = new boolean[4];
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f240825f = paint;
        paint.setColor(6676738);
        paint.setAlpha(255);
        paint.setStrokeWidth(i17);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f240830n.c(300L, 300L);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f240830n;
        if (b4Var != null) {
            b4Var.d();
            this.f240830n = null;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean[] zArr;
        boolean z17;
        super.onDraw(canvas);
        int i17 = 0;
        while (true) {
            zArr = this.f240823d;
            if (i17 >= 4) {
                z17 = true;
                break;
            } else {
                if (!zArr[i17]) {
                    z17 = false;
                    break;
                }
                i17++;
            }
        }
        int i18 = this.f240828i / 2;
        boolean z18 = zArr[0];
        int i19 = this.f240827h;
        android.graphics.Paint paint = this.f240825f;
        if (z18 && (true == z17 || this.f240829m % 2 == 0)) {
            int i27 = this.f240824e.left;
            canvas.drawLine(i27 + i18, r0.top + i19, i27 + i18, r0.bottom - i19, paint);
        }
        if (zArr[1] && (true == z17 || this.f240829m % 2 == 0)) {
            int i28 = this.f240824e.right;
            canvas.drawLine(i28 - i18, r0.top + i19, i28 - i18, r0.bottom - i19, paint);
        }
        boolean z19 = zArr[2];
        int i29 = this.f240826g;
        if (z19 && (true == z17 || this.f240829m % 3 == 0)) {
            android.graphics.Rect rect = this.f240824e;
            float f17 = rect.left + i29;
            int i37 = rect.top;
            canvas.drawLine(f17, i37 + i18, rect.right - i29, i37 + i18, paint);
        }
        if (zArr[3]) {
            if (true == z17 || this.f240829m % 3 == 0) {
                android.graphics.Rect rect2 = this.f240824e;
                float f18 = rect2.left + i29;
                int i38 = rect2.bottom;
                canvas.drawLine(f18, i38 - i18, rect2.right - i29, i38 - i18, paint);
            }
        }
    }

    /* renamed from: setMaskRect */
    public void m68689x86f71d72(android.graphics.Rect rect) {
        this.f240824e = rect;
    }

    /* renamed from: setShowRectEdges */
    public void m68690x6b430313(boolean[] zArr) {
        if (zArr == null || 4 != zArr.length) {
            return;
        }
        boolean z17 = zArr[0];
        boolean z18 = zArr[1];
        boolean z19 = zArr[2];
        boolean z27 = zArr[3];
        for (int i17 = 0; i17 < 4; i17++) {
            this.f240823d[i17] = zArr[i17];
        }
        invalidate();
    }
}
