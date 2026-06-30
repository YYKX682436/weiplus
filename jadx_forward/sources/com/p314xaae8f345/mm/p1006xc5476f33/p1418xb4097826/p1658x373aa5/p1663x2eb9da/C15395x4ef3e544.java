package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/crit/PKCritBuffStageBackground;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.crit.PKCritBuffStageBackground */
/* loaded from: classes2.dex */
public final class C15395x4ef3e544 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f213388d;

    /* renamed from: e, reason: collision with root package name */
    public final int f213389e;

    /* renamed from: f, reason: collision with root package name */
    public final int f213390f;

    /* renamed from: g, reason: collision with root package name */
    public int f213391g;

    /* renamed from: h, reason: collision with root package name */
    public long f213392h;

    /* renamed from: i, reason: collision with root package name */
    public int f213393i;

    /* renamed from: m, reason: collision with root package name */
    public final float f213394m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15395x4ef3e544(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213388d = new android.graphics.Paint();
        this.f213389e = android.graphics.Color.parseColor("#00ffffff");
        this.f213390f = android.graphics.Color.parseColor("#26ffffff");
        this.f213394m = getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        a();
    }

    public final void a() {
        android.graphics.Paint paint = this.f213388d;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f213394m);
        this.f213393i = i65.a.b(getContext(), 43);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.draw(canvas);
        int height = getHeight();
        int i18 = this.f213391g;
        android.graphics.Paint paint = this.f213388d;
        if (height != i18) {
            int i19 = this.f213389e;
            paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, getHeight() / 0.93f, new int[]{i19, this.f213390f, i19}, new float[]{0.0f, 0.5f, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
        }
        this.f213391g = getHeight();
        float f17 = this.f213394m;
        int height2 = ((int) (getHeight() / 2.74f)) + ((int) f17);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f213392h;
        if (j17 > 0) {
            i17 = (int) (((((float) (currentTimeMillis - j17)) / 1000.0f) * this.f213393i) % height2);
        } else {
            this.f213392h = currentTimeMillis;
            i17 = 0;
        }
        float f18 = height2;
        float f19 = (0.0f - f18) + i17;
        while (f19 < getWidth()) {
            float f27 = f19 + f18;
            canvas.drawLine(f19, getHeight(), f27 - f17, 0.0f, paint);
            f19 = f27;
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15395x4ef3e544(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213388d = new android.graphics.Paint();
        this.f213389e = android.graphics.Color.parseColor("#00ffffff");
        this.f213390f = android.graphics.Color.parseColor("#26ffffff");
        this.f213394m = getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        a();
    }
}
