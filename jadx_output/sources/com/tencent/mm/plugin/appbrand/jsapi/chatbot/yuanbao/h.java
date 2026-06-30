package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f80308d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f80309e;

    /* renamed from: f, reason: collision with root package name */
    public int f80310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p f80311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80312h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80313i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0 f80314m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80311g = pVar;
        this.f80312h = str;
        this.f80313i = str2;
        this.f80314m = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.h(this.f80311g, this.f80312h, this.f80313i, this.f80314m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0151  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
