package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class g4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f86635d;

    public g4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.util.List list) {
        this.f86635d = list.listIterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86635d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return (com.tencent.mm.plugin.appbrand.page.w2) this.f86635d.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
