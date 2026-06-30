package mx0;

/* loaded from: classes5.dex */
public final class g7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413538d = c10977x8e40eced;
        this.f413539e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.g7(this.f413538d, this.f413539e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.g7 g7Var = (mx0.g7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        wx0.e0 m47299x698bc542;
        wx0.v0 m47304xa4a16ade;
        wx0.s0 m47303x63dc8ed6;
        mx0.c m47300xde982615;
        wx0.b1 m47318xe5196c70;
        wx0.c0 m47295xea94ef48;
        wx0.g1 m47323x72600261;
        wx0.k0 m47301xa4e05a8e;
        wx0.z0 m47309xd66ca7e6;
        wx0.f m47294x827fd77;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413538d;
        java.lang.String M = c10977x8e40eced.f151090v.M();
        int i17 = 0;
        if (!(!(M == null || r26.n0.N(M))) && !c10977x8e40eced.K) {
            i17 = this.f413539e;
        }
        m47299x698bc542 = c10977x8e40eced.m47299x698bc542();
        float f17 = i17;
        m47299x698bc542.a(f17);
        m47304xa4a16ade = c10977x8e40eced.m47304xa4a16ade();
        m47304xa4a16ade.a(f17);
        m47303x63dc8ed6 = c10977x8e40eced.m47303x63dc8ed6();
        m47303x63dc8ed6.a(f17);
        m47300xde982615 = c10977x8e40eced.m47300xde982615();
        m47300xde982615.a(f17);
        m47318xe5196c70 = c10977x8e40eced.m47318xe5196c70();
        m47318xe5196c70.a(f17);
        m47295xea94ef48 = c10977x8e40eced.m47295xea94ef48();
        m47295xea94ef48.a(f17);
        m47323x72600261 = c10977x8e40eced.m47323x72600261();
        m47323x72600261.a(f17);
        m47301xa4e05a8e = c10977x8e40eced.m47301xa4e05a8e();
        m47301xa4e05a8e.a(f17);
        m47309xd66ca7e6 = c10977x8e40eced.m47309xd66ca7e6();
        m47309xd66ca7e6.a(f17);
        m47294x827fd77 = c10977x8e40eced.m47294x827fd77();
        m47294x827fd77.a(f17);
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 c10897xb8eb1396 = c10977x8e40eced.N;
        if (c10897xb8eb1396 != null) {
            c10897xb8eb1396.m46835x2627ce99(i17);
        }
        return jz5.f0.f384359a;
    }
}
