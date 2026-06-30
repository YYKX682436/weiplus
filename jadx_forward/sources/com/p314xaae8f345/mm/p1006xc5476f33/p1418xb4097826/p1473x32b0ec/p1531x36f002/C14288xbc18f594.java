package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/util/CommonCircleIndicator;", "Landroid/view/View;", "", "getIndicatorHeight", "", "value", "m", "I", "setSelected", "(I)V", "selected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator */
/* loaded from: classes3.dex */
public final class C14288xbc18f594 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f196957d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f196958e;

    /* renamed from: f, reason: collision with root package name */
    public final int f196959f;

    /* renamed from: g, reason: collision with root package name */
    public final int f196960g;

    /* renamed from: h, reason: collision with root package name */
    public final float f196961h;

    /* renamed from: i, reason: collision with root package name */
    public final float f196962i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int selected;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14288xbc18f594(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setSelected */
    private final void m57145xbd98911d(int i17) {
        this.selected = java.lang.Math.min(this.f196957d - 1, i17);
        invalidate();
    }

    public final void a(int i17) {
        int i18 = this.f196957d;
        if (i17 >= i18) {
            i17 = i18 - 1;
        }
        m57145xbd98911d(i17);
        invalidate();
    }

    /* renamed from: getIndicatorHeight, reason: from getter */
    public final float getF196961h() {
        return this.f196961h;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        java.util.Iterator it = e06.p.m(0, this.f196957d).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i17 = this.selected;
            android.graphics.Paint paint = this.f196958e;
            if (b17 == i17) {
                paint.setColor(this.f196959f);
            } else {
                paint.setColor(this.f196960g);
            }
            float f17 = this.f196962i;
            float f18 = this.f196961h;
            canvas.drawCircle((b17 * (f17 + f18)) + (f18 / 2.0f), f18 / 2.0f, f18 / 2.0f, paint);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27 = this.f196957d;
        float f17 = this.f196961h;
        if (i27 > 0) {
            i19 = (int) ((i27 * f17) + (this.f196962i * (i27 - 1)));
        } else {
            i19 = 0;
        }
        setMeasuredDimension(i19, (int) f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14288xbc18f594(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f196958e = new android.graphics.Paint(1);
        this.f196959f = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77678x8113c22e);
        this.f196960g = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vd2.x5.f517539a, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f196959f = obtainStyledAttributes.getColor(3, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            this.f196960g = obtainStyledAttributes.getColor(2, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            this.f196961h = obtainStyledAttributes.getDimension(1, 12.0f);
            this.f196962i = obtainStyledAttributes.getDimension(0, 16.0f);
            obtainStyledAttributes.recycle();
        }
    }
}
