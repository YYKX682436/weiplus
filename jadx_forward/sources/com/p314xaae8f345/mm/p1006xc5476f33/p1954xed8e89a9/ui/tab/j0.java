package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 f235900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var, java.lang.String str) {
        super(2);
        this.f235900d = l0Var;
        this.f235901e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.j32 j32Var = (r45.j32) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.l0 l0Var = this.f235900d;
        if (p3325xe03a0797.p3326xc267989b.z0.h(l0Var.f235933n)) {
            java.lang.String str = this.f235901e;
            if (!booleanValue || j32Var == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CGI failed, fallback to initial data: username=");
                sb6.append(str);
                sb6.append(", initCount=");
                r45.j32 j32Var2 = l0Var.f235929j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j32Var2);
                sb6.append(j32Var2.m75941xfb821914(0).size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ContactBizHeaderLiveNoticeLogicV2", sb6.toString());
                zy2.ic icVar = l0Var.f235927h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(icVar);
                r45.j32 j32Var3 = l0Var.f235929j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j32Var3);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) icVar).g(j32Var3, "", false, "", -1, 0, l0Var.f235930k);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogicV2", "show more list with CGI data: username=" + str + ", count=" + j32Var.m75941xfb821914(0).size() + ", totalNotice=" + j32Var.m75939xb282bd08(2) + ", totalReserve=" + j32Var.m75939xb282bd08(3));
                zy2.ic icVar2 = l0Var.f235927h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(icVar2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4) icVar2).g(j32Var, "", false, "", -1, 0, l0Var.f235930k);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ContactBizHeaderLiveNoticeLogicV2", "request callback: coroutine cancelled, skip UI update");
        }
        return jz5.f0.f384359a;
    }
}
