package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class m6 extends com.p176xb6135e39.p283xc50a8b8b.h implements com.p176xb6135e39.p283xc50a8b8b.t6, java.util.RandomAccess, com.p176xb6135e39.p283xc50a8b8b.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.m6 f126860g;

    /* renamed from: e, reason: collision with root package name */
    public int[] f126861e;

    /* renamed from: f, reason: collision with root package name */
    public int f126862f;

    static {
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = new com.p176xb6135e39.p283xc50a8b8b.m6(new int[0], 0);
        f126860g = m6Var;
        m6Var.f126678d = false;
    }

    public m6() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        int intValue = ((java.lang.Integer) obj).intValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f126862f)) {
            int[] iArr = this.f126861e;
            if (i18 < iArr.length) {
                java.lang.System.arraycopy(iArr, i17, iArr, i17 + 1, i18 - i17);
            } else {
                int[] iArr2 = new int[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
                java.lang.System.arraycopy(this.f126861e, i17, iArr2, i17 + 1, this.f126862f - i17);
                this.f126861e = iArr2;
            }
            this.f126861e[i17] = intValue;
            this.f126862f++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(j(i17));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        d();
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        collection.getClass();
        if (!(collection instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            return super.addAll(collection);
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) collection;
        int i17 = m6Var.f126862f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f126862f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        int[] iArr = this.f126861e;
        if (i19 > iArr.length) {
            this.f126861e = java.util.Arrays.copyOf(iArr, i19);
        }
        java.lang.System.arraycopy(m6Var.f126861e, 0, this.f126861e, this.f126862f, m6Var.f126862f);
        this.f126862f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(int i17) {
        d();
        int i18 = this.f126862f;
        int[] iArr = this.f126861e;
        if (i18 == iArr.length) {
            int[] iArr2 = new int[((i18 * 3) / 2) + 1];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i18);
            this.f126861e = iArr2;
        }
        int[] iArr3 = this.f126861e;
        int i19 = this.f126862f;
        this.f126862f = i19 + 1;
        iArr3[i19] = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.m6)) {
            return super.equals(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) obj;
        if (this.f126862f != m6Var.f126862f) {
            return false;
        }
        int[] iArr = m6Var.f126861e;
        for (int i17 = 0; i17 < this.f126862f; i17++) {
            if (this.f126861e[i17] != iArr[i17]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f126862f) {
            throw new java.lang.IndexOutOfBoundsException(j(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return java.lang.Integer.valueOf(h(i17));
    }

    public int h(int i17) {
        g(i17);
        return this.f126861e[i17];
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i17 = 1;
        for (int i18 = 0; i18 < this.f126862f; i18++) {
            i17 = (i17 * 31) + this.f126861e[i18];
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Integer)) {
            return -1;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        int i17 = this.f126862f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f126861e[i18] == intValue) {
                return i18;
            }
        }
        return -1;
    }

    public final java.lang.String j(int i17) {
        int i18 = this.f126862f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(35);
        sb6.append("Index:");
        sb6.append(i17);
        sb6.append(", Size:");
        sb6.append(i18);
        return sb6.toString();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v6
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.t6 F(int i17) {
        if (i17 >= this.f126862f) {
            return new com.p176xb6135e39.p283xc50a8b8b.m6(java.util.Arrays.copyOf(this.f126861e, i17), this.f126862f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public int l(int i17, int i18) {
        d();
        g(i17);
        int[] iArr = this.f126861e;
        int i19 = iArr[i17];
        iArr[i17] = i18;
        return i19;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f126862f; i17++) {
            if (obj.equals(java.lang.Integer.valueOf(this.f126861e[i17]))) {
                int[] iArr = this.f126861e;
                java.lang.System.arraycopy(iArr, i17 + 1, iArr, i17, (this.f126862f - i17) - 1);
                this.f126862f--;
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
        int[] iArr = this.f126861e;
        java.lang.System.arraycopy(iArr, i18, iArr, i17, this.f126862f - i18);
        this.f126862f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        return java.lang.Integer.valueOf(l(i17, ((java.lang.Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126862f;
    }

    public m6(int[] iArr, int i17) {
        this.f126861e = iArr;
        this.f126862f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        int[] iArr = this.f126861e;
        int i18 = iArr[i17];
        if (i17 < this.f126862f - 1) {
            java.lang.System.arraycopy(iArr, i17 + 1, iArr, i17, (r2 - i17) - 1);
        }
        this.f126862f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Integer.valueOf(i18);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Integer) obj).intValue());
        return true;
    }
}
