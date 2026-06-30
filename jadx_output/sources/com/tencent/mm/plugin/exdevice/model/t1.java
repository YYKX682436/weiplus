package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes6.dex */
public class t1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99065d = 0;

    public t1(com.tencent.mm.plugin.exdevice.model.u1 u1Var, com.tencent.mm.plugin.exdevice.model.s1 s1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99065d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99065d;
        this.f99065d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.exdevice.model.n3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
