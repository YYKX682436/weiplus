package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes6.dex */
public class i1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89032d = 0;

    public i1(com.tencent.mm.plugin.appbrand.task.j1 j1Var, com.tencent.mm.plugin.appbrand.task.h1 h1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89032d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89032d;
        this.f89032d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.task.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
