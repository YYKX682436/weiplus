package gu0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.l f357348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu0.o f357349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu0.a0 a0Var, hu0.l lVar, hu0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357347e = a0Var;
        this.f357348f = lVar;
        this.f357349g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.u(this.f357347e, this.f357348f, this.f357349g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357346d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                hu0.a0 a0Var = this.f357347e;
                this.f357346d = 1;
                if (a0Var.P6(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.PreviewUI", "attachRenderView failed: " + e17.getMessage());
        }
        this.f357348f.R6(true);
        this.f357349g.O6();
        return jz5.f0.f384359a;
    }
}
