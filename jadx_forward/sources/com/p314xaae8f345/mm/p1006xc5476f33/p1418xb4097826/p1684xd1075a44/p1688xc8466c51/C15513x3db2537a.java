package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1688xc8466c51;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/record/EdgeTransparentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.widget.record.EdgeTransparentView */
/* loaded from: classes2.dex */
public final class C15513x3db2537a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f218490d;

    /* renamed from: e, reason: collision with root package name */
    public int f218491e;

    /* renamed from: f, reason: collision with root package name */
    public float f218492f;

    /* renamed from: g, reason: collision with root package name */
    public final int f218493g;

    /* renamed from: h, reason: collision with root package name */
    public final int f218494h;

    /* renamed from: i, reason: collision with root package name */
    public final int f218495i;

    /* renamed from: m, reason: collision with root package name */
    public final int f218496m;

    /* renamed from: n, reason: collision with root package name */
    public int f218497n;

    /* renamed from: o, reason: collision with root package name */
    public int f218498o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f218499p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f218500q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15513x3db2537a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int i17 = this.f218491e;
        if (i17 == 0 || (i17 & this.f218493g) != 0) {
            float f17 = this.f218497n;
            float f18 = this.f218492f;
            android.graphics.Paint paint = this.f218490d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
            canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        }
        int i18 = this.f218491e;
        if (i18 == 0 || (i18 & this.f218494h) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.f218497n / 2.0f, this.f218498o / 2.0f);
            float f19 = this.f218497n;
            float f27 = this.f218492f;
            android.graphics.Paint paint2 = this.f218490d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
            canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
            canvas.restoreToCount(save);
        }
        int i19 = (this.f218498o - this.f218497n) / 2;
        int i27 = this.f218491e;
        if (i27 == 0 || (i27 & this.f218495i) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, this.f218497n / 2.0f, this.f218498o / 2.0f);
            float f28 = i19;
            canvas.translate(0.0f, f28);
            float f29 = this.f218492f;
            android.graphics.Paint paint3 = this.f218490d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint3);
            canvas.drawRect(0 - f28, 0.0f, this.f218497n + f28, f29, paint3);
            canvas.restoreToCount(save2);
        }
        int i28 = this.f218491e;
        if (i28 == 0 || (i28 & this.f218496m) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, this.f218497n / 2.0f, this.f218498o / 2.0f);
            float f37 = i19;
            canvas.translate(0.0f, f37);
            float f38 = this.f218492f;
            android.graphics.Paint paint4 = this.f218490d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint4);
            canvas.drawRect(0 - f37, 0.0f, this.f218497n + f37, f38, paint4);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Paint paint = this.f218490d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
        paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f218492f, this.f218499p, this.f218500q, android.graphics.Shader.TileMode.CLAMP));
        this.f218497n = getWidth();
        this.f218498o = getHeight();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15513x3db2537a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f218493g = 1;
        this.f218494h = 1 << 1;
        this.f218495i = 1 << 2;
        this.f218496m = 1 << 3;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f218490d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f218490d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f100078b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f218491e = obtainStyledAttributes.getInt(0, 0);
        this.f218492f = obtainStyledAttributes.getDimension(1, i65.a.a(context, 20.0f));
        obtainStyledAttributes.recycle();
        this.f218499p = new int[]{-1, 0};
        this.f218500q = new float[]{0.0f, 1.0f};
    }
}
