package hg2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f362912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f362914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.eu0 f362915h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362916i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362917m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gk2.e eVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, r45.eu0 eu0Var, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362912e = eVar;
        this.f362913f = context;
        this.f362914g = k0Var;
        this.f362915h = eu0Var;
        this.f362916i = str;
        this.f362917m = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hg2.o(this.f362912e, this.f362913f, this.f362914g, this.f362915h, this.f362916i, this.f362917m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hg2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f362911d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean l76 = ((mm2.c1) this.f362912e.a(mm2.c1.class)).l7();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            hg2.n nVar = new hg2.n(l76, this.f362914g, null);
            this.f362911d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        l81.b1 b1Var = new l81.b1();
        r45.eu0 eu0Var = this.f362915h;
        java.lang.String str2 = this.f362916i;
        java.lang.String str3 = this.f362917m;
        gk2.e eVar = this.f362912e;
        java.lang.String m75945x2fec8307 = eu0Var.m75945x2fec8307(0);
        java.lang.String m75945x2fec83072 = eu0Var.m75945x2fec8307(1);
        b1Var.f398547b = m75945x2fec8307;
        b1Var.f398555f = m75945x2fec83072;
        b1Var.f398565k = 1205;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l();
        float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        }
        lVar.f159055b = (int) ((ae2.in.f85221a.h0() / 100.0f) * f17);
        lVar.f159059f = k91.s2.f387293d;
        lVar.f159067n = false;
        lVar.f159064k = k91.t2.f387301f;
        b1Var.G = lVar.a();
        b1Var.f398561i = new hg2.m(str2, str3, eVar, str);
        dk2.q4.f315471a.n(this.f362913f, this.f362912e, b1Var, this.f362914g);
        return jz5.f0.f384359a;
    }
}
