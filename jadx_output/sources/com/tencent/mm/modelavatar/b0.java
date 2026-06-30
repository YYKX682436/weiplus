package com.tencent.mm.modelavatar;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f70424d = 0;

    public b0(com.tencent.mm.modelavatar.c0 c0Var, com.tencent.mm.modelavatar.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f70424d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f70424d;
        this.f70424d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.modelavatar.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
