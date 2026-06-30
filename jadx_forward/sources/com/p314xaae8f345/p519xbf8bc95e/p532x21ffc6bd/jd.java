package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class jd extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf {

    /* renamed from: g, reason: collision with root package name */
    private int f131498g;

    /* renamed from: h, reason: collision with root package name */
    private int f131499h;

    /* renamed from: i, reason: collision with root package name */
    private int f131500i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f131501j;

    public jd(com.tencent.mapsdk.internal.je.b... bVarArr) {
        super(bVarArr);
        this.f131501j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd mo36794x5a5dd5d() {
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je> arrayList = this.f131513e;
        int size = arrayList.size();
        com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[size];
        for (int i17 = 0; i17 < size; i17++) {
            bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) arrayList.get(i17).e();
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd(bVarArr);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf
    public final java.lang.Object a(float f17) {
        return java.lang.Integer.valueOf(b(f17));
    }

    public final int b(float f17) {
        int i17;
        int i18;
        int i19;
        int i27;
        float f18;
        int i28 = this.f131509a;
        if (i28 != 2) {
            if (f17 <= 0.0f) {
                com.tencent.mapsdk.internal.je.b bVar = (com.tencent.mapsdk.internal.je.b) this.f131513e.get(0);
                com.tencent.mapsdk.internal.je.b bVar2 = (com.tencent.mapsdk.internal.je.b) this.f131513e.get(1);
                i19 = bVar.f131507e;
                i27 = bVar2.f131507e;
                float f19 = bVar.f131502a;
                float f27 = bVar2.f131502a;
                android.view.animation.Interpolator interpolator = bVar2.f131504c;
                if (interpolator != null) {
                    f17 = interpolator.getInterpolation(f17);
                }
                f18 = (f17 - f19) / (f27 - f19);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar = this.f131514f;
                if (jkVar != null) {
                    return ((java.lang.Number) jkVar.a(f18, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27))).intValue();
                }
            } else if (f17 >= 1.0f) {
                com.tencent.mapsdk.internal.je.b bVar3 = (com.tencent.mapsdk.internal.je.b) this.f131513e.get(i28 - 2);
                com.tencent.mapsdk.internal.je.b bVar4 = (com.tencent.mapsdk.internal.je.b) this.f131513e.get(this.f131509a - 1);
                i19 = bVar3.f131507e;
                i27 = bVar4.f131507e;
                float f28 = bVar3.f131502a;
                float f29 = bVar4.f131502a;
                android.view.animation.Interpolator interpolator2 = bVar4.f131504c;
                if (interpolator2 != null) {
                    f17 = interpolator2.getInterpolation(f17);
                }
                f18 = (f17 - f28) / (f29 - f28);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar2 = this.f131514f;
                if (jkVar2 != null) {
                    return ((java.lang.Number) jkVar2.a(f18, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27))).intValue();
                }
            } else {
                com.tencent.mapsdk.internal.je.b bVar5 = (com.tencent.mapsdk.internal.je.b) this.f131513e.get(0);
                int i29 = 1;
                while (true) {
                    int i37 = this.f131509a;
                    if (i29 < i37) {
                        com.tencent.mapsdk.internal.je.b bVar6 = (com.tencent.mapsdk.internal.je.b) this.f131513e.get(i29);
                        if (f17 < bVar6.f131502a) {
                            android.view.animation.Interpolator interpolator3 = bVar6.f131504c;
                            if (interpolator3 != null) {
                                f17 = interpolator3.getInterpolation(f17);
                            }
                            float f37 = bVar5.f131502a;
                            f17 = (f17 - f37) / (bVar6.f131502a - f37);
                            i17 = bVar5.f131507e;
                            int i38 = bVar6.f131507e;
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar3 = this.f131514f;
                            if (jkVar3 != null) {
                                return ((java.lang.Number) jkVar3.a(f17, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i38))).intValue();
                            }
                            i18 = i38 - i17;
                        } else {
                            i29++;
                            bVar5 = bVar6;
                        }
                    } else {
                        return ((java.lang.Number) this.f131513e.get(i37 - 1).d()).intValue();
                    }
                }
            }
            return i19 + ((int) (f18 * (i27 - i19)));
        }
        if (this.f131501j) {
            this.f131501j = false;
            this.f131498g = ((com.tencent.mapsdk.internal.je.b) this.f131513e.get(0)).f131507e;
            int i39 = ((com.tencent.mapsdk.internal.je.b) this.f131513e.get(1)).f131507e;
            this.f131499h = i39;
            this.f131500i = i39 - this.f131498g;
        }
        android.view.animation.Interpolator interpolator4 = this.f131512d;
        if (interpolator4 != null) {
            f17 = interpolator4.getInterpolation(f17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar4 = this.f131514f;
        if (jkVar4 == null) {
            i17 = this.f131498g;
            i18 = this.f131500i;
        } else {
            return ((java.lang.Number) jkVar4.a(f17, java.lang.Integer.valueOf(this.f131498g), java.lang.Integer.valueOf(this.f131499h))).intValue();
        }
        return i17 + ((int) (f17 * i18));
    }
}
