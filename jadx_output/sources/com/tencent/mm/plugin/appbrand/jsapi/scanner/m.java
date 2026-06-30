package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes7.dex */
public class m implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.scanner.p f82968c;

    public m(com.tencent.mm.plugin.appbrand.jsapi.scanner.p pVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82968c = pVar;
        this.f82966a = c0Var;
        this.f82967b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        java.lang.String str2;
        int i27 = 0;
        com.tencent.mm.plugin.appbrand.jsapi.scanner.p.f82971g = false;
        if (i17 != (this.f82968c.hashCode() & 65535)) {
            return false;
        }
        if (i18 == -1) {
            java.lang.String encodeToString = android.util.Base64.encodeToString(new byte[0], 2);
            if (intent != null) {
                str2 = intent.getStringExtra("key_scan_result");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_scan_result_raw");
                if (byteArrayExtra != null) {
                    encodeToString = android.util.Base64.encodeToString(byteArrayExtra, 2);
                }
                str = intent.getStringExtra("key_scan_result_code_name");
                i19 = com.tencent.mm.plugin.scanner.j1.a(str);
                i27 = intent.getIntExtra("key_scan_result_code_version", 0);
            } else {
                str = null;
                i19 = 0;
                str2 = "";
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("charSet", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            hashMap.put("rawData", encodeToString);
            hashMap.put("codeVersion", java.lang.Integer.valueOf(i27));
            if (i19 != 19 && i19 != 22) {
                hashMap.put("result", str2);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                hashMap.put("scanType", str != null ? str : "");
                this.f82966a.a(this.f82967b, this.f82968c.p("ok", hashMap));
                return true;
            }
            hashMap.put("result", i19 != 22 ? str2 : "");
            hashMap.put("scanType", i19 == 22 ? "WX_CODE" : "QR_CODE");
            if (com.tencent.mars.comm.NetStatusUtil.isConnected(this.f82966a.getF147807d())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiScanCode", "online mode");
                com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask jsApiScanCode$GetA8KeyTask = new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanCode$GetA8KeyTask();
                jsApiScanCode$GetA8KeyTask.f82936f = str2;
                jsApiScanCode$GetA8KeyTask.f82939i = i19;
                jsApiScanCode$GetA8KeyTask.f82940m = i27;
                jsApiScanCode$GetA8KeyTask.f82941n = new com.tencent.mm.plugin.appbrand.jsapi.scanner.l(this, jsApiScanCode$GetA8KeyTask, hashMap, str2);
                jsApiScanCode$GetA8KeyTask.d();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiScanCode", "offline mode");
                this.f82966a.a(this.f82967b, this.f82968c.p("ok", hashMap));
            }
        } else if (i18 != 0) {
            this.f82966a.a(this.f82967b, this.f82968c.o("fail"));
        } else {
            this.f82966a.a(this.f82967b, this.f82968c.o("cancel"));
        }
        return true;
    }
}
