package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes6.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99041d = 0;

    public p1(com.tencent.mm.plugin.exdevice.model.q1 q1Var, com.tencent.mm.plugin.exdevice.model.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99041d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99041d;
        this.f99041d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.exdevice.model.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
