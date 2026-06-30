package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes3.dex */
public class a2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f219546d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f219547e = new android.graphics.Paint(1);

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ViewOnClickListenerC15601x7e0a9753 viewOnClickListenerC15601x7e0a9753) {
        this.f219546d = (int) viewOnClickListenerC15601x7e0a9753.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7902x5db88677(rect, view, c1163xf1deaba4, h3Var);
        int i17 = this.f219546d;
        rect.set(i17, i17, i17, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo8166xc398a7c3(canvas, c1163xf1deaba4, h3Var);
        android.graphics.Paint paint = this.f219547e;
        paint.setColor(-2434342);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            int i18 = this.f219546d;
            if (i17 == 1 || i17 == 4) {
                canvas.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
                canvas.drawLine(childAt.getRight() + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
            } else if (i17 == 7) {
                canvas.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
            }
        }
    }
}
