package yy0;

/* loaded from: classes5.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549725d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.m0 f549727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yy0.m0 m0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549727f = m0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yy0.l0 l0Var = new yy0.l0(this.f549727f, interfaceC29045xdcb5ca57);
        l0Var.f549726e = obj;
        return l0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yy0.m0 m0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549725d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yy0.m0 m0Var2 = this.f549727f;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                az0.l2 l2Var = az0.l2.f97189a;
                this.f549726e = m0Var2;
                this.f549725d = 1;
                java.lang.Object a17 = l2Var.a(this);
                if (a17 == aVar) {
                    return aVar;
                }
                m0Var = m0Var2;
                obj = a17;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0Var = (yy0.m0) this.f549726e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            m0Var.f549740d = ((java.lang.Boolean) obj).booleanValue() ? yy0.i0.f549672f : yy0.i0.f549670d;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return f0Var;
    }
}
