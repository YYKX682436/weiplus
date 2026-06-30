package com.tencent.mm.dynamicbackground.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "Landroid/view/View;", "", "updateMode", "Ljz5/f0;", "setUpdateMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class GradientColorBackgroundView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f64892d;

    /* renamed from: e, reason: collision with root package name */
    public int f64893e;

    /* renamed from: f, reason: collision with root package name */
    public int f64894f;

    /* renamed from: g, reason: collision with root package name */
    public int f64895g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64896h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientColorBackgroundView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.h(context, "context");
        this.f64892d = new android.graphics.Paint();
        this.f64893e = -5778734;
        this.f64894f = -14072734;
        new mq.d();
        this.f64896h = true;
        b();
    }

    public final void a(boolean z17) {
        this.f64892d.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.f64893e, this.f64894f, android.graphics.Shader.TileMode.CLAMP));
        if (z17) {
            invalidate();
        }
        this.f64896h = false;
    }

    public final void b() {
        this.f64895g = 1;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.c(context, "context");
        this.f64893e = context.getResources().getColor(com.tencent.mm.R.color.f478904kb);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.c(context2, "context");
        this.f64894f = context2.getResources().getColor(com.tencent.mm.R.color.f478903ka);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f64895g == 1) {
            if (this.f64896h) {
                a(true);
            }
        } else if (this.f64896h) {
            a(true);
        }
        if (canvas != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f64892d);
        }
    }

    public final void setUpdateMode(int i17) {
        mq.h.b("MicroMsg.GradientColorBackgroundView", "alvinluo setUpdateMode: %d", java.lang.Integer.valueOf(i17));
        if (this.f64895g != i17) {
            this.f64895g = i17;
            a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientColorBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.h(context, "context");
        kotlin.jvm.internal.o.h(attributeSet, "attributeSet");
        this.f64892d = new android.graphics.Paint();
        this.f64893e = -5778734;
        this.f64894f = -14072734;
        new mq.d();
        this.f64896h = true;
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientColorBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.h(context, "context");
        kotlin.jvm.internal.o.h(attributeSet, "attributeSet");
        this.f64892d = new android.graphics.Paint();
        this.f64893e = -5778734;
        this.f64894f = -14072734;
        new mq.d();
        this.f64896h = true;
        b();
    }
}
