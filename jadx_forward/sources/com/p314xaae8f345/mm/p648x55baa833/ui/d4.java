package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes2.dex */
public class d4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f145638d;

    /* renamed from: e, reason: collision with root package name */
    public final int f145639e;

    public d4(android.content.Context context) {
        this.f145639e = i65.a.b(context, 8);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f145638d = paint;
        paint.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7902x5db88677(rect, view, c1163xf1deaba4, h3Var);
        rect.bottom = this.f145639e;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
        int childCount = c1163xf1deaba4.getChildCount();
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            canvas.drawRect(paddingLeft, childAt.getBottom(), width, childAt.getBottom() + this.f145639e, this.f145638d);
        }
    }
}
