package jd3;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jd3.g f380705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.h0 f380706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f380707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f380708g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jd3.g gVar, lc3.h0 h0Var, org.json.JSONArray jSONArray, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f380705d = gVar;
        this.f380706e = h0Var;
        this.f380707f = jSONArray;
        this.f380708g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jd3.c(this.f380705d, this.f380706e, this.f380707f, this.f380708g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jd3.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jd3.g gVar = this.f380705d;
        lc3.h0 h0Var = this.f380706e;
        org.json.JSONObject jSONObject = this.f380707f.getJSONObject(this.f380708g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "getJSONObject(...)");
        gVar.getClass();
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        java.lang.String optString2 = jSONObject.optString("entry");
        java.lang.String optString3 = jSONObject.optString("customName");
        java.lang.String optString4 = jSONObject.optString("prefix");
        java.lang.String optString5 = jSONObject.optString("context");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
            java.lang.String str = gVar.e().f425864a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            java.lang.String Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).Bi(str, optString);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiInjectJsFiles", "injectFiles path:[" + optString + "] context:[" + optString5 + "] entry[" + optString2 + "] wxaPhysical:[" + Bi + ']');
            if (Bi.length() == 0) {
                return jd3.a.f380693f;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
            java.lang.String str2 = gVar.e().f425864a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var2).Ai(str2, Bi, optString3, optString4);
            ik1.b0 b0Var = new ik1.b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = Ai != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l) Ai).mo49307xcc440832(optString2, b0Var) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiInjectJsFiles", "readFile result is:" + mo49307xcc440832);
            if (mo49307xcc440832 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                return jd3.a.f380694g;
            }
            ae3.b bVar = ae3.b.f85882a;
            java.lang.Object value = b0Var.f373357a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            h0Var.E0(new java.lang.String(bArr, r26.c.f450398a), jd3.d.f380709a);
            return jd3.a.f380692e;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiInjectJsFiles", "injectFiles error fileSystem nil wxaPath:" + optString + " entry:" + optString2);
            return jd3.a.f380695h;
        }
    }
}
