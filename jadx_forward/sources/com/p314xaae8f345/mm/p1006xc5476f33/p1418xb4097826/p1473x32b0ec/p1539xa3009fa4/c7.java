package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class c7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f198507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f198508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f198509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(yl2.g1 g1Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198508e = g1Var;
        this.f198509f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c7(this.f198508e, this.f198509f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        r45.j01 j01Var;
        r45.v25 v25Var;
        r45.j01 j01Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f198507d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: calling prepare to refresh userFlag");
            this.f198507d = 1;
            obj = this.f198508e.n(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        mm2.s1 s1Var = (mm2.s1) dk2.ef.f314905a.i(mm2.s1.class);
        int i18 = (kVar == null || (j01Var2 = kVar.f544569c) == null) ? -1 : j01Var2.f458972f;
        if (kVar == null || (j01Var = kVar.f544569c) == null || (v25Var = j01Var.K) == null || (str = v25Var.m75945x2fec8307(4)) == null) {
            str = "";
        }
        if (s1Var != null) {
            s1Var.f410925o = i18;
        }
        if (s1Var != null) {
            s1Var.f410926p = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "refreshUserFlagAndHandle: cache updated, userFlag=" + i18 + ", url=" + str);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b7(this.f198509f));
        return jz5.f0.f384359a;
    }
}
