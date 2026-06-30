package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80303d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f80304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p f80305f;

    /* renamed from: g, reason: collision with root package name */
    public int f80306g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f80305f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f80304e = obj;
        this.f80306g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p.wi(this.f80305f, null, null, this);
    }
}
