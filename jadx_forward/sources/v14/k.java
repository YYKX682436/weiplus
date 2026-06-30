package v14;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f514083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.p f514084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514086g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f514087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v14.p pVar, java.lang.String str, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f514084e = pVar;
        this.f514085f = str;
        this.f514086g = str2;
        this.f514087h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v14.k(this.f514084e, this.f514085f, this.f514086g, this.f514087h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f514083d;
        v14.p pVar = this.f514084e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kv.b0 b0Var = pVar.f514110d;
            this.f514083d = 1;
            obj = ((hn1.s) b0Var).hj(this.f514085f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = this.f514086g;
        pVar.f514111e = str;
        this.f514087h.mo146xb9724478(str);
        c01.b9.f118602c.b((java.lang.String) obj);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        v14.j jVar = new v14.j(null);
        this.f514083d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, jVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
