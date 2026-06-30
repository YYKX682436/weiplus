package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes6.dex */
public class m1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f89096d = 0;

    public m1(com.tencent.mm.plugin.appbrand.task.n1 n1Var, com.tencent.mm.plugin.appbrand.task.l1 l1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f89096d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f89096d;
        this.f89096d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.task.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
