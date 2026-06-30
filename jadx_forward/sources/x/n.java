package x;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Object[] f532373g;

    /* renamed from: h, reason: collision with root package name */
    public static int f532374h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Object[] f532375i;

    /* renamed from: m, reason: collision with root package name */
    public static int f532376m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f532377d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f532378e;

    /* renamed from: f, reason: collision with root package name */
    public int f532379f;

    public n() {
        this.f532377d = x.e.f532351a;
        this.f532378e = x.e.f532352b;
        this.f532379f = 0;
    }

    private void a(int i17) {
        if (i17 == 8) {
            synchronized (x.n.class) {
                java.lang.Object[] objArr = f532375i;
                if (objArr != null) {
                    this.f532378e = objArr;
                    f532375i = (java.lang.Object[]) objArr[0];
                    this.f532377d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f532376m--;
                    return;
                }
            }
        } else if (i17 == 4) {
            synchronized (x.n.class) {
                java.lang.Object[] objArr2 = f532373g;
                if (objArr2 != null) {
                    this.f532378e = objArr2;
                    f532373g = (java.lang.Object[]) objArr2[0];
                    this.f532377d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f532374h--;
                    return;
                }
            }
        }
        this.f532377d = new int[i17];
        this.f532378e = new java.lang.Object[i17 << 1];
    }

    public static void c(int[] iArr, java.lang.Object[] objArr, int i17) {
        if (iArr.length == 8) {
            synchronized (x.n.class) {
                if (f532376m < 10) {
                    objArr[0] = f532375i;
                    objArr[1] = iArr;
                    for (int i18 = (i17 << 1) - 1; i18 >= 2; i18--) {
                        objArr[i18] = null;
                    }
                    f532375i = objArr;
                    f532376m++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (x.n.class) {
                if (f532374h < 10) {
                    objArr[0] = f532373g;
                    objArr[1] = iArr;
                    for (int i19 = (i17 << 1) - 1; i19 >= 2; i19--) {
                        objArr[i19] = null;
                    }
                    f532373g = objArr;
                    f532374h++;
                }
            }
        }
    }

    public void b(int i17) {
        int i18 = this.f532379f;
        int[] iArr = this.f532377d;
        if (iArr.length < i17) {
            java.lang.Object[] objArr = this.f532378e;
            a(i17);
            if (this.f532379f > 0) {
                java.lang.System.arraycopy(iArr, 0, this.f532377d, 0, i18);
                java.lang.System.arraycopy(objArr, 0, this.f532378e, 0, i18 << 1);
            }
            c(iArr, objArr, i18);
        }
        if (this.f532379f != i18) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void clear() {
        int i17 = this.f532379f;
        if (i17 > 0) {
            int[] iArr = this.f532377d;
            java.lang.Object[] objArr = this.f532378e;
            this.f532377d = x.e.f532351a;
            this.f532378e = x.e.f532352b;
            this.f532379f = 0;
            c(iArr, objArr, i17);
        }
        if (this.f532379f > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* renamed from: containsKey */
    public boolean m174748xc6607c0(java.lang.Object obj) {
        return e(obj) >= 0;
    }

    /* renamed from: containsValue */
    public boolean m174749x8b9c2692(java.lang.Object obj) {
        return g(obj) >= 0;
    }

    int d(java.lang.Object obj, int i17) {
        int i18 = this.f532379f;
        if (i18 == 0) {
            return -1;
        }
        try {
            int a17 = x.e.a(this.f532377d, i18, i17);
            if (a17 < 0 || obj.equals(this.f532378e[a17 << 1])) {
                return a17;
            }
            int i19 = a17 + 1;
            while (i19 < i18 && this.f532377d[i19] == i17) {
                if (obj.equals(this.f532378e[i19 << 1])) {
                    return i19;
                }
                i19++;
            }
            for (int i27 = a17 - 1; i27 >= 0 && this.f532377d[i27] == i17; i27--) {
                if (obj.equals(this.f532378e[i27 << 1])) {
                    return i27;
                }
            }
            return ~i19;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public int e(java.lang.Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    /* renamed from: equals */
    public boolean m174750xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x.n) {
            x.n nVar = (x.n) obj;
            if (this.f532379f != nVar.f532379f) {
                return false;
            }
            for (int i17 = 0; i17 < this.f532379f; i17++) {
                try {
                    java.lang.Object h17 = h(i17);
                    java.lang.Object l17 = l(i17);
                    java.lang.Object m174751x4aabfc28 = nVar.m174751x4aabfc28(h17, null);
                    if (l17 == null) {
                        if (m174751x4aabfc28 != null || !nVar.m174748xc6607c0(h17)) {
                            return false;
                        }
                    } else if (!l17.equals(m174751x4aabfc28)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.f532379f != map.size()) {
                return false;
            }
            for (int i18 = 0; i18 < this.f532379f; i18++) {
                try {
                    java.lang.Object h18 = h(i18);
                    java.lang.Object l18 = l(i18);
                    java.lang.Object obj2 = map.get(h18);
                    if (l18 == null) {
                        if (obj2 != null || !map.containsKey(h18)) {
                            return false;
                        }
                    } else if (!l18.equals(obj2)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i17 = this.f532379f;
        if (i17 == 0) {
            return -1;
        }
        try {
            int a17 = x.e.a(this.f532377d, i17, 0);
            if (a17 < 0 || this.f532378e[a17 << 1] == null) {
                return a17;
            }
            int i18 = a17 + 1;
            while (i18 < i17 && this.f532377d[i18] == 0) {
                if (this.f532378e[i18 << 1] == null) {
                    return i18;
                }
                i18++;
            }
            for (int i19 = a17 - 1; i19 >= 0 && this.f532377d[i19] == 0; i19--) {
                if (this.f532378e[i19 << 1] == null) {
                    return i19;
                }
            }
            return ~i18;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(java.lang.Object obj) {
        int i17 = this.f532379f * 2;
        java.lang.Object[] objArr = this.f532378e;
        if (obj == null) {
            for (int i18 = 1; i18 < i17; i18 += 2) {
                if (objArr[i18] == null) {
                    return i18 >> 1;
                }
            }
            return -1;
        }
        for (int i19 = 1; i19 < i17; i19 += 2) {
            if (obj.equals(objArr[i19])) {
                return i19 >> 1;
            }
        }
        return -1;
    }

    public java.lang.Object get(java.lang.Object obj) {
        return m174751x4aabfc28(obj, null);
    }

    /* renamed from: getOrDefault */
    public java.lang.Object m174751x4aabfc28(java.lang.Object obj, java.lang.Object obj2) {
        int e17 = e(obj);
        return e17 >= 0 ? this.f532378e[(e17 << 1) + 1] : obj2;
    }

    public java.lang.Object h(int i17) {
        return this.f532378e[i17 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f532377d;
        java.lang.Object[] objArr = this.f532378e;
        int i17 = this.f532379f;
        int i18 = 1;
        int i19 = 0;
        int i27 = 0;
        while (i19 < i17) {
            java.lang.Object obj = objArr[i18];
            i27 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i19];
            i19++;
            i18 += 2;
        }
        return i27;
    }

    public void i(x.n nVar) {
        int i17 = nVar.f532379f;
        b(this.f532379f + i17);
        if (this.f532379f != 0) {
            for (int i18 = 0; i18 < i17; i18++) {
                put(nVar.h(i18), nVar.l(i18));
            }
        } else if (i17 > 0) {
            java.lang.System.arraycopy(nVar.f532377d, 0, this.f532377d, 0, i17);
            java.lang.System.arraycopy(nVar.f532378e, 0, this.f532378e, 0, i17 << 1);
            this.f532379f = i17;
        }
    }

    /* renamed from: isEmpty */
    public boolean m174752x7aab3243() {
        return this.f532379f <= 0;
    }

    public java.lang.Object j(int i17) {
        java.lang.Object[] objArr = this.f532378e;
        int i18 = i17 << 1;
        java.lang.Object obj = objArr[i18 + 1];
        int i19 = this.f532379f;
        int i27 = 0;
        if (i19 <= 1) {
            c(this.f532377d, objArr, i19);
            this.f532377d = x.e.f532351a;
            this.f532378e = x.e.f532352b;
        } else {
            int i28 = i19 - 1;
            int[] iArr = this.f532377d;
            if (iArr.length <= 8 || i19 >= iArr.length / 3) {
                if (i17 < i28) {
                    int i29 = i17 + 1;
                    int i37 = i28 - i17;
                    java.lang.System.arraycopy(iArr, i29, iArr, i17, i37);
                    java.lang.Object[] objArr2 = this.f532378e;
                    java.lang.System.arraycopy(objArr2, i29 << 1, objArr2, i18, i37 << 1);
                }
                java.lang.Object[] objArr3 = this.f532378e;
                int i38 = i28 << 1;
                objArr3[i38] = null;
                objArr3[i38 + 1] = null;
            } else {
                a(i19 > 8 ? i19 + (i19 >> 1) : 8);
                if (i19 != this.f532379f) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i17 > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.f532377d, 0, i17);
                    java.lang.System.arraycopy(objArr, 0, this.f532378e, 0, i18);
                }
                if (i17 < i28) {
                    int i39 = i17 + 1;
                    int i47 = i28 - i17;
                    java.lang.System.arraycopy(iArr, i39, this.f532377d, i17, i47);
                    java.lang.System.arraycopy(objArr, i39 << 1, this.f532378e, i18, i47 << 1);
                }
            }
            i27 = i28;
        }
        if (i19 != this.f532379f) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f532379f = i27;
        return obj;
    }

    public java.lang.Object k(int i17, java.lang.Object obj) {
        int i18 = (i17 << 1) + 1;
        java.lang.Object[] objArr = this.f532378e;
        java.lang.Object obj2 = objArr[i18];
        objArr[i18] = obj;
        return obj2;
    }

    public java.lang.Object l(int i17) {
        return this.f532378e[(i17 << 1) + 1];
    }

    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        int d17;
        int i18 = this.f532379f;
        if (obj == null) {
            d17 = f();
            i17 = 0;
        } else {
            int hashCode = obj.hashCode();
            i17 = hashCode;
            d17 = d(obj, hashCode);
        }
        if (d17 >= 0) {
            int i19 = (d17 << 1) + 1;
            java.lang.Object[] objArr = this.f532378e;
            java.lang.Object obj3 = objArr[i19];
            objArr[i19] = obj2;
            return obj3;
        }
        int i27 = ~d17;
        int[] iArr = this.f532377d;
        if (i18 >= iArr.length) {
            int i28 = 8;
            if (i18 >= 8) {
                i28 = (i18 >> 1) + i18;
            } else if (i18 < 4) {
                i28 = 4;
            }
            java.lang.Object[] objArr2 = this.f532378e;
            a(i28);
            if (i18 != this.f532379f) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.f532377d;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr2, 0, this.f532378e, 0, objArr2.length);
            }
            c(iArr, objArr2, i18);
        }
        if (i27 < i18) {
            int[] iArr3 = this.f532377d;
            int i29 = i27 + 1;
            java.lang.System.arraycopy(iArr3, i27, iArr3, i29, i18 - i27);
            java.lang.Object[] objArr3 = this.f532378e;
            java.lang.System.arraycopy(objArr3, i27 << 1, objArr3, i29 << 1, (this.f532379f - i27) << 1);
        }
        int i37 = this.f532379f;
        if (i18 == i37) {
            int[] iArr4 = this.f532377d;
            if (i27 < iArr4.length) {
                iArr4[i27] = i17;
                java.lang.Object[] objArr4 = this.f532378e;
                int i38 = i27 << 1;
                objArr4[i38] = obj;
                objArr4[i38 + 1] = obj2;
                this.f532379f = i37 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    /* renamed from: putIfAbsent */
    public java.lang.Object m174753x20186ae5(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object m174751x4aabfc28 = m174751x4aabfc28(obj, null);
        return m174751x4aabfc28 == null ? put(obj, obj2) : m174751x4aabfc28;
    }

    /* renamed from: remove */
    public java.lang.Object m174754xc84af884(java.lang.Object obj) {
        int e17 = e(obj);
        if (e17 >= 0) {
            return j(e17);
        }
        return null;
    }

    /* renamed from: replace */
    public java.lang.Object m174756x413cb2b4(java.lang.Object obj, java.lang.Object obj2) {
        int e17 = e(obj);
        if (e17 >= 0) {
            return k(e17, obj2);
        }
        return null;
    }

    /* renamed from: size */
    public int m174758x35e001() {
        return this.f532379f;
    }

    /* renamed from: toString */
    public java.lang.String m174759x9616526c() {
        if (m174752x7aab3243()) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f532379f * 28);
        sb6.append('{');
        for (int i17 = 0; i17 < this.f532379f; i17++) {
            if (i17 > 0) {
                sb6.append(", ");
            }
            java.lang.Object h17 = h(i17);
            if (h17 != this) {
                sb6.append(h17);
            } else {
                sb6.append("(this Map)");
            }
            sb6.append('=');
            java.lang.Object l17 = l(i17);
            if (l17 != this) {
                sb6.append(l17);
            } else {
                sb6.append("(this Map)");
            }
        }
        sb6.append('}');
        return sb6.toString();
    }

    /* renamed from: remove */
    public boolean m174755xc84af884(java.lang.Object obj, java.lang.Object obj2) {
        int e17 = e(obj);
        if (e17 < 0) {
            return false;
        }
        java.lang.Object l17 = l(e17);
        if (obj2 != l17 && (obj2 == null || !obj2.equals(l17))) {
            return false;
        }
        j(e17);
        return true;
    }

    /* renamed from: replace */
    public boolean m174757x413cb2b4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int e17 = e(obj);
        if (e17 < 0) {
            return false;
        }
        java.lang.Object l17 = l(e17);
        if (l17 != obj2 && (obj2 == null || !obj2.equals(l17))) {
            return false;
        }
        k(e17, obj3);
        return true;
    }

    public n(int i17) {
        if (i17 == 0) {
            this.f532377d = x.e.f532351a;
            this.f532378e = x.e.f532352b;
        } else {
            a(i17);
        }
        this.f532379f = 0;
    }
}
