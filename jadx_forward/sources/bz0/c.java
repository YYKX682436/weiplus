package bz0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f118260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p3325xe03a0797.p3326xc267989b.r2 r2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f118260e = r2Var;
        this.f118261f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bz0.c(this.f118260e, this.f118261f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bz0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f118259d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f118260e;
            if (r2Var != null) {
                this.f118259d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6707xf4fd108e c6707xf4fd108e = bz0.f.f118270c;
        bz0.f fVar = bz0.f.f118268a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5 c17096x4dad80a5 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a;
        java.lang.String str = this.f118261f;
        qc0.d1 b17 = c17096x4dad80a5.b(str);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasReport24946", "getVideoReportInfo videoPath:" + str + " info:" + b17);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(b17.f442896a);
            jSONArray.put(b17.f442897b);
            jSONObject.put("s", jSONArray);
            jSONObject.put("d", b17.f442899d);
            jSONObject.put("f", java.lang.Float.valueOf(b17.f442898c));
            jSONObject.put("vb", b17.f442900e);
            jSONObject.put("ab", b17.f442903h);
            jSONObject.put("as", b17.f442905j);
            jSONObject.put("acc", b17.f442904i);
            jSONObject.put("t", b17.f442902g ? "265" : "264");
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6707xf4fd108e.f140467i = c6707xf4fd108e.b("exportMediaInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        return jz5.f0.f384359a;
    }
}
