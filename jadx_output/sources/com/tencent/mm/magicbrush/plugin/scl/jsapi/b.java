package com.tencent.mm.magicbrush.plugin.scl.jsapi;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68653d = 0;

    public b(com.tencent.mm.magicbrush.plugin.scl.jsapi.c cVar, com.tencent.mm.magicbrush.plugin.scl.jsapi.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68653d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68653d;
        this.f68653d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.magicbrush.plugin.scl.jsapi.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
