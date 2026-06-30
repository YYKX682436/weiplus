package df2;

/* loaded from: classes3.dex */
public final class e8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f311574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d42 f311575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f311576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(df2.s8 s8Var, r45.d42 d42Var, r45.ch1 ch1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311574d = s8Var;
        this.f311575e = d42Var;
        this.f311576f = ch1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.e8(this.f311574d, this.f311575e, this.f311576f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.e8 e8Var = (df2.e8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        p3325xe03a0797.p3326xc267989b.a1 a1Var = p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED;
        r45.ch1 ch1Var = this.f311576f;
        r45.d42 d42Var = this.f311575e;
        df2.s8 s8Var = this.f311574d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.b(s8Var, p0Var, a1Var, new df2.d8(d42Var, ch1Var, s8Var, null));
        return jz5.f0.f384359a;
    }
}
