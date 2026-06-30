package com.google.protobuf;

/* loaded from: classes16.dex */
public final class m6 extends com.google.protobuf.h implements com.google.protobuf.t6, java.util.RandomAccess, com.google.protobuf.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.m6 f45327g;

    /* renamed from: e, reason: collision with root package name */
    public int[] f45328e;

    /* renamed from: f, reason: collision with root package name */
    public int f45329f;

    static {
        com.google.protobuf.m6 m6Var = new com.google.protobuf.m6(new int[0], 0);
        f45327g = m6Var;
        m6Var.f45145d = false;
    }

    public m6() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        int intValue = ((java.lang.Integer) obj).intValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f45329f)) {
            int[] iArr = this.f45328e;
            if (i18 < iArr.length) {
                java.lang.System.arraycopy(iArr, i17, iArr, i17 + 1, i18 - i17);
            } else {
                int[] iArr2 = new int[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
                java.lang.System.arraycopy(this.f45328e, i17, iArr2, i17 + 1, this.f45329f - i17);
                this.f45328e = iArr2;
            }
            this.f45328e[i17] = intValue;
            this.f45329f++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(j(i17));
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        d();
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        collection.getClass();
        if (!(collection instanceof com.google.protobuf.m6)) {
            return super.addAll(collection);
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) collection;
        int i17 = m6Var.f45329f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f45329f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        int[] iArr = this.f45328e;
        if (i19 > iArr.length) {
            this.f45328e = java.util.Arrays.copyOf(iArr, i19);
        }
        java.lang.System.arraycopy(m6Var.f45328e, 0, this.f45328e, this.f45329f, m6Var.f45329f);
        this.f45329f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(int i17) {
        d();
        int i18 = this.f45329f;
        int[] iArr = this.f45328e;
        if (i18 == iArr.length) {
            int[] iArr2 = new int[((i18 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i18);
            this.f45328e = iArr2;
        }
        int[] iArr3 = this.f45328e;
        int i19 = this.f45329f;
        this.f45329f = i19 + 1;
        iArr3[i19] = i17;
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.m6)) {
            return super.equals(obj);
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) obj;
        if (this.f45329f != m6Var.f45329f) {
            return false;
        }
        int[] iArr = m6Var.f45328e;
        for (int i17 = 0; i17 < this.f45329f; i17++) {
            if (this.f45328e[i17] != iArr[i17]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f45329f) {
            throw new java.lang.IndexOutOfBoundsException(j(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return java.lang.Integer.valueOf(h(i17));
    }

    public int h(int i17) {
        g(i17);
        return this.f45328e[i17];
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i17 = 1;
        for (int i18 = 0; i18 < this.f45329f; i18++) {
            i17 = (i17 * 31) + this.f45328e[i18];
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        int i17 = this.f45329f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f45328e[i18] == intValue) {
                return i18;
            }
        }
        return -1;
    }

    public final java.lang.String j(int i17) {
        int i18 = this.f45329f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(35);
        sb6.append("Index:");
        sb6.append(i17);
        sb6.append(", Size:");
        sb6.append(i18);
        return sb6.toString();
    }

    @Override // com.google.protobuf.v6
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.t6 F(int i17) {
        if (i17 >= this.f45329f) {
            return new com.google.protobuf.m6(java.util.Arrays.copyOf(this.f45328e, i17), this.f45329f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public int l(int i17, int i18) {
        d();
        g(i17);
        int[] iArr = this.f45328e;
        int i19 = iArr[i17];
        iArr[i17] = i18;
        return i19;
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f45329f; i17++) {
            if (obj.equals(java.lang.Integer.valueOf(this.f45328e[i17]))) {
                int[] iArr = this.f45328e;
                java.lang.System.arraycopy(iArr, i17 + 1, iArr, i17, (this.f45329f - i17) - 1);
                this.f45329f--;
                ((java.util.AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i17, int i18) {
        d();
        if (i18 < i17) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f45328e;
        java.lang.System.arraycopy(iArr, i18, iArr, i17, this.f45329f - i18);
        this.f45329f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        return java.lang.Integer.valueOf(l(i17, ((java.lang.Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45329f;
    }

    public m6(int[] iArr, int i17) {
        this.f45328e = iArr;
        this.f45329f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        int[] iArr = this.f45328e;
        int i18 = iArr[i17];
        if (i17 < this.f45329f - 1) {
            java.lang.System.arraycopy(iArr, i17 + 1, iArr, i17, (r2 - i17) - 1);
        }
        this.f45329f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Integer.valueOf(i18);
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Integer) obj).intValue());
        return true;
    }
}
