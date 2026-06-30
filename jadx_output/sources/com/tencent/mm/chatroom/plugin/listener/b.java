package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63638d = 0;

    public b(com.tencent.mm.chatroom.plugin.listener.c cVar, com.tencent.mm.chatroom.plugin.listener.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63638d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63638d;
        this.f63638d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.chatroom.plugin.listener.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
