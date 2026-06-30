package fv5;

/* loaded from: classes16.dex */
public class b implements java.lang.Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f348553g = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public int[] f348554d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f348555e;

    /* renamed from: f, reason: collision with root package name */
    public int f348556f;

    public b() {
        this(10);
    }

    public final int[] a(int[] iArr, int i17, int i18) {
        if (i17 > iArr.length) {
            throw new java.lang.IllegalArgumentException("Bad currentSize, originalSize: " + iArr.length + " currentSize: " + i17);
        }
        if (i17 + 1 > iArr.length) {
            int[] iArr2 = new int[i17 <= 4 ? 8 : (i17 >> 1) + i17];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
            iArr = iArr2;
        }
        iArr[i17] = i18;
        return iArr;
    }

    public final int b(int[] iArr, int i17, int i18) {
        int i19 = i17 - 1;
        int i27 = 0;
        while (i27 <= i19) {
            int i28 = (i27 + i19) >>> 1;
            int i29 = iArr[i28];
            if (i29 < i18) {
                i27 = i28 + 1;
            } else {
                if (i29 <= i18) {
                    return i28;
                }
                i19 = i28 - 1;
            }
        }
        return ~i27;
    }

    public int c(int i17) {
        int b17 = b(this.f348554d, this.f348556f, i17);
        if (b17 < 0) {
            return 0;
        }
        return this.f348555e[b17];
    }

    /* renamed from: clone */
    public java.lang.Object m130500x5a5dd5d() {
        try {
            fv5.b bVar = (fv5.b) super.clone();
            try {
                bVar.f348554d = (int[]) this.f348554d.clone();
                bVar.f348555e = (int[]) this.f348555e.clone();
                return bVar;
            } catch (java.lang.CloneNotSupportedException unused) {
                return bVar;
            }
        } catch (java.lang.CloneNotSupportedException unused2) {
            return null;
        }
    }

    public int d(int i17) {
        return b(this.f348554d, this.f348556f, i17);
    }

    public final int[] e(int[] iArr, int i17, int i18, int i19) {
        if (i17 > iArr.length) {
            throw new java.lang.IllegalArgumentException("Bad currentSize, originalSize: " + iArr.length + " currentSize: " + i17);
        }
        if (i17 + 1 <= iArr.length) {
            java.lang.System.arraycopy(iArr, i18, iArr, i18 + 1, i17 - i18);
            iArr[i18] = i19;
            return iArr;
        }
        int[] iArr2 = new int[i17 <= 4 ? 8 : i17 + (i17 >> 1)];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i18);
        iArr2[i18] = i19;
        java.lang.System.arraycopy(iArr, i18, iArr2, i18 + 1, iArr.length - i18);
        return iArr2;
    }

    public void f(int i17, int i18) {
        int b17 = b(this.f348554d, this.f348556f, i17);
        if (b17 >= 0) {
            this.f348555e[b17] = i18;
            return;
        }
        int i19 = ~b17;
        this.f348554d = e(this.f348554d, this.f348556f, i19, i17);
        this.f348555e = e(this.f348555e, this.f348556f, i19, i18);
        this.f348556f++;
    }

    /* renamed from: toString */
    public java.lang.String m130501x9616526c() {
        int i17 = this.f348556f;
        if (i17 <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17 * 28);
        sb6.append('{');
        for (int i18 = 0; i18 < this.f348556f; i18++) {
            if (i18 > 0) {
                sb6.append(", ");
            }
            sb6.append(this.f348554d[i18]);
            sb6.append('=');
            sb6.append(this.f348555e[i18]);
        }
        sb6.append('}');
        return sb6.toString();
    }

    public b(int i17) {
        if (i17 == 0) {
            int[] iArr = f348553g;
            this.f348554d = iArr;
            this.f348555e = iArr;
        } else {
            int[] iArr2 = new int[i17];
            this.f348554d = iArr2;
            this.f348555e = new int[iArr2.length];
        }
        this.f348556f = 0;
    }
}
