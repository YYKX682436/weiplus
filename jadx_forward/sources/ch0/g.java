package ch0;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122741f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122742g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f122743h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f122744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122739d = i17;
        this.f122740e = str;
        this.f122741f = str2;
        this.f122742g = str3;
        this.f122743h = i18;
        this.f122744i = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch0.g(this.f122739d, this.f122740e, this.f122741f, this.f122742g, this.f122743h, this.f122744i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch0.g gVar = (ch0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f122739d;
        java.lang.String str = this.f122740e;
        su4.k2.j(941, i17, str, str, "", 0, true, this.f122741f, true, this.f122742g, "", this.f122743h, false, this.f122744i);
        return jz5.f0.f384359a;
    }
}
