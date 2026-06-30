package com.tencent.mm.legacy.app;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68505d = 0;

    public l(com.tencent.mm.legacy.app.m mVar, com.tencent.mm.legacy.app.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68505d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68505d;
        this.f68505d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.legacy.app.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
