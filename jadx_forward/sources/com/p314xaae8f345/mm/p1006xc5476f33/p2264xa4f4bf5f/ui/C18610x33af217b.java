package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.FadingEdgeView */
/* loaded from: classes2.dex */
public class C18610x33af217b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f254958d;

    /* renamed from: e, reason: collision with root package name */
    public int f254959e;

    /* renamed from: f, reason: collision with root package name */
    public float f254960f;

    /* renamed from: g, reason: collision with root package name */
    public final int f254961g;

    /* renamed from: h, reason: collision with root package name */
    public final int f254962h;

    /* renamed from: i, reason: collision with root package name */
    public final int f254963i;

    /* renamed from: m, reason: collision with root package name */
    public final int f254964m;

    /* renamed from: n, reason: collision with root package name */
    public int f254965n;

    /* renamed from: o, reason: collision with root package name */
    public int f254966o;

    public C18610x33af217b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j17);
        int i17 = this.f254959e;
        if (i17 == 0 || (i17 & this.f254961g) != 0) {
            canvas.drawRect(0.0f, 0.0f, this.f254965n, this.f254960f, this.f254958d);
        }
        int i18 = this.f254959e;
        if (i18 == 0 || (i18 & this.f254962h) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.f254965n / 2, this.f254966o / 2);
            canvas.drawRect(0.0f, 0.0f, this.f254965n, this.f254960f, this.f254958d);
            canvas.restoreToCount(save);
        }
        int i19 = (this.f254966o - this.f254965n) / 2;
        int i27 = this.f254959e;
        if (i27 == 0 || (i27 & this.f254963i) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, this.f254965n / 2, this.f254966o / 2);
            canvas.translate(0.0f, i19);
            canvas.drawRect(0 - i19, 0.0f, this.f254965n + i19, this.f254960f, this.f254958d);
            canvas.restoreToCount(save2);
        }
        int i28 = this.f254959e;
        if (i28 == 0 || (i28 & this.f254964m) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, this.f254965n / 2, this.f254966o / 2);
            canvas.translate(0.0f, i19);
            canvas.drawRect(0 - i19, 0.0f, this.f254965n + i19, this.f254960f, this.f254958d);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f254965n = getWidth();
        this.f254966o = getHeight();
    }

    /* renamed from: setPosition */
    public void m71733xa32537ab(int i17) {
        this.f254959e = i17;
        invalidate();
    }

    public C18610x33af217b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f254961g = 1;
        this.f254962h = 2;
        this.f254963i = 4;
        this.f254964m = 8;
        int i18 = 0;
        int[] iArr = {-16777216, 0};
        float[] fArr = {0.0f, 1.0f};
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f254958d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f254958d.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zh4.o.f554517a);
        this.f254959e = obtainStyledAttributes.getInt(0, 0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        if (valueOf != null) {
            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf.intValue());
        }
        this.f254960f = obtainStyledAttributes.getDimension(1, i18);
        obtainStyledAttributes.recycle();
        this.f254958d.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f254960f, iArr, fArr, android.graphics.Shader.TileMode.CLAMP));
    }
}
