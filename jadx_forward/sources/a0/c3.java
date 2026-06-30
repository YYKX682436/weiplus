package a0;

/* loaded from: classes10.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f81632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.m3 f81633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f81634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f81635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(boolean z17, a0.m3 m3Var, float f17, float f18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81632e = z17;
        this.f81633f = m3Var;
        this.f81634g = f17;
        this.f81635h = f18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a0.c3(this.f81632e, this.f81633f, this.f81634g, this.f81635h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.c3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81631d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f81632e) {
                a0.m3 m3Var = this.f81633f;
                float f17 = this.f81634g;
                this.f81631d = 1;
                if (b0.o2.b(m3Var, f17, null, this, 2, null) == aVar) {
                    return aVar;
                }
            } else {
                a0.m3 m3Var2 = this.f81633f;
                float f18 = this.f81635h;
                this.f81631d = 2;
                if (b0.o2.b(m3Var2, f18, null, this, 2, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
