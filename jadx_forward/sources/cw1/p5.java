package cw1;

/* loaded from: classes12.dex */
public final class p5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f304773d;

    /* renamed from: e, reason: collision with root package name */
    public final int f304774e;

    /* renamed from: f, reason: collision with root package name */
    public final int f304775f;

    /* renamed from: g, reason: collision with root package name */
    public final int f304776g;

    /* renamed from: h, reason: collision with root package name */
    public final int f304777h;

    public p5(android.content.Context context, java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f304773d = items;
        this.f304774e = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ais);
        this.f304775f = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aih);
        this.f304776g = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561089yd);
        this.f304777h = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aii);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        cw1.o5 o5Var = (cw1.o5) this.f304773d.get(u07);
        boolean z17 = o5Var.f304735b;
        int i17 = this.f304775f;
        if (z17) {
            if (u07 == 0) {
                outRect.top = i17;
                return;
            }
            return;
        }
        int i18 = o5Var.f304737d;
        int i19 = i18 & 1;
        int i27 = this.f304774e;
        int i28 = this.f304777h;
        if (i19 == 0) {
            outRect.left = i28;
            outRect.right = i27;
        } else {
            outRect.left = i27;
            outRect.right = i28;
        }
        if (i18 < 2) {
            i17 = this.f304776g;
        }
        outRect.top = i17;
        if (i18 / 2 == (((i18 == u07 ? r7.size() : ((cw1.o5) r7.get((u07 - i18) - 1)).f304737d) + 1) / 2) - 1) {
            outRect.bottom = i28;
        }
    }
}
