package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f152371d = 0;

    public y(com.p314xaae8f345.mm.p944x882e457a.z zVar, com.p314xaae8f345.mm.p944x882e457a.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f152371d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f152371d;
        this.f152371d = i17 + 1;
        if (i17 == 0) {
            return kr2.t.INSTANCE;
        }
        if (i17 == 1) {
            return ic2.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
