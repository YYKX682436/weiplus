package wx0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f532089d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f532090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f532091f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wx0.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532091f = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wx0.w wVar = new wx0.w(this.f532091f, interfaceC29045xdcb5ca57);
        wVar.f532090e = obj;
        return wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.w) mo148xaf65a0fc((nx0.i2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f532089d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        wx0.c0 c0Var = this.f532091f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nx0.i2 i2Var = (nx0.i2) this.f532090e;
            yx0.b8 b8Var = c0Var.f531992g;
            this.f532089d = 1;
            p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.v6(i2Var, b8Var, null), 3, null);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        nx0.i2 f151135g = c0Var.e().getF151135g();
        if (f151135g == null || (str = f151135g.f422665a) == null) {
            str = "";
        }
        yy0.m7 m7Var = (yy0.m7) l0Var;
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.v6(m7Var, str, null), 3, null);
        return f0Var;
    }
}
