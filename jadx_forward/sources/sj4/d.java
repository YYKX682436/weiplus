package sj4;

/* loaded from: classes9.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pj4.x1 f490362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pj4.j0 f490363c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f490364d;

    public d(java.lang.String str, pj4.x1 x1Var, pj4.j0 j0Var, yz5.a aVar) {
        this.f490361a = str;
        this.f490362b = x1Var;
        this.f490363c = j0Var;
        this.f490364d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public void a(k91.v5 v5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.ExtJumpInfoHandler", "onGetWeAppInfo() called with: info = " + v5Var);
        if (v5Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.f66875xa013b0d5, this.f490361a);
            pj4.x1 x1Var = this.f490362b;
            jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, x1Var.f436864e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w07 = v5Var.w0();
            jSONObject.put("version", w07 != null ? w07.f158977d : 0);
            jSONObject.put("versionType", x1Var.f436866g);
            java.lang.String str = v5Var.f68920x68aa7b8d;
            if (str == null) {
                str = "";
            }
            jSONObject.put("headImageURL", str);
            this.f490363c.f436674f = jSONObject.toString();
        }
        this.f490364d.mo152xb9724478();
    }
}
