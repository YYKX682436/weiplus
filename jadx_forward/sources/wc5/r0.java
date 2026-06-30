package wc5;

/* loaded from: classes10.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f526167d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f526168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f526169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(wc5.y0 y0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526169f = y0Var;
        this.f526170g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wc5.r0 r0Var = new wc5.r0(this.f526169f, this.f526170g, interfaceC29045xdcb5ca57);
        r0Var.f526168e = obj;
        return r0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f526167d;
        wc5.y0 y0Var2 = this.f526169f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f526168e;
            long j17 = y0Var2.f526194i;
            this.f526168e = y0Var;
            this.f526167d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
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
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f526168e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.z0.g(y0Var);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        wc5.q0 q0Var = new wc5.q0(y0Var2, this.f526170g, null);
        this.f526168e = null;
        this.f526167d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, q0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
