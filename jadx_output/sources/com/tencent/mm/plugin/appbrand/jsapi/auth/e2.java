package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class e2 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f79444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.f2 f79446c;

    public e2(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.f2 f2Var) {
        this.f79444a = e9Var;
        this.f79445b = i17;
        this.f79446c = f2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse = (com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse) appBrandProxyUIProcessTask$ProcessResult;
        java.util.HashMap hashMap = new java.util.HashMap(2);
        boolean z17 = jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse != null && jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse.f79353e == 0;
        com.tencent.mm.plugin.appbrand.jsapi.auth.f2 f2Var = this.f79446c;
        int i17 = this.f79445b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f79444a;
        if (z17) {
            hashMap.put("mobileTicket", jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse.f79352d);
            f2Var.getClass();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            e9Var.a(i17, f2Var.t("ok", hashMap));
            return;
        }
        if (jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse == null || (str = java.lang.Integer.valueOf(jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse.f79353e).toString()) == null) {
            str = "";
        }
        hashMap.put("errCode", str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail errCode:  ");
        sb6.append(jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse != null ? java.lang.Integer.valueOf(jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse.f79353e) : null);
        sb6.append(" errMsg: ");
        sb6.append(jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse != null ? jsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse.f79354f : null);
        java.lang.String sb7 = sb6.toString();
        f2Var.getClass();
        if (sb7 == null) {
            sb7 = "fail:jsapi invalid request data";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 101);
        e9Var.a(i17, f2Var.t(sb7, hashMap));
    }
}
