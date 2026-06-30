package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class AppBrandTaskRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public int f91903b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f91904c2;

    public AppBrandTaskRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91903b2 = 0;
        this.f91904c2 = -1;
    }

    public void g1(android.content.Context context, int i17) {
        float f17;
        int i18 = this.f91904c2;
        if (-1 == i18) {
            i18 = i65.a.f(context, com.tencent.mm.R.dimen.f479738dv);
        }
        int i19 = i18;
        com.tencent.mm.plugin.appbrand.widget.recent.c1 c1Var = com.tencent.mm.plugin.appbrand.widget.recent.d1.f91969a;
        float f18 = i17;
        float f19 = 4;
        float f27 = 2;
        float b17 = ((f18 - (c1Var.b(getContext()) * f19)) - (f27 * 0.0f)) / 3.0f;
        if (b17 <= i65.a.f(getContext(), com.tencent.mm.R.dimen.f479646bl)) {
            float h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479738dv);
            b17 = ((f18 - (f19 * c1Var.b(getContext()))) - (f27 * h17)) / 3.0f;
            f17 = h17;
        } else {
            f17 = 0.0f;
        }
        float f28 = f18 / 4.0f;
        float b18 = c1Var.b(getContext());
        float f29 = (f28 - f17) - b18;
        float f37 = b17 - f29;
        float f38 = (f28 - f37) - b18;
        float f39 = b17 - f38;
        float f47 = (f28 - f39) - b18;
        float f48 = b17 - f47;
        while (getItemDecorationCount() > 0) {
            T0(0);
        }
        N(new com.tencent.mm.plugin.appbrand.widget.recent.a1(0, i19, 0, f17, f29, f37, f38, f39, f47, f48, f17));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (getMeasuredWidth() != this.f91903b2) {
            this.f91903b2 = getMeasuredWidth();
            g1(getContext(), this.f91903b2);
        }
    }

    public void setLineGap(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskRecyclerView", "setLineGap, lineGap: %d", java.lang.Integer.valueOf(i17));
        this.f91904c2 = i17;
        g1(getContext(), this.f91903b2);
    }

    public AppBrandTaskRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91903b2 = 0;
        this.f91904c2 = -1;
    }
}
