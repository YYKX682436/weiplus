package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class f1 implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g1 f80870a;

    public f1(com.tencent.mm.plugin.appbrand.jsapi.g1 g1Var) {
        this.f80870a = g1Var;
    }

    @Override // bi4.l1
    public void onFinishAction(int i17, java.lang.String str, pj4.r0 r0Var) {
        com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult publishTextStatusResult = new com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult();
        publishTextStatusResult.f78667d = i17;
        publishTextStatusResult.f78668e = str;
        publishTextStatusResult.f78669f = r0Var != null ? r0Var.toByteArray() : null;
        this.f80870a.finishProcess(publishTextStatusResult);
    }
}
