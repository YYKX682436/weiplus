package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89141d = 0;

    public q(com.tencent.mm.plugin.appbrand.task.preload.r rVar, com.tencent.mm.plugin.appbrand.task.preload.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89141d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89141d;
        this.f89141d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.task.preload.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
