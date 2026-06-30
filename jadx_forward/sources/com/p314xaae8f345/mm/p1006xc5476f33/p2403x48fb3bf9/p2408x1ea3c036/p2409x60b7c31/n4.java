package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class n4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f263938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f263939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 f263941d;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, android.content.Intent intent, android.content.Context context) {
        this.f263941d = j4Var;
        this.f263938a = q5Var;
        this.f263939b = intent;
        this.f263940c = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f263938a;
        if (!K0 || jSONObject == null) {
            q5Var.a(str, null);
            return;
        }
        java.lang.String optString = jSONObject.optString("imgPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var = this.f263941d;
        j4Var.f263894f = optString;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j4Var.f263894f)) {
            q5Var.a("imgPath is null", null);
            return;
        }
        android.content.Intent intent = this.f263939b;
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", j4Var.f263894f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareCustomContent", "doTimeline, start activity");
        j45.l.o(this.f263940c, "sns", ".ui.SnsUploadUI", this.f263939b, 2, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
