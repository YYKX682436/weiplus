package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskRecyclerView */
/* loaded from: classes7.dex */
public class C12798x822d6bca extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12803xc1f7abcf {
    public C12798x822d6bca(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12803xc1f7abcf
    public void g1(android.content.Context context, int i17) {
        float f17;
        float f18;
        int i18 = this.f173437c2;
        if (-1 == i18) {
            i18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        }
        int i19 = i18;
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y0.b() ? 2 : 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d1.f173502a;
        float f19 = i17;
        float f27 = i27;
        float f28 = 2;
        float f29 = i27 - 1;
        float c17 = ((f19 - (c1Var.c(getContext(), i27) * f27)) - (f28 * 0.0f)) / f29;
        if (c17 <= i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl)) {
            float h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
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
        while (m7950x883dc776() > 0) {
            T0(0);
        }
        N(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.b1(0, i27, i19, 0, f18, f38, f39, f47, f48, f49));
    }

    public C12798x822d6bca(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
