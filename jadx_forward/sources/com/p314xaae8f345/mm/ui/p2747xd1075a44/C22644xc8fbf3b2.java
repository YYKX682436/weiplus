package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/ui/widget/RoundCornerLinearLayout;", "Landroid/widget/LinearLayout;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al5/t2", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.RoundCornerLinearLayout */
/* loaded from: classes5.dex */
public class C22644xc8fbf3b2 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public al5.t2 f292947d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Path f292948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22644xc8fbf3b2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292948e = new android.graphics.Path();
        a(context, null, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544631e, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f292947d = new al5.t2(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
    }

    public final void b() {
        al5.t2 t2Var;
        if (getWidth() <= 0 || getHeight() <= 0 || (t2Var = this.f292947d) == null) {
            return;
        }
        android.graphics.Path path = this.f292948e;
        path.reset();
        path.addPath(com.p314xaae8f345.mm.ui.dl.c(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), t2Var.f87562a, t2Var.f87563b, t2Var.f87565d, t2Var.f87564c, 0.6f));
        path.close();
    }

    public final void c(float f17, float f18, float f19, float f27) {
        al5.t2 t2Var = this.f292947d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t2Var);
        t2Var.f87562a = f17;
        al5.t2 t2Var2 = this.f292947d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t2Var2);
        t2Var2.f87563b = f18;
        al5.t2 t2Var3 = this.f292947d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t2Var3);
        t2Var3.f87564c = f19;
        al5.t2 t2Var4 = this.f292947d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t2Var4);
        t2Var4.f87565d = f27;
        b();
        postInvalidate();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.f292948e;
        if (path.isEmpty()) {
            b();
        }
        int save = canvas.save();
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        b();
    }

    /* renamed from: setRadius */
    public final void m81435x205ac394(float f17) {
        c(f17, f17, f17, f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22644xc8fbf3b2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292948e = new android.graphics.Path();
        a(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22644xc8fbf3b2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292948e = new android.graphics.Path();
        a(context, attributeSet, i17);
    }
}
