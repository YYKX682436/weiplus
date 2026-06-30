package oz;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f431697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oz.g f431698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f431699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, oz.g gVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f431697e = f9Var;
        this.f431698f = gVar;
        this.f431699g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new oz.k(this.f431697e, this.f431698f, this.f431699g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oz.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object ij6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f431696d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f431697e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dg0.f fVar = (dg0.f) i95.n0.c(dg0.f.class);
            java.lang.String z07 = f9Var.z0();
            java.lang.String str = z07 == null ? "" : z07;
            java.lang.String Q0 = f9Var.Q0();
            cg0.a aVar2 = new cg0.a(str, Q0 == null ? "" : Q0, f9Var.m124847x74d37ac6(), f9Var.I0(), f9Var.mo78012x3fdd41df(), false, 32, null);
            aVar2.f122574h = true;
            aVar2.f122575i = this.f431699g;
            this.f431696d = 1;
            ij6 = ((ig0.o) fVar).ij(aVar2, this);
            if (ij6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ij6 = obj;
        }
        cg0.b bVar = (cg0.b) ij6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadExecutor", "downloadVoice: done, msgId=" + f9Var.m124847x74d37ac6() + ", result=" + bVar.f122576a);
        this.f431698f.mo157473x57429edc(bVar.f122576a == cg0.c.f122577d ? 0 : -1);
        return jz5.f0.f384359a;
    }
}
