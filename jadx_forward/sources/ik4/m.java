package ik4;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.p f373478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f373479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ik4.p pVar, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373478d = pVar;
        this.f373479e = interfaceC26164x73fc6bc6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ik4.m(this.f373478d, this.f373479e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ik4.m mVar = (ik4.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ik4.p pVar = this.f373478d;
        pVar.f("onPrepared and trigger start2");
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f373479e;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100975x68ac462();
        }
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100984x40944be2(pVar.f373491f, pVar.f373494i);
        }
        pVar.f("onPrepared and trigger start3");
        return jz5.f0.f384359a;
    }
}
