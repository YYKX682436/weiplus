package fh1;

/* loaded from: classes7.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f344125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f344128g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fh1.x0 f344129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344130i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344131m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fh1.z zVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6, fh1.x0 x0Var, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f344126e = zVar;
        this.f344127f = str;
        this.f344128g = c11667xc7e59dd6;
        this.f344129h = x0Var;
        this.f344130i = str2;
        this.f344131m = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fh1.s(this.f344126e, this.f344127f, this.f344128g, this.f344129h, this.f344130i, this.f344131m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fh1.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f344125d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fh1.z zVar = this.f344126e;
            this.f344125d = 1;
            obj = zVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                fh1.x0 x0Var = this.f344129h;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String str2 = this.f344127f;
                java.lang.String str3 = this.f344130i;
                java.lang.String str4 = this.f344131m;
                jSONObject.put("appId", str2);
                jSONObject.put("envVersion", str3);
                jSONObject.put("appPath", str4);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                x0Var.G1("onMiniprogramPackageReady", jSONObject2);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.v.f165852b;
        java.lang.String c17 = this.f344126e.c();
        if (this.f344126e.f344168i != null) {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229376h;
            if (str == null) {
                str = "";
            }
        } else {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229376h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        java.lang.String str5 = str;
        java.lang.String str6 = this.f344127f;
        java.lang.String c18 = this.f344126e.c();
        fh1.z zVar2 = this.f344126e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745 c12411x6bc6c745 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1151x2011485b.p1153x32add612.C12411x6bc6c745(c18, zVar2.f344162c, zVar2.f344163d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = this.f344128g;
        this.f344125d = 2;
        if (pVar.a(c17, str5, str6, c12411x6bc6c745, c11667xc7e59dd6, this) == aVar) {
            return aVar;
        }
        fh1.x0 x0Var2 = this.f344129h;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.String str22 = this.f344127f;
        java.lang.String str32 = this.f344130i;
        java.lang.String str42 = this.f344131m;
        jSONObject3.put("appId", str22);
        jSONObject3.put("envVersion", str32);
        jSONObject3.put("appPath", str42);
        java.lang.String jSONObject22 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject22, "toString(...)");
        x0Var2.G1("onMiniprogramPackageReady", jSONObject22);
        return f0Var;
    }
}
