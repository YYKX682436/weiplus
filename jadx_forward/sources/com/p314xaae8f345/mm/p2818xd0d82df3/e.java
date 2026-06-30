package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f295894d = 0;

    public e(com.p314xaae8f345.mm.p2818xd0d82df3.f fVar, com.p314xaae8f345.mm.p2818xd0d82df3.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f295894d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f295894d;
        this.f295894d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2818xd0d82df3.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
