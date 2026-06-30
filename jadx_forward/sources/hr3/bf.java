package hr3;

/* loaded from: classes.dex */
public final class bf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f364962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f364963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, hr3.pf pfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f364962d = h0Var;
        this.f364963e = pfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr3.bf(this.f364962d, this.f364963e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hr3.bf bfVar = (hr3.bf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bfVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        hr3.pf pfVar = this.f364963e;
        this.f364962d.f391656d = db5.e1.Q(pfVar.m80379x76847179(), pfVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), pfVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572493bd4), true, false, null);
        return jz5.f0.f384359a;
    }
}
