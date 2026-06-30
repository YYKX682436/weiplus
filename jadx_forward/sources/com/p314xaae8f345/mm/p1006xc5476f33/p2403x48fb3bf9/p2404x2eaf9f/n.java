package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 f263422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var) {
        super(0);
        this.f263422d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = this.f263422d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = r0Var.f263449a;
        java.lang.String str4 = "";
        if (c22633x83752a59.f292904t) {
            java.lang.String mo120156xb5887639 = c22633x83752a59.mo120156xb5887639();
            if (mo120156xb5887639 == null) {
                mo120156xb5887639 = "";
            }
            r0Var.Q0(mo120156xb5887639);
        }
        if (!r0Var.v0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) r0Var;
            e3Var.o1();
            byte[] byteArrayExtra = e3Var.d0().getByteArrayExtra("key_scan_qr_code_get_a8key_req");
            byte[] byteArrayExtra2 = e3Var.d0().getByteArrayExtra("key_scan_qr_code_get_a8key_resp");
            if (byteArrayExtra != null && byteArrayExtra2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "set outer get A8key result");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O = e3Var.O();
                O.getClass();
                if (byteArrayExtra.length > 0 && byteArrayExtra2.length > 0) {
                    r45.r83 r83Var = new r45.r83();
                    r45.s83 s83Var = new r45.s83();
                    try {
                        r83Var.mo11468x92b714fd(byteArrayExtra);
                        s83Var.mo11468x92b714fd(byteArrayExtra2);
                        O.f264930q = r83Var.f466148i.f454289d;
                    } catch (java.lang.Exception unused) {
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(O.f264930q) || s83Var.f467078d == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8Key", "ReqUrl or FullUrl is null");
                    } else {
                        O.f264931r = s83Var;
                        O.f264932s = r83Var;
                    }
                }
            }
            java.lang.String stringExtra = e3Var.d0().getStringExtra("geta8key_username");
            java.lang.String stringExtra2 = e3Var.d0().getStringExtra("msgUsername");
            java.lang.String stringExtra3 = e3Var.d0().getStringExtra("serverMsgID");
            int intExtra = e3Var.d0().getIntExtra("geta8key_msg_scene", 0);
            int intExtra2 = e3Var.d0().getIntExtra("weapp_scene", 0);
            java.lang.String stringExtra4 = e3Var.d0().getStringExtra("weapp_scene_note");
            java.lang.String stringExtra5 = e3Var.d0().getStringExtra("weapp_username");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O2 = e3Var.O();
            O2.getClass();
            O2.f264935v = stringExtra2 == null ? "" : stringExtra2;
            e3Var.O().f264917d = e3Var.d0().getStringExtra("kReferrer");
            e3Var.O().A = stringExtra3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O3 = e3Var.O();
            O3.getClass();
            O3.f264919f = stringExtra == null ? "" : stringExtra;
            e3Var.O().f264936w = intExtra;
            e3Var.O().f264937x = intExtra2;
            e3Var.O().f264938y = stringExtra4;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O4 = e3Var.O();
            O4.getClass();
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            O4.f264939z = stringExtra5;
            e3Var.O().f264916c = e3Var.k0(stringExtra);
            e3Var.O().f264920g = e3Var.d0().getStringExtra("geta8key_open_webview_appid");
            e3Var.O().f264918e = 0;
            e3Var.O().f264922i = e3Var.d0().getByteArrayExtra("geta8key_cookie");
            e3Var.O().f264928o = e3Var.d0().getIntExtra("key_wallet_region", 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O5 = e3Var.O();
            java.lang.String stringExtra6 = e3Var.d0().getStringExtra("key_function_id");
            O5.getClass();
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            O5.f264921h = stringExtra6;
            e3Var.O().F = e3Var.d0().getIntExtra("KMsgType", 0);
            e3Var.O().G = e3Var.d0().getIntExtra("KAppMsgType", 0);
            int intExtra3 = e3Var.d0().getIntExtra("geta8key_session_id", 0);
            if (intExtra3 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "set requestid:" + intExtra3);
                e3Var.O().f264923j = intExtra3;
            }
            int intExtra4 = e3Var.d0().getIntExtra("geta8key_init_request_id", 0);
            if (intExtra4 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.o1(), "set initRequestId:" + intExtra4);
                e3Var.O().f264924k = intExtra4;
            }
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O6 = e3Var.O();
                r45.r83 r83Var2 = e3Var.O().f264932s;
                if (r83Var2 == null || (str3 = r83Var2.G) == null) {
                    str3 = "";
                }
                O6.getClass();
                O6.f264935v = str3;
            }
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O7 = e3Var.O();
                r45.r83 r83Var3 = e3Var.O().f264932s;
                if (r83Var3 == null || (str2 = r83Var3.f466152p) == null) {
                    str2 = "";
                }
                O7.getClass();
                O7.f264919f = str2;
            }
            if (stringExtra3 == null || stringExtra3.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O8 = e3Var.O();
                r45.r83 r83Var4 = e3Var.O().f264932s;
                if (r83Var4 != null && (str = r83Var4.H) != null) {
                    str4 = str;
                }
                O8.A = str4;
            }
            r0Var.H0();
            r0Var.R0();
        }
        return jz5.f0.f384359a;
    }
}
