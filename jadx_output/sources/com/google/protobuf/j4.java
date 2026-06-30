package com.google.protobuf;

/* loaded from: classes16.dex */
public final class j4 extends com.google.protobuf.h implements com.google.protobuf.o6, java.util.RandomAccess, com.google.protobuf.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.j4 f45232g;

    /* renamed from: e, reason: collision with root package name */
    public double[] f45233e;

    /* renamed from: f, reason: collision with root package name */
    public int f45234f;

    static {
        com.google.protobuf.j4 j4Var = new com.google.protobuf.j4(new double[0], 0);
        f45232g = j4Var;
        j4Var.f45145d = false;
    }

    public j4() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f45234f)) {
            double[] dArr = this.f45233e;
            if (i18 < dArr.length) {
                java.lang.System.arraycopy(dArr, i17, dArr, i17 + 1, i18 - i17);
            } else {
                double[] dArr2 = new double[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(dArr, 0, dArr2, 0, i17);
                java.lang.System.arraycopy(this.f45233e, i17, dArr2, i17 + 1, this.f45234f - i17);
                this.f45233e = dArr2;
            }
            this.f45233e[i17] = doubleValue;
            this.f45234f++;
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
        if (!(collection instanceof com.google.protobuf.j4)) {
            return super.addAll(collection);
        }
        com.google.protobuf.j4 j4Var = (com.google.protobuf.j4) collection;
        int i17 = j4Var.f45234f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f45234f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        double[] dArr = this.f45233e;
        if (i19 > dArr.length) {
            this.f45233e = java.util.Arrays.copyOf(dArr, i19);
        }
        java.lang.System.arraycopy(j4Var.f45233e, 0, this.f45233e, this.f45234f, j4Var.f45234f);
        this.f45234f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(double d17) {
        d();
        int i17 = this.f45234f;
        double[] dArr = this.f45233e;
        if (i17 == dArr.length) {
            double[] dArr2 = new double[((i17 * 3) / 2) + 1];
            java.lang.System.arraycopy(dArr, 0, dArr2, 0, i17);
            this.f45233e = dArr2;
        }
        double[] dArr3 = this.f45233e;
        int i18 = this.f45234f;
        this.f45234f = i18 + 1;
        dArr3[i18] = d17;
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.j4)) {
            return super.equals(obj);
        }
        com.google.protobuf.j4 j4Var = (com.google.protobuf.j4) obj;
        if (this.f45234f != j4Var.f45234f) {
            return false;
        }
        double[] dArr = j4Var.f45233e;
        for (int i17 = 0; i17 < this.f45234f; i17++) {
            if (java.lang.Double.doubleToLongBits(this.f45233e[i17]) != java.lang.Double.doubleToLongBits(dArr[i17])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f45234f) {
            throw new java.lang.IndexOutOfBoundsException(h(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        g(i17);
        return java.lang.Double.valueOf(this.f45233e[i17]);
    }

    public final java.lang.String h(int i17) {
        int i18 = this.f45234f;
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
        for (int i18 = 0; i18 < this.f45234f; i18++) {
            i17 = (i17 * 31) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(this.f45233e[i18]));
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Double)) {
            return -1;
        }
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        int i17 = this.f45234f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f45233e[i18] == doubleValue) {
                return i18;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.v6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o6 F(int i17) {
        if (i17 >= this.f45234f) {
            return new com.google.protobuf.j4(java.util.Arrays.copyOf(this.f45233e, i17), this.f45234f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f45234f; i17++) {
            if (obj.equals(java.lang.Double.valueOf(this.f45233e[i17]))) {
                double[] dArr = this.f45233e;
                java.lang.System.arraycopy(dArr, i17 + 1, dArr, i17, (this.f45234f - i17) - 1);
                this.f45234f--;
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
        double[] dArr = this.f45233e;
        java.lang.System.arraycopy(dArr, i18, dArr, i17, this.f45234f - i18);
        this.f45234f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        d();
        g(i17);
        double[] dArr = this.f45233e;
        double d17 = dArr[i17];
        dArr[i17] = doubleValue;
        return java.lang.Double.valueOf(d17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45234f;
    }

    public j4(double[] dArr, int i17) {
        this.f45233e = dArr;
        this.f45234f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        double[] dArr = this.f45233e;
        double d17 = dArr[i17];
        if (i17 < this.f45234f - 1) {
            java.lang.System.arraycopy(dArr, i17 + 1, dArr, i17, (r3 - i17) - 1);
        }
        this.f45234f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Double.valueOf(d17);
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Double) obj).doubleValue());
        return true;
    }
}
