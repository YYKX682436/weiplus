package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* loaded from: classes7.dex */
public class m implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p f164501c;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164501c = pVar;
        this.f164499a = c0Var;
        this.f164500b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        int i19;
        java.lang.String str2;
        int i27 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f164504g = false;
        if (i17 != (this.f164501c.hashCode() & 65535)) {
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
                i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(str);
                i27 = intent.getIntExtra("key_scan_result_code_version", 0);
            } else {
                str = null;
                i19 = 0;
                str2 = "";
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("charSet", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            hashMap.put("rawData", encodeToString);
            hashMap.put("codeVersion", java.lang.Integer.valueOf(i27));
            if (i19 != 19 && i19 != 22) {
                hashMap.put("result", str2);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                hashMap.put("scanType", str != null ? str : "");
                this.f164499a.a(this.f164500b, this.f164501c.p("ok", hashMap));
                return true;
            }
            hashMap.put("result", i19 != 22 ? str2 : "");
            hashMap.put("scanType", i19 == 22 ? "WX_CODE" : "QR_CODE");
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this.f164499a.getF229340d())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiScanCode", "online mode");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12230x653fb2e0 c12230x653fb2e0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12230x653fb2e0();
                c12230x653fb2e0.f164469f = str2;
                c12230x653fb2e0.f164472i = i19;
                c12230x653fb2e0.f164473m = i27;
                c12230x653fb2e0.f164474n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.l(this, c12230x653fb2e0, hashMap, str2);
                c12230x653fb2e0.d();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiScanCode", "offline mode");
                this.f164499a.a(this.f164500b, this.f164501c.p("ok", hashMap));
            }
        } else if (i18 != 0) {
            this.f164499a.a(this.f164500b, this.f164501c.o("fail"));
        } else {
            this.f164499a.a(this.f164500b, this.f164501c.o("cancel"));
        }
        return true;
    }
}
