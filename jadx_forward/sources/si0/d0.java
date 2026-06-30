package si0;

/* loaded from: classes13.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f489582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f489583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(si0.l0 l0Var, double d17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489582e = l0Var;
        this.f489583f = d17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.d0(this.f489582e, this.f489583f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489581d;
        si0.l0 l0Var = this.f489582e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = l0Var.f489652v;
            if (r2Var != null) {
                this.f489581d = 1;
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
        org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af7 = l0Var.f489636f;
        if (c29699xf00d0af7 != null) {
            c29699xf00d0af7.m154895x3ae760af(this.f489583f);
        }
        org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af72 = l0Var.f489636f;
        if (c29699xf00d0af72 != null) {
            c29699xf00d0af72.m154877x5d03b04();
        }
        return jz5.f0.f384359a;
    }
}
