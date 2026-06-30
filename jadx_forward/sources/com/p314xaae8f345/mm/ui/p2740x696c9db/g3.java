package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes6.dex */
public class g3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f291970d = 0;

    public g3(com.p314xaae8f345.mm.ui.p2740x696c9db.h3 h3Var, com.p314xaae8f345.mm.ui.p2740x696c9db.f3 f3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f291970d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f291970d;
        this.f291970d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2740x696c9db.jd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
