package com.tencent.mm.plugin.biz;

/* loaded from: classes.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f93864d = 0;

    public i(com.tencent.mm.plugin.biz.j jVar, com.tencent.mm.plugin.biz.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f93864d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f93864d;
        this.f93864d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.biz.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
