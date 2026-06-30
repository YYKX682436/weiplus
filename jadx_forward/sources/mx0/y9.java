package mx0;

/* loaded from: classes3.dex */
public final class y9 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f413991d = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2);

    /* renamed from: e, reason: collision with root package name */
    public final int f413992e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.afq);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        int i17 = this.f413991d;
        outRect.right = i17;
        outRect.left = i17;
        int b17 = state.b() - 1;
        int i18 = this.f413992e;
        if (u07 == b17) {
            outRect.right = (parent.getWidth() - i18) / 2;
        }
        if (u07 == 0) {
            outRect.left = (parent.getWidth() - i18) / 2;
        }
    }
}
