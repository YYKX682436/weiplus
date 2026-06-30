package ee5;

/* loaded from: classes3.dex */
public final class x2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f333621d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f333622e = new android.graphics.Paint(1);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.a3 f333623f;

    public x2(ee5.a3 a3Var) {
        this.f333623f = a3Var;
        this.f333621d = (int) a3Var.m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int i17 = this.f333621d;
        outRect.set(i17, i17, i17, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        android.graphics.Paint paint = this.f333622e;
        paint.setColor(-2434342);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            int i18 = this.f333621d;
            if (i17 == 1 || i17 == 4 || i17 == 7 || i17 == 10) {
                c17.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
                c17.drawLine(childAt.getRight() + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
            }
            if (i17 == 13) {
                c17.drawLine(childAt.getLeft() - i18, childAt.getTop(), childAt.getLeft() - i18, childAt.getBottom(), paint);
                ee5.a3 a3Var = this.f333623f;
                if (a3Var.f333353i && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(a3Var.f333350f)) {
                    c17.drawLine(childAt.getRight() + i18, childAt.getTop(), childAt.getRight() + i18, childAt.getBottom(), paint);
                }
            }
        }
    }
}
