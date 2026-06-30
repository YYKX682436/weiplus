package rm0;

/* loaded from: classes4.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f478947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f478948e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f478949f;

    /* renamed from: g, reason: collision with root package name */
    public int f478950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i f478951h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lm5.d f478952i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f478953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p944x882e457a.i iVar, lm5.d dVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478951h = iVar;
        this.f478952i = dVar;
        this.f478953m = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rm0.g(this.f478951h, this.f478952i, this.f478953m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478950g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p944x882e457a.i iVar = this.f478951h;
            this.f478947d = iVar;
            lm5.d dVar = this.f478952i;
            this.f478948e = dVar;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f478953m;
            this.f478949f = fVar;
            this.f478950g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            com.p314xaae8f345.mm.p944x882e457a.o oVar = iVar.f152179f;
            iVar.l().L(dVar, new rm0.e(oVar != null ? oVar.f152246d : 0, fVar, iVar, rVar));
            rVar.m(new rm0.f(iVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
