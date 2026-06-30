package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes3.dex */
public final class a1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f91927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f91928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f91929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f91930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f91931i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f91932m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f91933n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f91934o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f91935p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f91936q;

    public a1(int i17, int i18, int i19, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        this.f91926d = i17;
        this.f91927e = i18;
        this.f91928f = i19;
        this.f91929g = f17;
        this.f91930h = f18;
        this.f91931i = f19;
        this.f91932m = f27;
        this.f91933n = f28;
        this.f91934o = f29;
        this.f91935p = f37;
        this.f91936q = f38;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        if (!(w07 instanceof com.tencent.mm.plugin.appbrand.widget.recent.t)) {
            outRect.top = 0;
            outRect.left = 0;
            outRect.right = 0;
            return;
        }
        if (u07 == -1) {
            u07 = ((com.tencent.mm.plugin.appbrand.widget.recent.t) w07).getOldPosition();
        }
        int i17 = u07 - this.f91926d;
        if (i17 / 4 >= 1) {
            outRect.top = this.f91927e;
        } else {
            outRect.top = this.f91928f;
        }
        outRect.bottom = 0;
        int i18 = i17 % 4;
        if (i18 == 0) {
            outRect.left = (int) this.f91929g;
            outRect.right = (int) this.f91930h;
            return;
        }
        if (i18 == 1) {
            outRect.left = (int) this.f91931i;
            outRect.right = (int) this.f91932m;
        } else if (i18 == 2) {
            outRect.left = (int) this.f91933n;
            outRect.right = (int) this.f91934o;
        } else {
            if (i18 != 3) {
                return;
            }
            outRect.left = (int) this.f91935p;
            outRect.right = (int) this.f91936q;
        }
    }
}
