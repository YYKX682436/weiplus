package pn4;

/* loaded from: classes4.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f438656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f438658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438659i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pn4.k1 f438660m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, java.lang.String str4, pn4.k1 k1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438654d = str;
        this.f438655e = str2;
        this.f438656f = i17;
        this.f438657g = str3;
        this.f438658h = i18;
        this.f438659i = str4;
        this.f438660m = k1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pn4.j1(this.f438654d, this.f438655e, this.f438656f, this.f438657g, this.f438658h, this.f438659i, this.f438660m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pn4.j1 j1Var = (pn4.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.jp3 jp3Var = new r45.jp3();
        jp3Var.f459539d = 1;
        jp3Var.f459541f = this.f438654d;
        java.util.LinkedList linkedList = jp3Var.f459540e;
        r45.cq6 cq6Var = new r45.cq6();
        cq6Var.f453326f = this.f438655e;
        cq6Var.f453324d = this.f438656f;
        cq6Var.f453329i = this.f438657g;
        cq6Var.f453327g = this.f438658h;
        cq6Var.f453325e = this.f438659i;
        linkedList.add(cq6Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 631;
        lVar.f152199c = "/cgi-bin/micromsg-bin/gettranstext";
        lVar.f152197a = jp3Var;
        lVar.f152198b = new r45.kp3();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(lVar.a());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new pn4.i1(a17, this.f438660m, null), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
