package je2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f380792d;

    /* renamed from: e, reason: collision with root package name */
    public int f380793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jm4 f380794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ je2.t f380795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.jm4 jm4Var, je2.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f380794f = jm4Var;
        this.f380795g = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new je2.s(this.f380794f, this.f380795g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((je2.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        je2.t tVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f380793e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.kv1 kv1Var = this.f380794f.f459466f;
            if (kv1Var != null) {
                dk2.u7 u7Var = dk2.u7.f315714a;
                je2.t tVar2 = this.f380795g;
                this.f380792d = tVar2;
                this.f380793e = 1;
                if (u7Var.k(kv1Var, this) == aVar) {
                    return aVar;
                }
                tVar = tVar2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tVar = (je2.t) this.f380792d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        tVar.Q6();
        return jz5.f0.f384359a;
    }
}
