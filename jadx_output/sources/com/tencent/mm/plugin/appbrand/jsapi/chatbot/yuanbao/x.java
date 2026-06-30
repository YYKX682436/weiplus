package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f80342d = 0;

    public x(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.y yVar, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80342d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f80342d;
        this.f80342d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
