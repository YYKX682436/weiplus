package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f295900d = 0;

    public m(com.p314xaae8f345.mm.p2818xd0d82df3.n nVar, com.p314xaae8f345.mm.p2818xd0d82df3.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f295900d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f295900d;
        this.f295900d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2818xd0d82df3.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
