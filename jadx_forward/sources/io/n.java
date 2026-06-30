package io;

/* loaded from: classes3.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f374949f = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20.0f);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f374950d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f374951e = jz5.h.b(new io.m(this));

    public n(android.content.Context context) {
        this.f374950d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 <= 0) {
            u07 = 0;
        }
        if (u07 > 0) {
            outRect.top = 1;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        parent.getChildCount();
        android.graphics.Rect rect = new android.graphics.Rect();
        int paddingLeft = parent.getPaddingLeft();
        int i17 = f374949f;
        rect.left = paddingLeft + i17;
        rect.right = (parent.getMeasuredWidth() - parent.getPaddingRight()) - i17;
        int childCount = parent.getChildCount();
        for (int i18 = 1; i18 < childCount; i18++) {
            android.view.View childAt = parent.getChildAt(i18);
            if (childAt == null) {
                return;
            }
            int top = childAt.getTop();
            rect.bottom = top;
            rect.top = top - 1;
            canvas.drawRect(rect, (android.graphics.Paint) ((jz5.n) this.f374951e).mo141623x754a37bb());
        }
    }
}
