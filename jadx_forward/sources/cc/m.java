package cc;

/* loaded from: classes14.dex */
public class m extends java.util.AbstractCollection {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f121921d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Collection f121922e;

    /* renamed from: f, reason: collision with root package name */
    public final cc.m f121923f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Collection f121924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc.r f121925h;

    public m(cc.r rVar, java.lang.Object obj, java.util.Collection collection, cc.m mVar) {
        this.f121925h = rVar;
        this.f121921d = obj;
        this.f121922e = collection;
        this.f121923f = mVar;
        this.f121924g = mVar == null ? null : mVar.f121922e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object obj) {
        e();
        boolean isEmpty = this.f121922e.isEmpty();
        boolean add = this.f121922e.add(obj);
        if (add) {
            this.f121925h.f121931h++;
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
        boolean addAll = this.f121922e.addAll(collection);
        if (addAll) {
            this.f121925h.f121931h += this.f121922e.size() - size;
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
        this.f121922e.clear();
        this.f121925h.f121931h -= size;
        g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        e();
        return this.f121922e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        e();
        return this.f121922e.containsAll(collection);
    }

    public final void d() {
        cc.m mVar = this.f121923f;
        if (mVar != null) {
            mVar.d();
        } else {
            this.f121925h.f121930g.put(this.f121921d, this.f121922e);
        }
    }

    public final void e() {
        java.util.Collection collection;
        cc.m mVar = this.f121923f;
        if (mVar != null) {
            mVar.e();
            if (mVar.f121922e != this.f121924g) {
                throw new java.util.ConcurrentModificationException();
            }
        } else {
            if (!this.f121922e.isEmpty() || (collection = (java.util.Collection) this.f121925h.f121930g.get(this.f121921d)) == null) {
                return;
            }
            this.f121922e = collection;
        }
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        e();
        return this.f121922e.equals(obj);
    }

    public final void g() {
        cc.m mVar = this.f121923f;
        if (mVar != null) {
            mVar.g();
        } else if (this.f121922e.isEmpty()) {
            this.f121925h.f121930g.remove(this.f121921d);
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        e();
        return this.f121922e.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        e();
        return new cc.l(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        e();
        boolean remove = this.f121922e.remove(obj);
        if (remove) {
            cc.r rVar = this.f121925h;
            rVar.f121931h--;
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
        boolean removeAll = this.f121922e.removeAll(collection);
        if (removeAll) {
            this.f121925h.f121931h += this.f121922e.size() - size;
            g();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f121922e.retainAll(collection);
        if (retainAll) {
            this.f121925h.f121931h += this.f121922e.size() - size;
            g();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        e();
        return this.f121922e.size();
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        e();
        return this.f121922e.toString();
    }
}
