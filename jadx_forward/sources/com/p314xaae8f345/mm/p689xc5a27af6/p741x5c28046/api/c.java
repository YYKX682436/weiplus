package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147588d = 0;

    public c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d dVar, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147588d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147588d;
        this.f147588d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
