package bg2;

/* loaded from: classes3.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f101911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xg6 f101912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.x2 f101913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(so2.h1 h1Var, r45.xg6 xg6Var, bg2.x2 x2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101911e = h1Var;
        this.f101912f = xg6Var;
        this.f101913g = x2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.p2(this.f101911e, this.f101912f, this.f101913g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.p2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101910d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long m75939xb282bd08 = this.f101911e.f491917n.f491889a > 0 ? r8.f491891c * 1000 : this.f101912f.m75939xb282bd08(1);
            this.f101910d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(m75939xb282bd08, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bg2.x2.Y6(this.f101913g);
        return jz5.f0.f384359a;
    }
}
