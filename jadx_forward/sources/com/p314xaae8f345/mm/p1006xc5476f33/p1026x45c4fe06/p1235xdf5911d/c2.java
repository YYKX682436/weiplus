package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class c2 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc f173678d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f173679e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f173680f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f173681g;

    /* renamed from: m, reason: collision with root package name */
    public boolean f173682m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc runtimeContainerHandler) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtimeContainerHandler, "runtimeContainerHandler");
        this.f173678d = runtimeContainerHandler;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f173681g = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f173681g;
        if (paint2 != null) {
            paint2.setColor(-65536);
        }
        this.f173682m = false;
        this.f173679e = true;
        this.f173680f = kz5.o1.c(0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f173682m) {
            android.graphics.Paint paint = this.f173681g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
            canvas.drawCircle(0.0f, 0.0f, 50.0f, paint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!this.f173679e) {
            return false;
        }
        if (this.f173680f.contains(java.lang.Integer.valueOf(event.getAction()))) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f173678d.m50376x76847179());
            u1Var.g(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzk));
            u1Var.a(true);
            u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.a2(this));
            u1Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.b2.f173668d);
            u1Var.q(false);
        }
        return true;
    }

    /* renamed from: setDotVisible */
    public final void m53715x63d434eb(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWxAssistantView", "@@@TummyTest setDotVisible: " + z17);
        if (this.f173682m != z17) {
            this.f173682m = z17;
            invalidate();
        }
    }
}
