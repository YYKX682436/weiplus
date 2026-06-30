package x;

/* loaded from: classes15.dex */
public final class l implements java.util.Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.m f532369d;

    public l(x.m mVar) {
        this.f532369d = mVar;
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.f532369d.a();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f532369d.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f532369d.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new x.h(this.f532369d, 1);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        x.m mVar = this.f532369d;
        int f17 = mVar.f(obj);
        if (f17 < 0) {
            return false;
        }
        mVar.h(f17);
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        x.m mVar = this.f532369d;
        int d17 = mVar.d();
        int i17 = 0;
        boolean z17 = false;
        while (i17 < d17) {
            if (collection.contains(mVar.b(i17, 1))) {
                mVar.h(i17);
                i17--;
                d17--;
                z17 = true;
            }
            i17++;
        }
        return z17;
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        x.m mVar = this.f532369d;
        int d17 = mVar.d();
        int i17 = 0;
        boolean z17 = false;
        while (i17 < d17) {
            if (!collection.contains(mVar.b(i17, 1))) {
                mVar.h(i17);
                i17--;
                d17--;
                z17 = true;
            }
            i17++;
        }
        return z17;
    }

    @Override // java.util.Collection
    public int size() {
        return this.f532369d.d();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f532369d.l(objArr, 1);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        x.m mVar = this.f532369d;
        int d17 = mVar.d();
        java.lang.Object[] objArr = new java.lang.Object[d17];
        for (int i17 = 0; i17 < d17; i17++) {
            objArr[i17] = mVar.b(i17, 1);
        }
        return objArr;
    }
}
