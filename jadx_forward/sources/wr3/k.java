package wr3;

/* loaded from: classes11.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f530358d;

    /* renamed from: e, reason: collision with root package name */
    public final int f530359e;

    public k(android.content.Context context) {
        int round = java.lang.Math.round(es.h.b(context) * 8.0f);
        this.f530358d = round;
        this.f530359e = round / 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 >= 0) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(layoutParams2.e());
            if (!(valueOf.intValue() >= 0)) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : u07 % 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 c16914xdd3f84a5 = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16914xdd3f84a5) parent : null;
            boolean hasTopic = c16914xdd3f84a5 != null ? c16914xdd3f84a5.getHasTopic() : false;
            if (u07 == 0 && hasTopic) {
                outRect.top = 0;
            } else {
                outRect.top = this.f530358d;
            }
            outRect.bottom = 0;
            int i17 = this.f530359e;
            if (intValue == 0) {
                outRect.right = i17;
            } else {
                outRect.left = i17;
            }
        }
    }
}
