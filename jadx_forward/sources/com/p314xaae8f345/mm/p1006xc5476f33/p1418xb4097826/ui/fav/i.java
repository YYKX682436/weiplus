package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p f210707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15107xbe61a985 f210708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15107xbe61a985 c15107xbe61a985) {
        super(1);
        this.f210707d = pVar;
        this.f210708e = c15107xbe61a985;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa resp = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        int size = this.f210708e.m56387xe6796cde().size();
        java.util.List m56409x97891cf7 = resp.m56409x97891cf7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.p pVar = this.f210707d;
        if (m56409x97891cf7 != null) {
            pVar.c().addAll(m56409x97891cf7);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = pVar.f().d().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8153xd399a4d9(size, m56409x97891cf7.size());
            }
        }
        pVar.f().e().E(!resp.getHasMore());
        pVar.f().f();
        if (pVar.c().isEmpty()) {
            pVar.f().k();
        }
        return jz5.f0.f384359a;
    }
}
