package ls4;

/* loaded from: classes8.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f402627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m80 f402628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.fc5 f402630g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.m80 m80Var, ls4.u uVar, r45.fc5 fc5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f402628e = m80Var;
        this.f402629f = uVar;
        this.f402630g = fc5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ls4.s(this.f402628e, this.f402629f, this.f402630g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ls4.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f402627d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = this.f402628e.f461762e.f463185d;
            this.f402627d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f402629f.h(this.f402630g);
        return jz5.f0.f384359a;
    }
}
