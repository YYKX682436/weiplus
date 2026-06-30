package en5;

/* loaded from: classes14.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f337052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f337053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f337054g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(g2.g0 g0Var, fn5.n0 n0Var, c1.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f337052e = g0Var;
        this.f337053f = n0Var;
        this.f337054g = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new en5.v0(this.f337052e, this.f337053f, this.f337054g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((en5.v0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f337051d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f337051d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        g2.g0 g0Var = this.f337052e;
        if (g0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageQuerySearchBar", "input service is null");
        }
        this.f337053f.D = false;
        if (g0Var != null && g0Var.f349235b.get() != null) {
            ((u26.o) ((g2.p0) g0Var.f349234a).f349274j).e(g2.h0.ShowKeyboard);
        }
        this.f337054g.a();
        return jz5.f0.f384359a;
    }
}
