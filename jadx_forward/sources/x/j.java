package x;

/* loaded from: classes15.dex */
public final class j implements java.util.Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.m f532364d;

    public j(x.m mVar) {
        this.f532364d = mVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f532364d.a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f532364d.e(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Map c17 = this.f532364d.c();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c17.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return x.m.j(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        x.m mVar = this.f532364d;
        int i17 = 0;
        for (int d17 = mVar.d() - 1; d17 >= 0; d17--) {
            java.lang.Object b17 = mVar.b(d17, 0);
            i17 += b17 == null ? 0 : b17.hashCode();
        }
        return i17;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f532364d.d() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new x.h(this.f532364d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        x.m mVar = this.f532364d;
        int e17 = mVar.e(obj);
        if (e17 < 0) {
            return false;
        }
        mVar.h(e17);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        java.util.Map c17 = this.f532364d.c();
        int size = c17.size();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            c17.remove(it.next());
        }
        return size != c17.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        return x.m.k(this.f532364d.c(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f532364d.d();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f532364d.l(objArr, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        x.m mVar = this.f532364d;
        int d17 = mVar.d();
        java.lang.Object[] objArr = new java.lang.Object[d17];
        for (int i17 = 0; i17 < d17; i17++) {
            objArr[i17] = mVar.b(i17, 0);
        }
        return objArr;
    }
}
