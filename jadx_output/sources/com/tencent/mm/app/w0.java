package com.tencent.mm.app;

/* loaded from: classes6.dex */
public class w0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f53893d = 0;

    public w0(com.tencent.mm.app.x0 x0Var, com.tencent.mm.app.v0 v0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53893d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f53893d;
        this.f53893d = i17 + 1;
        if (i17 == 0) {
            return bt.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
