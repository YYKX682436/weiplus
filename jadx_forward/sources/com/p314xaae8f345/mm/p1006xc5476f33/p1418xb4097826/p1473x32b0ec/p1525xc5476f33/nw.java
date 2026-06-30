package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f195214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f195215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, java.util.List list) {
        super(0);
        this.f195214d = owVar;
        this.f195215e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String m76175x6d346f39;
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.t1(this.f195214d);
        java.util.List<r45.ch1> list2 = this.f195215e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f195214d;
        synchronized (list2) {
            for (r45.ch1 ch1Var : list2) {
                r45.xn1 xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13);
                if (xn1Var != null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                    if (c19782x23db1cfa != null && (m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39()) != null) {
                        r45.ri1 ri1Var = new r45.ri1();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                        java.lang.String str = null;
                        if (m75934xbce7f2f != null) {
                            try {
                                ri1Var.m75932x347fbd55(m75934xbce7f2f.g());
                                str = ri1Var.m75945x2fec8307(0);
                                java.lang.String str2 = owVar.f195320p;
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(owVar.f195320p, "tryEmitHightLightLikeByOthers：parseFrom failed: " + e17.getMessage(), e17);
                            }
                        }
                        if (str == null || str.length() == 0) {
                            owVar.Q.add(m76175x6d346f39);
                        } else {
                            dk2.ga gaVar = (dk2.ga) ((java.util.LinkedHashMap) owVar.f195331x0).get(str);
                            if (gaVar != null && (list = gaVar.f315053h) != null) {
                                list.add(m76175x6d346f39);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
