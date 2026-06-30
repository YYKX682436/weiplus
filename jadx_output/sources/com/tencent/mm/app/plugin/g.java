package com.tencent.mm.app.plugin;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53664d = 0;

    public g(com.tencent.mm.app.plugin.h hVar, com.tencent.mm.app.plugin.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53664d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53664d;
        this.f53664d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.app.plugin.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
