package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class yo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp f201988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar) {
        super(0);
        this.f201988d = hpVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        qo0.c cVar;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        java.lang.String m76184x8010e5e4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = this.f201988d;
        r45.xn1 xn1Var = hpVar.P;
        java.lang.String str2 = "";
        if (xn1Var == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa3.m76197x6c03c64c()) == null) {
            str = "";
        }
        bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", str);
        r45.xn1 xn1Var2 = hpVar.P;
        if (xn1Var2 != null && (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null && (m76184x8010e5e4 = c19782x23db1cfa2.m76184x8010e5e4()) != null) {
            str2 = m76184x8010e5e4;
        }
        bundle.putString("PARAM_FINDER_LIVE_LINK_NICKNAME", str2);
        r45.xn1 xn1Var3 = hpVar.P;
        bundle.putString("PARAM_FINDER_LIVE_LINK_AVATAR", (xn1Var3 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76175x6d346f39());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = hpVar.H;
        if (lVar != null && (cVar = lVar.f194858g) != null) {
            cVar.mo46557x60d69242(qo0.b.S1, bundle);
        }
        return bundle;
    }
}
