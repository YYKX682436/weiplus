package com.google.protobuf;

/* loaded from: classes16.dex */
public class f7 extends com.google.protobuf.h implements com.google.protobuf.g7, java.util.RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.protobuf.g7 f45086f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f45087e;

    static {
        com.google.protobuf.f7 f7Var = new com.google.protobuf.f7();
        f7Var.f45145d = false;
        f45086f = f7Var;
    }

    public f7() {
        this(10);
    }

    @Override // com.google.protobuf.v6
    public com.google.protobuf.v6 F(int i17) {
        if (i17 < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        arrayList.addAll(this.f45087e);
        return new com.google.protobuf.f7(arrayList);
    }

    @Override // com.google.protobuf.g7
    public java.lang.Object J(int i17) {
        return this.f45087e.get(i17);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        d();
        this.f45087e.add(i17, (java.lang.String) obj);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.g7
    public com.google.protobuf.g7 b() {
        return this.f45145d ? new com.google.protobuf.cb(this) : this;
    }

    @Override // com.google.protobuf.g7
    public java.util.List c() {
        return java.util.Collections.unmodifiableList(this.f45087e);
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.f45087e.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.g7
    public com.google.protobuf.y f(int i17) {
        com.google.protobuf.y g17;
        java.util.List list = this.f45087e;
        java.lang.Object obj = list.get(i17);
        if (obj instanceof com.google.protobuf.y) {
            g17 = (com.google.protobuf.y) obj;
        } else if (obj instanceof java.lang.String) {
            g17 = com.google.protobuf.y.h((java.lang.String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            com.google.protobuf.y yVar = com.google.protobuf.y.f45712e;
            g17 = com.google.protobuf.y.g(bArr, 0, bArr.length);
        }
        if (g17 != obj) {
            list.set(i17, g17);
        }
        return g17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        java.lang.String str;
        java.util.List list = this.f45087e;
        java.lang.Object obj = list.get(i17);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.protobuf.y) {
            com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
            str = yVar.r();
            if (yVar.l()) {
                list.set(i17, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new java.lang.String(bArr, com.google.protobuf.w6.f45648a);
            com.google.protobuf.kb kbVar = com.google.protobuf.ob.f45371a;
            if (com.google.protobuf.ob.f45371a.e(0, bArr, 0, bArr.length) == 0) {
                list.set(i17, str);
            }
        }
        return str;
    }

    @Override // com.google.protobuf.g7
    public void q(com.google.protobuf.y yVar) {
        d();
        this.f45087e.add(yVar);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        java.lang.Object remove = this.f45087e.remove(i17);
        ((java.util.AbstractList) this).modCount++;
        return remove instanceof java.lang.String ? (java.lang.String) remove : remove instanceof com.google.protobuf.y ? ((com.google.protobuf.y) remove).r() : new java.lang.String((byte[]) remove, com.google.protobuf.w6.f45648a);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        d();
        java.lang.Object obj2 = this.f45087e.set(i17, (java.lang.String) obj);
        return obj2 instanceof java.lang.String ? (java.lang.String) obj2 : obj2 instanceof com.google.protobuf.y ? ((com.google.protobuf.y) obj2).r() : new java.lang.String((byte[]) obj2, com.google.protobuf.w6.f45648a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45087e.size();
    }

    public f7(int i17) {
        this(new java.util.ArrayList(i17));
    }

    @Override // com.google.protobuf.h, java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        d();
        if (collection instanceof com.google.protobuf.g7) {
            collection = ((com.google.protobuf.g7) collection).c();
        }
        boolean addAll = this.f45087e.addAll(i17, collection);
        ((java.util.AbstractList) this).modCount++;
        return addAll;
    }

    public f7(com.google.protobuf.g7 g7Var) {
        this.f45087e = new java.util.ArrayList(g7Var.size());
        addAll(g7Var);
    }

    public f7(java.util.ArrayList arrayList) {
        this.f45087e = arrayList;
    }
}
