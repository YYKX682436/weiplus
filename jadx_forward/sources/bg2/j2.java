package bg2;

/* loaded from: classes3.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f101724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f101725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f101726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(long j17, bg2.n2 n2Var, r45.f52 f52Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101724e = j17;
        this.f101725f = n2Var;
        this.f101726g = f52Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.j2(this.f101724e, this.f101725f, this.f101726g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.j2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101723d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = this.f101724e;
            this.f101723d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17 * 1000, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f101725f.Z6(this.f101726g);
        return jz5.f0.f384359a;
    }
}
