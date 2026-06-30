package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRecyclerView */
/* loaded from: classes7.dex */
public class C12803xc1f7abcf extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public int f173436b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f173437c2;

    public C12803xc1f7abcf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173436b2 = 0;
        this.f173437c2 = -1;
    }

    public void g1(android.content.Context context, int i17) {
        float f17;
        int i18 = this.f173437c2;
        if (-1 == i18) {
            i18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        }
        int i19 = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d1.f173502a;
        float f18 = i17;
        float f19 = 4;
        float f27 = 2;
        float b17 = ((f18 - (c1Var.b(getContext()) * f19)) - (f27 * 0.0f)) / 3.0f;
        if (b17 <= i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl)) {
            float h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
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
        while (m7950x883dc776() > 0) {
            T0(0);
        }
        N(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.a1(0, i19, 0, f17, f29, f37, f38, f39, f47, f48, f17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (getMeasuredWidth() != this.f173436b2) {
            this.f173436b2 = getMeasuredWidth();
            g1(getContext(), this.f173436b2);
        }
    }

    /* renamed from: setLineGap */
    public void m53635xbbc97b80(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskRecyclerView", "setLineGap, lineGap: %d", java.lang.Integer.valueOf(i17));
        this.f173437c2 = i17;
        g1(getContext(), this.f173436b2);
    }

    public C12803xc1f7abcf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173436b2 = 0;
        this.f173437c2 = -1;
    }
}
