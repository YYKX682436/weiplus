package x;

/* loaded from: classes14.dex */
public final class i implements java.util.Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.m f532363d;

    public i(x.m mVar) {
        this.f532363d = mVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        x.m mVar = this.f532363d;
        int d17 = mVar.d();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            mVar.g(entry.getKey(), entry.getValue());
        }
        return d17 != mVar.d();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f532363d.a();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        x.m mVar = this.f532363d;
        int e17 = mVar.e(key);
        if (e17 < 0) {
            return false;
        }
        java.lang.Object b17 = mVar.b(e17, 1);
        java.lang.Object value = entry.getValue();
        return b17 == value || (b17 != null && b17.equals(value));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
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
        x.m mVar = this.f532363d;
        int i17 = 0;
        for (int d17 = mVar.d() - 1; d17 >= 0; d17--) {
            java.lang.Object b17 = mVar.b(d17, 0);
            java.lang.Object b18 = mVar.b(d17, 1);
            i17 += (b17 == null ? 0 : b17.hashCode()) ^ (b18 == null ? 0 : b18.hashCode());
        }
        return i17;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f532363d.d() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new x.k(this.f532363d);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f532363d.d();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
