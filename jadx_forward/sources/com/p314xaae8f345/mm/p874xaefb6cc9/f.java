package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f150600d = 0;

    public f(com.p314xaae8f345.mm.p874xaefb6cc9.g gVar, com.p314xaae8f345.mm.p874xaefb6cc9.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f150600d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f150600d;
        this.f150600d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p874xaefb6cc9.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
