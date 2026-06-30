package com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "Landroid/view/View;", "", "updateMode", "Ljz5/f0;", "setUpdateMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView */
/* loaded from: classes10.dex */
public final class C10436x212919c6 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f146425d;

    /* renamed from: e, reason: collision with root package name */
    public int f146426e;

    /* renamed from: f, reason: collision with root package name */
    public int f146427f;

    /* renamed from: g, reason: collision with root package name */
    public int f146428g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f146429h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10436x212919c6(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        this.f146425d = new android.graphics.Paint();
        this.f146426e = -5778734;
        this.f146427f = -14072734;
        new mq.d();
        this.f146429h = true;
        b();
    }

    public final void a(boolean z17) {
        this.f146425d.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.f146426e, this.f146427f, android.graphics.Shader.TileMode.CLAMP));
        if (z17) {
            invalidate();
        }
        this.f146429h = false;
    }

    public final void b() {
        this.f146428g = 1;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(context, "context");
        this.f146426e = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560437kb);
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(context2, "context");
        this.f146427f = context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560436ka);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f146428g == 1) {
            if (this.f146429h) {
                a(true);
            }
        } else if (this.f146429h) {
            a(true);
        }
        if (canvas != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f146425d);
        }
    }

    /* renamed from: setUpdateMode */
    public final void m43673xabe600e(int i17) {
        mq.h.b("MicroMsg.GradientColorBackgroundView", "alvinluo setUpdateMode: %d", java.lang.Integer.valueOf(i17));
        if (this.f146428g != i17) {
            this.f146428g = i17;
            a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10436x212919c6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(attributeSet, "attributeSet");
        this.f146425d = new android.graphics.Paint();
        this.f146426e = -5778734;
        this.f146427f = -14072734;
        new mq.d();
        this.f146429h = true;
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10436x212919c6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(attributeSet, "attributeSet");
        this.f146425d = new android.graphics.Paint();
        this.f146426e = -5778734;
        this.f146427f = -14072734;
        new mq.d();
        this.f146429h = true;
        b();
    }
}
