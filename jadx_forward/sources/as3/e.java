package as3;

/* loaded from: classes3.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 f95034d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141) {
        this.f95034d = c16911xd5774141;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(parent.u0(view));
        if (!(valueOf.intValue() == 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            android.content.Context context = this.f95034d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            outRect.left = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context, 20);
        }
    }
}
