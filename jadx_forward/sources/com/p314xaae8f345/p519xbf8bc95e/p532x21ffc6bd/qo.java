package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qo extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qn f132550a;

    public qo(android.content.Context context) {
        super(context);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qn qnVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qn();
        this.f132550a = qnVar;
        setBackground(qnVar);
        this.f132550a.a(getResources().getDisplayMetrics().density * 1.0f);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f132550a.setBounds(0, 0, i19 - i17, i27 - i18);
    }

    /* renamed from: setActivate */
    public final void m36936x13de7375(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qn qnVar = this.f132550a;
        if (qnVar == null) {
            return;
        }
        qnVar.f132547a = z17;
        postInvalidate();
    }

    /* renamed from: setArrowStrokeWidth */
    public final void m36937x310f6b27(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qn qnVar = this.f132550a;
        if (qnVar == null) {
            return;
        }
        qnVar.a(f17);
        postInvalidate();
    }

    /* renamed from: setDarkStyle */
    public final void m36938xecb3a999(boolean z17) {
        this.f132550a.f132548b = z17;
        invalidate();
    }
}
