package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class f0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.g0 f80392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f80393b;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.chattool.g0 g0Var, kotlinx.coroutines.q qVar) {
        this.f80392a = g0Var;
        this.f80393b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Luggage.JsApiNotifyGroupMembers", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f80392a.f80394g) {
            return false;
        }
        kotlinx.coroutines.q qVar = this.f80393b;
        if (i18 == -1) {
            ((kotlinx.coroutines.r) qVar).s(java.lang.Boolean.TRUE, null);
            return true;
        }
        if (i18 != 0) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(jc1.f.f298913b);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar)));
        return true;
    }
}
