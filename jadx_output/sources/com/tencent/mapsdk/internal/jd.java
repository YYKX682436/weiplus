package com.tencent.mapsdk.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class jd extends com.tencent.mapsdk.internal.jf {

    /* renamed from: g, reason: collision with root package name */
    private int f49965g;

    /* renamed from: h, reason: collision with root package name */
    private int f49966h;

    /* renamed from: i, reason: collision with root package name */
    private int f49967i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f49968j;

    public jd(com.tencent.mapsdk.internal.je.b... bVarArr) {
        super(bVarArr);
        this.f49968j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.jf
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.mapsdk.internal.jd clone() {
        java.util.ArrayList<com.tencent.mapsdk.internal.je> arrayList = this.f49980e;
        int size = arrayList.size();
        com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[size];
        for (int i17 = 0; i17 < size; i17++) {
            bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) arrayList.get(i17).e();
        }
        return new com.tencent.mapsdk.internal.jd(bVarArr);
    }

    @Override // com.tencent.mapsdk.internal.jf
    public final java.lang.Object a(float f17) {
        return java.lang.Integer.valueOf(b(f17));
    }

    public final int b(float f17) {
        int i17;
        int i18;
        int i19;
        int i27;
        float f18;
        int i28 = this.f49976a;
        if (i28 != 2) {
            if (f17 <= 0.0f) {
                com.tencent.mapsdk.internal.je.b bVar = (com.tencent.mapsdk.internal.je.b) this.f49980e.get(0);
                com.tencent.mapsdk.internal.je.b bVar2 = (com.tencent.mapsdk.internal.je.b) this.f49980e.get(1);
                i19 = bVar.f49974e;
                i27 = bVar2.f49974e;
                float f19 = bVar.f49969a;
                float f27 = bVar2.f49969a;
                android.view.animation.Interpolator interpolator = bVar2.f49971c;
                if (interpolator != null) {
                    f17 = interpolator.getInterpolation(f17);
                }
                f18 = (f17 - f19) / (f27 - f19);
                com.tencent.mapsdk.internal.jk jkVar = this.f49981f;
                if (jkVar != null) {
                    return ((java.lang.Number) jkVar.a(f18, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27))).intValue();
                }
            } else if (f17 >= 1.0f) {
                com.tencent.mapsdk.internal.je.b bVar3 = (com.tencent.mapsdk.internal.je.b) this.f49980e.get(i28 - 2);
                com.tencent.mapsdk.internal.je.b bVar4 = (com.tencent.mapsdk.internal.je.b) this.f49980e.get(this.f49976a - 1);
                i19 = bVar3.f49974e;
                i27 = bVar4.f49974e;
                float f28 = bVar3.f49969a;
                float f29 = bVar4.f49969a;
                android.view.animation.Interpolator interpolator2 = bVar4.f49971c;
                if (interpolator2 != null) {
                    f17 = interpolator2.getInterpolation(f17);
                }
                f18 = (f17 - f28) / (f29 - f28);
                com.tencent.mapsdk.internal.jk jkVar2 = this.f49981f;
                if (jkVar2 != null) {
                    return ((java.lang.Number) jkVar2.a(f18, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27))).intValue();
                }
            } else {
                com.tencent.mapsdk.internal.je.b bVar5 = (com.tencent.mapsdk.internal.je.b) this.f49980e.get(0);
                int i29 = 1;
                while (true) {
                    int i37 = this.f49976a;
                    if (i29 < i37) {
                        com.tencent.mapsdk.internal.je.b bVar6 = (com.tencent.mapsdk.internal.je.b) this.f49980e.get(i29);
                        if (f17 < bVar6.f49969a) {
                            android.view.animation.Interpolator interpolator3 = bVar6.f49971c;
                            if (interpolator3 != null) {
                                f17 = interpolator3.getInterpolation(f17);
                            }
                            float f37 = bVar5.f49969a;
                            f17 = (f17 - f37) / (bVar6.f49969a - f37);
                            i17 = bVar5.f49974e;
                            int i38 = bVar6.f49974e;
                            com.tencent.mapsdk.internal.jk jkVar3 = this.f49981f;
                            if (jkVar3 != null) {
                                return ((java.lang.Number) jkVar3.a(f17, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i38))).intValue();
                            }
                            i18 = i38 - i17;
                        } else {
                            i29++;
                            bVar5 = bVar6;
                        }
                    } else {
                        return ((java.lang.Number) this.f49980e.get(i37 - 1).d()).intValue();
                    }
                }
            }
            return i19 + ((int) (f18 * (i27 - i19)));
        }
        if (this.f49968j) {
            this.f49968j = false;
            this.f49965g = ((com.tencent.mapsdk.internal.je.b) this.f49980e.get(0)).f49974e;
            int i39 = ((com.tencent.mapsdk.internal.je.b) this.f49980e.get(1)).f49974e;
            this.f49966h = i39;
            this.f49967i = i39 - this.f49965g;
        }
        android.view.animation.Interpolator interpolator4 = this.f49979d;
        if (interpolator4 != null) {
            f17 = interpolator4.getInterpolation(f17);
        }
        com.tencent.mapsdk.internal.jk jkVar4 = this.f49981f;
        if (jkVar4 == null) {
            i17 = this.f49965g;
            i18 = this.f49967i;
        } else {
            return ((java.lang.Number) jkVar4.a(f17, java.lang.Integer.valueOf(this.f49965g), java.lang.Integer.valueOf(this.f49966h))).intValue();
        }
        return i17 + ((int) (f17 * i18));
    }
}
