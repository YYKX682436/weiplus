package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes3.dex */
public final class a1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f173461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f173462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f173463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f173464i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f173465m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f173466n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f173467o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f173468p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f173469q;

    public a1(int i17, int i18, int i19, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        this.f173459d = i17;
        this.f173460e = i18;
        this.f173461f = i19;
        this.f173462g = f17;
        this.f173463h = f18;
        this.f173464i = f19;
        this.f173465m = f27;
        this.f173466n = f28;
        this.f173467o = f29;
        this.f173468p = f37;
        this.f173469q = f38;
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
        if (!(w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.t)) {
            outRect.top = 0;
            outRect.left = 0;
            outRect.right = 0;
            return;
        }
        if (u07 == -1) {
            u07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.t) w07).m8187x9323db3a();
        }
        int i17 = u07 - this.f173459d;
        if (i17 / 4 >= 1) {
            outRect.top = this.f173460e;
        } else {
            outRect.top = this.f173461f;
        }
        outRect.bottom = 0;
        int i18 = i17 % 4;
        if (i18 == 0) {
            outRect.left = (int) this.f173462g;
            outRect.right = (int) this.f173463h;
            return;
        }
        if (i18 == 1) {
            outRect.left = (int) this.f173464i;
            outRect.right = (int) this.f173465m;
        } else if (i18 == 2) {
            outRect.left = (int) this.f173466n;
            outRect.right = (int) this.f173467o;
        } else {
            if (i18 != 3) {
                return;
            }
            outRect.left = (int) this.f173468p;
            outRect.right = (int) this.f173469q;
        }
    }
}
