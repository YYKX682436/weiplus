package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes14.dex */
public class bb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f126469d;

    public bb(com.p176xb6135e39.p283xc50a8b8b.cb cbVar) {
        this.f126469d = cbVar.f126522d.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126469d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (java.lang.String) this.f126469d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
