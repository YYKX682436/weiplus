package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f68439d = 0;

    public o(com.tencent.mm.ipcinvoker.wx_extension.p pVar, com.tencent.mm.ipcinvoker.wx_extension.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f68439d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f68439d;
        this.f68439d = i17 + 1;
        if (i17 == 0) {
            return h80.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
