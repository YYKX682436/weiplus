package com.tencent.mm.plugin.ai.data.business.trigger;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f74659d = 0;

    public b(com.tencent.mm.plugin.ai.data.business.trigger.c cVar, com.tencent.mm.plugin.ai.data.business.trigger.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f74659d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f74659d;
        this.f74659d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.ai.data.business.trigger.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
