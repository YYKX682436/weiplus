package com.google.protobuf;

/* loaded from: classes16.dex */
public final class e5 extends com.google.protobuf.h implements com.google.protobuf.s6, java.util.RandomAccess, com.google.protobuf.f9 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.e5 f45058g;

    /* renamed from: e, reason: collision with root package name */
    public float[] f45059e;

    /* renamed from: f, reason: collision with root package name */
    public int f45060f;

    static {
        com.google.protobuf.e5 e5Var = new com.google.protobuf.e5(new float[0], 0);
        f45058g = e5Var;
        e5Var.f45145d = false;
    }

    public e5() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        float floatValue = ((java.lang.Float) obj).floatValue();
        d();
        if (i17 >= 0 && i17 <= (i18 = this.f45060f)) {
            float[] fArr = this.f45059e;
            if (i18 < fArr.length) {
                java.lang.System.arraycopy(fArr, i17, fArr, i17 + 1, i18 - i17);
            } else {
                float[] fArr2 = new float[((i18 * 3) / 2) + 1];
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, i17);
                java.lang.System.arraycopy(this.f45059e, i17, fArr2, i17 + 1, this.f45060f - i17);
                this.f45059e = fArr2;
            }
            this.f45059e[i17] = floatValue;
            this.f45060f++;
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
        if (!(collection instanceof com.google.protobuf.e5)) {
            return super.addAll(collection);
        }
        com.google.protobuf.e5 e5Var = (com.google.protobuf.e5) collection;
        int i17 = e5Var.f45060f;
        if (i17 == 0) {
            return false;
        }
        int i18 = this.f45060f;
        if (Integer.MAX_VALUE - i18 < i17) {
            throw new java.lang.OutOfMemoryError();
        }
        int i19 = i18 + i17;
        float[] fArr = this.f45059e;
        if (i19 > fArr.length) {
            this.f45059e = java.util.Arrays.copyOf(fArr, i19);
        }
        java.lang.System.arraycopy(e5Var.f45059e, 0, this.f45059e, this.f45060f, e5Var.f45060f);
        this.f45060f = i19;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public void e(float f17) {
        d();
        int i17 = this.f45060f;
        float[] fArr = this.f45059e;
        if (i17 == fArr.length) {
            float[] fArr2 = new float[((i17 * 3) / 2) + 1];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, i17);
            this.f45059e = fArr2;
        }
        float[] fArr3 = this.f45059e;
        int i18 = this.f45060f;
        this.f45060f = i18 + 1;
        fArr3[i18] = f17;
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.e5)) {
            return super.equals(obj);
        }
        com.google.protobuf.e5 e5Var = (com.google.protobuf.e5) obj;
        if (this.f45060f != e5Var.f45060f) {
            return false;
        }
        float[] fArr = e5Var.f45059e;
        for (int i17 = 0; i17 < this.f45060f; i17++) {
            if (java.lang.Float.floatToIntBits(this.f45059e[i17]) != java.lang.Float.floatToIntBits(fArr[i17])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i17) {
        if (i17 < 0 || i17 >= this.f45060f) {
            throw new java.lang.IndexOutOfBoundsException(h(i17));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        g(i17);
        return java.lang.Float.valueOf(this.f45059e[i17]);
    }

    public final java.lang.String h(int i17) {
        int i18 = this.f45060f;
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
        for (int i18 = 0; i18 < this.f45060f; i18++) {
            i17 = (i17 * 31) + java.lang.Float.floatToIntBits(this.f45059e[i18]);
        }
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float floatValue = ((java.lang.Float) obj).floatValue();
        int i17 = this.f45060f;
        for (int i18 = 0; i18 < i17; i18++) {
            if (this.f45059e[i18] == floatValue) {
                return i18;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.v6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.s6 F(int i17) {
        if (i17 >= this.f45060f) {
            return new com.google.protobuf.e5(java.util.Arrays.copyOf(this.f45059e, i17), this.f45060f);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        d();
        for (int i17 = 0; i17 < this.f45060f; i17++) {
            if (obj.equals(java.lang.Float.valueOf(this.f45059e[i17]))) {
                float[] fArr = this.f45059e;
                java.lang.System.arraycopy(fArr, i17 + 1, fArr, i17, (this.f45060f - i17) - 1);
                this.f45060f--;
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
        float[] fArr = this.f45059e;
        java.lang.System.arraycopy(fArr, i18, fArr, i17, this.f45060f - i18);
        this.f45060f -= i18 - i17;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        float floatValue = ((java.lang.Float) obj).floatValue();
        d();
        g(i17);
        float[] fArr = this.f45059e;
        float f17 = fArr[i17];
        fArr[i17] = floatValue;
        return java.lang.Float.valueOf(f17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45060f;
    }

    public e5(float[] fArr, int i17) {
        this.f45059e = fArr;
        this.f45060f = i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        g(i17);
        float[] fArr = this.f45059e;
        float f17 = fArr[i17];
        if (i17 < this.f45060f - 1) {
            java.lang.System.arraycopy(fArr, i17 + 1, fArr, i17, (r2 - i17) - 1);
        }
        this.f45060f--;
        ((java.util.AbstractList) this).modCount++;
        return java.lang.Float.valueOf(f17);
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        e(((java.lang.Float) obj).floatValue());
        return true;
    }
}
