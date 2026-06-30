package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class or extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f214335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f214336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f214337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f214338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, yz5.p pVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f214336e = c15371xf336b8cc;
        this.f214337f = pVar;
        this.f214338g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.or(this.f214336e, this.f214337f, this.f214338g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.or) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f214335d;
        boolean z17 = this.f214338g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc = this.f214336e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15371xf336b8cc.R, "startLoading");
            az2.f loadingComponent = c15371xf336b8cc.getLoadingComponent();
            if (loadingComponent != null) {
                loadingComponent.a();
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            this.f214335d = 1;
            obj = this.f214337f.mo149xb9724478(valueOf, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        az2.f loadingComponent2 = c15371xf336b8cc.getLoadingComponent();
        if (loadingComponent2 != null) {
            loadingComponent2.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15371xf336b8cc.R, "endLoading");
        c15371xf336b8cc.setEnabled(true);
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15371xf336b8cc.R, "reset state");
            c15371xf336b8cc.m81392x52cfa5c6(!z17);
        }
        return jz5.f0.f384359a;
    }
}
