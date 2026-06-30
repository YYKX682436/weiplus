package com.tencent.mm.booter.notification;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63505d = 0;

    public o(com.tencent.mm.booter.notification.p pVar, com.tencent.mm.booter.notification.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63505d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63505d;
        this.f63505d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.booter.notification.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
