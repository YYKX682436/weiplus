package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/AppMsgShopCardImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "finder-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.AppMsgShopCardImageView */
/* loaded from: classes4.dex */
public final class C15212x3fac343a extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public final float f212347f;

    /* renamed from: g, reason: collision with root package name */
    public final float f212348g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f212349h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f212350i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15212x3fac343a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float width = getWidth();
        float height = getHeight();
        android.graphics.Path path = this.f212349h;
        path.reset();
        float f17 = this.f212347f;
        path.moveTo(0.0f, f17);
        path.quadTo(0.0f, 0.0f, f17, 0.0f);
        path.lineTo(width - f17, 0.0f);
        path.quadTo(width, 0.0f, width, f17);
        path.lineTo(width, height);
        path.lineTo(0.0f, height);
        path.close();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, width, height, this.f212350i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        float f17 = this.f212348g;
        if (mode == 1073741824) {
            int i19 = (int) (size * f17);
            if (mode2 != Integer.MIN_VALUE || i19 <= size2) {
                size2 = i19;
            }
        } else {
            size = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
            size2 = (int) (size * f17);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15212x3fac343a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212347f = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        this.f212348g = 0.32f;
        this.f212349h = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(android.graphics.Color.parseColor("#08000000"));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f212350i = paint;
    }
}
