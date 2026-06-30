package mx0;

/* loaded from: classes5.dex */
public final class r4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413818d = c10977x8e40eced;
        this.f413819e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.r4(this.f413818d, this.f413819e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.r4 r4Var = (mx0.r4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        wx0.e0 m47299x698bc542;
        wx0.s0 m47303x63dc8ed6;
        wx0.s0 m47303x63dc8ed62;
        mx0.x m47313xff1c565a;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413818d;
        yx0.b8 b8Var = c10977x8e40eced.f151090v;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = b8Var.M;
        boolean z17 = this.f413819e;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new yx0.x3(b8Var, z17, null), 3, null);
        m47299x698bc542 = c10977x8e40eced.m47299x698bc542();
        m47299x698bc542.b(z17);
        m47303x63dc8ed6 = c10977x8e40eced.m47303x63dc8ed6();
        m47303x63dc8ed62 = c10977x8e40eced.m47303x63dc8ed6();
        m47303x63dc8ed6.c(m47303x63dc8ed62.f532073m);
        m47313xff1c565a = c10977x8e40eced.m47313xff1c565a();
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10976xccdd83a4) ((mx0.q2) m47313xff1c565a).d().o().e()).m47286x48565ce1(z17);
        return jz5.f0.f384359a;
    }
}
