package com.tencent.mm.plugin.appbrand;

/* loaded from: classes6.dex */
public class jb implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f78476d = 0;

    public jb(com.tencent.mm.plugin.appbrand.kb kbVar, com.tencent.mm.plugin.appbrand.ib ibVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f78476d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f78476d;
        this.f78476d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
