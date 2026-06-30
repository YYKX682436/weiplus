package com.tencent.mm.booter.notification;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63500d = 0;

    public k(com.tencent.mm.booter.notification.l lVar, com.tencent.mm.booter.notification.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63500d;
        this.f63500d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.booter.notification.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
