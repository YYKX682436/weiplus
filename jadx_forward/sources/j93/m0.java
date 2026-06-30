package j93;

/* loaded from: classes.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f379970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f379971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j93.r0 r0Var, wi5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f379970d = r0Var;
        this.f379971e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j93.m0(this.f379970d, this.f379971e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        j93.m0 m0Var = (j93.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        m0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        j93.r0 r0Var = this.f379970d;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = r0Var.O6();
        if (O6 != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new j93.l0(r0Var, this.f379971e, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
