package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 f207508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca f207509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 c5436xd7d34ee8, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca) {
        super(0);
        this.f207508d = c5436xd7d34ee8;
        this.f207509e = c14951x18cbc2ca;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l3 l3Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 c5436xd7d34ee8 = this.f207508d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5436xd7d34ee8.f135779g.f87874a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca = this.f207509e;
            java.lang.String str = c14951x18cbc2ca.f207098d;
            am.ca caVar = c5436xd7d34ee8.f135779g;
            java.lang.String str2 = caVar.f87874a;
            java.util.Iterator it = c14951x18cbc2ca.f207104m.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str3 = caVar.f87874a;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.mu2) next).m75936x14adae67(0);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null) && (l3Var = c14951x18cbc2ca.f207113v) != null && (c1163xf1deaba4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t3) l3Var).f207401r) != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8147xed6e4d18(i18);
                }
                i17 = i18;
            }
        }
        return jz5.f0.f384359a;
    }
}
