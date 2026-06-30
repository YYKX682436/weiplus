package mx0;

/* loaded from: classes5.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413577d = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.i4(this.f413577d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.i4 i4Var = (mx0.i4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.g3 m47316xc93d195a;
        mx0.g3 m47316xc93d195a2;
        mx0.l m47302x7ff74ce5;
        mx0.o1 m47307x8c723d89;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413577d;
        c10977x8e40eced.y0();
        c10977x8e40eced.R0();
        m47316xc93d195a = c10977x8e40eced.m47316xc93d195a();
        m47316xc93d195a.b(true);
        m47316xc93d195a2 = c10977x8e40eced.m47316xc93d195a();
        m47316xc93d195a2.mo9066x6761d4f();
        m47302x7ff74ce5 = c10977x8e40eced.m47302x7ff74ce5();
        m47302x7ff74ce5.c();
        m47307x8c723d89 = c10977x8e40eced.m47307x8c723d89();
        m47307x8c723d89.mo9067x901b6914(0);
        return jz5.f0.f384359a;
    }
}
