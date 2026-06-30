package com.tencent.mm.modelavatar;

/* loaded from: classes6.dex */
public class f0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f70445d = 0;

    public f0(com.tencent.mm.modelavatar.g0 g0Var, com.tencent.mm.modelavatar.e0 e0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70445d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f70445d;
        this.f70445d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelavatar.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
