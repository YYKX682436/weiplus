package com.tencent.mm.model.newabtest;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f70395d = 0;

    public f(com.tencent.mm.model.newabtest.g gVar, com.tencent.mm.model.newabtest.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70395d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f70395d;
        this.f70395d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.model.newabtest.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
