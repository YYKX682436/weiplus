package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes6.dex */
public class w9 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f287749d = 0;

    public w9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.x9 x9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.v9 v9Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f287749d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f287749d;
        this.f287749d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
