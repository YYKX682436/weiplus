package com.google.protobuf;

/* loaded from: classes16.dex */
public final class l7 extends com.google.protobuf.h implements com.google.protobuf.u6, java.util.RandomAccess, com.google.protobuf.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.l7 f45299g;

    /* renamed from: e, reason: collision with root package name */
    public long[] f45300e;

    /* renamed from: f, reason: collision with root package name */
    public int f45301f;

    static {
        com.google.protobuf.l7 l7Var = new com.google.protobuf.l7(new long[0], 0);
        f45299g = l7Var;
        l7Var.f45145d = false;
    }

    public l7() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        long longValue = ((java.lang.Long) obj).longValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f45301f)) {
            long[] jArr = this.f45300e;
            if (i18 < jArr.length) {
                java.lang.System.arraycopy(jArr, i17, jArr, i17 + 1, i18 - i17);
            } else {
                long[] jArr2 = new long[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(jArr, 0, jArr2, 0, i17);
                java.lang.System.arraycopy(this.f45300e, i17, jArr2, i17 + 1, this.f45301f - i17);
                this.f45300e = jArr2;
            }
            this.f45300e[i17] = longValue;
            this.f45301f++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(h(i17));
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        d();
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        collection.getClass();
        if (!(collection instanceof com.google.protobuf.l7)) {
            return super.addAll(collection);
        }
        com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) collection;
        int i17 = l7Var.f45301f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f45301f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        long[] jArr = this.f45300e;
        if (i19 > jArr.length) {
            this.f45300e = java.util.Arrays.copyOf(jArr, i19);
        }
        java.lang.System.arraycopy(l7Var.f45300e, 0, this.f45300e, this.f45301f, l7Var.f45301f);
        this.f45301f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(long j17) {
        d();
        int i17 = this.f45301f;
        long[] jArr = this.f45300e;
        if (i17 == jArr.length) {
            long[] jArr2 = new long[((i17 * 3) / 2) + 1];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i17);
            this.f45300e = jArr2;
        }
        long[] jArr3 = this.f45300e;
        int i18 = this.f45301f;
        this.f45301f = i18 + 1;
        jArr3[i18] = j17;
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.l7)) {
            return super.equals(obj);
        }
        com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) obj;
        if (this.f45301f != l7Var.f45301f) {
            return false;
        }
        long[] jArr = l7Var.f45300e;
        for (int i17 = 0; i17 < this.f45301f; i17++) {
            if (this.f45300e[i17] != jArr[i17]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f45301f) {
            throw new java.lang.IndexOutOfBoundsException(h(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        g(i17);
        return java.lang.Long.valueOf(this.f45300e[i17]);
    }

    public final java.lang.String h(int i17) {
        int i18 = this.f45301f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(35);
        sb6.append("Index:");
        sb6.append(i17);
        sb6.append(", Size:");
        sb6.append(i18);
        return sb6.toString();
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i17 = 1;
        for (int i18 = 0; i18 < this.f45301f; i18++) {
            i17 = (i17 * 31) + com.google.protobuf.w6.b(this.f45300e[i18]);
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Long)) {
            return -1;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        int i17 = this.f45301f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f45300e[i18] == longValue) {
                return i18;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.v6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.u6 F(int i17) {
        if (i17 >= this.f45301f) {
            return new com.google.protobuf.l7(java.util.Arrays.copyOf(this.f45300e, i17), this.f45301f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f45301f; i17++) {
            if (obj.equals(java.lang.Long.valueOf(this.f45300e[i17]))) {
                long[] jArr = this.f45300e;
                java.lang.System.arraycopy(jArr, i17 + 1, jArr, i17, (this.f45301f - i17) - 1);
                this.f45301f--;
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
        long[] jArr = this.f45300e;
        java.lang.System.arraycopy(jArr, i18, jArr, i17, this.f45301f - i18);
        this.f45301f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        long longValue = ((java.lang.Long) obj).longValue();
        d();
        g(i17);
        long[] jArr = this.f45300e;
        long j17 = jArr[i17];
        jArr[i17] = longValue;
        return java.lang.Long.valueOf(j17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45301f;
    }

    public l7(long[] jArr, int i17) {
        this.f45300e = jArr;
        this.f45301f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        long[] jArr = this.f45300e;
        long j17 = jArr[i17];
        if (i17 < this.f45301f - 1) {
            java.lang.System.arraycopy(jArr, i17 + 1, jArr, i17, (r3 - i17) - 1);
        }
        this.f45301f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Long.valueOf(j17);
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Long) obj).longValue());
        return true;
    }
}
