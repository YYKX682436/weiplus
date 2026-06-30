package vh0;

/* loaded from: classes3.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f518457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f518458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f518460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f518461h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518458e = context;
        this.f518459f = str;
        this.f518460g = f9Var;
        this.f518461h = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vh0.o2(this.f518458e, this.f518459f, this.f518460g, this.f518461h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.o2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f518457d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f518457d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            k70.x Di = ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di();
            zh0.b bVar = new zh0.b(rVar);
            rVar.m(new zh0.a(Di, bVar));
            m11.b0 b0Var = this.f518461h;
            ((m11.j) Di).c(b0Var.f404166a, tg3.l1.a(this.f518460g), b0Var.f404173h, null, 0, bVar);
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
