package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f178407d = 0;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f178407d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f178407d;
        this.f178407d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
