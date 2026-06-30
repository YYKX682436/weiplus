package com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f146540d = 0;

    public m(com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.n nVar, com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f146540d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f146540d;
        this.f146540d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
