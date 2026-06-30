package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class vi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f214778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f214779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f214781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f214782h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(android.view.ViewGroup viewGroup, android.content.Context context, float f17, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f214779e = viewGroup;
        this.f214780f = context;
        this.f214781g = f17;
        this.f214782h = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vi(this.f214779e, this.f214780f, this.f214781g, this.f214782h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vi) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f214778d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.view.ViewGroup viewGroup = this.f214779e;
            viewGroup.setVisibility(0);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xi.f214867d;
            float f18 = this.f214781g;
            os5.u uVar = new os5.u((int) (f17 * f18), (int) (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xi.f214865b * f18), (int) (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xi.f214866c * f18));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
            android.content.Context context = this.f214780f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            xt2.k1 k1Var = new xt2.k1(context, uVar);
            k1Var.b("FinderQuickShareProductDialog", viewGroup);
            int a17 = i65.a.a(context, 162.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderQuickShareProductDialog", "parse showbox " + this.f214782h + " with space " + a17);
            java.util.List list = this.f214782h;
            android.view.ViewGroup viewGroup2 = this.f214779e;
            this.f214778d = 1;
            if (os5.v.a(k1Var, "FinderQuickShareProductDialog", list, false, viewGroup2, a17, null, this, 32, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
