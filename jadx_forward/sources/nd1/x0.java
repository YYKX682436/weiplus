package nd1;

/* loaded from: classes7.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f417949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f417951f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f417952g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f417953h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nd1.y0 f417954i;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.util.ArrayList arrayList, int i17, nd1.y0 y0Var) {
        this.f417949d = w2Var;
        this.f417950e = e9Var;
        this.f417951f = c0Var;
        this.f417952g = arrayList;
        this.f417953h = i17;
        this.f417954i = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f417949d;
        java.lang.String mo14683xad58292c = w2Var != null ? w2Var.mo14683xad58292c() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417950e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = e9Var.mo32091x9a3f0ba2().x0().m52169xfdaa7672();
        if (android.text.TextUtils.equals(mo14683xad58292c, m52169xfdaa7672 != null ? m52169xfdaa7672.mo14683xad58292c() : null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa76722 = e9Var.mo32091x9a3f0ba2().x0().m52169xfdaa7672();
            if (m52169xfdaa76722 != null) {
                m52169xfdaa76722.K(oi1.n.f427140d, this.f417951f.f391645d ? new oi1.l("", this.f417952g) : null);
            }
            nd1.y0 y0Var = this.f417954i;
            y0Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            java.lang.String str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(this.f417953h, y0Var.u(str2, jSONObject));
        }
    }
}
