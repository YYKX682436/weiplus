package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes2.dex */
public class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f238266d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f238267e;

    /* renamed from: f, reason: collision with root package name */
    public final int f238268f;

    /* renamed from: g, reason: collision with root package name */
    public final int f238269g;

    public w(android.content.Context context) {
        this.f238268f = i65.a.a(context, 0.5f);
        this.f238269g = i65.a.b(context, 16);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f238266d = paint;
        paint.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f238267e = paint2;
        paint2.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7902x5db88677(rect, view, c1163xf1deaba4, h3Var);
        rect.bottom = this.f238268f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
        int childCount = c1163xf1deaba4.getChildCount();
        int paddingLeft = c1163xf1deaba4.getPaddingLeft();
        int i17 = this.f238269g + paddingLeft;
        int width = c1163xf1deaba4.getWidth() - c1163xf1deaba4.getPaddingRight();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i18);
            float bottom = childAt.getBottom();
            float bottom2 = childAt.getBottom() + this.f238268f;
            if (i18 == childCount - 1) {
                canvas.drawRect(paddingLeft, bottom, width, bottom2, this.f238267e);
            } else {
                canvas.drawRect(i17, bottom, width, bottom2, this.f238266d);
            }
        }
    }
}
