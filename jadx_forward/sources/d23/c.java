package d23;

/* loaded from: classes.dex */
public final class c implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f307418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d23.g f307419f;

    public c(java.lang.String str, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a, d23.g gVar) {
        this.f307417d = str;
        this.f307418e = c20976x6ba6452a;
        this.f307419f = gVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFTSHotData SceneEnd: ");
            int i17 = aVar.f440818b;
            sb6.append(i17);
            sb6.append(' ');
            int i18 = aVar.f440819c;
            sb6.append(i18);
            sb6.append(' ');
            java.lang.String str2 = aVar.f440820d;
            sb6.append(str2);
            sb6.append(' ');
            r45.ya1 ya1Var = (r45.ya1) aVar.f440822f;
            sb6.append(ya1Var != null ? ya1Var.m75945x2fec8307(1) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSHotSearchJSApi", sb6.toString());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ret", i18);
            jSONObject.put("errMsg", str2);
            jSONObject.put("requestId", this.f307417d);
            if (i17 == 0 && i18 == 0) {
                if (ya1Var == null || (str = ya1Var.m75945x2fec8307(1)) == null) {
                    str = "{}";
                }
                jSONObject.put("json", str);
            }
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f307418e;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new d23.b(this.f307419f, jSONObject, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
