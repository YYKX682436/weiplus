package com.tencent.mm.plugin.base.stub;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f93720d = 0;

    public b(com.tencent.mm.plugin.base.stub.c cVar, com.tencent.mm.plugin.base.stub.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93720d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f93720d;
        this.f93720d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.base.stub.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
