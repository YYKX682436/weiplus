package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class b3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12213xaeac911f f164120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12214xea575707 f164121b;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12213xaeac911f c12213xaeac911f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12214xea575707 c12214xea575707) {
        this.f164120a = c12213xaeac911f;
        this.f164121b = c12214xea575707;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo9541xb6136779(long r8, java.lang.String r10, java.lang.Object r11, int r12) {
        /*
            r7 = this;
            java.lang.String r8 = ""
            java.lang.String r9 = "safeGetString"
            java.lang.String r12 = "result"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "actionName:"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = " data:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.RequestMerchantTransferTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.String r0 = "reportMerchantTransferResult"
            boolean r10 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r0)
            r0 = 0
            java.lang.String r2 = "fail"
            com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferResult r3 = r7.f164120a
            if (r10 == 0) goto La5
            boolean r10 = r11 instanceof org.json.JSONObject
            if (r10 == 0) goto L99
            org.json.JSONObject r11 = (org.json.JSONObject) r11
            r10 = 0
            r4 = 1
            boolean r5 = r11.has(r12)     // Catch: java.lang.Exception -> L46
            if (r5 != r4) goto L3e
            r5 = r4
            goto L3f
        L3e:
            r5 = r0
        L3f:
            if (r5 == 0) goto L4e
            java.lang.String r5 = r11.getString(r12)     // Catch: java.lang.Exception -> L46
            goto L4f
        L46:
            r5 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r9, r8, r5)
        L4e:
            r5 = r10
        L4f:
            java.lang.String r6 = "success"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r6)
            if (r5 == 0) goto L63
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
            r3.getClass()
            r3.f164100d = r6
            r3.f164101e = r11
            goto Lb0
        L63:
            boolean r5 = r11.has(r12)     // Catch: java.lang.Exception -> L73
            if (r5 != r4) goto L6a
            goto L6b
        L6a:
            r4 = r0
        L6b:
            if (r4 == 0) goto L7b
            java.lang.String r8 = r11.getString(r12)     // Catch: java.lang.Exception -> L73
            r10 = r8
            goto L7b
        L73:
            r12 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r9, r8, r12)
        L7b:
            java.lang.String r8 = "cancel"
            boolean r9 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r8)
            if (r9 == 0) goto L8e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8)
            r3.getClass()
            r3.f164100d = r8
            r3.f164101e = r11
            goto Lb0
        L8e:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)
            r3.getClass()
            r3.f164100d = r2
            r3.f164101e = r11
            goto Lb0
        L99:
            java.lang.String r8 = "wrong data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)
            r3.getClass()
            r3.f164100d = r2
            goto Lb0
        La5:
            java.lang.String r8 = "wrong actionName"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)
            r3.getClass()
            r3.f164100d = r2
        Lb0:
            com.tencent.mm.plugin.appbrand.jsapi.pay.RequestMerchantTransferTask r8 = r7.f164121b
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12214xea575707.a(r8, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b3.mo9541xb6136779(long, java.lang.String, java.lang.Object, int):boolean");
    }
}
