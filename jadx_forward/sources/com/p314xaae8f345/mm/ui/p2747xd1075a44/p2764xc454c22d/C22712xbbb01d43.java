package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/ui/widget/progress/RoundCornerProgressBar;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attrs", "Ljz5/f0;", "setupAttributes", "", "progress", "setProgress", "Landroid/content/Context;", "context", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.progress.RoundCornerProgressBar */
/* loaded from: classes4.dex */
public final class C22712xbbb01d43 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f293922d;

    /* renamed from: e, reason: collision with root package name */
    public int f293923e;

    /* renamed from: f, reason: collision with root package name */
    public int f293924f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f293925g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22712xbbb01d43(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setupAttributes */
    private final void m82109xc4ae87b4(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yl5.a.f544645s);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f293923e = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
            this.f293924f = obtainStyledAttributes.getColor(2, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            int i17 = obtainStyledAttributes.getInt(1, 0);
            this.f293922d = i17;
            this.f293922d = e06.p.f(i17, 0, 100);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / 2;
        android.graphics.Paint paint = this.f293925g;
        paint.setColor(this.f293923e);
        paint.setStrokeWidth(getHeight());
        canvas.drawLine(height, height, getWidth() - height, height, paint);
        if (this.f293922d > 0) {
            paint.setColor(this.f293924f);
            canvas.drawLine(height, height, (((getWidth() - getHeight()) * this.f293922d) / 100.0f) + height, height, paint);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f293922d);
        sb6.append('%');
        info.setContentDescription(sb6.toString());
    }

    /* renamed from: setProgress */
    public final void m82110x3ae760af(int i17) {
        this.f293922d = e06.p.f(i17, 0, 100);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22712xbbb01d43(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f293923e = -1;
        this.f293924f = -16711936;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f293925g = paint;
        m82109xc4ae87b4(attributeSet);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }
}
