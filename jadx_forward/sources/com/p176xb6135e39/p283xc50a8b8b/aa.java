package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class aa extends java.util.AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.ba f126404d;

    public aa(com.p176xb6135e39.p283xc50a8b8b.ba baVar, com.p176xb6135e39.p283xc50a8b8b.u9 u9Var) {
        this.f126404d = baVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f126404d.h((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f126404d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.f126404d.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new com.p176xb6135e39.p283xc50a8b8b.z9(this.f126404d, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f126404d.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f126404d.size();
    }
}
