package av5;

/* loaded from: classes16.dex */
public class d extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14358e;

    /* renamed from: f, reason: collision with root package name */
    public final int[][] f14359f;

    /* renamed from: g, reason: collision with root package name */
    public final int[][] f14360g;

    /* renamed from: h, reason: collision with root package name */
    public final int[][] f14361h;

    public d(int i17, int i18, int[][] iArr, int[][] iArr2, int[][] iArr3) {
        super(i17);
        this.f14358e = i18;
        this.f14359f = iArr;
        this.f14360g = iArr2;
        this.f14361h = iArr3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.d dVar) {
        int i17 = dVar.f14358e;
        int i18 = this.f14358e;
        if (i18 != i17) {
            return cv5.c.f(i18, i17);
        }
        int[][] iArr = this.f14359f;
        int length = iArr.length;
        int[][] iArr2 = this.f14360g;
        int length2 = iArr2.length;
        int[][] iArr3 = this.f14361h;
        int length3 = iArr3.length;
        int[][] iArr4 = dVar.f14359f;
        int length4 = iArr4.length;
        int[][] iArr5 = dVar.f14360g;
        int length5 = iArr5.length;
        int[][] iArr6 = dVar.f14361h;
        int length6 = iArr6.length;
        if (length != length4) {
            return cv5.c.c(length, length4);
        }
        if (length2 != length5) {
            return cv5.c.c(length2, length5);
        }
        if (length3 != length6) {
            return cv5.c.c(length3, length6);
        }
        for (int i19 = 0; i19 < length; i19++) {
            int[] iArr7 = iArr[i19];
            int i27 = iArr7[0];
            int i28 = iArr7[1];
            int[] iArr8 = iArr4[i19];
            int i29 = iArr8[0];
            int i37 = iArr8[1];
            if (i27 != i29) {
                return cv5.c.f(i27, i29);
            }
            if (i28 != i37) {
                return cv5.c.c(i28, i37);
            }
        }
        for (int i38 = 0; i38 < length2; i38++) {
            int[] iArr9 = iArr2[i38];
            int i39 = iArr9[0];
            int i47 = iArr9[1];
            int[] iArr10 = iArr5[i38];
            int i48 = iArr10[0];
            int i49 = iArr10[1];
            if (i39 != i48) {
                return cv5.c.f(i39, i48);
            }
            if (i47 != i49) {
                return cv5.c.c(i47, i49);
            }
        }
        for (int i57 = 0; i57 < length3; i57++) {
            int[] iArr11 = iArr3[i57];
            int i58 = iArr11[0];
            int i59 = iArr11[1];
            int[] iArr12 = iArr6[i57];
            int i66 = iArr12[0];
            int i67 = iArr12[1];
            if (i58 != i66) {
                return cv5.c.f(i58, i66);
            }
            if (i59 != i67) {
                return cv5.c.c(i59, i67);
            }
        }
        return 0;
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.d) && compareTo((av5.d) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14358e), this.f14359f, this.f14360g, this.f14361h);
    }
}
