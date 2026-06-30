package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class t0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.v0 f80462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f80463b;

    public t0(com.tencent.mm.plugin.appbrand.jsapi.chattool.v0 v0Var, kotlinx.coroutines.q qVar) {
        this.f80462a = v0Var;
        this.f80463b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Luggage.JsApiSelectGroupMembers", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f80462a.f80474g) {
            return false;
        }
        jc1.d dVar = jc1.f.f298915d;
        kotlinx.coroutines.q qVar = this.f80463b;
        if (i18 == -1) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.w("Luggage.JsApiSelectGroupMembers", "data is null, error");
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar)));
                return true;
            }
            try {
                r45.ha5 ha5Var = new r45.ha5();
                byte[] byteArrayExtra = intent.getByteArrayExtra("KSelectUserList");
                if (byteArrayExtra != null) {
                    ha5Var.parseFrom(byteArrayExtra);
                }
                org.json.JSONObject json = ha5Var.toJSON();
                org.json.JSONArray optJSONArray = json.optJSONArray("dataList");
                if (optJSONArray == null) {
                    optJSONArray = new org.json.JSONArray();
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                int length = optJSONArray.length();
                for (int i19 = 0; i19 < length; i19++) {
                    linkedList.add(optJSONArray.getJSONObject(i19).getString("userName"));
                }
                ((kotlinx.coroutines.r) qVar).s(linkedList, null);
                com.tencent.mars.xlog.Log.i("Luggage.JsApiSelectGroupMembers", "contactListJson: " + json + " userNameList:" + linkedList.size());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail e:" + e17);
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar2 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar2)));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail e:" + th6);
                com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar3 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar3)));
            }
        } else if (i18 == 0 || i18 == 1) {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar4 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(jc1.f.f298913b);
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar4)));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.f fVar5 = new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(dVar);
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar5)));
        }
        return true;
    }
}
