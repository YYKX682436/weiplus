package b54;

/* loaded from: classes4.dex */
public final class d implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb4.k f18100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18101b;

    public d(eb4.k kVar, java.lang.String str) {
        this.f18100a = kVar;
        this.f18101b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        r3.e(r4, "retCode", r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:3:0x0017, B:5:0x002a, B:8:0x0032, B:13:0x003e, B:16:0x0045, B:18:0x0052, B:20:0x005c, B:23:0x006b, B:25:0x00a5, B:31:0x00b1), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:3:0x0017, B:5:0x002a, B:8:0x0032, B:13:0x003e, B:16:0x0045, B:18:0x0052, B:20:0x005c, B:23:0x006b, B:25:0x00a5, B:31:0x00b1), top: B:2:0x0017 }] */
    @Override // com.tencent.mm.plugin.sns.model.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "query failed"
            java.lang.String r1 = "OpFinderJsapiHandler"
            b54.e r2 = b54.e.f18102a
            eb4.k r3 = r13.f18100a
            java.lang.String r4 = r13.f18101b
            java.lang.String r5 = "opQueryFinderFollowState, ret="
            java.lang.String r6 = "onCallback"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opQueryFinderFollowState$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r8 = -1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r9.<init>(r5)     // Catch: java.lang.Throwable -> Lb8
            r9.append(r14)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> Lb8
            com.tencent.mars.xlog.Log.i(r1, r5)     // Catch: java.lang.Throwable -> Lb8
            boolean r5 = r14 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto L2d
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lb8
            goto L2e
        L2d:
            r14 = 0
        L2e:
            r5 = 1
            r9 = 0
            if (r14 == 0) goto L3b
            int r10 = r14.length()     // Catch: java.lang.Throwable -> Lb8
            if (r10 != 0) goto L39
            goto L3b
        L39:
            r10 = r9
            goto L3c
        L3b:
            r10 = r5
        L3c:
            if (r10 == 0) goto L45
            b54.e.a(r2, r3, r4, r8, r0)     // Catch: java.lang.Throwable -> Lb8
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> Lb8
            return
        L45:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb8
            r10.<init>(r14)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r14 = "errCode"
            int r14 = r10.optInt(r14)     // Catch: java.lang.Throwable -> Lb8
            if (r14 == 0) goto L5c
            java.lang.String r14 = "server failed"
            b54.e.a(r2, r3, r4, r8, r14)     // Catch: java.lang.Throwable -> Lb8
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> Lb8
            return
        L5c:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb8
            r14.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r11 = "followFlg"
            int r11 = r10.optInt(r11)     // Catch: java.lang.Throwable -> Lb8
            r12 = 2
            if (r11 != r12) goto L6b
            r11 = r9
        L6b:
            java.lang.String r12 = "followState"
            r14.put(r12, r11)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r11 = "friendFollowCount"
            java.lang.String r12 = "followNum"
            int r12 = r10.optInt(r12)     // Catch: java.lang.Throwable -> Lb8
            r14.put(r11, r12)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r11 = "feedCount"
            java.lang.String r12 = "feedNum"
            int r10 = r10.optInt(r12)     // Catch: java.lang.Throwable -> Lb8
            r14.put(r11, r10)     // Catch: java.lang.Throwable -> Lb8
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb8
            r10.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r11 = "ret"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lb8
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r11 = "err_msg"
            java.lang.String r12 = "ok"
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r11 = "result"
            r10.put(r11, r14)     // Catch: java.lang.Throwable -> Lb8
            if (r4 == 0) goto Lad
            int r14 = r4.length()     // Catch: java.lang.Throwable -> Lb8
            if (r14 != 0) goto Lac
            goto Lad
        Lac:
            r5 = r9
        Lad:
            if (r5 != 0) goto Lce
            if (r3 == 0) goto Lce
            java.lang.String r14 = "retCode"
            r3.e(r4, r14, r10)     // Catch: java.lang.Throwable -> Lb8
            goto Lce
        Lb8:
            r14 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "opQueryFinderFollowState, exp="
            r5.<init>(r9)
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            com.tencent.mars.xlog.Log.e(r1, r14)
            b54.e.a(r2, r3, r4, r8, r0)
        Lce:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b54.d.a(java.lang.Object):void");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opQueryFinderFollowState$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opQueryFinderFollowState$1");
    }
}
