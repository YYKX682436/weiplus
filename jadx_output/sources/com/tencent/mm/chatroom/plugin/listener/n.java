package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63668d = 0;

    public n(com.tencent.mm.chatroom.plugin.listener.o oVar, com.tencent.mm.chatroom.plugin.listener.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63668d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63668d;
        this.f63668d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.chatroom.plugin.listener.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
