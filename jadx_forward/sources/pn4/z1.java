package pn4;

/* loaded from: classes4.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f438806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pn4.c2 f438808g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pn4.t1 f438809h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(java.lang.String str, int i17, java.lang.String str2, pn4.c2 c2Var, pn4.t1 t1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438805d = str;
        this.f438806e = i17;
        this.f438807f = str2;
        this.f438808g = c2Var;
        this.f438809h = t1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pn4.z1(this.f438805d, this.f438806e, this.f438807f, this.f438808g, this.f438809h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pn4.z1 z1Var = (pn4.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.jp3 jp3Var = new r45.jp3();
        jp3Var.f459539d = 1;
        jp3Var.f459541f = this.f438805d;
        java.util.LinkedList linkedList = jp3Var.f459540e;
        r45.cq6 cq6Var = new r45.cq6();
        cq6Var.f453324d = this.f438806e;
        cq6Var.f453327g = 114;
        cq6Var.f453325e = this.f438807f;
        linkedList.add(cq6Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 631;
        lVar.f152199c = "/cgi-bin/micromsg-bin/gettranstext";
        lVar.f152197a = jp3Var;
        lVar.f152198b = new r45.kp3();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(lVar.a());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new pn4.y1(a17, this.f438808g, this.f438809h, null), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
