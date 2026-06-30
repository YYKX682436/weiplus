package ha3;

/* loaded from: classes15.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f361441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ha3.v vVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f361441d = vVar;
        this.f361442e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ha3.o(this.f361441d, this.f361442e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ha3.o oVar = (ha3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ha3.v vVar = this.f361441d;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = vVar.f361473b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100935xb0277d5();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = vVar.f361473b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100937xc9fc1b13(this.f361442e, 3);
        }
        return jz5.f0.f384359a;
    }
}
