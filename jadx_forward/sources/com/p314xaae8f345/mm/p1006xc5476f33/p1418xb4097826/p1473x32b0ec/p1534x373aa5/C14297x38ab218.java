package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderGradientAlphaImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/view/l0", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderGradientAlphaImageView */
/* loaded from: classes5.dex */
public final class C14297x38ab218 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f197309f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l0 f197310g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f197311h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f197312i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14297x38ab218(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void n() {
        float[] fArr;
        int[] iArr;
        int width = getWidth();
        android.graphics.Paint paint = this.f197309f;
        if (width <= 0 || getHeight() <= 0 || this.f197312i == null || this.f197311h == null) {
            paint.setShader(null);
            return;
        }
        int ordinal = this.f197310g.ordinal();
        if (ordinal == 0) {
            fArr = new float[]{0.0f, 0.0f, getWidth(), 0.0f};
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            fArr = new float[]{0.0f, 0.0f, 0.0f, getHeight()};
        }
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        float f27 = fArr[3];
        float[] fArr2 = this.f197312i;
        if (fArr2 == null) {
            iArr = new int[0];
        } else {
            int length = fArr2.length;
            int[] iArr2 = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                iArr2[i17] = android.graphics.Color.argb(e06.p.f((int) ((1.0f - fArr2[i17]) * 255), 0, 255), 0, 0, 0);
            }
            iArr = iArr2;
        }
        if (iArr.length == 0) {
            paint.setShader(null);
        } else {
            paint.setShader(new android.graphics.LinearGradient(f17, f18, f19, f27, iArr, this.f197311h, android.graphics.Shader.TileMode.CLAMP));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (getDrawable() != null) {
            android.graphics.Paint paint = this.f197309f;
            if (paint.getShader() != null && getWidth() > 0 && getHeight() > 0) {
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                super.onDraw(canvas);
                if (paint.getShader() != null) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                }
                canvas.restoreToCount(saveLayer);
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        n();
        invalidate();
    }

    public /* synthetic */ C14297x38ab218(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14297x38ab218(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        this.f197309f = paint;
        this.f197310g = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l0.f197981d;
    }
}
