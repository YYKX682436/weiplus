package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class c2 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.hc f92145d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f92146e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f92147f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f92148g;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92149m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Context context, com.tencent.mm.plugin.appbrand.hc runtimeContainerHandler) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(runtimeContainerHandler, "runtimeContainerHandler");
        this.f92145d = runtimeContainerHandler;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f92148g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f92148g;
        if (paint2 != null) {
            paint2.setColor(-65536);
        }
        this.f92149m = false;
        this.f92146e = true;
        this.f92147f = kz5.o1.c(0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f92149m) {
            android.graphics.Paint paint = this.f92148g;
            kotlin.jvm.internal.o.d(paint);
            canvas.drawCircle(0.0f, 0.0f, 50.0f, paint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!this.f92146e) {
            return false;
        }
        if (this.f92147f.contains(java.lang.Integer.valueOf(event.getAction()))) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f92145d.getContext());
            u1Var.g(getContext().getString(com.tencent.mm.R.string.nzk));
            u1Var.a(true);
            u1Var.b(new com.tencent.mm.plugin.appbrand.wxassistant.a2(this));
            u1Var.e(com.tencent.mm.plugin.appbrand.wxassistant.b2.f92135d);
            u1Var.q(false);
        }
        return true;
    }

    public final void setDotVisible(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWxAssistantView", "@@@TummyTest setDotVisible: " + z17);
        if (this.f92149m != z17) {
            this.f92149m = z17;
            invalidate();
        }
    }
}
