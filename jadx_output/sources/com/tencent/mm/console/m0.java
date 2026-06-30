package com.tencent.mm.console;

/* loaded from: classes6.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f64823d = 0;

    public m0(com.tencent.mm.console.n0 n0Var, com.tencent.mm.console.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f64823d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f64823d;
        this.f64823d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.console.j5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
