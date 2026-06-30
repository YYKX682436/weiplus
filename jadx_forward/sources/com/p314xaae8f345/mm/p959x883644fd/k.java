package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f153063d = 0;

    public k(com.p314xaae8f345.mm.p959x883644fd.l lVar, com.p314xaae8f345.mm.p959x883644fd.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f153063d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f153063d;
        this.f153063d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p959x883644fd.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
