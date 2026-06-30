package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 f235910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f235909d = str;
        this.f235910e = l0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.k0(this.f235909d, this.f235910e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String finderUserName = this.f235909d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var = this.f235910e;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "request full live notice list: username=" + finderUserName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUserName, "$finderUserName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0.d(l0Var, finderUserName, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.j0(l0Var, finderUserName));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ContactBizHeaderLiveNoticeLogicV2", "request full list exception: " + e17.getMessage());
            if (l0Var.f235929j != null) {
                zy2.ic icVar = l0Var.f235927h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(icVar);
                r45.j32 j32Var = l0Var.f235929j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j32Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) icVar).g(j32Var, "", false, "", -1, 0, l0Var.f235930k);
            }
        }
        return jz5.f0.f384359a;
    }
}
