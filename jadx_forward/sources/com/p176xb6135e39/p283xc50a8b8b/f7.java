package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class f7 extends com.p176xb6135e39.p283xc50a8b8b.h implements com.p176xb6135e39.p283xc50a8b8b.g7, java.util.RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.g7 f126619f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f126620e;

    static {
        com.p176xb6135e39.p283xc50a8b8b.f7 f7Var = new com.p176xb6135e39.p283xc50a8b8b.f7();
        f7Var.f126678d = false;
        f126619f = f7Var;
    }

    public f7() {
        this(10);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.v6
    public com.p176xb6135e39.p283xc50a8b8b.v6 F(int i17) {
        if (i17 < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        arrayList.addAll(this.f126620e);
        return new com.p176xb6135e39.p283xc50a8b8b.f7(arrayList);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public java.lang.Object J(int i17) {
        return this.f126620e.get(i17);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        d();
        this.f126620e.add(i17, (java.lang.String) obj);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public com.p176xb6135e39.p283xc50a8b8b.g7 b() {
        return this.f126678d ? new com.p176xb6135e39.p283xc50a8b8b.cb(this) : this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public java.util.List c() {
        return java.util.Collections.unmodifiableList(this.f126620e);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        this.f126620e.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public com.p176xb6135e39.p283xc50a8b8b.y f(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.y g17;
        java.util.List list = this.f126620e;
        java.lang.Object obj = list.get(i17);
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
            g17 = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        } else if (obj instanceof java.lang.String) {
            g17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            com.p176xb6135e39.p283xc50a8b8b.y yVar = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
            g17 = com.p176xb6135e39.p283xc50a8b8b.y.g(bArr, 0, bArr.length);
        }
        if (g17 != obj) {
            list.set(i17, g17);
        }
        return g17;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        java.lang.String str;
        java.util.List list = this.f126620e;
        java.lang.Object obj = list.get(i17);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
            com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
            str = yVar.r();
            if (yVar.l()) {
                list.set(i17, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new java.lang.String(bArr, com.p176xb6135e39.p283xc50a8b8b.w6.f127181a);
            com.p176xb6135e39.p283xc50a8b8b.kb kbVar = com.p176xb6135e39.p283xc50a8b8b.ob.f126904a;
            if (com.p176xb6135e39.p283xc50a8b8b.ob.f126904a.e(0, bArr, 0, bArr.length) == 0) {
                list.set(i17, str);
            }
        }
        return str;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g7
    public void q(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        d();
        this.f126620e.add(yVar);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        d();
        java.lang.Object remove = this.f126620e.remove(i17);
        ((java.util.AbstractList) this).modCount++;
        return remove instanceof java.lang.String ? (java.lang.String) remove : remove instanceof com.p176xb6135e39.p283xc50a8b8b.y ? ((com.p176xb6135e39.p283xc50a8b8b.y) remove).r() : new java.lang.String((byte[]) remove, com.p176xb6135e39.p283xc50a8b8b.w6.f127181a);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        d();
        java.lang.Object obj2 = this.f126620e.set(i17, (java.lang.String) obj);
        return obj2 instanceof java.lang.String ? (java.lang.String) obj2 : obj2 instanceof com.p176xb6135e39.p283xc50a8b8b.y ? ((com.p176xb6135e39.p283xc50a8b8b.y) obj2).r() : new java.lang.String((byte[]) obj2, com.p176xb6135e39.p283xc50a8b8b.w6.f127181a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f126620e.size();
    }

    public f7(int i17) {
        this(new java.util.ArrayList(i17));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.h, java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        d();
        if (collection instanceof com.p176xb6135e39.p283xc50a8b8b.g7) {
            collection = ((com.p176xb6135e39.p283xc50a8b8b.g7) collection).c();
        }
        boolean addAll = this.f126620e.addAll(i17, collection);
        ((java.util.AbstractList) this).modCount++;
        return addAll;
    }

    public f7(com.p176xb6135e39.p283xc50a8b8b.g7 g7Var) {
        this.f126620e = new java.util.ArrayList(g7Var.size());
        addAll(g7Var);
    }

    public f7(java.util.ArrayList arrayList) {
        this.f126620e = arrayList;
    }
}
