package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class a5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f263786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f263787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f263788c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 f263791f;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, org.json.JSONObject jSONObject, android.content.Intent intent, android.content.Context context, java.lang.String str) {
        this.f263791f = j4Var;
        this.f263786a = q5Var;
        this.f263787b = jSONObject;
        this.f263788c = intent;
        this.f263789d = context;
        this.f263790e = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f263786a;
        if (!K0 || jSONObject == null) {
            q5Var.a(str, null);
            return;
        }
        java.lang.String optString = jSONObject.optString("imgPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var = this.f263791f;
        j4Var.f263894f = optString;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("imgPath is null", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("img_path", j4Var.f263894f);
        org.json.JSONObject optJSONObject = this.f263787b.optJSONObject("tailInfo");
        if (optJSONObject != null) {
            hashMap.put("tail_url", optJSONObject.optString("url", ""));
        }
        java.lang.String str2 = j4Var.f263894f;
        android.content.Intent intent = this.f263788c;
        intent.putExtra("image_path", str2);
        intent.putExtra("webview_params", hashMap);
        this.f263791f.n(this.f263788c, this.f263789d, this.f263787b, hashMap, this.f263790e, this.f263786a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
