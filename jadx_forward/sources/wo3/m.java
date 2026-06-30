package wo3;

/* loaded from: classes9.dex */
public class m extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f529731m = "";

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f529732n = "";

    /* renamed from: d, reason: collision with root package name */
    public int f529733d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f529734e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f529735f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f529736g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f529737h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f529738i;

    public m(java.lang.String str, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f529738i = hashMap;
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k());
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, str);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "" + i17);
        hashMap.put("sign", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(wo.w0.k() + "&" + str));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        gm0.j1.i();
        sb6.append(gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        hashMap.put("code_ver", sb6.toString());
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 568;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 49;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinequeryuser";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            f529731m = jSONObject.optString("limit_fee");
            f529732n = jSONObject.optString("is_show_order_detail");
            java.lang.String optString = jSONObject.optString("pay_amount");
            java.lang.String optString2 = jSONObject.optString("pay_number");
            java.lang.String optString3 = jSONObject.optString("card_logos");
            to3.c0.Ai().Vi(196629, f529731m);
            to3.c0.Ai().Vi(196641, f529732n);
            to3.c0.Ai().Vi(196645, optString);
            to3.c0.Ai().Vi(196646, optString2);
            to3.c0.Ai().Vi(196615, optString3);
            yo3.m.f545691e = optString3;
            jSONObject.optInt("retcode");
            jSONObject.optString("retmsg");
            this.f529733d = jSONObject.optInt("wx_error_type");
            this.f529734e = jSONObject.optString("wx_error_msg");
            this.f529735f = jSONObject.optString("get_code_flag");
            this.f529736g = jSONObject.optString("micropay_pause_flag");
            this.f529737h = jSONObject.optString("micropay_pause_word");
        }
    }
}
