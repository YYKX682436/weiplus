package hg2;

/* loaded from: classes3.dex */
public final class i extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.l33 l33Var;
        r45.hg1 hg1Var;
        r45.l33 l33Var2;
        r45.lq1 lq1Var;
        hg2.h hVar;
        r45.eu0 eu0Var = null;
        if (hc1Var != null && (l33Var2 = (r45.l33) hc1Var.m75936x14adae67(66)) != null && (lq1Var = (r45.lq1) l33Var2.m75936x14adae67(0)) != null) {
            dk2.vf vfVar = new dk2.vf(lq1Var);
            ((mm2.f6) m56788xbba4bfc0(mm2.f6.class)).X6(vfVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("join live set flash sale info, cancel = ");
            int i17 = vfVar.f315785c;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlashSaleDataController", sb6.toString());
            if (i17 != 0) {
                hg2.h hVar2 = (hg2.h) m56789x25fe639c(hg2.h.class);
                if (hVar2 != null) {
                    pm0.v.X(new hg2.b(hVar2));
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                if (k0Var != null && (hVar = (hg2.h) k0Var.mo57658x143f1b92(hg2.h.class)) != null) {
                    hVar.Z6();
                }
                android.content.Context O6 = O6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
                hg2.s.b(vfVar, O6, ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null);
            }
        }
        if (hc1Var == null || (l33Var = (r45.l33) hc1Var.m75936x14adae67(66)) == null || (hg1Var = (r45.hg1) l33Var.m75936x14adae67(1)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlashSaleDataController", "join live set flash sale config");
        r45.eu0 eu0Var2 = new r45.eu0();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hg1Var.m75934xbce7f2f(0);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 != null) {
            try {
                eu0Var2.mo11468x92b714fd(g17);
                eu0Var = eu0Var2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        ((mm2.f6) m56788xbba4bfc0(mm2.f6.class)).W6(eu0Var);
    }
}
