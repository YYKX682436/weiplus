package hu3;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366737d;

    /* renamed from: e, reason: collision with root package name */
    public int f366738e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366740g = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hu3.u uVar = new hu3.u(this.f366740g, interfaceC29045xdcb5ca57);
        uVar.f366739f = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        hu3.n0 n0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f366738e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        hu3.n0 n0Var2 = this.f366740g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f366739f;
            pp0.q0 q0Var = (pp0.q0) i95.n0.c(pp0.q0.class);
            this.f366739f = y0Var2;
            this.f366737d = n0Var2;
            this.f366738e = 1;
            ((yy0.k8) q0Var).getClass();
            az0.i5 i5Var = az0.i5.f97090a;
            az0.i5.s(i5Var, true, null, false, 6, null);
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(i5Var.r().getF93115e(), new az0.f3(null), this);
            if (g17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = g17;
            n0Var = n0Var2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (hu3.n0) this.f366737d;
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f366739f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pp0.p0 p0Var = (pp0.p0) obj;
        if (p0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfessionalTemplateCorePlugin", "createImproveCamManager error");
            p3325xe03a0797.p3326xc267989b.z0.d(y0Var, "createImproveCamManager error", null, 2, null);
            return f0Var;
        }
        n0Var.f366695f = p0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "finished create createImproveCamManager");
        n0Var2.f366703q.start();
        this.f366739f = null;
        this.f366737d = null;
        this.f366738e = 2;
        n0Var2.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g18 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new hu3.a0(n0Var2, null), this);
        if (g18 != aVar) {
            g18 = f0Var;
        }
        return g18 == aVar ? aVar : f0Var;
    }
}
