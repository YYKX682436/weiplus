package com.tencent.mm.magicbrush.plugin.scl.jsapi;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68660d = 0;

    public f(com.tencent.mm.magicbrush.plugin.scl.jsapi.g gVar, com.tencent.mm.magicbrush.plugin.scl.jsapi.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68660d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68660d;
        this.f68660d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.magicbrush.plugin.scl.jsapi.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
