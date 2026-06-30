package qi3;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f445266d;

    /* renamed from: e, reason: collision with root package name */
    public int f445267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.n f445268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f445269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f445270h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445271i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qi3.n nVar, long j17, java.lang.Long l17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f445268f = nVar;
        this.f445269g = j17;
        this.f445270h = l17;
        this.f445271i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qi3.k(this.f445268f, this.f445269g, this.f445270h, this.f445271i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi3.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        long j17 = this.f445269g;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f445267e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                qi3.n nVar = this.f445268f;
                java.lang.String str2 = nVar.f445283c;
                if (str2 == null) {
                    str2 = nVar.f445282b;
                }
                com.p314xaae8f345.mm.p944x882e457a.i b17 = qi3.m.f445280a.a(nVar, 1, new qi3.j(str2, this.f445269g, this.f445270h, this.f445271i)).b();
                this.f445266d = str2;
                this.f445267e = 1;
                obj = rm0.h.b(b17, this);
                if (obj == aVar) {
                    return aVar;
                }
                str = str2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) this.f445266d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
            pt0.e0 e0Var = pt0.f0.f439742b1;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(str, j17);
            if (k17 != null) {
                k17.m124849x5361953a(j17);
                k17.r1(fVar.b() ? 2 : 5);
                if (fVar.b()) {
                    r45.rr rrVar = (r45.rr) fVar.f152151d;
                    k17.o1(rrVar != null ? rrVar.f466663d : 0L);
                }
            } else {
                k17 = null;
            }
            if (k17 != null) {
                e0Var.s(str, j17, k17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BypSendHelper", e17, "sendBypTextMessage", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
