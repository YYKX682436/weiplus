package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63675d = 0;

    public r(com.tencent.mm.chatroom.plugin.listener.s sVar, com.tencent.mm.chatroom.plugin.listener.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63675d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63675d;
        this.f63675d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.chatroom.plugin.listener.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
