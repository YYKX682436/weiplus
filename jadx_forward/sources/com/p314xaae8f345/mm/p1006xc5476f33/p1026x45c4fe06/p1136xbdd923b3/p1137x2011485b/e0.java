package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

/* loaded from: classes7.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f165805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f165806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fj1.y f165807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef f165808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(fh1.z zVar, fj1.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef c12319xdc45d1ef, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f165806e = zVar;
        this.f165807f = yVar;
        this.f165808g = c12319xdc45d1ef;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.e0(this.f165806e, this.f165807f, this.f165808g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f165805d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fh1.z zVar = this.f165806e;
            this.f165805d = 1;
            obj = zVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAMagicBrushFrameLauncher", "bizHostImpl.ensureMBServiceReady()==false, bizInstance:".concat(this.f165806e.c()));
            return f0Var;
        }
        this.f165807f.d().a0(this.f165806e);
        fh1.z zVar2 = this.f165806e;
        fj1.y yVar = this.f165807f;
        zVar2.f344169j = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.d0(yVar, zVar2);
        java.lang.String lowerCase = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.b(yVar.f344680g).toString().toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        fh1.z zVar3 = this.f165806e;
        java.lang.String c17 = this.f165807f.c();
        org.json.JSONObject jSONObject = (org.json.JSONObject) ((jz5.n) this.f165807f.f344688o).mo141623x754a37bb();
        zVar3.getClass();
        zVar3.e(new fh1.x(zVar3, c17, lowerCase, jSONObject));
        fh1.z zVar4 = this.f165806e;
        java.lang.String c18 = this.f165807f.c();
        java.lang.String str = this.f165808g.f165779h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 appPkgInfo = this.f165807f.e().f387385r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appPkgInfo, "appPkgInfo");
        zVar4.getClass();
        zVar4.e(new fh1.t(zVar4, c18, lowerCase, str, appPkgInfo));
        return f0Var;
    }
}
