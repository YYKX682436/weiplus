package hu3;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a f366678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a c16996x6c653a3a, hu3.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366678e = c16996x6c653a3a;
        this.f366679f = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hu3.k(this.f366678e, this.f366679f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f366677d;
        hu3.n0 n0Var = this.f366679f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select filter >> ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a c16996x6c653a3a = this.f366678e;
            sb6.append(c16996x6c653a3a.f237237e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
            this.f366677d = 1;
            obj = n0Var.h(c16996x6c653a3a, true, this);
            if (obj == aVar) {
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.view.Surface surface = (android.view.Surface) obj;
        if (surface != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "switch filter success");
            if (n0Var.f366697h == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "no select beauty , goto toggle render");
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                hu3.j jVar = new hu3.j(n0Var, surface, null);
                this.f366677d = 2;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, jVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
