package com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f149364d = 0;

    public j(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.k kVar, com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f149364d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f149364d;
        this.f149364d = i17 + 1;
        if (i17 == 0) {
            return be0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
