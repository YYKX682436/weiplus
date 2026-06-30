package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes3.dex */
public final class b1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f173476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f173477g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f173478h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f173479i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f173480m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f173481n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f173482o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f173483p;

    public b1(int i17, int i18, int i19, int i27, float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f173474d = i17;
        this.f173475e = i18;
        this.f173476f = i19;
        this.f173477g = i27;
        this.f173478h = f17;
        this.f173479i = f18;
        this.f173480m = f19;
        this.f173481n = f27;
        this.f173482o = f28;
        this.f173483p = f29;
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
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(view);
        if (!(w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g0)) {
            outRect.top = 0;
            outRect.left = 0;
            outRect.right = 0;
            return;
        }
        if (u07 == -1) {
            u07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.g0) w07).m8187x9323db3a();
        }
        int i17 = u07 - this.f173474d;
        int i18 = this.f173475e;
        if (i17 / i18 >= 1) {
            outRect.top = this.f173476f;
        } else {
            outRect.top = this.f173477g;
        }
        outRect.bottom = 0;
        int i19 = i17 % i18;
        if (i19 == 0) {
            outRect.left = (int) this.f173478h;
            outRect.right = (int) this.f173479i;
        } else if (i19 == 1) {
            outRect.left = (int) this.f173480m;
            outRect.right = (int) this.f173481n;
        } else {
            if (i19 != 2) {
                return;
            }
            outRect.left = (int) this.f173482o;
            outRect.right = (int) this.f173483p;
        }
    }
}
