package gx0;

/* loaded from: classes5.dex */
public final class ld extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f358215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.c7 f358216g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, rv0.c7 c7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358214e = bfVar;
        this.f358215f = c4181x2248e1a3;
        this.f358216g = c7Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ld(this.f358214e, this.f358215f, this.f358216g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ld) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358213d;
        gx0.bf bfVar = this.f358214e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f358213d = 1;
            if (bfVar.s7(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return p3325xe03a0797.p3326xc267989b.l.e(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.kd(this.f358215f, this.f358216g, bfVar, null));
    }
}
