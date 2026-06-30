package g0;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f348899d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f348900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.r f348901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d1.g f348902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.z f348903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1.g f348904i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g0.r rVar, d1.g gVar, s1.z zVar, d1.g gVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348901f = rVar;
        this.f348902g = gVar;
        this.f348903h = zVar;
        this.f348904i = gVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        g0.q qVar = new g0.q(this.f348901f, this.f348902g, this.f348903h, this.f348904i, interfaceC29045xdcb5ca57);
        qVar.f348900e = obj;
        return qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g0.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f348899d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f348900e;
            g0.r rVar = this.f348901f;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new g0.p(rVar, this.f348904i, null), 3, null);
            g0.e eVar = rVar.f348871e;
            if (eVar == null) {
                eVar = rVar.f348870d;
            }
            this.f348899d = 1;
            if (eVar.a(this.f348902g, this.f348903h, this) == aVar) {
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
