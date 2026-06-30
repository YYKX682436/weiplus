package com.p314xaae8f345.mm.p2818xd0d82df3;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f295897d = 0;

    public i(com.p314xaae8f345.mm.p2818xd0d82df3.j jVar, com.p314xaae8f345.mm.p2818xd0d82df3.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f295897d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f295897d;
        this.f295897d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2818xd0d82df3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
