package com.tencent.mm.plugin.appbrand.task.checkdemo;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89006d = 0;

    public i(com.tencent.mm.plugin.appbrand.task.checkdemo.j jVar, com.tencent.mm.plugin.appbrand.task.checkdemo.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89006d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89006d;
        this.f89006d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.task.checkdemo.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
