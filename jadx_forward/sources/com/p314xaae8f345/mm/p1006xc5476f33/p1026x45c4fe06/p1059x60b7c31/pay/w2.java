package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class w2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed f164228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12210x69394b55 f164229b;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12209xfce2a9ed c12209xfce2a9ed, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12210x69394b55 c12210x69394b55) {
        this.f164228a = c12209xfce2a9ed;
        this.f164229b = c12210x69394b55;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo9541xb6136779(long r4, java.lang.String r6, java.lang.Object r7, int r8) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            java.lang.String r4 = "reportPayResult"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r4)
            r6 = 0
            java.lang.String r8 = "fail"
            com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayResult r0 = r3.f164228a
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r2, r4)
        L4c:
            r4 = 0
        L4d:
            java.lang.String r1 = "success"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r1)
            java.lang.String r2 = "<set-?>"
            if (r4 == 0) goto L66
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            r0.getClass()
            r0.f164089d = r1
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r2)
            r0.f164090e = r7
            goto L8b
        L66:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r8)
            r0.getClass()
            r0.f164089d = r8
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r2)
            r0.f164090e = r7
            goto L8b
        L74:
            java.lang.String r4 = "wrong data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r4)
            r0.getClass()
            r0.f164089d = r8
            goto L8b
        L80:
            java.lang.String r4 = "wrong actionName"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r4)
            r0.getClass()
            r0.f164089d = r8
        L8b:
            com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMedicalInsurancePayTask r4 = r3.f164229b
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12210x69394b55.a(r4, r0)
            com.tencent.mm.sdk.event.IListener r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12210x69394b55.b(r4)
            r4.mo48814x2efc64()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.w2.mo9541xb6136779(long, java.lang.String, java.lang.Object, int):boolean");
    }
}
