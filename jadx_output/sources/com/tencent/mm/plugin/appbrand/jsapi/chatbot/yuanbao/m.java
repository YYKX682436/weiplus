package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes.dex */
public final class m implements com.tencent.mm.ipcinvoker.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f80326d;

    public m(kotlinx.coroutines.q qVar) {
        this.f80326d = qVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle != null ? bundle.getInt("KEY_CODE", -1) : -1;
        if (bundle == null || (str = bundle.getString("KEY_PAGE_CONTENT_PATH")) == null) {
            str = "";
        }
        kotlinx.coroutines.q qVar = this.f80326d;
        if (i17 == 0) {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(str));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("get page content failed"))));
        }
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception exc) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        if (exc == null) {
            exc = new java.lang.Exception("invoke exception");
        }
        ((kotlinx.coroutines.r) this.f80326d).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(exc)));
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f80326d).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("bridge not found"))));
    }
}
