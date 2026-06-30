package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class l7 extends com.p176xb6135e39.p283xc50a8b8b.h implements com.p176xb6135e39.p283xc50a8b8b.u6, java.util.RandomAccess, com.p176xb6135e39.p283xc50a8b8b.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.l7 f126832g;

    /* renamed from: e, reason: collision with root package name */
    public long[] f126833e;

    /* renamed from: f, reason: collision with root package name */
    public int f126834f;

    static {
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = new com.p176xb6135e39.p283xc50a8b8b.l7(new long[0], 0);
        f126832g = l7Var;
        l7Var.f126678d = false;
    }

    public l7() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        long longValue = ((java.lang.Long) obj).longValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f126834f)) {
            long[] jArr = this.f126833e;
            if (i18 < jArr.length) {
                java.lang.System.arraycopy(jArr, i17, jArr, i17 + 1, i18 - i17);
            } else {
                long[] jArr2 = new long[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(jArr, 0, jArr2, 0, i17);
                java.lang.System.arraycopy(this.f126833e, i17, jArr2, i17 + 1, this.f126834f - i17);
                this.f126833e = jArr2;
            }
            this.f126833e[i17] = longValue;
            this.f126834f++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(h(i17));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        d();
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        collection.getClass();
        if (!(collection instanceof com.p176xb6135e39.p283xc50a8b8b.l7)) {
            return super.addAll(collection);
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) collection;
        int i17 = l7Var.f126834f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f126834f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        long[] jArr = this.f126833e;
        if (i19 > jArr.length) {
            this.f126833e = java.util.Arrays.copyOf(jArr, i19);
        }
        java.lang.System.arraycopy(l7Var.f126833e, 0, this.f126833e, this.f126834f, l7Var.f126834f);
        this.f126834f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(long j17) {
        d();
        int i17 = this.f126834f;
        long[] jArr = this.f126833e;
        if (i17 == jArr.length) {
            long[] jArr2 = new long[((i17 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i17);
            this.f126833e = jArr2;
        }
        long[] jArr3 = this.f126833e;
        int i18 = this.f126834f;
        this.f126834f = i18 + 1;
        jArr3[i18] = j17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.l7)) {
            return super.equals(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) obj;
        if (this.f126834f != l7Var.f126834f) {
            return false;
        }
        long[] jArr = l7Var.f126833e;
        for (int i17 = 0; i17 < this.f126834f; i17++) {
            if (this.f126833e[i17] != jArr[i17]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f126834f) {
            throw new java.lang.IndexOutOfBoundsException(h(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        g(i17);
        return java.lang.Long.valueOf(this.f126833e[i17]);
    }

    public final java.lang.String h(int i17) {
        int i18 = this.f126834f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(35);
        sb6.append("Index:");
        sb6.append(i17);
        sb6.append(", Size:");
        sb6.append(i18);
        return sb6.toString();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i17 = 1;
        for (int i18 = 0; i18 < this.f126834f; i18++) {
            i17 = (i17 * 31) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f126833e[i18]);
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        int i17 = this.f126834f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f126833e[i18] == longValue) {
                return i18;
            }
        }
        return -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.u6 F(int i17) {
        if (i17 >= this.f126834f) {
            return new com.p176xb6135e39.p283xc50a8b8b.l7(java.util.Arrays.copyOf(this.f126833e, i17), this.f126834f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f126834f; i17++) {
            if (obj.equals(java.lang.Long.valueOf(this.f126833e[i17]))) {
                long[] jArr = this.f126833e;
                java.lang.System.arraycopy(jArr, i17 + 1, jArr, i17, (this.f126834f - i17) - 1);
                this.f126834f--;
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
        long[] jArr = this.f126833e;
        java.lang.System.arraycopy(jArr, i18, jArr, i17, this.f126834f - i18);
        this.f126834f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        long longValue = ((java.lang.Long) obj).longValue();
        d();
        g(i17);
        long[] jArr = this.f126833e;
        long j17 = jArr[i17];
        jArr[i17] = longValue;
        return java.lang.Long.valueOf(j17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126834f;
    }

    public l7(long[] jArr, int i17) {
        this.f126833e = jArr;
        this.f126834f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        long[] jArr = this.f126833e;
        long j17 = jArr[i17];
        if (i17 < this.f126834f - 1) {
            java.lang.System.arraycopy(jArr, i17 + 1, jArr, i17, (r3 - i17) - 1);
        }
        this.f126834f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Long.valueOf(j17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Long) obj).longValue());
        return true;
    }
}
