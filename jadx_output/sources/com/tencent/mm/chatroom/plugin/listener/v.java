package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63678d = 0;

    public v(com.tencent.mm.chatroom.plugin.listener.w wVar, com.tencent.mm.chatroom.plugin.listener.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63678d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63678d;
        this.f63678d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.chatroom.plugin.listener.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
