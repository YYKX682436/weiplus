package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class jb extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf {

    /* renamed from: g, reason: collision with root package name */
    private double f131494g;

    /* renamed from: h, reason: collision with root package name */
    private double f131495h;

    /* renamed from: i, reason: collision with root package name */
    private double f131496i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f131497j;

    public jb(com.tencent.mapsdk.internal.je.a... aVarArr) {
        super(aVarArr);
        this.f131497j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb mo36794x5a5dd5d() {
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je> arrayList = this.f131513e;
        int size = arrayList.size();
        com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[size];
        for (int i17 = 0; i17 < size; i17++) {
            aVarArr[i17] = (com.tencent.mapsdk.internal.je.a) arrayList.get(i17).e();
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb(aVarArr);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf
    public final java.lang.Object a(float f17) {
        return java.lang.Double.valueOf(b(f17));
    }

    public final double b(float f17) {
        double d17;
        double d18;
        float f18;
        int i17 = this.f131509a;
        if (i17 == 2) {
            if (this.f131497j) {
                this.f131497j = false;
                this.f131494g = ((com.tencent.mapsdk.internal.je.a) this.f131513e.get(0)).f131506e;
                double d19 = ((com.tencent.mapsdk.internal.je.a) this.f131513e.get(1)).f131506e;
                this.f131495h = d19;
                this.f131496i = d19 - this.f131494g;
            }
            android.view.animation.Interpolator interpolator = this.f131512d;
            if (interpolator != null) {
                f17 = interpolator.getInterpolation(f17);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar = this.f131514f;
            if (jkVar == null) {
                return this.f131494g + (f17 * this.f131496i);
            }
            return ((java.lang.Number) jkVar.a(f17, java.lang.Double.valueOf(this.f131494g), java.lang.Double.valueOf(this.f131495h))).doubleValue();
        }
        if (f17 <= 0.0f) {
            com.tencent.mapsdk.internal.je.a aVar = (com.tencent.mapsdk.internal.je.a) this.f131513e.get(0);
            com.tencent.mapsdk.internal.je.a aVar2 = (com.tencent.mapsdk.internal.je.a) this.f131513e.get(1);
            d17 = aVar.f131506e;
            d18 = aVar2.f131506e;
            float f19 = aVar.f131502a;
            float f27 = aVar2.f131502a;
            android.view.animation.Interpolator interpolator2 = aVar2.f131504c;
            if (interpolator2 != null) {
                f17 = interpolator2.getInterpolation(f17);
            }
            f18 = (f17 - f19) / (f27 - f19);
            if (this.f131514f != null) {
                return ((java.lang.Number) r0.a(f18, java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18))).floatValue();
            }
        } else if (f17 >= 1.0f) {
            com.tencent.mapsdk.internal.je.a aVar3 = (com.tencent.mapsdk.internal.je.a) this.f131513e.get(i17 - 2);
            com.tencent.mapsdk.internal.je.a aVar4 = (com.tencent.mapsdk.internal.je.a) this.f131513e.get(this.f131509a - 1);
            d17 = aVar3.f131506e;
            d18 = aVar4.f131506e;
            float f28 = aVar3.f131502a;
            float f29 = aVar4.f131502a;
            android.view.animation.Interpolator interpolator3 = aVar4.f131504c;
            if (interpolator3 != null) {
                f17 = interpolator3.getInterpolation(f17);
            }
            f18 = (f17 - f28) / (f29 - f28);
            if (this.f131514f != null) {
                return ((java.lang.Number) r0.a(f18, java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18))).floatValue();
            }
        } else {
            com.tencent.mapsdk.internal.je.a aVar5 = (com.tencent.mapsdk.internal.je.a) this.f131513e.get(0);
            int i18 = 1;
            while (true) {
                if (i18 < this.f131509a) {
                    com.tencent.mapsdk.internal.je.a aVar6 = (com.tencent.mapsdk.internal.je.a) this.f131513e.get(i18);
                    if (f17 < aVar6.f131502a) {
                        android.view.animation.Interpolator interpolator4 = aVar6.f131504c;
                        if (interpolator4 != null) {
                            f17 = interpolator4.getInterpolation(f17);
                        }
                        float f37 = aVar5.f131502a;
                        float f38 = (f17 - f37) / (aVar6.f131502a - f37);
                        double d27 = aVar5.f131506e;
                        double d28 = aVar6.f131506e;
                        return this.f131514f == null ? d27 + (f38 * (d28 - d27)) : ((java.lang.Number) r4.a(f38, java.lang.Double.valueOf(d27), java.lang.Double.valueOf(d28))).floatValue();
                    }
                    i18++;
                    aVar5 = aVar6;
                } else {
                    return ((java.lang.Number) this.f131513e.get(r3 - 1).d()).floatValue();
                }
            }
        }
        return d17 + (f18 * (d18 - d17));
    }
}
