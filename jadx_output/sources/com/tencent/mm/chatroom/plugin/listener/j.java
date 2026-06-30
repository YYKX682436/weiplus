package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63658d = 0;

    public j(com.tencent.mm.chatroom.plugin.listener.k kVar, com.tencent.mm.chatroom.plugin.listener.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63658d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63658d;
        this.f63658d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.chatroom.plugin.listener.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
