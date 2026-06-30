package ar2;

/* loaded from: classes2.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f94913d;

    /* renamed from: e, reason: collision with root package name */
    public final int f94914e;

    /* renamed from: f, reason: collision with root package name */
    public int f94915f;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f94913d = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
        this.f94914e = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
        this.f94915f = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        boolean z17 = u07 % 2 == 0;
        if (u07 == 0 || u07 == 1) {
            outRect.top = this.f94915f;
        }
        int i17 = this.f94913d;
        int i18 = this.f94914e;
        outRect.left = z17 ? i18 : i17;
        if (!z17) {
            i17 = i18;
        }
        outRect.right = i17;
        outRect.bottom = i18;
    }
}
