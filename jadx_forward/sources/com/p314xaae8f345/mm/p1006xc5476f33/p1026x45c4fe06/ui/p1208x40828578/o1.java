package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class o1 extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f171667d = new java.util.ArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p3.f158073a);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f171668e = new java.util.ArrayList(10000);

    public static void j(int i17, int i18, int i19) {
        if (i17 < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex = " + i17);
        }
        if (i18 > i19) {
            throw new java.lang.IndexOutOfBoundsException("toIndex = " + i18);
        }
        if (i17 <= i18) {
            return;
        }
        throw new java.lang.IllegalArgumentException("fromIndex(" + i17 + ") > toIndex(" + i18 + ")");
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1.class.isInstance(collection)) {
            iz5.a.g("collection type mismatch!!", false);
            return false;
        }
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1) collection;
            this.f171667d.addAll(o1Var.f171667d);
            this.f171668e.addAll(o1Var.f171668e);
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized void clear() {
        this.f171667d.clear();
        this.f171668e.clear();
    }

    @Override // java.util.ArrayList
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 clone() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 o1Var;
        o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1();
        o1Var.f171667d.addAll(this.f171667d);
        o1Var.f171668e.addAll(this.f171668e);
        return o1Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 get(int i17) {
        if (i17 < this.f171667d.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) this.f171667d.get(i17);
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) this.f171668e.get(i17 - this.f171667d.size());
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 remove(int i17) {
        if (i17 < this.f171667d.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) this.f171667d.remove(i17);
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) this.f171668e.remove(i17 - this.f171667d.size());
    }

    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 h(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f171667d.clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            this.f171667d.addAll(arrayList);
        }
        this.f171668e.clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
            this.f171668e.addAll(arrayList2);
        }
        return this;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        iz5.a.g("Why you need this?? call @smoothieli fix it", false);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.n1(this);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized int size() {
        return this.f171667d.size() + this.f171668e.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public synchronized java.util.List subList(int i17, int i18) {
        j(i17, i18, size());
        if (i17 == i18) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i18 - i17);
        while (i17 < i18) {
            arrayList.add(get(i17));
            i17++;
        }
        return arrayList;
    }
}
