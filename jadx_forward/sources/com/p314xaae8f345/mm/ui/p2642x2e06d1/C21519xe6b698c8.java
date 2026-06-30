package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMVerticalTextView */
/* loaded from: classes13.dex */
public class C21519xe6b698c8 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.text.TextPaint f279135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f279136e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f279137f;

    /* renamed from: g, reason: collision with root package name */
    public final int f279138g;

    /* renamed from: h, reason: collision with root package name */
    public int f279139h;

    public C21519xe6b698c8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279137f = new android.graphics.Rect();
        this.f279139h = 0;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f279135d = textPaint;
        textPaint.setAntiAlias(true);
        this.f279135d.setTextSize(15.0f);
        this.f279135d.setColor(-16777216);
        this.f279135d.setTextAlign(android.graphics.Paint.Align.CENTER);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.N);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.f279136e = context.getString(resourceId);
        }
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 15);
        if (dimensionPixelOffset > 0) {
            this.f279135d.setTextSize(dimensionPixelOffset);
        }
        this.f279135d.setColor(obtainStyledAttributes.getColor(3, -16777216));
        this.f279138g = obtainStyledAttributes.getInt(0, 0);
        this.f279135d.setFakeBoldText(obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
        requestLayout();
        invalidate();
    }

    /* renamed from: getTextSize */
    public float m79147x40077844() {
        return this.f279135d.getTextSize();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        android.graphics.Path path = new android.graphics.Path();
        int i17 = this.f279138g;
        android.graphics.Rect rect = this.f279137f;
        int i18 = 0;
        if (i17 == 0) {
            int width = (getWidth() - rect.height()) / 2;
            float f17 = 0;
            path.moveTo(f17, f17);
            path.lineTo(f17, height);
            i18 = width;
        } else {
            float width2 = (getWidth() >> 1) + (rect.height() >> 1);
            path.moveTo(width2, height);
            path.lineTo(width2, 0);
        }
        canvas.drawTextOnPath(this.f279136e, path, 0.0f, -i18, this.f279135d);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i17 = this.f279139h;
        if (i17 == 0) {
            accessibilityNodeInfo.setClassName(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21229xde41602b);
        } else if (i17 == 1) {
            accessibilityNodeInfo.setClassName(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21227xcdc820b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.text.TextPaint textPaint = this.f279135d;
        java.lang.String str = this.f279136e;
        textPaint.getTextBounds(str, 0, str.length(), this.f279137f);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode != 1073741824) {
            int i19 = (int) (this.f279135d.getFontMetrics().bottom - this.f279135d.getFontMetrics().top);
            size = mode == Integer.MIN_VALUE ? java.lang.Math.min(i19, size) : i19;
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 != 1073741824) {
            int ceil = (int) java.lang.Math.ceil(this.f279135d.measureText(this.f279136e));
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(ceil, size2) : ceil;
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: setAccessibilityViewType */
    public void m79148x63b4dfab(int i17) {
        this.f279139h = i17;
    }

    /* renamed from: setMediumBold */
    public void m79149xb2d4819c(boolean z17) {
        this.f279135d.setFakeBoldText(z17);
    }

    /* renamed from: setText */
    public void m79150x765074af(java.lang.String str) {
        this.f279136e = str;
        requestLayout();
        invalidate();
    }

    /* renamed from: setTextColor */
    public void m79151x1c5c5ff4(int i17) {
        this.f279135d.setColor(i17);
        invalidate();
    }

    /* renamed from: setTextSize */
    public void m79153x3abfd950(int i17) {
        this.f279135d.setTextSize(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setTextSize */
    public void m79152x3abfd950(float f17) {
        this.f279135d.setTextSize(f17);
        requestLayout();
        invalidate();
    }
}
