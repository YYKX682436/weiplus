package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public class jf {

    /* renamed from: a, reason: collision with root package name */
    int f49976a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.je f49977b;

    /* renamed from: c, reason: collision with root package name */
    com.tencent.mapsdk.internal.je f49978c;

    /* renamed from: d, reason: collision with root package name */
    android.view.animation.Interpolator f49979d;

    /* renamed from: e, reason: collision with root package name */
    java.util.ArrayList<com.tencent.mapsdk.internal.je> f49980e;

    /* renamed from: f, reason: collision with root package name */
    com.tencent.mapsdk.internal.jk f49981f;

    public jf(com.tencent.mapsdk.internal.je... jeVarArr) {
        this.f49976a = jeVarArr.length;
        java.util.ArrayList<com.tencent.mapsdk.internal.je> arrayList = new java.util.ArrayList<>();
        this.f49980e = arrayList;
        arrayList.addAll(java.util.Arrays.asList(jeVarArr));
        this.f49977b = this.f49980e.get(0);
        com.tencent.mapsdk.internal.je jeVar = this.f49980e.get(this.f49976a - 1);
        this.f49978c = jeVar;
        this.f49979d = jeVar.f49971c;
    }

    private static com.tencent.mapsdk.internal.jf a(int... iArr) {
        int length = iArr.length;
        com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[java.lang.Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (com.tencent.mapsdk.internal.je.b) com.tencent.mapsdk.internal.je.a();
            bVarArr[1] = (com.tencent.mapsdk.internal.je.b) com.tencent.mapsdk.internal.je.a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (com.tencent.mapsdk.internal.je.b) com.tencent.mapsdk.internal.je.a(0.0f, iArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) com.tencent.mapsdk.internal.je.a(i17 / (length - 1), iArr[i17]);
            }
        }
        return new com.tencent.mapsdk.internal.jd(bVarArr);
    }

    public java.lang.String toString() {
        java.lang.String str = " ";
        for (int i17 = 0; i17 < this.f49976a; i17++) {
            str = str + this.f49980e.get(i17).d() + "  ";
        }
        return str;
    }

    private static com.tencent.mapsdk.internal.jf a(double... dArr) {
        int length = dArr.length;
        com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[java.lang.Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (com.tencent.mapsdk.internal.je.a) com.tencent.mapsdk.internal.je.b();
            aVarArr[1] = (com.tencent.mapsdk.internal.je.a) com.tencent.mapsdk.internal.je.a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (com.tencent.mapsdk.internal.je.a) com.tencent.mapsdk.internal.je.a(0.0f, dArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                aVarArr[i17] = (com.tencent.mapsdk.internal.je.a) com.tencent.mapsdk.internal.je.a(i17 / (length - 1), dArr[i17]);
            }
        }
        return new com.tencent.mapsdk.internal.jb(aVarArr);
    }

    private static com.tencent.mapsdk.internal.jf a(com.tencent.mapsdk.internal.je... jeVarArr) {
        int length = jeVarArr.length;
        int i17 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        for (com.tencent.mapsdk.internal.je jeVar : jeVarArr) {
            if (jeVar instanceof com.tencent.mapsdk.internal.je.a) {
                z17 = true;
            } else if (jeVar instanceof com.tencent.mapsdk.internal.je.b) {
                z18 = true;
            } else {
                z19 = true;
            }
        }
        if (z17 && !z18 && !z19) {
            com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[length];
            while (i17 < length) {
                aVarArr[i17] = (com.tencent.mapsdk.internal.je.a) jeVarArr[i17];
                i17++;
            }
            return new com.tencent.mapsdk.internal.jb(aVarArr);
        }
        if (z18 && !z17 && !z19) {
            com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[length];
            while (i17 < length) {
                bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) jeVarArr[i17];
                i17++;
            }
            return new com.tencent.mapsdk.internal.jd(bVarArr);
        }
        return new com.tencent.mapsdk.internal.jf(jeVarArr);
    }

    public static com.tencent.mapsdk.internal.jf a(java.lang.Object... objArr) {
        int length = objArr.length;
        com.tencent.mapsdk.internal.je.c[] cVarArr = new com.tencent.mapsdk.internal.je.c[java.lang.Math.max(length, 2)];
        if (length == 1) {
            cVarArr[0] = (com.tencent.mapsdk.internal.je.c) com.tencent.mapsdk.internal.je.c();
            cVarArr[1] = (com.tencent.mapsdk.internal.je.c) com.tencent.mapsdk.internal.je.a(1.0f, objArr[0]);
        } else {
            cVarArr[0] = (com.tencent.mapsdk.internal.je.c) com.tencent.mapsdk.internal.je.a(0.0f, objArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                cVarArr[i17] = (com.tencent.mapsdk.internal.je.c) com.tencent.mapsdk.internal.je.a(i17 / (length - 1), objArr[i17]);
            }
        }
        return new com.tencent.mapsdk.internal.jf(cVarArr);
    }

    private void a(com.tencent.mapsdk.internal.jk jkVar) {
        this.f49981f = jkVar;
    }

    @Override // 
    /* renamed from: a */
    public com.tencent.mapsdk.internal.jf clone() {
        java.util.ArrayList<com.tencent.mapsdk.internal.je> arrayList = this.f49980e;
        int size = arrayList.size();
        com.tencent.mapsdk.internal.je[] jeVarArr = new com.tencent.mapsdk.internal.je[size];
        for (int i17 = 0; i17 < size; i17++) {
            jeVarArr[i17] = arrayList.get(i17).e();
        }
        return new com.tencent.mapsdk.internal.jf(jeVarArr);
    }

    public java.lang.Object a(float f17) {
        int i17 = this.f49976a;
        if (i17 == 2) {
            android.view.animation.Interpolator interpolator = this.f49979d;
            if (interpolator != null) {
                f17 = interpolator.getInterpolation(f17);
            }
            return this.f49981f.a(f17, this.f49977b.d(), this.f49978c.d());
        }
        int i18 = 1;
        if (f17 <= 0.0f) {
            com.tencent.mapsdk.internal.je jeVar = this.f49980e.get(1);
            android.view.animation.Interpolator interpolator2 = jeVar.f49971c;
            if (interpolator2 != null) {
                f17 = interpolator2.getInterpolation(f17);
            }
            com.tencent.mapsdk.internal.je jeVar2 = this.f49977b;
            float f18 = jeVar2.f49969a;
            return this.f49981f.a((f17 - f18) / (jeVar.f49969a - f18), jeVar2.d(), jeVar.d());
        }
        if (f17 >= 1.0f) {
            com.tencent.mapsdk.internal.je jeVar3 = this.f49980e.get(i17 - 2);
            android.view.animation.Interpolator interpolator3 = this.f49978c.f49971c;
            if (interpolator3 != null) {
                f17 = interpolator3.getInterpolation(f17);
            }
            float f19 = jeVar3.f49969a;
            return this.f49981f.a((f17 - f19) / (this.f49978c.f49969a - f19), jeVar3.d(), this.f49978c.d());
        }
        com.tencent.mapsdk.internal.je jeVar4 = this.f49977b;
        while (i18 < this.f49976a) {
            com.tencent.mapsdk.internal.je jeVar5 = this.f49980e.get(i18);
            if (f17 < jeVar5.f49969a) {
                android.view.animation.Interpolator interpolator4 = jeVar5.f49971c;
                if (interpolator4 != null) {
                    f17 = interpolator4.getInterpolation(f17);
                }
                float f27 = jeVar4.f49969a;
                return this.f49981f.a((f17 - f27) / (jeVar5.f49969a - f27), jeVar4.d(), jeVar5.d());
            }
            i18++;
            jeVar4 = jeVar5;
        }
        return this.f49978c.d();
    }
}
