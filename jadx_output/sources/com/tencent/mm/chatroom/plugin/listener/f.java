package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f63645d = 0;

    public f(com.tencent.mm.chatroom.plugin.listener.g gVar, com.tencent.mm.chatroom.plugin.listener.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f63645d;
        this.f63645d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.chatroom.plugin.listener.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
