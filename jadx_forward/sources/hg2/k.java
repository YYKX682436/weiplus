package hg2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362897d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362898e;

    /* renamed from: f, reason: collision with root package name */
    public int f362899f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hg2.l f362901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hg2.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362901h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hg2.k kVar = new hg2.k(this.f362901h, interfaceC29045xdcb5ca57);
        kVar.f362900g = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hg2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        hg2.l lVar;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        android.view.ViewGroup viewGroup;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f362899f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f362900g;
            lVar = this.f362901h;
            android.view.ViewGroup viewGroup2 = lVar.f362902m;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                this.f362900g = y0Var2;
                this.f362897d = lVar;
                this.f362898e = viewGroup2;
                this.f362899f = 1;
                if (hg2.l.Z6(lVar, 3, this) == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                viewGroup = viewGroup2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        viewGroup = (android.view.ViewGroup) this.f362898e;
        lVar = (hg2.l) this.f362897d;
        y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f362900g;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        viewGroup.setVisibility(8);
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = lVar.f372632e;
        hg2.s.a(context, ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null, y0Var, null);
        return jz5.f0.f384359a;
    }
}
