package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qo extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.mapsdk.internal.qn f51017a;

    public qo(android.content.Context context) {
        super(context);
        com.tencent.mapsdk.internal.qn qnVar = new com.tencent.mapsdk.internal.qn();
        this.f51017a = qnVar;
        setBackground(qnVar);
        this.f51017a.a(getResources().getDisplayMetrics().density * 1.0f);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f51017a.setBounds(0, 0, i19 - i17, i27 - i18);
    }

    public final void setActivate(boolean z17) {
        com.tencent.mapsdk.internal.qn qnVar = this.f51017a;
        if (qnVar == null) {
            return;
        }
        qnVar.f51014a = z17;
        postInvalidate();
    }

    public final void setArrowStrokeWidth(float f17) {
        com.tencent.mapsdk.internal.qn qnVar = this.f51017a;
        if (qnVar == null) {
            return;
        }
        qnVar.a(f17);
        postInvalidate();
    }

    public final void setDarkStyle(boolean z17) {
        this.f51017a.f51015b = z17;
        invalidate();
    }
}
