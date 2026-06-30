package du0;

/* loaded from: classes.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f324866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f324868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f324869g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.l lVar, float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f324867e = lVar;
        this.f324868f = f17;
        this.f324869g = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du0.c0(this.f324867e, this.f324868f, this.f324869g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f324866d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            du0.b0 b0Var = new du0.b0(this.f324868f, this.f324869g, null);
            this.f324866d = 1;
            obj = p3325xe03a0797.p3326xc267989b.a4.c(2000L, b0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f324867e.mo146xb9724478((com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) obj);
        return jz5.f0.f384359a;
    }
}
