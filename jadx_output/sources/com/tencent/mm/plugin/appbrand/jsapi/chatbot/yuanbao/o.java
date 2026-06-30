package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes5.dex */
public final class o implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f80329a;

    public o(kotlin.coroutines.Continuation continuation) {
        this.f80329a = continuation;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.modelcdntran.m1 m1Var = event.f71103a;
        java.util.Objects.toString(m1Var);
        int ordinal = m1Var.ordinal();
        kotlin.coroutines.Continuation continuation = this.f80329a;
        if (ordinal != 3) {
            if (ordinal == 4) {
                dn.h hVar = event.f71108f;
                if (hVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "uploadToCdn: onEnd action:" + m1Var + ", result is null");
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a(-1, "", "")));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "uploadToCdn: onEnd action:" + m1Var + " result:" + event.f71108f + " fieldId:" + hVar.field_fileId + " aesKey:" + hVar.field_aesKey);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                java.lang.String field_fileId = hVar.field_fileId;
                kotlin.jvm.internal.o.f(field_fileId, "field_fileId");
                java.lang.String field_aesKey = hVar.field_aesKey;
                kotlin.jvm.internal.o.f(field_aesKey, "field_aesKey");
                continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a(0, field_fileId, field_aesKey)));
                return;
            }
            if (ordinal != 16 && ordinal != 17) {
                switch (ordinal) {
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        return;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "uploadToCdn: onEnd action:" + m1Var);
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a(-1, "", "")));
    }
}
