package gd1;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f352046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd1.w f352048f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, gd1.w wVar) {
        super(1);
        this.f352046d = lVar;
        this.f352047e = i17;
        this.f352048f = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String t17;
        hd1.z result = (hd1.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        result.toString();
        boolean z17 = result instanceof hd1.y;
        gd1.w wVar = this.f352048f;
        int i17 = this.f352047e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f352046d;
        if (z17) {
            java.util.Map l17 = kz5.c1.l(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e((byte[]) ((hd1.y) result).f361975a)));
            wVar.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(lVar.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) lVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT) {
                java.lang.String str = android.text.TextUtils.isEmpty("fail:convert native buffer parameter fail. native buffer exceed size limit.") ? "fail:native buffer exceed size limit" : "fail:convert native buffer parameter fail. native buffer exceed size limit.";
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                t17 = wVar.u(str, jSONObject);
            } else {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                l17.put("errno", 0);
                t17 = wVar.t("ok", l17);
            }
            lVar.a(i17, t17);
        } else if (result instanceof hd1.x) {
            hd1.x xVar = (hd1.x) result;
            java.lang.String str4 = "fail:" + xVar.f361974b;
            int i18 = xVar.f361973a;
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(wVar, i18, str4, kz5.c1.i(new jz5.l("errCode", java.lang.Integer.valueOf(i18)))));
        }
        return jz5.f0.f384359a;
    }
}
