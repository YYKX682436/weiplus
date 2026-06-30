package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class j4 extends com.p176xb6135e39.p283xc50a8b8b.h implements com.p176xb6135e39.p283xc50a8b8b.o6, java.util.RandomAccess, com.p176xb6135e39.p283xc50a8b8b.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.j4 f126765g;

    /* renamed from: e, reason: collision with root package name */
    public double[] f126766e;

    /* renamed from: f, reason: collision with root package name */
    public int f126767f;

    static {
        com.p176xb6135e39.p283xc50a8b8b.j4 j4Var = new com.p176xb6135e39.p283xc50a8b8b.j4(new double[0], 0);
        f126765g = j4Var;
        j4Var.f126678d = false;
    }

    public j4() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f126767f)) {
            double[] dArr = this.f126766e;
            if (i18 < dArr.length) {
                java.lang.System.arraycopy(dArr, i17, dArr, i17 + 1, i18 - i17);
            } else {
                double[] dArr2 = new double[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(dArr, 0, dArr2, 0, i17);
                java.lang.System.arraycopy(this.f126766e, i17, dArr2, i17 + 1, this.f126767f - i17);
                this.f126766e = dArr2;
            }
            this.f126766e[i17] = doubleValue;
            this.f126767f++;
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
        if (!(collection instanceof com.p176xb6135e39.p283xc50a8b8b.j4)) {
            return super.addAll(collection);
        }
        com.p176xb6135e39.p283xc50a8b8b.j4 j4Var = (com.p176xb6135e39.p283xc50a8b8b.j4) collection;
        int i17 = j4Var.f126767f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f126767f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        double[] dArr = this.f126766e;
        if (i19 > dArr.length) {
            this.f126766e = java.util.Arrays.copyOf(dArr, i19);
        }
        java.lang.System.arraycopy(j4Var.f126766e, 0, this.f126766e, this.f126767f, j4Var.f126767f);
        this.f126767f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(double d17) {
        d();
        int i17 = this.f126767f;
        double[] dArr = this.f126766e;
        if (i17 == dArr.length) {
            double[] dArr2 = new double[((i17 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i17);
            this.f126766e = dArr2;
        }
        double[] dArr3 = this.f126766e;
        int i18 = this.f126767f;
        this.f126767f = i18 + 1;
        dArr3[i18] = d17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.j4)) {
            return super.equals(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.j4 j4Var = (com.p176xb6135e39.p283xc50a8b8b.j4) obj;
        if (this.f126767f != j4Var.f126767f) {
            return false;
        }
        double[] dArr = j4Var.f126766e;
        for (int i17 = 0; i17 < this.f126767f; i17++) {
            if (java.lang.Double.doubleToLongBits(this.f126766e[i17]) != java.lang.Double.doubleToLongBits(dArr[i17])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f126767f) {
            throw new java.lang.IndexOutOfBoundsException(h(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        g(i17);
        return java.lang.Double.valueOf(this.f126766e[i17]);
    }

    public final java.lang.String h(int i17) {
        int i18 = this.f126767f;
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
        for (int i18 = 0; i18 < this.f126767f; i18++) {
            i17 = (i17 * 31) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(this.f126766e[i18]));
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        int i17 = this.f126767f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f126766e[i18] == doubleValue) {
                return i18;
            }
        }
        return -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o6 F(int i17) {
        if (i17 >= this.f126767f) {
            return new com.p176xb6135e39.p283xc50a8b8b.j4(java.util.Arrays.copyOf(this.f126766e, i17), this.f126767f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f126767f; i17++) {
            if (obj.equals(java.lang.Double.valueOf(this.f126766e[i17]))) {
                double[] dArr = this.f126766e;
                java.lang.System.arraycopy(dArr, i17 + 1, dArr, i17, (this.f126767f - i17) - 1);
                this.f126767f--;
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
        double[] dArr = this.f126766e;
        java.lang.System.arraycopy(dArr, i18, dArr, i17, this.f126767f - i18);
        this.f126767f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        d();
        g(i17);
        double[] dArr = this.f126766e;
        double d17 = dArr[i17];
        dArr[i17] = doubleValue;
        return java.lang.Double.valueOf(d17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126767f;
    }

    public j4(double[] dArr, int i17) {
        this.f126766e = dArr;
        this.f126767f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        double[] dArr = this.f126766e;
        double d17 = dArr[i17];
        if (i17 < this.f126767f - 1) {
            java.lang.System.arraycopy(dArr, i17 + 1, dArr, i17, (r3 - i17) - 1);
        }
        this.f126767f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Double.valueOf(d17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Double) obj).doubleValue());
        return true;
    }
}
