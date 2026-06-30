package com.tencent.mm.booter.notification;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63481d = 0;

    public g(com.tencent.mm.booter.notification.h hVar, com.tencent.mm.booter.notification.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63481d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63481d;
        this.f63481d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.booter.notification.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
