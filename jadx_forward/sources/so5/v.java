package so5;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uo5.q f492446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f492447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f492448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so5.y f492449h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(uo5.q qVar, int i17, boolean z17, so5.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492446e = qVar;
        this.f492447f = i17;
        this.f492448g = z17;
        this.f492449h = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so5.v(this.f492446e, this.f492447f, this.f492448g, this.f492449h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((so5.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492445d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(((uo5.l) this.f492446e).f511260d);
            so5.u uVar = new so5.u(this.f492447f, this.f492448g, this.f492449h);
            this.f492445d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) b17).a(uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
