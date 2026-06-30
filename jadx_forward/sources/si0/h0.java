package si0;

/* loaded from: classes13.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f489615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f489616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(si0.l0 l0Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489615e = l0Var;
        this.f489616f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.h0(this.f489615e, this.f489616f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489614d;
        si0.l0 l0Var = this.f489615e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = l0Var.f489652v;
            if (r2Var != null) {
                this.f489614d = 1;
                if (((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        long j17 = this.f489616f;
        long j18 = (long) (j17 / l0Var.f489649s);
        l0Var.f489644n = j18;
        l0Var.f489643m = (j18 * 1.0d) / l0Var.f489645o.getDuration();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = l0Var.f489650t;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new si0.g0(l0Var, j17, null), 2, null);
        return jz5.f0.f384359a;
    }
}
