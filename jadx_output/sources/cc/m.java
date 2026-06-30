package cc;

/* loaded from: classes14.dex */
public class m extends java.util.AbstractCollection {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f40388d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Collection f40389e;

    /* renamed from: f, reason: collision with root package name */
    public final cc.m f40390f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Collection f40391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc.r f40392h;

    public m(cc.r rVar, java.lang.Object obj, java.util.Collection collection, cc.m mVar) {
        this.f40392h = rVar;
        this.f40388d = obj;
        this.f40389e = collection;
        this.f40390f = mVar;
        this.f40391g = mVar == null ? null : mVar.f40389e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object obj) {
        e();
        boolean isEmpty = this.f40389e.isEmpty();
        boolean add = this.f40389e.add(obj);
        if (add) {
            this.f40392h.f40398h++;
            if (isEmpty) {
                d();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f40389e.addAll(collection);
        if (addAll) {
            this.f40392h.f40398h += this.f40389e.size() - size;
            if (size == 0) {
                d();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f40389e.clear();
        this.f40392h.f40398h -= size;
        g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        e();
        return this.f40389e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        e();
        return this.f40389e.containsAll(collection);
    }

    public final void d() {
        cc.m mVar = this.f40390f;
        if (mVar != null) {
            mVar.d();
        } else {
            this.f40392h.f40397g.put(this.f40388d, this.f40389e);
        }
    }

    public final void e() {
        java.util.Collection collection;
        cc.m mVar = this.f40390f;
        if (mVar != null) {
            mVar.e();
            if (mVar.f40389e != this.f40391g) {
                throw new java.util.ConcurrentModificationException();
            }
        } else {
            if (!this.f40389e.isEmpty() || (collection = (java.util.Collection) this.f40392h.f40397g.get(this.f40388d)) == null) {
                return;
            }
            this.f40389e = collection;
        }
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        e();
        return this.f40389e.equals(obj);
    }

    public final void g() {
        cc.m mVar = this.f40390f;
        if (mVar != null) {
            mVar.g();
        } else if (this.f40389e.isEmpty()) {
            this.f40392h.f40397g.remove(this.f40388d);
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        e();
        return this.f40389e.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        e();
        return new cc.l(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        e();
        boolean remove = this.f40389e.remove(obj);
        if (remove) {
            cc.r rVar = this.f40392h;
            rVar.f40398h--;
            g();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f40389e.removeAll(collection);
        if (removeAll) {
            this.f40392h.f40398h += this.f40389e.size() - size;
            g();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f40389e.retainAll(collection);
        if (retainAll) {
            this.f40392h.f40398h += this.f40389e.size() - size;
            g();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        e();
        return this.f40389e.size();
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        e();
        return this.f40389e.toString();
    }
}
