package b54;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b54.e f18102a = new b54.e();

    public static final /* synthetic */ void a(b54.e eVar, eb4.k kVar, java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
        eVar.b(kVar, str, i17, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:3:0x001f, B:5:0x003e, B:10:0x004a, B:13:0x005d), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:3:0x001f, B:5:0x003e, B:10:0x004a, B:13:0x005d), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(java.lang.String r7, org.json.JSONObject r8, eb4.k r9, ab4.n0 r10) {
        /*
            java.lang.String r0 = "OpFinderJsapiHandler"
            java.lang.String r1 = "opFinderFollow, paramsJson="
            java.lang.String r2 = "opFinderFollow"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "paramsJson"
            kotlin.jvm.internal.o.g(r8, r4)
            java.lang.String r4 = "callbacker"
            kotlin.jvm.internal.o.g(r9, r4)
            java.lang.String r4 = "landingPageData"
            kotlin.jvm.internal.o.g(r10, r4)
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            r5.append(r8)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L6d
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L6d
            s34.y r1 = new s34.y     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r5 = "finderUsername"
            java.lang.String r8 = r8.optString(r5)     // Catch: java.lang.Throwable -> L6d
            r1.f402829a = r8     // Catch: java.lang.Throwable -> L6d
            r5 = 1
            if (r8 == 0) goto L47
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L6d
            if (r8 != 0) goto L45
            goto L47
        L45:
            r8 = r4
            goto L48
        L47:
            r8 = r5
        L48:
            if (r8 == 0) goto L5d
            b54.e r8 = b54.e.f18102a     // Catch: java.lang.Throwable -> L6d
            java.lang.String r10 = "param err"
            r1 = -2
            r8.b(r9, r7, r1, r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = "opFinderFollow， finderUsername empty"
            com.tencent.mars.xlog.Log.e(r0, r7)     // Catch: java.lang.Throwable -> L6d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch: java.lang.Throwable -> L6d
            return r4
        L5d:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r8 = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance()     // Catch: java.lang.Throwable -> L6d
            b54.c r6 = new b54.c     // Catch: java.lang.Throwable -> L6d
            r6.<init>(r9, r7, r10, r1)     // Catch: java.lang.Throwable -> L6d
            r8.addAdFinderContract(r1, r5, r6)     // Catch: java.lang.Throwable -> L6d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch: java.lang.Throwable -> L6d
            return r5
        L6d:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "opFinderFollow, exp="
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.mars.xlog.Log.e(r0, r7)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b54.e.c(java.lang.String, org.json.JSONObject, eb4.k, ab4.n0):boolean");
    }

    public static final boolean d(android.content.Context context, java.lang.String str, org.json.JSONObject paramsJson, eb4.k callbacker, ab4.n0 landingPageData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("opOpenFinderProfile", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(paramsJson, "paramsJson");
        kotlin.jvm.internal.o.g(callbacker, "callbacker");
        kotlin.jvm.internal.o.g(landingPageData, "landingPageData");
        try {
            java.lang.String optString = paramsJson.optString("finderUsername");
            boolean z17 = optString == null || optString.length() == 0;
            b54.e eVar = f18102a;
            if (z17) {
                eVar.b(callbacker, str, -2, "param err");
                com.tencent.mars.xlog.Log.e("OpFinderJsapiHandler", "opOpenFinderProfile， finderUsername empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("opOpenFinderProfile", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
                return false;
            }
            boolean doJumpToFinderProfileUI = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(context, optString, landingPageData.o(), landingPageData.j(), 7);
            com.tencent.mars.xlog.Log.i("OpFinderJsapiHandler", "opOpenFinderProfile， paramsJson=" + paramsJson + ", ret=" + doJumpToFinderProfileUI);
            if (doJumpToFinderProfileUI) {
                eVar.b(callbacker, str, 0, "ok");
            } else {
                eVar.b(callbacker, str, -1, "jump failed");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("opOpenFinderProfile", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
            return doJumpToFinderProfileUI;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("OpFinderJsapiHandler", "opOpenFinderProfile, exp=" + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("opOpenFinderProfile", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x001f, B:5:0x0037, B:10:0x0043, B:13:0x0056), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x001f, B:5:0x0037, B:10:0x0043, B:13:0x0056), top: B:2:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(java.lang.String r6, org.json.JSONObject r7, eb4.k r8, ab4.n0 r9) {
        /*
            java.lang.String r0 = "OpFinderJsapiHandler"
            java.lang.String r1 = "opQueryFinderFollowState, paramsJson="
            java.lang.String r2 = "opQueryFinderFollowState"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "paramsJson"
            kotlin.jvm.internal.o.g(r7, r4)
            java.lang.String r4 = "callbacker"
            kotlin.jvm.internal.o.g(r8, r4)
            java.lang.String r4 = "landingPageData"
            kotlin.jvm.internal.o.g(r9, r4)
            r9 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r4.append(r7)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L66
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "finderUsername"
            java.lang.String r7 = r7.optString(r1)     // Catch: java.lang.Throwable -> L66
            r1 = 1
            if (r7 == 0) goto L40
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L66
            if (r4 != 0) goto L3e
            goto L40
        L3e:
            r4 = r9
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 == 0) goto L56
            b54.e r7 = b54.e.f18102a     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "param err"
            r4 = -2
            r7.b(r8, r6, r4, r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "opQueryFinderFollowState， finderUsername empty"
            com.tencent.mars.xlog.Log.e(r0, r6)     // Catch: java.lang.Throwable -> L66
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch: java.lang.Throwable -> L66
            return r9
        L56:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r4 = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance()     // Catch: java.lang.Throwable -> L66
            b54.d r5 = new b54.d     // Catch: java.lang.Throwable -> L66
            r5.<init>(r8, r6)     // Catch: java.lang.Throwable -> L66
            r4.getAdFinderContact(r7, r5)     // Catch: java.lang.Throwable -> L66
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch: java.lang.Throwable -> L66
            return r1
        L66:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "opQueryFinderFollowState out, exp="
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.mars.xlog.Log.e(r0, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b54.e.e(java.lang.String, org.json.JSONObject, eb4.k, ab4.n0):boolean");
    }

    public final void b(eb4.k kVar, java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
        com.tencent.mars.xlog.Log.i("OpFinderJsapiHandler", "callbackJs, retcode=" + i17 + ", errMsg=" + str2 + ", callbackId=" + str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", java.lang.Integer.valueOf(i17));
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("err_msg", str2);
        if (!(str == null || str.length() == 0) && kVar != null) {
            kVar.e(str, "retCode", hashMap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
    }
}
