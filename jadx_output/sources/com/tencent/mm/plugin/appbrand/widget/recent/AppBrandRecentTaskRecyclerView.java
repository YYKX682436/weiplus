package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class AppBrandRecentTaskRecyclerView extends com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRecyclerView {
    public AppBrandRecentTaskRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRecyclerView
    public void g1(android.content.Context context, int i17) {
        float f17;
        float f18;
        int i18 = this.f91904c2;
        if (-1 == i18) {
            i18 = i65.a.f(context, com.tencent.mm.R.dimen.f479738dv);
        }
        int i19 = i18;
        int i27 = com.tencent.mm.plugin.appbrand.widget.recent.y0.b() ? 2 : 3;
        com.tencent.mm.plugin.appbrand.widget.recent.c1 c1Var = com.tencent.mm.plugin.appbrand.widget.recent.d1.f91969a;
        float f19 = i17;
        float f27 = i27;
        float f28 = 2;
        float f29 = i27 - 1;
        float c17 = ((f19 - (c1Var.c(getContext(), i27) * f27)) - (f28 * 0.0f)) / f29;
        if (c17 <= i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl)) {
            float h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479738dv);
            f17 = ((f19 - (c1Var.c(getContext(), i27) * f27)) - (f28 * h17)) / f29;
            f18 = h17;
        } else {
            f17 = c17;
            f18 = 0.0f;
        }
        float f37 = f19 / f27;
        float c18 = c1Var.c(getContext(), i27);
        float f38 = (f37 - f18) - c18;
        float f39 = f17 - f38;
        float f47 = (f37 - f39) - c18;
        float f48 = f17 - f47;
        float f49 = (f37 - f48) - c18;
        while (getItemDecorationCount() > 0) {
            T0(0);
        }
        N(new com.tencent.mm.plugin.appbrand.widget.recent.b1(0, i27, i19, 0, f18, f38, f39, f47, f48, f49));
    }

    public AppBrandRecentTaskRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
