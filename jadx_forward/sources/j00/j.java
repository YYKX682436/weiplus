package j00;

/* loaded from: classes9.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f378330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f378331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f378332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f378333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f378334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f378335i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3325xe03a0797.p3326xc267989b.z zVar, p3325xe03a0797.p3326xc267989b.z zVar2, c00.j3 j3Var, boolean z17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f378331e = zVar;
        this.f378332f = zVar2;
        this.f378333g = j3Var;
        this.f378334h = z17;
        this.f378335i = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j00.j(this.f378331e, this.f378332f, this.f378333g, this.f378334h, this.f378335i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f378330d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j00.i iVar = new j00.i(this.f378331e, this.f378332f, this.f378333g, this.f378334h, this.f378335i, null);
            this.f378330d = 1;
            if (p3325xe03a0797.p3326xc267989b.a4.b(1000L, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
