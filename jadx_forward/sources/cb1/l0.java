package cb1;

/* loaded from: classes4.dex */
public class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.m0 f121800c;

    public l0(cb1.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f121800c = m0Var;
        this.f121798a = v5Var;
        this.f121799b = i17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.gq3 gq3Var = (r45.gq3) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        cb1.m0 m0Var = this.f121800c;
        int i17 = this.f121799b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121798a;
        if (gq3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData cgi failed, null response");
            hashMap.put("ret", -99);
            v5Var.a(i17, m0Var.p("fail: ErrMsg: cgi fail", hashMap));
            return null;
        }
        int i18 = gq3Var.f76492x92037252.f458492d;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), gq3Var.f76492x92037252.f458493e);
            hashMap.put("ret", java.lang.Integer.valueOf(gq3Var.f76492x92037252.f458492d));
            v5Var.a(i17, m0Var.p("fail: ErrMsg:" + gq3Var.f76492x92037252.f458493e, hashMap));
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData success");
        java.lang.String str = !android.text.TextUtils.isEmpty(gq3Var.f457012d) ? gq3Var.f457012d : "";
        java.lang.String str2 = android.text.TextUtils.isEmpty(gq3Var.f457014f) ? "" : gq3Var.f457014f;
        int i19 = gq3Var.f457013e;
        java.util.LinkedList linkedList = gq3Var.f457015g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData auth_info:%s, auth_status:%d", str2, java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData user_info_json:%s", str);
        hashMap.put("userData", str);
        hashMap.put("authStatus", java.lang.Integer.valueOf(i19));
        hashMap.put("authInfo", str2);
        if (linkedList != null && linkedList.size() > 0) {
            hashMap.put("authGroupList", new org.json.JSONArray((java.util.Collection) linkedList));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData authGroupList:%s", new org.json.JSONArray((java.util.Collection) linkedList).toString());
        }
        v5Var.a(i17, m0Var.p("ok", hashMap));
        return null;
    }
}
