package x;

/* loaded from: classes13.dex */
public class f implements java.lang.Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f532353h = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f532354d = false;

    /* renamed from: e, reason: collision with root package name */
    public long[] f532355e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object[] f532356f;

    /* renamed from: g, reason: collision with root package name */
    public int f532357g;

    public f() {
        int i17;
        int i18 = 4;
        while (true) {
            i17 = 80;
            if (i18 >= 32) {
                break;
            }
            int i19 = (1 << i18) - 12;
            if (80 <= i19) {
                i17 = i19;
                break;
            }
            i18++;
        }
        int i27 = i17 / 8;
        this.f532355e = new long[i27];
        this.f532356f = new java.lang.Object[i27];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x.f m174731x5a5dd5d() {
        try {
            x.f fVar = (x.f) super.clone();
            fVar.f532355e = (long[]) this.f532355e.clone();
            fVar.f532356f = (java.lang.Object[]) this.f532356f.clone();
            return fVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public final void b() {
        int i17 = this.f532357g;
        long[] jArr = this.f532355e;
        java.lang.Object[] objArr = this.f532356f;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj = objArr[i19];
            if (obj != f532353h) {
                if (i19 != i18) {
                    jArr[i18] = jArr[i19];
                    objArr[i18] = obj;
                    objArr[i19] = null;
                }
                i18++;
            }
        }
        this.f532354d = false;
        this.f532357g = i18;
    }

    public java.lang.Object c(long j17, java.lang.Object obj) {
        java.lang.Object obj2;
        int b17 = x.e.b(this.f532355e, this.f532357g, j17);
        return (b17 < 0 || (obj2 = this.f532356f[b17]) == f532353h) ? obj : obj2;
    }

    /* renamed from: clear */
    public void m174730x5a5b64d() {
        int i17 = this.f532357g;
        java.lang.Object[] objArr = this.f532356f;
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = null;
        }
        this.f532357g = 0;
        this.f532354d = false;
    }

    public void d(long j17, java.lang.Object obj) {
        int b17 = x.e.b(this.f532355e, this.f532357g, j17);
        if (b17 >= 0) {
            this.f532356f[b17] = obj;
            return;
        }
        int i17 = ~b17;
        int i18 = this.f532357g;
        if (i17 < i18) {
            java.lang.Object[] objArr = this.f532356f;
            if (objArr[i17] == f532353h) {
                this.f532355e[i17] = j17;
                objArr[i17] = obj;
                return;
            }
        }
        if (this.f532354d && i18 >= this.f532355e.length) {
            b();
            i17 = ~x.e.b(this.f532355e, this.f532357g, j17);
        }
        int i19 = this.f532357g;
        if (i19 >= this.f532355e.length) {
            int i27 = (i19 + 1) * 8;
            int i28 = 4;
            while (true) {
                if (i28 >= 32) {
                    break;
                }
                int i29 = (1 << i28) - 12;
                if (i27 <= i29) {
                    i27 = i29;
                    break;
                }
                i28++;
            }
            int i37 = i27 / 8;
            long[] jArr = new long[i37];
            java.lang.Object[] objArr2 = new java.lang.Object[i37];
            long[] jArr2 = this.f532355e;
            java.lang.System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            java.lang.Object[] objArr3 = this.f532356f;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f532355e = jArr;
            this.f532356f = objArr2;
        }
        int i38 = this.f532357g - i17;
        if (i38 != 0) {
            long[] jArr3 = this.f532355e;
            int i39 = i17 + 1;
            java.lang.System.arraycopy(jArr3, i17, jArr3, i39, i38);
            java.lang.Object[] objArr4 = this.f532356f;
            java.lang.System.arraycopy(objArr4, i17, objArr4, i39, this.f532357g - i17);
        }
        this.f532355e[i17] = j17;
        this.f532356f[i17] = obj;
        this.f532357g++;
    }

    public int e() {
        if (this.f532354d) {
            b();
        }
        return this.f532357g;
    }

    public java.lang.Object f(int i17) {
        if (this.f532354d) {
            b();
        }
        return this.f532356f[i17];
    }

    /* renamed from: toString */
    public java.lang.String m174732x9616526c() {
        if (e() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f532357g * 28);
        sb6.append('{');
        for (int i17 = 0; i17 < this.f532357g; i17++) {
            if (i17 > 0) {
                sb6.append(", ");
            }
            if (this.f532354d) {
                b();
            }
            sb6.append(this.f532355e[i17]);
            sb6.append('=');
            java.lang.Object f17 = f(i17);
            if (f17 != this) {
                sb6.append(f17);
            } else {
                sb6.append("(this Map)");
            }
        }
        sb6.append('}');
        return sb6.toString();
    }
}
