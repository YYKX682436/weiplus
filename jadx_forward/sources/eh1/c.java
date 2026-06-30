package eh1;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f334438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f334439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh1.d f334440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f334441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, eh1.d dVar, int i17) {
        super(0);
        this.f334438d = jSONObject;
        this.f334439e = yVar;
        this.f334440f = dVar;
        this.f334441g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.a T2;
        fh1.i iVar;
        org.json.JSONObject jSONObject = this.f334438d;
        int optInt = jSONObject.optInt("frameId", 0);
        int optInt2 = jSONObject.optInt("biz");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f334439e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = t37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) t37 : null;
        int i17 = this.f334441g;
        eh1.d dVar = this.f334440f;
        if (o6Var == null || (T2 = o6Var.T2()) == null || (iVar = (fh1.i) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1152x33528441.b) T2).f167269c.get(optInt2)) == null) {
            yVar.a(i17, dVar.o("fail biz instance not found"));
        } else {
            fh1.z zVar = (fh1.z) iVar;
            zVar.e(new fh1.u(zVar, optInt));
            dVar.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, dVar.u(str, jSONObject2));
        }
        return jz5.f0.f384359a;
    }
}
