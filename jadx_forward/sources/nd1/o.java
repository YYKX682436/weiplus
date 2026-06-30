package nd1;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f417885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f417886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417887h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417888i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.p f417889m;

    public o(nd1.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, boolean z17, int i17, org.json.JSONObject jSONObject2, java.lang.String str) {
        this.f417889m = pVar;
        this.f417883d = yVar;
        this.f417884e = jSONObject;
        this.f417885f = z17;
        this.f417886g = i17;
        this.f417887h = jSONObject2;
        this.f417888i = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417883d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = yVar.t3().x0();
        int m52176x1538ad57 = x07.m52176x1538ad57();
        int optInt = this.f417884e.optInt("delta", 1);
        int size = yVar.t3().f156330f.size();
        nd1.p pVar = this.f417889m;
        int i17 = this.f417886g;
        if (size >= 2 && optInt >= m52176x1538ad57) {
            if (this.f417885f) {
                yVar.t3().Y0(optInt);
            } else {
                yVar.t3().S();
            }
            yVar.a(i17, pVar.o("ok"));
            return;
        }
        if (m52176x1538ad57 > 1) {
            x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k3(x07, optInt >= m52176x1538ad57 ? m52176x1538ad57 - 1 : optInt, "scene_jsapi_navigate_back", this.f417887h, new nd1.C29200x330112(this, yVar, i17), this.f417888i));
            return;
        }
        pVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:cannot navigate back at first page" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 201001);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar.a(i17, pVar.u(str, jSONObject));
    }
}
