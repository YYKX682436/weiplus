package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002R*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderEdgeTransparentView;", "Lcom/tencent/mm/view/HardTouchableLayout;", "", "width", "Ljz5/f0;", "setEdgeWidth", "", "position", "setEdgePosition", "fix", "setHorizontalShaderOffsetFix", "", "value", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad, "Z", "isEnable", "()Z", "setEnable", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderEdgeTransparentView */
/* loaded from: classes2.dex */
public final class C15275x4b820d74 extends com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 {
    public final int A;
    public int B;
    public int C;
    public float D;

    /* renamed from: E, reason: from kotlin metadata */
    public boolean isEnable;
    public final int[] F;
    public final float[] G;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f212535s;

    /* renamed from: t, reason: collision with root package name */
    public int f212536t;

    /* renamed from: u, reason: collision with root package name */
    public int f212537u;

    /* renamed from: v, reason: collision with root package name */
    public int f212538v;

    /* renamed from: w, reason: collision with root package name */
    public float f212539w;

    /* renamed from: x, reason: collision with root package name */
    public final int f212540x;

    /* renamed from: y, reason: collision with root package name */
    public final int f212541y;

    /* renamed from: z, reason: collision with root package name */
    public final int f212542z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15275x4b820d74(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        if (!this.isEnable) {
            return super.drawChild(canvas, child, j17);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int i17 = this.f212536t;
        if (i17 == 0 || (i17 & this.f212540x) != 0) {
            float f17 = this.B;
            float f18 = this.f212539w;
            android.graphics.Paint paint = this.f212535s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
            canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        }
        int i18 = this.f212536t;
        if (i18 == 0 || (i18 & this.f212541y) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.B / 2.0f, this.C / 2.0f);
            float f19 = this.B;
            float f27 = this.f212539w;
            android.graphics.Paint paint2 = this.f212535s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
            canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
            canvas.restoreToCount(save);
        }
        int i19 = (this.C - this.B) / 2;
        int i27 = this.f212536t;
        if (i27 == 0 || (i27 & this.f212542z) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, this.B / 2.0f, this.C / 2.0f);
            float f28 = i19;
            canvas.translate(0.0f, this.D + f28);
            float f29 = this.f212539w;
            android.graphics.Paint paint3 = this.f212535s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint3);
            canvas.drawRect(0 - f28, 0.0f, this.B + f28, f29, paint3);
            canvas.restoreToCount(save2);
        }
        int i28 = this.f212536t;
        if (i28 == 0 || (i28 & this.A) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, this.B / 2.0f, this.C / 2.0f);
            float f37 = i19;
            canvas.translate(0.0f, this.D + f37);
            float f38 = this.f212539w;
            android.graphics.Paint paint4 = this.f212535s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint4);
            canvas.drawRect(0 - f37, 0.0f, this.B + f37, f38, paint4);
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
        android.graphics.Paint paint = this.f212535s;
        if (paint != null) {
            paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f212539w, this.F, this.G, android.graphics.Shader.TileMode.CLAMP));
        }
        this.B = getWidth();
        this.C = getHeight();
    }

    /* renamed from: setEdgePosition */
    public final void m62007xc2a0eb88(int i17) {
        this.f212536t = i17;
    }

    /* renamed from: setEdgeWidth */
    public final void m62008x68ad0fc7(float f17) {
        this.f212539w = f17;
        android.graphics.Paint paint = this.f212535s;
        if (paint != null) {
            paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f212539w, this.F, this.G, android.graphics.Shader.TileMode.CLAMP));
        }
        postInvalidate();
    }

    /* renamed from: setEnable */
    public final void m62009xae17c85(boolean z17) {
        this.isEnable = z17;
        postInvalidate();
    }

    /* renamed from: setHorizontalShaderOffsetFix */
    public final void m62010xb4a09117(float f17) {
        this.D = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15275x4b820d74(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212540x = 1;
        this.f212541y = 1 << 1;
        this.f212542z = 1 << 2;
        this.A = 1 << 3;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f212535s = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f212535s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b92.w2.f100078b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f212536t = obtainStyledAttributes.getInt(0, 0);
        this.f212537u = obtainStyledAttributes.getColor(3, android.graphics.Color.parseColor("#d9d9d9"));
        this.f212538v = obtainStyledAttributes.getColor(2, 0);
        this.f212539w = obtainStyledAttributes.getDimension(1, i65.a.a(context, 20.0f));
        obtainStyledAttributes.recycle();
        this.F = new int[]{this.f212537u, this.f212538v};
        this.G = new float[]{0.3f, 1.0f};
    }
}
