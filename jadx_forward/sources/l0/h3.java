package l0;

/* loaded from: classes14.dex */
public final class h3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f395754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.n f395755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f395756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(c0.n nVar, x0.i0 i0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f395755e = nVar;
        this.f395756f = i0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l0.h3(this.f395755e, this.f395756f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.h3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f395754d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = ((c0.p) this.f395755e).f118474a;
            l0.g3 g3Var = new l0.g3(this.f395756f);
            this.f395754d = 1;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var;
            q2Var.getClass();
            if (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l(q2Var, g3Var, this) == aVar) {
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
