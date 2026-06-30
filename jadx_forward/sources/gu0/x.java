package gu0;

/* loaded from: classes5.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f357375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.l f357376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu0.o f357377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hu0.a0 a0Var, hu0.l lVar, hu0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357375e = a0Var;
        this.f357376f = lVar;
        this.f357377g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.x(this.f357375e, this.f357376f, this.f357377g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357374d;
        hu0.a0 a0Var = this.f357375e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f357374d = 1;
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
        this.f357376f.R6(true);
        a0Var.U6(true);
        this.f357377g.O6();
        return jz5.f0.f384359a;
    }
}
