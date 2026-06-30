package jb1;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f380249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f380250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jb1.i f380251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f380252d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, jb1.i iVar, yz5.a aVar) {
        this.f380249a = lVar;
        this.f380250b = i17;
        this.f380251c = iVar;
        this.f380252d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y3
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i4 res) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(res, "res");
        int ordinal = res.ordinal();
        jb1.i iVar = this.f380251c;
        int i17 = this.f380250b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f380249a;
        if (ordinal == 0) {
            iVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, iVar.u(str2, jSONObject));
            return;
        }
        if (ordinal == 1) {
            this.f380252d.mo152xb9724478();
            return;
        }
        if (ordinal != 2) {
            return;
        }
        iVar.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 3);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, iVar.u(str2, jSONObject2));
    }
}
