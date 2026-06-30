package ch2;

/* loaded from: classes10.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f122907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f122909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole f122910g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(ch2.o2 o2Var, r45.yx1 yx1Var, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122908e = o2Var;
        this.f122909f = yx1Var;
        this.f122910g = tXChorusRole;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ch2.i2 i2Var = new ch2.i2(this.f122908e, this.f122909f, this.f122910g, interfaceC29045xdcb5ca57);
        i2Var.f122907d = obj;
        return i2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch2.i2 i2Var = (ch2.i2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f122907d;
        gh2.f l76 = this.f122908e.l7();
        r45.yx1 yx1Var = this.f122909f;
        java.lang.String unique_id = yx1Var.f472992e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unique_id, "unique_id");
        java.lang.String song_mid = yx1Var.f472991d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_mid, "song_mid");
        l76.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l76.f353403f;
        gh2.d dVar = new gh2.d(l76, unique_id, song_mid);
        gh2.c[] cVarArr = gh2.c.f353399d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44 c6517xa6e83e44 = dVar.f353400a;
        boolean z17 = true;
        c6517xa6e83e44.f138703t = 1;
        c6517xa6e83e44.f138701r = ((om2.l) l76.m147920xbba4bfc0(om2.l.class)).P6();
        c6517xa6e83e44.f138702s = ((om2.l) l76.m147920xbba4bfc0(om2.l.class)).O6();
        concurrentHashMap.put(unique_id, dVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVReportSlice", "bindReportData: " + unique_id + ", " + song_mid);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2[] s2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2.f197211d;
        jSONObject.put("LoadSo", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2[] s2VarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2.f197211d;
        jSONObject.put("GetPlayResource", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2[] s2VarArr3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2.f197211d;
        jSONObject.put("ParsePlayResource", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2[] s2VarArr4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2.f197211d;
        jSONObject.put("ConvertAccompanyResource", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2[] s2VarArr5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.s2.f197211d;
        jSONObject.put("RequestSing", 0);
        h0Var.f391656d = jSONObject;
        ch2.h2 h2Var = new ch2.h2(h0Var);
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole = this.f122910g;
        if (!(tXChorusRole == null) && tXChorusRole != com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger) {
            z17 = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var2.f391656d = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new ch2.e2(this.f122909f, z17, this.f122908e, h0Var, p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new ch2.g2(h0Var2, z17, this.f122908e, this.f122909f, h0Var, null), 3, null), h2Var, this.f122910g, null), 3, null);
        return jz5.f0.f384359a;
    }
}
