package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes3.dex */
public class f3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f219590d;

    /* renamed from: e, reason: collision with root package name */
    public final int f219591e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f219592f = new android.graphics.Paint(1);

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15608xc657ed6d viewOnClickListenerC15608xc657ed6d) {
        this.f219590d = i65.a.b(viewOnClickListenerC15608xc657ed6d.mo55332x76847179(), 37);
        this.f219591e = i65.a.b(viewOnClickListenerC15608xc657ed6d.mo55332x76847179(), 18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7902x5db88677(rect, view, c1163xf1deaba4, h3Var);
        int i17 = this.f219590d;
        int i18 = this.f219591e;
        rect.set(i17, i18, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
        android.graphics.Paint paint = this.f219592f;
        paint.setColor(-2434342);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            if (i17 == 0) {
                int right = childAt.getRight();
                int i18 = this.f219590d;
                canvas.drawLine(right + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
            }
        }
    }
}
