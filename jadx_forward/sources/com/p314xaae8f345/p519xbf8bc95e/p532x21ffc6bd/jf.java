package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public class jf {

    /* renamed from: a, reason: collision with root package name */
    int f131509a;

    /* renamed from: b, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je f131510b;

    /* renamed from: c, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je f131511c;

    /* renamed from: d, reason: collision with root package name */
    android.view.animation.Interpolator f131512d;

    /* renamed from: e, reason: collision with root package name */
    java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je> f131513e;

    /* renamed from: f, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk f131514f;

    public jf(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je... jeVarArr) {
        this.f131509a = jeVarArr.length;
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je> arrayList = new java.util.ArrayList<>();
        this.f131513e = arrayList;
        arrayList.addAll(java.util.Arrays.asList(jeVarArr));
        this.f131510b = this.f131513e.get(0);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar = this.f131513e.get(this.f131509a - 1);
        this.f131511c = jeVar;
        this.f131512d = jeVar.f131504c;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf a(int... iArr) {
        int length = iArr.length;
        com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[java.lang.Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (com.tencent.mapsdk.internal.je.b) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a();
            bVarArr[1] = (com.tencent.mapsdk.internal.je.b) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (com.tencent.mapsdk.internal.je.b) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(0.0f, iArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(i17 / (length - 1), iArr[i17]);
            }
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd(bVarArr);
    }

    /* renamed from: toString */
    public java.lang.String m36796x9616526c() {
        java.lang.String str = " ";
        for (int i17 = 0; i17 < this.f131509a; i17++) {
            str = str + this.f131513e.get(i17).d() + "  ";
        }
        return str;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf a(double... dArr) {
        int length = dArr.length;
        com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[java.lang.Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (com.tencent.mapsdk.internal.je.a) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.b();
            aVarArr[1] = (com.tencent.mapsdk.internal.je.a) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (com.tencent.mapsdk.internal.je.a) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(0.0f, dArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                aVarArr[i17] = (com.tencent.mapsdk.internal.je.a) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(i17 / (length - 1), dArr[i17]);
            }
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb(aVarArr);
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je... jeVarArr) {
        int length = jeVarArr.length;
        int i17 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar : jeVarArr) {
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
            return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb(aVarArr);
        }
        if (z18 && !z17 && !z19) {
            com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[length];
            while (i17 < length) {
                bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) jeVarArr[i17];
                i17++;
            }
            return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd(bVarArr);
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf(jeVarArr);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf a(java.lang.Object... objArr) {
        int length = objArr.length;
        com.tencent.mapsdk.internal.je.c[] cVarArr = new com.tencent.mapsdk.internal.je.c[java.lang.Math.max(length, 2)];
        if (length == 1) {
            cVarArr[0] = (com.tencent.mapsdk.internal.je.c) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.c();
            cVarArr[1] = (com.tencent.mapsdk.internal.je.c) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(1.0f, objArr[0]);
        } else {
            cVarArr[0] = (com.tencent.mapsdk.internal.je.c) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(0.0f, objArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                cVarArr[i17] = (com.tencent.mapsdk.internal.je.c) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(i17 / (length - 1), objArr[i17]);
            }
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf(cVarArr);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar) {
        this.f131514f = jkVar;
    }

    @Override // 
    /* renamed from: a */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf mo36794x5a5dd5d() {
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je> arrayList = this.f131513e;
        int size = arrayList.size();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je[] jeVarArr = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je[size];
        for (int i17 = 0; i17 < size; i17++) {
            jeVarArr[i17] = arrayList.get(i17).e();
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf(jeVarArr);
    }

    public java.lang.Object a(float f17) {
        int i17 = this.f131509a;
        if (i17 == 2) {
            android.view.animation.Interpolator interpolator = this.f131512d;
            if (interpolator != null) {
                f17 = interpolator.getInterpolation(f17);
            }
            return this.f131514f.a(f17, this.f131510b.d(), this.f131511c.d());
        }
        int i18 = 1;
        if (f17 <= 0.0f) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar = this.f131513e.get(1);
            android.view.animation.Interpolator interpolator2 = jeVar.f131504c;
            if (interpolator2 != null) {
                f17 = interpolator2.getInterpolation(f17);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar2 = this.f131510b;
            float f18 = jeVar2.f131502a;
            return this.f131514f.a((f17 - f18) / (jeVar.f131502a - f18), jeVar2.d(), jeVar.d());
        }
        if (f17 >= 1.0f) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar3 = this.f131513e.get(i17 - 2);
            android.view.animation.Interpolator interpolator3 = this.f131511c.f131504c;
            if (interpolator3 != null) {
                f17 = interpolator3.getInterpolation(f17);
            }
            float f19 = jeVar3.f131502a;
            return this.f131514f.a((f17 - f19) / (this.f131511c.f131502a - f19), jeVar3.d(), this.f131511c.d());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar4 = this.f131510b;
        while (i18 < this.f131509a) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar5 = this.f131513e.get(i18);
            if (f17 < jeVar5.f131502a) {
                android.view.animation.Interpolator interpolator4 = jeVar5.f131504c;
                if (interpolator4 != null) {
                    f17 = interpolator4.getInterpolation(f17);
                }
                float f27 = jeVar4.f131502a;
                return this.f131514f.a((f17 - f27) / (jeVar5.f131502a - f27), jeVar4.d(), jeVar5.d());
            }
            i18++;
            jeVar4 = jeVar5;
        }
        return this.f131511c.d();
    }
}
