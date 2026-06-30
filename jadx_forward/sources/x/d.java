package x;

/* loaded from: classes13.dex */
public final class d implements java.util.Collection, java.util.Set {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f532341h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object[] f532342i = new java.lang.Object[0];

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Object[] f532343m;

    /* renamed from: n, reason: collision with root package name */
    public static int f532344n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.Object[] f532345o;

    /* renamed from: p, reason: collision with root package name */
    public static int f532346p;

    /* renamed from: d, reason: collision with root package name */
    public int[] f532347d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f532348e;

    /* renamed from: f, reason: collision with root package name */
    public int f532349f;

    /* renamed from: g, reason: collision with root package name */
    public x.m f532350g;

    public d(java.util.Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    public static void e(int[] iArr, java.lang.Object[] objArr, int i17) {
        if (iArr.length == 8) {
            synchronized (x.d.class) {
                if (f532346p < 10) {
                    objArr[0] = f532345o;
                    objArr[1] = iArr;
                    for (int i18 = i17 - 1; i18 >= 2; i18--) {
                        objArr[i18] = null;
                    }
                    f532345o = objArr;
                    f532346p++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (x.d.class) {
                if (f532344n < 10) {
                    objArr[0] = f532343m;
                    objArr[1] = iArr;
                    for (int i19 = i17 - 1; i19 >= 2; i19--) {
                        objArr[i19] = null;
                    }
                    f532343m = objArr;
                    f532344n++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        int i17;
        int g17;
        if (obj == null) {
            g17 = h();
            i17 = 0;
        } else {
            int hashCode = obj.hashCode();
            i17 = hashCode;
            g17 = g(obj, hashCode);
        }
        if (g17 >= 0) {
            return false;
        }
        int i18 = ~g17;
        int i19 = this.f532349f;
        int[] iArr = this.f532347d;
        if (i19 >= iArr.length) {
            int i27 = 8;
            if (i19 >= 8) {
                i27 = (i19 >> 1) + i19;
            } else if (i19 < 4) {
                i27 = 4;
            }
            java.lang.Object[] objArr = this.f532348e;
            d(i27);
            int[] iArr2 = this.f532347d;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr, 0, this.f532348e, 0, objArr.length);
            }
            e(iArr, objArr, this.f532349f);
        }
        int i28 = this.f532349f;
        if (i18 < i28) {
            int[] iArr3 = this.f532347d;
            int i29 = i18 + 1;
            java.lang.System.arraycopy(iArr3, i18, iArr3, i29, i28 - i18);
            java.lang.Object[] objArr2 = this.f532348e;
            java.lang.System.arraycopy(objArr2, i18, objArr2, i29, this.f532349f - i18);
        }
        this.f532347d[i18] = i17;
        this.f532348e[i18] = obj;
        this.f532349f++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(java.util.Collection collection) {
        int size = this.f532349f + collection.size();
        int[] iArr = this.f532347d;
        boolean z17 = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.f532348e;
            d(size);
            int i17 = this.f532349f;
            if (i17 > 0) {
                java.lang.System.arraycopy(iArr, 0, this.f532347d, 0, i17);
                java.lang.System.arraycopy(objArr, 0, this.f532348e, 0, this.f532349f);
            }
            e(iArr, objArr, this.f532349f);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            z17 |= add(it.next());
        }
        return z17;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i17 = this.f532349f;
        if (i17 != 0) {
            e(this.f532347d, this.f532348e, i17);
            this.f532347d = f532341h;
            this.f532348e = f532342i;
            this.f532349f = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return m174726x73d44649(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i17) {
        if (i17 == 8) {
            synchronized (x.d.class) {
                java.lang.Object[] objArr = f532345o;
                if (objArr != null) {
                    this.f532348e = objArr;
                    f532345o = (java.lang.Object[]) objArr[0];
                    this.f532347d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f532346p--;
                    return;
                }
            }
        } else if (i17 == 4) {
            synchronized (x.d.class) {
                java.lang.Object[] objArr2 = f532343m;
                if (objArr2 != null) {
                    this.f532348e = objArr2;
                    f532343m = (java.lang.Object[]) objArr2[0];
                    this.f532347d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f532344n--;
                    return;
                }
            }
        }
        this.f532347d = new int[i17];
        this.f532348e = new java.lang.Object[i17];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (this.f532349f != set.size()) {
                return false;
            }
            for (int i17 = 0; i17 < this.f532349f; i17++) {
                try {
                    if (!set.contains(this.f532348e[i17])) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g(java.lang.Object obj, int i17) {
        int i18 = this.f532349f;
        if (i18 == 0) {
            return -1;
        }
        int a17 = x.e.a(this.f532347d, i18, i17);
        if (a17 < 0 || obj.equals(this.f532348e[a17])) {
            return a17;
        }
        int i19 = a17 + 1;
        while (i19 < i18 && this.f532347d[i19] == i17) {
            if (obj.equals(this.f532348e[i19])) {
                return i19;
            }
            i19++;
        }
        for (int i27 = a17 - 1; i27 >= 0 && this.f532347d[i27] == i17; i27--) {
            if (obj.equals(this.f532348e[i27])) {
                return i27;
            }
        }
        return ~i19;
    }

    public final int h() {
        int i17 = this.f532349f;
        if (i17 == 0) {
            return -1;
        }
        int a17 = x.e.a(this.f532347d, i17, 0);
        if (a17 < 0 || this.f532348e[a17] == null) {
            return a17;
        }
        int i18 = a17 + 1;
        while (i18 < i17 && this.f532347d[i18] == 0) {
            if (this.f532348e[i18] == null) {
                return i18;
            }
            i18++;
        }
        for (int i19 = a17 - 1; i19 >= 0 && this.f532347d[i19] == 0; i19--) {
            if (this.f532348e[i19] == null) {
                return i19;
            }
        }
        return ~i18;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f532347d;
        int i17 = this.f532349f;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            i18 += iArr[i19];
        }
        return i18;
    }

    /* renamed from: indexOf */
    public int m174726x73d44649(java.lang.Object obj) {
        return obj == null ? h() : g(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f532349f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        if (this.f532350g == null) {
            this.f532350g = new x.c(this);
        }
        x.m mVar = this.f532350g;
        if (mVar.f532371b == null) {
            mVar.f532371b = new x.j(mVar);
        }
        return mVar.f532371b.iterator();
    }

    public java.lang.Object j(int i17) {
        java.lang.Object[] objArr = this.f532348e;
        java.lang.Object obj = objArr[i17];
        int i18 = this.f532349f;
        if (i18 <= 1) {
            e(this.f532347d, objArr, i18);
            this.f532347d = f532341h;
            this.f532348e = f532342i;
            this.f532349f = 0;
        } else {
            int[] iArr = this.f532347d;
            if (iArr.length <= 8 || i18 >= iArr.length / 3) {
                int i19 = i18 - 1;
                this.f532349f = i19;
                if (i17 < i19) {
                    int i27 = i17 + 1;
                    java.lang.System.arraycopy(iArr, i27, iArr, i17, i19 - i17);
                    java.lang.Object[] objArr2 = this.f532348e;
                    java.lang.System.arraycopy(objArr2, i27, objArr2, i17, this.f532349f - i17);
                }
                this.f532348e[this.f532349f] = null;
            } else {
                d(i18 > 8 ? i18 + (i18 >> 1) : 8);
                this.f532349f--;
                if (i17 > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.f532347d, 0, i17);
                    java.lang.System.arraycopy(objArr, 0, this.f532348e, 0, i17);
                }
                int i28 = this.f532349f;
                if (i17 < i28) {
                    int i29 = i17 + 1;
                    java.lang.System.arraycopy(iArr, i29, this.f532347d, i17, i28 - i17);
                    java.lang.System.arraycopy(objArr, i29, this.f532348e, i17, this.f532349f - i17);
                }
            }
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        int m174726x73d44649 = m174726x73d44649(obj);
        if (m174726x73d44649 < 0) {
            return false;
        }
        j(m174726x73d44649);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            z17 |= remove(it.next());
        }
        return z17;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection collection) {
        boolean z17 = false;
        for (int i17 = this.f532349f - 1; i17 >= 0; i17--) {
            if (!collection.contains(this.f532348e[i17])) {
                j(i17);
                z17 = true;
            }
        }
        return z17;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f532349f;
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray() {
        int i17 = this.f532349f;
        java.lang.Object[] objArr = new java.lang.Object[i17];
        java.lang.System.arraycopy(this.f532348e, 0, objArr, 0, i17);
        return objArr;
    }

    /* renamed from: toString */
    public java.lang.String m174727x9616526c() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f532349f * 14);
        sb6.append('{');
        for (int i17 = 0; i17 < this.f532349f; i17++) {
            if (i17 > 0) {
                sb6.append(", ");
            }
            java.lang.Object obj = this.f532348e[i17];
            if (obj != this) {
                sb6.append(obj);
            } else {
                sb6.append("(this Set)");
            }
        }
        sb6.append('}');
        return sb6.toString();
    }

    public d(int i17) {
        if (i17 == 0) {
            this.f532347d = f532341h;
            this.f532348e = f532342i;
        } else {
            d(i17);
        }
        this.f532349f = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (objArr.length < this.f532349f) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), this.f532349f);
        }
        java.lang.System.arraycopy(this.f532348e, 0, objArr, 0, this.f532349f);
        int length = objArr.length;
        int i17 = this.f532349f;
        if (length > i17) {
            objArr[i17] = null;
        }
        return objArr;
    }
}
