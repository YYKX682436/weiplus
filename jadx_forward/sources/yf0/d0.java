package yf0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f543058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f543059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f543060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f543061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f543062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f543063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(yf0.k0 k0Var, zf0.v0 v0Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543059e = k0Var;
        this.f543060f = v0Var;
        this.f543061g = i17;
        this.f543062h = i18;
        this.f543063i = c16564xb55e1d5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf0.d0(this.f543059e, this.f543060f, this.f543061g, this.f543062h, this.f543063i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543058d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yf0.k0 k0Var = this.f543059e;
            zf0.v0 v0Var = this.f543060f;
            int i18 = this.f543061g;
            int i19 = this.f543062h;
            yf0.c0 c0Var = new yf0.c0(this.f543063i, v0Var);
            this.f543058d = 1;
            if (yf0.k0.T6(k0Var, v0Var, i18, i19, c0Var, this) == aVar) {
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
