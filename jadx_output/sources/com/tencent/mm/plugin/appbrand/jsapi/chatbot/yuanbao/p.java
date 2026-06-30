package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

@j95.b
/* loaded from: classes5.dex */
public final class p extends i95.w implements com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f80330d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f80331e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f80332f = new com.tencent.mm.sdk.platformtools.r2(10);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f80333g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f80334h = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b.f80289d);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object wi(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p r22, java.lang.String r23, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0 r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p.wi(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p, java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 Ai(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 c0Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        synchronized (this.f80331e) {
            c0Var = (com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0) this.f80332f.get(str);
        }
        return c0Var;
    }
}
