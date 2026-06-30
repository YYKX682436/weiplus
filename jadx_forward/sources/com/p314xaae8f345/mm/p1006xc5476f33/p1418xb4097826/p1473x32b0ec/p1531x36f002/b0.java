package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public class b0 extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f196977d = new java.util.ArrayList();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        boolean add = super.add(obj);
        if (add) {
            d();
        }
        return add;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        boolean addAll = super.addAll(collection);
        if (addAll) {
            d();
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        d();
    }

    public final void d() {
        int size = size();
        java.util.Iterator it = ((java.util.ArrayList) this.f196977d).iterator();
        while (it.hasNext()) {
            ((java.util.function.Consumer) it.next()).accept(java.lang.Integer.valueOf(size));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        java.lang.Object remove = super.remove(i17);
        d();
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection collection) {
        boolean removeAll = super.removeAll(collection);
        if (removeAll) {
            d();
        }
        return removeAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i17, int i18) {
        if (i17 != i18) {
            super.removeRange(i17, i18);
            d();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection collection) {
        boolean retainAll = super.retainAll(collection);
        if (retainAll) {
            d();
        }
        return retainAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        super.add(i17, obj);
        d();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        boolean addAll = super.addAll(i17, collection);
        if (addAll) {
            d();
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        boolean remove = super.remove(obj);
        if (remove) {
            d();
        }
        return remove;
    }
}
