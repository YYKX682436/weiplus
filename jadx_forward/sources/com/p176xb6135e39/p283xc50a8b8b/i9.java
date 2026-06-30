package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class i9 extends com.p176xb6135e39.p283xc50a8b8b.h implements java.util.RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.i9 f126731g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f126732e;

    /* renamed from: f, reason: collision with root package name */
    public int f126733f;

    static {
        com.p176xb6135e39.p283xc50a8b8b.i9 i9Var = new com.p176xb6135e39.p283xc50a8b8b.i9(new java.lang.Object[0], 0);
        f126731g = i9Var;
        i9Var.f126678d = false;
    }

    public i9(java.lang.Object[] objArr, int i17) {
        this.f126732e = objArr;
        this.f126733f = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v6
    public com.p176xb6135e39.p283xc50a8b8b.v6 F(int i17) {
        if (i17 >= this.f126733f) {
            return new com.p176xb6135e39.p283xc50a8b8b.i9(java.util.Arrays.copyOf(this.f126732e, i17), this.f126733f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        d();
        int i17 = this.f126733f;
        java.lang.Object[] objArr = this.f126732e;
        if (i17 == objArr.length) {
            this.f126732e = java.util.Arrays.copyOf(objArr, ((i17 * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.f126732e;
        int i18 = this.f126733f;
        this.f126733f = i18 + 1;
        objArr2[i18] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i17) {
        if (i17 < 0 || i17 >= this.f126733f) {
            throw new java.lang.IndexOutOfBoundsException(g(i17));
        }
    }

    public final java.lang.String g(int i17) {
        int i18 = this.f126733f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(35);
        sb6.append("Index:");
        sb6.append(i17);
        sb6.append(", Size:");
        sb6.append(i18);
        return sb6.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        e(i17);
        return this.f126732e[i17];
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        e(i17);
        java.lang.Object[] objArr = this.f126732e;
        java.lang.Object obj = objArr[i17];
        if (i17 < this.f126733f - 1) {
            java.lang.System.arraycopy(objArr, i17 + 1, objArr, i17, (r2 - i17) - 1);
        }
        this.f126733f--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        d();
        e(i17);
        java.lang.Object[] objArr = this.f126732e;
        java.lang.Object obj2 = objArr[i17];
        objArr[i17] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126733f;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f126733f)) {
            java.lang.Object[] objArr = this.f126732e;
            if (i18 < objArr.length) {
                java.lang.System.arraycopy(objArr, i17, objArr, i17 + 1, i18 - i17);
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i17);
                java.lang.System.arraycopy(this.f126732e, i17, objArr2, i17 + 1, this.f126733f - i17);
                this.f126732e = objArr2;
            }
            this.f126732e[i17] = obj;
            this.f126733f++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(g(i17));
    }
}
