package yt3;

/* loaded from: classes10.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.a4 f547279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f547280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(yt3.a4 a4Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547279d = a4Var;
        this.f547280e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yt3.z3(this.f547279d, this.f547280e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yt3.z3 z3Var = (yt3.z3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yt3.c cVar = this.f547280e ? yt3.c.f546906d : yt3.c.f546907e;
        yt3.a4 a4Var = this.f547279d;
        a4Var.f546880f = cVar;
        a4Var.f546878d.s(cVar == yt3.c.f546906d ? com.p314xaae8f345.mm.R.raw.f79658x7c1c1250 : com.p314xaae8f345.mm.R.raw.f79657x766371e, com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231);
        return jz5.f0.f384359a;
    }
}
