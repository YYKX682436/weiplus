package xx0;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f539487d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f539489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xx0.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539489f = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xx0.y yVar = new xx0.y(this.f539489f, interfaceC29045xdcb5ca57);
        yVar.f539488e = obj;
        return yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx0.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539487d;
        xx0.d0 d0Var = this.f539489f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f539488e;
            xx0.i iVar = d0Var.f539411f;
            vt3.r rVar = d0Var.f539410e;
            this.f539488e = y0Var;
            this.f539487d = 1;
            if (iVar.c(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f539488e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                y0Var2 = y0Var3;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(y0Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xx0.x(d0Var, (java.util.List) obj, null), 2, null);
                return jz5.f0.f384359a;
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var4 = (p3325xe03a0797.p3326xc267989b.y0) this.f539488e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = y0Var4;
        }
        xx0.i iVar2 = d0Var.f539411f;
        vt3.r rVar2 = d0Var.f539410e;
        this.f539488e = y0Var;
        this.f539487d = 2;
        java.lang.Object a17 = iVar2.a(rVar2, this);
        if (a17 == aVar) {
            return aVar;
        }
        y0Var2 = y0Var;
        obj = a17;
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xx0.x(d0Var, (java.util.List) obj, null), 2, null);
        return jz5.f0.f384359a;
    }
}
