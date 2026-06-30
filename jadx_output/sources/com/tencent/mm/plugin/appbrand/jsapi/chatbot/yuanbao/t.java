package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f80339d = 0;

    public t(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.u uVar, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f80339d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f80339d;
        this.f80339d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
