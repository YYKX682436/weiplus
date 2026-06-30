package v14;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f514103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.p f514104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.k0 f514106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f514107h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514108i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f514109m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v14.p pVar, java.lang.String str, kv.k0 k0Var, boolean z17, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f514104e = pVar;
        this.f514105f = str;
        this.f514106g = k0Var;
        this.f514107h = z17;
        this.f514108i = str2;
        this.f514109m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v14.o(this.f514104e, this.f514105f, this.f514106g, this.f514107h, this.f514108i, this.f514109m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f514103d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            v14.n nVar = new v14.n(this.f514104e, this.f514105f, null);
            this.f514103d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, nVar, this);
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
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        v14.m mVar = new v14.m(this.f514106g, this.f514107h, this.f514105f, bitmap, this.f514104e, this.f514108i, this.f514109m, null);
        this.f514103d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, mVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
