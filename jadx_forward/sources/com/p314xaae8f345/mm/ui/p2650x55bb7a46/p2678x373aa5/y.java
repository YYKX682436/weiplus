package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284685d = 0;

    public y(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.z zVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284685d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284685d;
        this.f284685d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.o2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
