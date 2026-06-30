package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes6.dex */
public class ua implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f148041d = 0;

    public ua(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.va vaVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ta taVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148041d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f148041d;
        this.f148041d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.jb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
