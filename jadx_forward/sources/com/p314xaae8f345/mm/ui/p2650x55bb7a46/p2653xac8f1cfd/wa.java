package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes6.dex */
public class wa implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f281697d = 0;

    public wa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xa xaVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.va vaVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f281697d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f281697d;
        this.f281697d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
