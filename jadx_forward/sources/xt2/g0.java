package xt2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f538292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14976x4bd61e3f f538293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f538294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t42 f538295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f538296h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14976x4bd61e3f c14976x4bd61e3f, long j17, r45.t42 t42Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538293e = c14976x4bd61e3f;
        this.f538294f = j17;
        this.f538295g = t42Var;
        this.f538296h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.g0(this.f538293e, this.f538294f, this.f538295g, this.f538296h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f538292d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14976x4bd61e3f c14976x4bd61e3f = this.f538293e;
            long j17 = this.f538294f;
            r45.t42 t42Var = this.f538295g;
            java.lang.String str = this.f538296h;
            this.f538292d = 1;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14976x4bd61e3f.a(c14976x4bd61e3f, j17, t42Var, str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
