package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes2.dex */
public class r4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f146005d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f146006e;

    /* renamed from: f, reason: collision with root package name */
    public final int f146007f;

    /* renamed from: g, reason: collision with root package name */
    public final int f146008g;

    public r4(android.content.Context context, float f17, float f18) {
        this.f146007f = i65.a.a(context, f17);
        this.f146008g = i65.a.a(context, f18);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f146005d = paint;
        paint.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f146006e = paint2;
        paint2.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7902x5db88677(rect, view, c1163xf1deaba4, h3Var);
        rect.bottom = this.f146007f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
        int childCount = c1163xf1deaba4.getChildCount();
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int i17 = this.f146008g + paddingLeft;
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i18);
            float bottom = childAt.getBottom();
            float bottom2 = childAt.getBottom() + this.f146007f;
            if (i18 == childCount - 1) {
                canvas.drawRect(paddingLeft, bottom, width, bottom2, this.f146006e);
            } else {
                canvas.drawRect(i17, bottom, width, bottom2, this.f146005d);
            }
        }
    }
}
