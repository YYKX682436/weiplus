package si1;

/* loaded from: classes7.dex */
public final class p1 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j f489815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f489816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f489817c;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        this.f489815a = jVar;
        this.f489816b = k0Var;
        this.f489817c = d0Var;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 d9Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.d9) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar = this.f489815a;
        if (jVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f489816b;
            k0Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty("fail limited use") ? "fail:limited use" : "fail limited use";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 700001);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            jVar.b(k0Var.u(str, jSONObject));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f489817c;
        d0Var.m(new si1.o1(d0Var, d9Var));
    }
}
