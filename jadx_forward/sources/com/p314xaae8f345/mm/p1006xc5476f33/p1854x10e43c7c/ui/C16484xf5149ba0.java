package com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/masssend/ui/MassMaskAnimLinearLayout;", "Landroid/widget/LinearLayout;", "", "d", "Ljz5/g;", "getCorDp", "()F", "corDp", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.masssend.ui.MassMaskAnimLinearLayout */
/* loaded from: classes5.dex */
public final class C16484xf5149ba0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g corDp;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f230056e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f230057f;

    public C16484xf5149ba0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getCorDp */
    private final float m66585x7444e6fc() {
        return ((java.lang.Number) ((jz5.n) this.corDp).mo141623x754a37bb()).floatValue();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f230056e.isEmpty()) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        getLocalVisibleRect(rect);
        canvas.drawRoundRect(new android.graphics.RectF(rect), m66585x7444e6fc(), m66585x7444e6fc(), this.f230057f);
    }

    public C16484xf5149ba0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.corDp = jz5.h.b(new kf3.f(this));
        this.f230056e = new android.graphics.Rect();
        this.f230057f = new android.graphics.Paint();
    }
}
