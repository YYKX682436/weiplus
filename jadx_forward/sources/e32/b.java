package e32;

/* loaded from: classes2.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f328633d;

    /* renamed from: e, reason: collision with root package name */
    public final int f328634e;

    public b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f328633d = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561886ve);
        this.f328634e = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = parent.mo7946xf939df19();
        java.lang.Integer valueOf = mo7946xf939df192 != null ? java.lang.Integer.valueOf(mo7946xf939df192.mo863xcdaf1228(u07)) : null;
        int i17 = this.f328633d;
        int i18 = this.f328634e;
        if (u07 == 0) {
            outRect.set((parent.getWidth() - i17) / 2, 0, i18, 0);
        } else if (u07 == mo1894x7e414b06 - 1) {
            outRect.set(i18, 0, (valueOf != null && valueOf.intValue() == 2) ? ((parent.getWidth() / 2) - ((i17 / 2) * 3)) - (i18 * 2) : (parent.getWidth() - i17) / 2, 0);
        } else {
            outRect.set(i18, 0, i18, 0);
        }
    }
}
