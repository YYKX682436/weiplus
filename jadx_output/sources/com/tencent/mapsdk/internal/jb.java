package com.tencent.mapsdk.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class jb extends com.tencent.mapsdk.internal.jf {

    /* renamed from: g, reason: collision with root package name */
    private double f49961g;

    /* renamed from: h, reason: collision with root package name */
    private double f49962h;

    /* renamed from: i, reason: collision with root package name */
    private double f49963i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f49964j;

    public jb(com.tencent.mapsdk.internal.je.a... aVarArr) {
        super(aVarArr);
        this.f49964j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.jf
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.tencent.mapsdk.internal.jb clone() {
        java.util.ArrayList<com.tencent.mapsdk.internal.je> arrayList = this.f49980e;
        int size = arrayList.size();
        com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[size];
        for (int i17 = 0; i17 < size; i17++) {
            aVarArr[i17] = (com.tencent.mapsdk.internal.je.a) arrayList.get(i17).e();
        }
        return new com.tencent.mapsdk.internal.jb(aVarArr);
    }

    @Override // com.tencent.mapsdk.internal.jf
    public final java.lang.Object a(float f17) {
        return java.lang.Double.valueOf(b(f17));
    }

    public final double b(float f17) {
        double d17;
        double d18;
        float f18;
        int i17 = this.f49976a;
        if (i17 == 2) {
            if (this.f49964j) {
                this.f49964j = false;
                this.f49961g = ((com.tencent.mapsdk.internal.je.a) this.f49980e.get(0)).f49973e;
                double d19 = ((com.tencent.mapsdk.internal.je.a) this.f49980e.get(1)).f49973e;
                this.f49962h = d19;
                this.f49963i = d19 - this.f49961g;
            }
            android.view.animation.Interpolator interpolator = this.f49979d;
            if (interpolator != null) {
                f17 = interpolator.getInterpolation(f17);
            }
            com.tencent.mapsdk.internal.jk jkVar = this.f49981f;
            if (jkVar == null) {
                return this.f49961g + (f17 * this.f49963i);
            }
            return ((java.lang.Number) jkVar.a(f17, java.lang.Double.valueOf(this.f49961g), java.lang.Double.valueOf(this.f49962h))).doubleValue();
        }
        if (f17 <= 0.0f) {
            com.tencent.mapsdk.internal.je.a aVar = (com.tencent.mapsdk.internal.je.a) this.f49980e.get(0);
            com.tencent.mapsdk.internal.je.a aVar2 = (com.tencent.mapsdk.internal.je.a) this.f49980e.get(1);
            d17 = aVar.f49973e;
            d18 = aVar2.f49973e;
            float f19 = aVar.f49969a;
            float f27 = aVar2.f49969a;
            android.view.animation.Interpolator interpolator2 = aVar2.f49971c;
            if (interpolator2 != null) {
                f17 = interpolator2.getInterpolation(f17);
            }
            f18 = (f17 - f19) / (f27 - f19);
            if (this.f49981f != null) {
                return ((java.lang.Number) r0.a(f18, java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18))).floatValue();
            }
        } else if (f17 >= 1.0f) {
            com.tencent.mapsdk.internal.je.a aVar3 = (com.tencent.mapsdk.internal.je.a) this.f49980e.get(i17 - 2);
            com.tencent.mapsdk.internal.je.a aVar4 = (com.tencent.mapsdk.internal.je.a) this.f49980e.get(this.f49976a - 1);
            d17 = aVar3.f49973e;
            d18 = aVar4.f49973e;
            float f28 = aVar3.f49969a;
            float f29 = aVar4.f49969a;
            android.view.animation.Interpolator interpolator3 = aVar4.f49971c;
            if (interpolator3 != null) {
                f17 = interpolator3.getInterpolation(f17);
            }
            f18 = (f17 - f28) / (f29 - f28);
            if (this.f49981f != null) {
                return ((java.lang.Number) r0.a(f18, java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18))).floatValue();
            }
        } else {
            com.tencent.mapsdk.internal.je.a aVar5 = (com.tencent.mapsdk.internal.je.a) this.f49980e.get(0);
            int i18 = 1;
            while (true) {
                if (i18 < this.f49976a) {
                    com.tencent.mapsdk.internal.je.a aVar6 = (com.tencent.mapsdk.internal.je.a) this.f49980e.get(i18);
                    if (f17 < aVar6.f49969a) {
                        android.view.animation.Interpolator interpolator4 = aVar6.f49971c;
                        if (interpolator4 != null) {
                            f17 = interpolator4.getInterpolation(f17);
                        }
                        float f37 = aVar5.f49969a;
                        float f38 = (f17 - f37) / (aVar6.f49969a - f37);
                        double d27 = aVar5.f49973e;
                        double d28 = aVar6.f49973e;
                        return this.f49981f == null ? d27 + (f38 * (d28 - d27)) : ((java.lang.Number) r4.a(f38, java.lang.Double.valueOf(d27), java.lang.Double.valueOf(d28))).floatValue();
                    }
                    i18++;
                    aVar5 = aVar6;
                } else {
                    return ((java.lang.Number) this.f49980e.get(r3 - 1).d()).floatValue();
                }
            }
        }
        return d17 + (f18 * (d18 - d17));
    }
}
