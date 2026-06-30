package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes3.dex */
public final class b1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f91942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f91943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f91944g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f91945h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f91946i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f91947m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f91948n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f91949o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f91950p;

    public b1(int i17, int i18, int i19, int i27, float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f91941d = i17;
        this.f91942e = i18;
        this.f91943f = i19;
        this.f91944g = i27;
        this.f91945h = f17;
        this.f91946i = f18;
        this.f91947m = f19;
        this.f91948n = f27;
        this.f91949o = f28;
        this.f91950p = f29;
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
        if (!(w07 instanceof com.tencent.mm.plugin.appbrand.widget.recent.g0)) {
            outRect.top = 0;
            outRect.left = 0;
            outRect.right = 0;
            return;
        }
        if (u07 == -1) {
            u07 = ((com.tencent.mm.plugin.appbrand.widget.recent.g0) w07).getOldPosition();
        }
        int i17 = u07 - this.f91941d;
        int i18 = this.f91942e;
        if (i17 / i18 >= 1) {
            outRect.top = this.f91943f;
        } else {
            outRect.top = this.f91944g;
        }
        outRect.bottom = 0;
        int i19 = i17 % i18;
        if (i19 == 0) {
            outRect.left = (int) this.f91945h;
            outRect.right = (int) this.f91946i;
        } else if (i19 == 1) {
            outRect.left = (int) this.f91947m;
            outRect.right = (int) this.f91948n;
        } else {
            if (i19 != 2) {
                return;
            }
            outRect.left = (int) this.f91949o;
            outRect.right = (int) this.f91950p;
        }
    }
}
