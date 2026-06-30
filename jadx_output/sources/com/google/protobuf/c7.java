package com.google.protobuf;

/* loaded from: classes16.dex */
public class c7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f44984d;

    public c7(java.util.Iterator it) {
        this.f44984d = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44984d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.Map.Entry entry = (java.util.Map.Entry) this.f44984d.next();
        return entry.getValue() instanceof com.google.protobuf.d7 ? new com.google.protobuf.b7(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f44984d.remove();
    }
}
