package yx0;

/* loaded from: classes5.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f548990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(yx0.b8 b8Var, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548989e = b8Var;
        this.f548990f = f17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.m5(this.f548989e, this.f548990f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.m5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548988d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pp0.p0 p0Var = this.f548989e.K;
            if (p0Var == null) {
                return null;
            }
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e c4013x695a957e = new com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e(this.f548990f * 2.0f);
            this.f548988d = 1;
            if (p0Var.t(c4013x695a957e, this) == aVar) {
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
