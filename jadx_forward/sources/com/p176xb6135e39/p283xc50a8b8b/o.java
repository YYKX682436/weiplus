package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class o extends com.p176xb6135e39.p283xc50a8b8b.h implements com.p176xb6135e39.p283xc50a8b8b.n6, java.util.RandomAccess, com.p176xb6135e39.p283xc50a8b8b.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.o f126874g;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f126875e;

    /* renamed from: f, reason: collision with root package name */
    public int f126876f;

    static {
        com.p176xb6135e39.p283xc50a8b8b.o oVar = new com.p176xb6135e39.p283xc50a8b8b.o(new boolean[0], 0);
        f126874g = oVar;
        oVar.f126678d = false;
    }

    public o() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f126876f)) {
            boolean[] zArr = this.f126875e;
            if (i18 < zArr.length) {
                java.lang.System.arraycopy(zArr, i17, zArr, i17 + 1, i18 - i17);
            } else {
                boolean[] zArr2 = new boolean[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(zArr, 0, zArr2, 0, i17);
                java.lang.System.arraycopy(this.f126875e, i17, zArr2, i17 + 1, this.f126876f - i17);
                this.f126875e = zArr2;
            }
            this.f126875e[i17] = booleanValue;
            this.f126876f++;
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
        if (!(collection instanceof com.p176xb6135e39.p283xc50a8b8b.o)) {
            return super.addAll(collection);
        }
        com.p176xb6135e39.p283xc50a8b8b.o oVar = (com.p176xb6135e39.p283xc50a8b8b.o) collection;
        int i17 = oVar.f126876f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f126876f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        boolean[] zArr = this.f126875e;
        if (i19 > zArr.length) {
            this.f126875e = java.util.Arrays.copyOf(zArr, i19);
        }
        java.lang.System.arraycopy(oVar.f126875e, 0, this.f126875e, this.f126876f, oVar.f126876f);
        this.f126876f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(boolean z17) {
        d();
        int i17 = this.f126876f;
        boolean[] zArr = this.f126875e;
        if (i17 == zArr.length) {
            boolean[] zArr2 = new boolean[((i17 * 3) / 2) + 1];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i17);
            this.f126875e = zArr2;
        }
        boolean[] zArr3 = this.f126875e;
        int i18 = this.f126876f;
        this.f126876f = i18 + 1;
        zArr3[i18] = z17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.o)) {
            return super.equals(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.o oVar = (com.p176xb6135e39.p283xc50a8b8b.o) obj;
        if (this.f126876f != oVar.f126876f) {
            return false;
        }
        boolean[] zArr = oVar.f126875e;
        for (int i17 = 0; i17 < this.f126876f; i17++) {
            if (this.f126875e[i17] != zArr[i17]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f126876f) {
            throw new java.lang.IndexOutOfBoundsException(h(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        g(i17);
        return java.lang.Boolean.valueOf(this.f126875e[i17]);
    }

    public final java.lang.String h(int i17) {
        int i18 = this.f126876f;
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
        for (int i18 = 0; i18 < this.f126876f; i18++) {
            i17 = (i17 * 31) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126875e[i18]);
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Boolean)) {
            return -1;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int i17 = this.f126876f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f126875e[i18] == booleanValue) {
                return i18;
            }
        }
        return -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.n6 F(int i17) {
        if (i17 >= this.f126876f) {
            return new com.p176xb6135e39.p283xc50a8b8b.o(java.util.Arrays.copyOf(this.f126875e, i17), this.f126876f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f126876f; i17++) {
            if (obj.equals(java.lang.Boolean.valueOf(this.f126875e[i17]))) {
                boolean[] zArr = this.f126875e;
                java.lang.System.arraycopy(zArr, i17 + 1, zArr, i17, (this.f126876f - i17) - 1);
                this.f126876f--;
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
        boolean[] zArr = this.f126875e;
        java.lang.System.arraycopy(zArr, i18, zArr, i17, this.f126876f - i18);
        this.f126876f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        d();
        g(i17);
        boolean[] zArr = this.f126875e;
        boolean z17 = zArr[i17];
        zArr[i17] = booleanValue;
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126876f;
    }

    public o(boolean[] zArr, int i17) {
        this.f126875e = zArr;
        this.f126876f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        boolean[] zArr = this.f126875e;
        boolean z17 = zArr[i17];
        if (i17 < this.f126876f - 1) {
            java.lang.System.arraycopy(zArr, i17 + 1, zArr, i17, (r2 - i17) - 1);
        }
        this.f126876f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Boolean) obj).booleanValue());
        return true;
    }
}
