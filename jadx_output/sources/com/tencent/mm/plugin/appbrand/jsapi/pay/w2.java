package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class w2 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult f82695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask f82696b;

    public w2(com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult requestMedicalInsurancePayResult, com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask requestMedicalInsurancePayTask) {
        this.f82695a = requestMedicalInsurancePayResult;
        this.f82696b = requestMedicalInsurancePayTask;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    @Override // com.tencent.mm.plugin.lite.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDispatch(long r4, java.lang.String r6, java.lang.Object r7, int r8) {
        /*
            r3 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "actionName:"
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = " data:"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.RequestMedicalInsurancePayTask"
            com.tencent.mars.xlog.Log.i(r5, r4)
            java.lang.String r4 = "reportPayResult"
            boolean r4 = kotlin.jvm.internal.o.b(r6, r4)
            r6 = 0
            java.lang.String r8 = "fail"
            com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult r0 = r3.f82695a
            if (r4 == 0) goto L80
            boolean r4 = r7 instanceof org.json.JSONObject
            if (r4 == 0) goto L74
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r4 = "result"
            boolean r1 = r7.has(r4)     // Catch: java.lang.Exception -> L40
            r2 = 1
            if (r1 != r2) goto L38
            goto L39
        L38:
            r2 = r6
        L39:
            if (r2 == 0) goto L4c
            java.lang.String r4 = r7.getString(r4)     // Catch: java.lang.Exception -> L40
            goto L4d
        L40:
            r4 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = "safeGetString"
            java.lang.String r2 = ""
            com.tencent.mm.sdk.platformtools.Log.a(r1, r2, r4)
        L4c:
            r4 = 0
        L4d:
            java.lang.String r1 = "success"
            boolean r4 = kotlin.jvm.internal.o.b(r4, r1)
            java.lang.String r2 = "<set-?>"
            if (r4 == 0) goto L66
            com.tencent.mars.xlog.Log.i(r5, r1)
            r0.getClass()
            r0.f82556d = r1
            kotlin.jvm.internal.o.g(r7, r2)
            r0.f82557e = r7
            goto L8b
        L66:
            com.tencent.mars.xlog.Log.e(r5, r8)
            r0.getClass()
            r0.f82556d = r8
            kotlin.jvm.internal.o.g(r7, r2)
            r0.f82557e = r7
            goto L8b
        L74:
            java.lang.String r4 = "wrong data"
            com.tencent.mars.xlog.Log.e(r5, r4)
            r0.getClass()
            r0.f82556d = r8
            goto L8b
        L80:
            java.lang.String r4 = "wrong actionName"
            com.tencent.mars.xlog.Log.e(r5, r4)
            r0.getClass()
            r0.f82556d = r8
        L8b:
            com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask r4 = r3.f82696b
            com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask.a(r4, r0)
            com.tencent.mm.sdk.event.IListener r4 = com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask.b(r4)
            r4.dead()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.pay.w2.onDispatch(long, java.lang.String, java.lang.Object, int):boolean");
    }
}
