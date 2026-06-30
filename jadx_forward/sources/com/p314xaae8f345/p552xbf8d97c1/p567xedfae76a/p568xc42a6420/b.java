package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public class b extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f134241d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.a f134242e;

    public b(java.util.ArrayList arrayList, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.a aVar) {
        this.f134241d = arrayList;
        this.f134242e = aVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        boolean add = this.f134241d.add(obj);
        try {
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l) this.f134242e).a(obj);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return add;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        boolean addAll = this.f134241d.addAll(collection);
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l) this.f134242e).a(it.next());
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f134241d.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return this.f134241d.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(java.util.Collection collection) {
        return this.f134241d.containsAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return this.f134241d.get(i17);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        return this.f134241d.indexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f134241d.isEmpty();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return this.f134241d.iterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return this.f134241d.lastIndexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return this.f134241d.listIterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        boolean remove = this.f134241d.remove(obj);
        try {
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l) this.f134242e).b(obj);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection collection) {
        boolean removeAll = this.f134241d.removeAll(collection);
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l) this.f134242e).b(it.next());
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return removeAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection collection) {
        return this.f134241d.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        return this.f134241d.set(i17, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f134241d.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.util.List subList(int i17, int i18) {
        return this.f134241d.subList(i17, i18);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return this.f134241d.toArray();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return this.f134241d.listIterator(i17);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f134241d.toArray(objArr);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        this.f134241d.add(i17, obj);
        try {
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l) this.f134242e).a(obj);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        java.lang.Object remove = this.f134241d.remove(i17);
        try {
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l) this.f134242e).b(remove);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        boolean addAll = this.f134241d.addAll(i17, collection);
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l) this.f134242e).a(it.next());
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return addAll;
    }
}
