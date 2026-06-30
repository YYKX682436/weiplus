package com.tencent.mm.feature.avatar;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f65187d = 0;

    public z(com.tencent.mm.feature.avatar.a0 a0Var, com.tencent.mm.feature.avatar.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f65187d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f65187d;
        this.f65187d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.avatar.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
