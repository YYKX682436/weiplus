package hu3;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366624e = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hu3.b0(this.f366624e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r2 mo9340x41012807;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f366623d;
        hu3.n0 n0Var = this.f366624e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f366623d = 1;
            if (n0Var.g(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                n0Var.f366695f = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "MaasManager release");
                i95.m c17 = i95.n0.c(pp0.q0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pp0.q0.od((pp0.q0) c17, false, 1, null);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pp0.p0 p0Var = n0Var.f366695f;
        if (p0Var != null && (mo9340x41012807 = p0Var.mo9340x41012807()) != null) {
            this.f366623d = 2;
            if (mo9340x41012807.C(this) == aVar) {
                return aVar;
            }
        }
        n0Var.f366695f = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "MaasManager release");
        i95.m c172 = i95.n0.c(pp0.q0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c172, "getService(...)");
        pp0.q0.od((pp0.q0) c172, false, 1, null);
        return jz5.f0.f384359a;
    }
}
