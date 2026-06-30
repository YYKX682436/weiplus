package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class o1 extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f90134d = new java.util.ArrayList(com.tencent.mm.plugin.appbrand.appusage.p3.f76540a);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f90135e = new java.util.ArrayList(10000);

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
        if (!com.tencent.mm.plugin.appbrand.ui.recents.o1.class.isInstance(collection)) {
            iz5.a.g("collection type mismatch!!", false);
            return false;
        }
        synchronized (this) {
            com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = (com.tencent.mm.plugin.appbrand.ui.recents.o1) collection;
            this.f90134d.addAll(o1Var.f90134d);
            this.f90135e.addAll(o1Var.f90135e);
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized void clear() {
        this.f90134d.clear();
        this.f90135e.clear();
    }

    @Override // java.util.ArrayList
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized com.tencent.mm.plugin.appbrand.ui.recents.o1 clone() {
        com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var;
        o1Var = new com.tencent.mm.plugin.appbrand.ui.recents.o1();
        o1Var.f90134d.addAll(this.f90134d);
        o1Var.f90135e.addAll(this.f90135e);
        return o1Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo get(int i17) {
        if (i17 < this.f90134d.size()) {
            return (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) this.f90134d.get(i17);
        }
        return (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) this.f90135e.get(i17 - this.f90134d.size());
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo remove(int i17) {
        if (i17 < this.f90134d.size()) {
            return (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) this.f90134d.remove(i17);
        }
        return (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) this.f90135e.remove(i17 - this.f90134d.size());
    }

    public synchronized com.tencent.mm.plugin.appbrand.ui.recents.o1 h(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f90134d.clear();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            this.f90134d.addAll(arrayList);
        }
        this.f90135e.clear();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
            this.f90135e.addAll(arrayList2);
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
        return new com.tencent.mm.plugin.appbrand.ui.recents.n1(this);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized int size() {
        return this.f90134d.size() + this.f90135e.size();
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
