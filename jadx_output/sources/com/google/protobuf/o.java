package com.google.protobuf;

/* loaded from: classes16.dex */
public final class o extends com.google.protobuf.h implements com.google.protobuf.n6, java.util.RandomAccess, com.google.protobuf.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.o f45341g;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f45342e;

    /* renamed from: f, reason: collision with root package name */
    public int f45343f;

    static {
        com.google.protobuf.o oVar = new com.google.protobuf.o(new boolean[0], 0);
        f45341g = oVar;
        oVar.f45145d = false;
    }

    public o() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f45343f)) {
            boolean[] zArr = this.f45342e;
            if (i18 < zArr.length) {
                java.lang.System.arraycopy(zArr, i17, zArr, i17 + 1, i18 - i17);
            } else {
                boolean[] zArr2 = new boolean[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(zArr, 0, zArr2, 0, i17);
                java.lang.System.arraycopy(this.f45342e, i17, zArr2, i17 + 1, this.f45343f - i17);
                this.f45342e = zArr2;
            }
            this.f45342e[i17] = booleanValue;
            this.f45343f++;
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
        if (!(collection instanceof com.google.protobuf.o)) {
            return super.addAll(collection);
        }
        com.google.protobuf.o oVar = (com.google.protobuf.o) collection;
        int i17 = oVar.f45343f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f45343f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        boolean[] zArr = this.f45342e;
        if (i19 > zArr.length) {
            this.f45342e = java.util.Arrays.copyOf(zArr, i19);
        }
        java.lang.System.arraycopy(oVar.f45342e, 0, this.f45342e, this.f45343f, oVar.f45343f);
        this.f45343f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(boolean z17) {
        d();
        int i17 = this.f45343f;
        boolean[] zArr = this.f45342e;
        if (i17 == zArr.length) {
            boolean[] zArr2 = new boolean[((i17 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i17);
            this.f45342e = zArr2;
        }
        boolean[] zArr3 = this.f45342e;
        int i18 = this.f45343f;
        this.f45343f = i18 + 1;
        zArr3[i18] = z17;
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.o)) {
            return super.equals(obj);
        }
        com.google.protobuf.o oVar = (com.google.protobuf.o) obj;
        if (this.f45343f != oVar.f45343f) {
            return false;
        }
        boolean[] zArr = oVar.f45342e;
        for (int i17 = 0; i17 < this.f45343f; i17++) {
            if (this.f45342e[i17] != zArr[i17]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f45343f) {
            throw new java.lang.IndexOutOfBoundsException(h(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        g(i17);
        return java.lang.Boolean.valueOf(this.f45342e[i17]);
    }

    public final java.lang.String h(int i17) {
        int i18 = this.f45343f;
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
        for (int i18 = 0; i18 < this.f45343f; i18++) {
            i17 = (i17 * 31) + com.google.protobuf.w6.a(this.f45342e[i18]);
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i17 = this.f45343f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f45342e[i18] == booleanValue) {
                return i18;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.v6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.n6 F(int i17) {
        if (i17 >= this.f45343f) {
            return new com.google.protobuf.o(java.util.Arrays.copyOf(this.f45342e, i17), this.f45343f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f45343f; i17++) {
            if (obj.equals(java.lang.Boolean.valueOf(this.f45342e[i17]))) {
                boolean[] zArr = this.f45342e;
                java.lang.System.arraycopy(zArr, i17 + 1, zArr, i17, (this.f45343f - i17) - 1);
                this.f45343f--;
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
        boolean[] zArr = this.f45342e;
        java.lang.System.arraycopy(zArr, i18, zArr, i17, this.f45343f - i18);
        this.f45343f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        d();
        g(i17);
        boolean[] zArr = this.f45342e;
        boolean z17 = zArr[i17];
        zArr[i17] = booleanValue;
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45343f;
    }

    public o(boolean[] zArr, int i17) {
        this.f45342e = zArr;
        this.f45343f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        boolean[] zArr = this.f45342e;
        boolean z17 = zArr[i17];
        if (i17 < this.f45343f - 1) {
            java.lang.System.arraycopy(zArr, i17 + 1, zArr, i17, (r2 - i17) - 1);
        }
        this.f45343f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}
