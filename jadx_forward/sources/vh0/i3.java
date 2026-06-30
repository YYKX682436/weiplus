package vh0;

/* loaded from: classes8.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.p3 f518415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50 f518416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(vh0.p3 p3Var, com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50 c10698x53096d50, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518415d = p3Var;
        this.f518416e = c10698x53096d50;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vh0.i3(this.f518415d, this.f518416e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vh0.i3 i3Var = (vh0.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vh0.d1 d1Var = (vh0.d1) ((jz5.n) this.f518415d.f518471m).mo141623x754a37bb();
        com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50 extendedAgreement = this.f518416e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extendedAgreement, "extendedAgreement");
        ((vh0.f2) d1Var).Di("yuanbao_unified_scene", new com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040(extendedAgreement.f149398d, extendedAgreement.f149399e, extendedAgreement.f149400f, extendedAgreement.f149401g, extendedAgreement.f149402h, extendedAgreement.f149403i), true);
        return jz5.f0.f384359a;
    }
}
