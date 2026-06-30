package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class p0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.r0 f80433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f80434b;

    public p0(com.tencent.mm.plugin.appbrand.jsapi.chattool.r0 r0Var, kotlinx.coroutines.q qVar) {
        this.f80433a = r0Var;
        this.f80434b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Luggage.JsApiOpenChatToolAllPage", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f80433a.f80448g) {
            return false;
        }
        jc1.d dVar = jc1.f.f298915d;
        kotlinx.coroutines.q qVar = this.f80434b;
        if (i18 == -1) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.w("Luggage.JsApiOpenChatToolAllPage", "data is null, error");
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar)));
                return true;
            }
            r45.ha5 ha5Var = new r45.ha5();
            byte[] byteArrayExtra = intent.getByteArrayExtra("KSelectUserList");
            if (byteArrayExtra != null) {
                try {
                    ha5Var.parseFrom(byteArrayExtra);
                } catch (java.lang.Throwable unused) {
                }
            }
            java.util.LinkedList<r45.ga5> linkedList = ha5Var.f375981d;
            if (linkedList == null || linkedList.isEmpty()) {
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar2 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar2)));
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.o.d(linkedList);
            for (r45.ga5 ga5Var : linkedList) {
                java.lang.String str = ga5Var.f375041d;
                if (!(str == null || str.length() == 0)) {
                    java.lang.String str2 = ga5Var.f375041d;
                    kotlin.jvm.internal.o.d(str2);
                    arrayList.add(new j91.a(str2, null, null, 0, 14, null));
                }
            }
            ((kotlinx.coroutines.r) qVar).s(arrayList, null);
        } else if (i18 == 0 || i18 == 1) {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar3 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(jc1.f.f298913b);
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar3)));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar4 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar4)));
        }
        return true;
    }
}
