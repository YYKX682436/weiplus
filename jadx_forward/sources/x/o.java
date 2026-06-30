package x;

/* loaded from: classes13.dex */
public class o implements java.lang.Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f532380h = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f532381d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f532382e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object[] f532383f;

    /* renamed from: g, reason: collision with root package name */
    public int f532384g;

    public o() {
        this(10);
    }

    public void a(int i17, java.lang.Object obj) {
        int i18 = this.f532384g;
        if (i18 != 0 && i17 <= this.f532382e[i18 - 1]) {
            g(i17, obj);
            return;
        }
        if (this.f532381d && i18 >= this.f532382e.length) {
            d();
        }
        int i19 = this.f532384g;
        if (i19 >= this.f532382e.length) {
            int i27 = (i19 + 1) * 4;
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
            int i37 = i27 / 4;
            int[] iArr = new int[i37];
            java.lang.Object[] objArr = new java.lang.Object[i37];
            int[] iArr2 = this.f532382e;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr2 = this.f532383f;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f532382e = iArr;
            this.f532383f = objArr;
        }
        this.f532382e[i19] = i17;
        this.f532383f[i19] = obj;
        this.f532384g = i19 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x.o m174761x5a5dd5d() {
        try {
            x.o oVar = (x.o) super.clone();
            oVar.f532382e = (int[]) this.f532382e.clone();
            oVar.f532383f = (java.lang.Object[]) this.f532383f.clone();
            return oVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public boolean c(int i17) {
        if (this.f532381d) {
            d();
        }
        return x.e.a(this.f532382e, this.f532384g, i17) >= 0;
    }

    public final void d() {
        int i17 = this.f532384g;
        int[] iArr = this.f532382e;
        java.lang.Object[] objArr = this.f532383f;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj = objArr[i19];
            if (obj != f532380h) {
                if (i19 != i18) {
                    iArr[i18] = iArr[i19];
                    objArr[i18] = obj;
                    objArr[i19] = null;
                }
                i18++;
            }
        }
        this.f532381d = false;
        this.f532384g = i18;
    }

    public java.lang.Object e(int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        int a17 = x.e.a(this.f532382e, this.f532384g, i17);
        return (a17 < 0 || (obj2 = this.f532383f[a17]) == f532380h) ? obj : obj2;
    }

    public int f(int i17) {
        if (this.f532381d) {
            d();
        }
        return this.f532382e[i17];
    }

    public void g(int i17, java.lang.Object obj) {
        int a17 = x.e.a(this.f532382e, this.f532384g, i17);
        if (a17 >= 0) {
            this.f532383f[a17] = obj;
            return;
        }
        int i18 = ~a17;
        int i19 = this.f532384g;
        if (i18 < i19) {
            java.lang.Object[] objArr = this.f532383f;
            if (objArr[i18] == f532380h) {
                this.f532382e[i18] = i17;
                objArr[i18] = obj;
                return;
            }
        }
        if (this.f532381d && i19 >= this.f532382e.length) {
            d();
            i18 = ~x.e.a(this.f532382e, this.f532384g, i17);
        }
        int i27 = this.f532384g;
        if (i27 >= this.f532382e.length) {
            int i28 = (i27 + 1) * 4;
            int i29 = 4;
            while (true) {
                if (i29 >= 32) {
                    break;
                }
                int i37 = (1 << i29) - 12;
                if (i28 <= i37) {
                    i28 = i37;
                    break;
                }
                i29++;
            }
            int i38 = i28 / 4;
            int[] iArr = new int[i38];
            java.lang.Object[] objArr2 = new java.lang.Object[i38];
            int[] iArr2 = this.f532382e;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr3 = this.f532383f;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f532382e = iArr;
            this.f532383f = objArr2;
        }
        int i39 = this.f532384g - i18;
        if (i39 != 0) {
            int[] iArr3 = this.f532382e;
            int i47 = i18 + 1;
            java.lang.System.arraycopy(iArr3, i18, iArr3, i47, i39);
            java.lang.Object[] objArr4 = this.f532383f;
            java.lang.System.arraycopy(objArr4, i18, objArr4, i47, this.f532384g - i18);
        }
        this.f532382e[i18] = i17;
        this.f532383f[i18] = obj;
        this.f532384g++;
    }

    public int h() {
        if (this.f532381d) {
            d();
        }
        return this.f532384g;
    }

    public java.lang.Object i(int i17) {
        if (this.f532381d) {
            d();
        }
        return this.f532383f[i17];
    }

    /* renamed from: toString */
    public java.lang.String m174762x9616526c() {
        if (h() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f532384g * 28);
        sb6.append('{');
        for (int i17 = 0; i17 < this.f532384g; i17++) {
            if (i17 > 0) {
                sb6.append(", ");
            }
            sb6.append(f(i17));
            sb6.append('=');
            java.lang.Object i18 = i(i17);
            if (i18 != this) {
                sb6.append(i18);
            } else {
                sb6.append("(this Map)");
            }
        }
        sb6.append('}');
        return sb6.toString();
    }

    public o(int i17) {
        this.f532381d = false;
        if (i17 == 0) {
            this.f532382e = x.e.f532351a;
            this.f532383f = x.e.f532352b;
            return;
        }
        int i18 = i17 * 4;
        int i19 = 4;
        while (true) {
            if (i19 >= 32) {
                break;
            }
            int i27 = (1 << i19) - 12;
            if (i18 <= i27) {
                i18 = i27;
                break;
            }
            i19++;
        }
        int i28 = i18 / 4;
        this.f532382e = new int[i28];
        this.f532383f = new java.lang.Object[i28];
    }
}
