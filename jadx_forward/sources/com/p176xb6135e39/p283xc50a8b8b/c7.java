package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class c7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f126517d;

    public c7(java.util.Iterator it) {
        this.f126517d = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126517d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f126517d.next();
        return entry.getValue() instanceof com.p176xb6135e39.p283xc50a8b8b.d7 ? new com.p176xb6135e39.p283xc50a8b8b.b7(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f126517d.remove();
    }
}
