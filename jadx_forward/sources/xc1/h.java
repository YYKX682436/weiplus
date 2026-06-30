package xc1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f534567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f534568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f534569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc1.l f534570g;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.lang.Object obj, int i17, xc1.l lVar) {
        this.f534567d = yVar;
        this.f534568e = obj;
        this.f534569f = i17;
        this.f534570g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f534567d;
        if (yVar != null && (mo32091x9a3f0ba2 = yVar.mo32091x9a3f0ba2()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = this.f534567d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba22 = yVar2 != null ? yVar2.mo32091x9a3f0ba2() : null;
            java.lang.Object obj = this.f534568e;
            mo32091x9a3f0ba2.T(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5.a(mo32091x9a3f0ba22, obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null, null), null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f534567d.mo48798x74292566()).f167252l = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar3 = this.f534567d;
        int i17 = this.f534569f;
        xc1.l lVar = this.f534570g;
        lVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        yVar3.a(i17, lVar.u(str, jSONObject));
    }
}
