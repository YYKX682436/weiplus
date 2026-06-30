package xx0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f539482d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f539484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(xx0.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539484f = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xx0.w wVar = new xx0.w(this.f539484f, interfaceC29045xdcb5ca57);
        wVar.f539483e = obj;
        return wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx0.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539482d;
        xx0.d0 d0Var = this.f539484f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f539483e;
            xx0.i iVar = d0Var.f539411f;
            vt3.r rVar = d0Var.f539410e;
            this.f539483e = y0Var2;
            this.f539482d = 1;
            java.lang.Object a17 = iVar.a(rVar, this);
            if (a17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f539483e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = y0Var3;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xx0.v(d0Var, (java.util.List) obj, null), 2, null);
        return jz5.f0.f384359a;
    }
}
