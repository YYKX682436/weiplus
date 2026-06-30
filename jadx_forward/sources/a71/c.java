package a71;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83438g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83439h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83435d = i17;
        this.f83436e = str;
        this.f83437f = str2;
        this.f83438g = str3;
        this.f83439h = str4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a71.c(this.f83435d, this.f83436e, this.f83437f, this.f83438g, this.f83439h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        a71.c cVar = (a71.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPolicyCgi isAgree:");
        int i17 = this.f83435d;
        sb6.append(i17);
        sb6.append(" customInfo:");
        java.lang.String str = this.f83436e;
        sb6.append(str);
        sb6.append(" ticket:");
        java.lang.String str2 = this.f83437f;
        sb6.append(str2);
        sb6.append(" policyList:");
        java.lang.String str3 = this.f83438g;
        sb6.append(str3);
        sb6.append(" from:");
        sb6.append(this.f83439h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Account.AccountComplianceReceiver", sb6.toString());
        r45.ia5 ia5Var = new r45.ia5();
        ia5Var.f458422d = i17 == 1 ? 1 : 2;
        ia5Var.f458423e = 1;
        ia5Var.f458424f = str3;
        ia5Var.f458425g = str2;
        ia5Var.f458426h = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5280;
        lVar.f152199c = "/cgi-bin/micromsg-bin/policyagreementop";
        lVar.f152197a = ia5Var;
        lVar.f152198b = new r45.ja5();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(lVar.a());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new a71.b(a17, this.f83435d, this.f83436e, this.f83437f, this.f83438g, null), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
