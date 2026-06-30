package c01;

/* loaded from: classes.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118772d;

    /* renamed from: e, reason: collision with root package name */
    public int f118773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c01.j1 f118774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118776h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(c01.j1 j1Var, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f118774f = j1Var;
        this.f118775g = str;
        this.f118776h = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c01.i1(this.f118774f, this.f118775g, this.f118776h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c01.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        c01.j1 j1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f118773e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c01.k1 k1Var = c01.k1.f118812a;
            c01.j1 j1Var2 = this.f118774f;
            this.f118772d = j1Var2;
            this.f118773e = 1;
            obj = k1Var.a(this.f118775g, this.f118776h, this);
            if (obj == aVar) {
                return aVar;
            }
            j1Var = j1Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j1Var = (c01.j1) this.f118772d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        j1Var.a(((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f384359a;
    }
}
