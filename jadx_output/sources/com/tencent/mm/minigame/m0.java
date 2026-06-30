package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class m0 implements com.tencent.mm.minigame.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f69107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f69108b;

    public m0(kotlinx.coroutines.q qVar, java.lang.String str) {
        this.f69107a = qVar;
        this.f69108b = str;
    }

    @Override // com.tencent.mm.minigame.f1
    public void a(com.tencent.mm.minigame.e1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlinx.coroutines.q qVar = this.f69107a;
        if (result.f69062a) {
            java.lang.String str = result.f69063b;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("WVA.JsApiOperateWVA", "getPkgPathFromMainProcessSuspend: got pkgPath=" + str);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(str));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("WVA.JsApiOperateWVA", "getPkgPathFromMainProcessSuspend: module not found");
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("pkgPath not found for packageName=" + this.f69108b))));
    }
}
