package x0;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f532453a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f532454b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f532455c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f532456d;

    /* renamed from: e, reason: collision with root package name */
    public int f532457e;

    public q() {
        int[] iArr = new int[16];
        int i17 = 0;
        while (i17 < 16) {
            int i18 = i17 + 1;
            iArr[i17] = i18;
            i17 = i18;
        }
        this.f532456d = iArr;
    }

    public final int a(int i17) {
        int i18 = this.f532453a + 1;
        int[] iArr = this.f532454b;
        int length = iArr.length;
        if (i18 > length) {
            int i19 = length * 2;
            int[] iArr2 = new int[i19];
            int[] iArr3 = new int[i19];
            kz5.v.n(iArr, iArr2, 0, 0, 0, 14, null);
            kz5.v.n(this.f532455c, iArr3, 0, 0, 0, 14, null);
            this.f532454b = iArr2;
            this.f532455c = iArr3;
        }
        int i27 = this.f532453a;
        this.f532453a = i27 + 1;
        int length2 = this.f532456d.length;
        if (this.f532457e >= length2) {
            int i28 = length2 * 2;
            int[] iArr4 = new int[i28];
            int i29 = 0;
            while (i29 < i28) {
                int i37 = i29 + 1;
                iArr4[i29] = i37;
                i29 = i37;
            }
            kz5.v.n(this.f532456d, iArr4, 0, 0, 0, 14, null);
            this.f532456d = iArr4;
        }
        int i38 = this.f532457e;
        int[] iArr5 = this.f532456d;
        this.f532457e = iArr5[i38];
        int[] iArr6 = this.f532454b;
        iArr6[i27] = i17;
        this.f532455c[i27] = i38;
        iArr5[i38] = i27;
        int i39 = iArr6[i27];
        while (i27 > 0) {
            int i47 = ((i27 + 1) >> 1) - 1;
            if (iArr6[i47] <= i39) {
                break;
            }
            b(i47, i27);
            i27 = i47;
        }
        return i38;
    }

    public final void b(int i17, int i18) {
        int[] iArr = this.f532454b;
        int[] iArr2 = this.f532455c;
        int[] iArr3 = this.f532456d;
        int i19 = iArr[i17];
        iArr[i17] = iArr[i18];
        iArr[i18] = i19;
        int i27 = iArr2[i17];
        iArr2[i17] = iArr2[i18];
        iArr2[i18] = i27;
        iArr3[iArr2[i17]] = i17;
        iArr3[iArr2[i18]] = i18;
    }
}
