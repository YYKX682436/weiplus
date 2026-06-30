package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class z8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f211616d;

    /* renamed from: e, reason: collision with root package name */
    public int f211617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 f211618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211618f = activityC15041xa4ea2f4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.z8(this.f211618f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.z8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yl2.g1 g1Var;
        java.lang.String str;
        r45.j01 j01Var;
        r45.v25 v25Var;
        r45.j01 j01Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f211617e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "handleAuthResultForExternal: calling prepare to refresh userFlag");
            yl2.g1 g1Var2 = new yl2.g1(this.f211618f, 0, 0L, 6, null);
            this.f211616d = g1Var2;
            this.f211617e = 1;
            java.lang.Object n17 = g1Var2.n(this);
            if (n17 == aVar) {
                return aVar;
            }
            g1Var = g1Var2;
            obj = n17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var = (yl2.g1) this.f211616d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        if (g1Var.c(kVar)) {
            int i18 = (kVar == null || (j01Var2 = kVar.f544569c) == null) ? 0 : j01Var2.f458972f;
            if (kVar == null || (j01Var = kVar.f544569c) == null || (v25Var = j01Var.K) == null || (str = v25Var.m75945x2fec8307(4)) == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "handleAuthResultForExternal: prepare success, newUserFlag=" + i18 + ", newRealnameAuthUrl=" + str);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.C;
            this.f211618f.n7(true, i18, str);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAuthResultForExternal: prepare failed, errCode=");
            sb6.append(kVar != null ? new java.lang.Integer(kVar.f544567a) : null);
            sb6.append(", errMsg=");
            sb6.append(kVar != null ? kVar.f544568b : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.o7(this.f211618f, false, 0, null, 6, null);
        }
        return jz5.f0.f384359a;
    }
}
