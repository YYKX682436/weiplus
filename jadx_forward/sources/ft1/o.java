package ft1;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f348038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft1.q f348039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f348041g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f348042h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ft1.q qVar, java.lang.String str, int i17, c01.o8 o8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348039e = qVar;
        this.f348040f = str;
        this.f348041g = i17;
        this.f348042h = o8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ft1.o(this.f348039e, this.f348040f, this.f348041g, this.f348042h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ft1.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f348038d;
        java.lang.String str = this.f348040f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f348038d = 1;
            obj = ft1.q.b(this.f348039e, str, this.f348041g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypGetContactInterceptor", "getContact result: %s, success: %s", str, java.lang.Boolean.valueOf(booleanValue));
        c01.o8 o8Var = this.f348042h;
        if (o8Var != null) {
            o8Var.a(str, booleanValue);
        }
        return jz5.f0.f384359a;
    }
}
