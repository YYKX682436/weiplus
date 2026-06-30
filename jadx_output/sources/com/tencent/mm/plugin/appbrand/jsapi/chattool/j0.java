package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class j0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.n0 f80401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f80402b;

    public j0(com.tencent.mm.plugin.appbrand.jsapi.chattool.n0 n0Var, kotlinx.coroutines.q qVar) {
        this.f80401a = n0Var;
        this.f80402b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Luggage.JsApiOpenChatTool", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f80401a.f80421g) {
            return false;
        }
        jc1.d dVar = jc1.f.f298915d;
        kotlinx.coroutines.q qVar = this.f80402b;
        if (i18 != -1) {
            if (i18 == 0 || i18 == 1) {
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(jc1.f.f298913b);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar)));
            } else {
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar2 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar2)));
            }
        } else {
            if (intent == null) {
                com.tencent.mars.xlog.Log.w("Luggage.JsApiOpenChatTool", "data is null, error");
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar3 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar3)));
                return true;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar4 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar4)));
                return true;
            }
            ((kotlinx.coroutines.r) qVar).s(nm5.j.c(stringExtra, java.lang.Integer.valueOf(intent.getIntExtra("KSelectUserChatType", 0))), null);
        }
        return true;
    }
}
