package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public class b extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f52708d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.owners.a f52709e;

    public b(java.util.ArrayList arrayList, com.tencent.matrix.lifecycle.owners.a aVar) {
        this.f52708d = arrayList;
        this.f52709e = aVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        boolean add = this.f52708d.add(obj);
        try {
            ((com.tencent.matrix.lifecycle.owners.l) this.f52709e).a(obj);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return add;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        boolean addAll = this.f52708d.addAll(collection);
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((com.tencent.matrix.lifecycle.owners.l) this.f52709e).a(it.next());
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f52708d.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return this.f52708d.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(java.util.Collection collection) {
        return this.f52708d.containsAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return this.f52708d.get(i17);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        return this.f52708d.indexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f52708d.isEmpty();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return this.f52708d.iterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return this.f52708d.lastIndexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator() {
        return this.f52708d.listIterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        boolean remove = this.f52708d.remove(obj);
        try {
            ((com.tencent.matrix.lifecycle.owners.l) this.f52709e).b(obj);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection collection) {
        boolean removeAll = this.f52708d.removeAll(collection);
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((com.tencent.matrix.lifecycle.owners.l) this.f52709e).b(it.next());
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return removeAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection collection) {
        return this.f52708d.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        return this.f52708d.set(i17, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f52708d.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.util.List subList(int i17, int i18) {
        return this.f52708d.subList(i17, i18);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return this.f52708d.toArray();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return this.f52708d.listIterator(i17);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f52708d.toArray(objArr);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        this.f52708d.add(i17, obj);
        try {
            ((com.tencent.matrix.lifecycle.owners.l) this.f52709e).a(obj);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        java.lang.Object remove = this.f52708d.remove(i17);
        try {
            ((com.tencent.matrix.lifecycle.owners.l) this.f52709e).b(remove);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        boolean addAll = this.f52708d.addAll(i17, collection);
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((com.tencent.matrix.lifecycle.owners.l) this.f52709e).a(it.next());
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ArrayListProxy", th6, "", new java.lang.Object[0]);
        }
        return addAll;
    }
}
