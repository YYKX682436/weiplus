package k50;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f385727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f385728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f385729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f385730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385731h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, t21.v2 v2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f385728e = list;
        this.f385729f = f9Var;
        this.f385730g = v2Var;
        this.f385731h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new k50.c1(this.f385728e, this.f385729f, this.f385730g, this.f385731h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((k50.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f385727d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            k50.b1 b1Var = new k50.b1(this.f385728e, this.f385729f, this.f385730g, this.f385731h, null);
            this.f385727d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, b1Var, this) == aVar) {
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
