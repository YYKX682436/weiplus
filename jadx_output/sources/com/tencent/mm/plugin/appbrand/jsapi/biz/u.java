package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes.dex */
public final class u implements com.tencent.wechat.iam.biz.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f80014a;

    public u(com.tencent.mm.ipcinvoker.r rVar) {
        this.f80014a = rVar;
    }

    @Override // com.tencent.wechat.iam.biz.n0
    public final void a(java.lang.String str) {
        kotlin.jvm.internal.o.d(str);
        boolean z17 = str.length() == 0;
        com.tencent.mm.ipcinvoker.r rVar = this.f80014a;
        if (z17) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet(false, null));
        } else {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskRet(true, str));
        }
    }
}
