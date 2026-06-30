package com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146558d = 0;

    public u(com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.v vVar, com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146558d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146558d;
        this.f146558d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
