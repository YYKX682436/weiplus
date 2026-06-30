package df2;

/* renamed from: df2.do, reason: invalid class name */
/* loaded from: classes15.dex */
public final class Cdo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jo f311526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lg0 f311527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(df2.jo joVar, bw5.lg0 lg0Var) {
        super(0);
        this.f311526d = joVar;
        this.f311527e = lg0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        st2.h1 h1Var;
        bw5.lg0 updateItem = this.f311527e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(updateItem, "$updateItem");
        df2.jo joVar = this.f311526d;
        joVar.getClass();
        java.lang.String str = "refreshShelfAction type: " + updateItem.f111307d;
        java.lang.String str2 = joVar.f312024m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (updateItem.f111307d == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0) joVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class);
            if (ga0Var != null && (h1Var = ga0Var.f194201r) != null) {
                h1Var.m().a(updateItem.f111311h[4] ? updateItem.f111310g : new bw5.kj0());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "refreshShelfAction, type: " + updateItem.f111307d);
            }
        } else {
            java.util.LinkedList<bw5.g10> linkedList = updateItem.f111308e;
            if (linkedList != null) {
                for (bw5.g10 g10Var : linkedList) {
                    int i17 = updateItem.f111307d;
                    if (i17 == 1) {
                        so2.j5 j5Var = (so2.j5) ((mm2.f6) joVar.m56788xbba4bfc0(mm2.f6.class)).f410572o.c(new df2.eo(g10Var));
                        if (j5Var != null) {
                            cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
                            if (m0Var != null) {
                                r45.y23 y23Var = m0Var.f124901v;
                                java.util.LinkedList<bw5.b10> linkedList2 = g10Var.L;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getShowBoxItems(...)");
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                                for (bw5.b10 b10Var : linkedList2) {
                                    r45.p56 p56Var = new r45.p56();
                                    byte[] mo14344x5f01b1f6 = b10Var.mo14344x5f01b1f6();
                                    if (mo14344x5f01b1f6 != null) {
                                        try {
                                            p56Var.mo11468x92b714fd(mo14344x5f01b1f6);
                                        } catch (java.lang.Exception e17) {
                                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                                        }
                                    }
                                    arrayList.add(p56Var);
                                }
                                y23Var.set(28, new java.util.LinkedList(arrayList));
                            }
                            android.view.View S6 = joVar.S6(com.p314xaae8f345.mm.R.id.flh);
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = S6 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) S6 : null;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
                            tt2.e1 e1Var = mo7946xf939df19 instanceof tt2.e1 ? (tt2.e1) mo7946xf939df19 : null;
                            if (e1Var != null) {
                                e1Var.T(g10Var.f109146d, 9);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "NotifyShopShelfUpdateType_Label productId: " + g10Var.f109146d);
                        }
                    } else if (i17 == 2) {
                        so2.j5 j5Var2 = (so2.j5) ((mm2.f6) joVar.m56788xbba4bfc0(mm2.f6.class)).f410572o.c(new df2.fo(g10Var));
                        if (j5Var2 != null) {
                            cm2.m0 m0Var2 = j5Var2 instanceof cm2.m0 ? (cm2.m0) j5Var2 : null;
                            if (m0Var2 != null) {
                                m0Var2.f124901v.set(76, g10Var.Y1[90] ? g10Var.W1 : new bw5.n00());
                            }
                            android.view.View S62 = joVar.S6(com.p314xaae8f345.mm.R.id.flh);
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = S62 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) S62 : null;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42 != null ? c1163xf1deaba42.mo7946xf939df19() : null;
                            tt2.e1 e1Var2 = mo7946xf939df192 instanceof tt2.e1 ? (tt2.e1) mo7946xf939df192 : null;
                            if (e1Var2 != null) {
                                e1Var2.T(g10Var.f109146d, 9);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "NotifyShopShelfUpdateType_OpenPrice productId: " + g10Var.f109146d);
                        }
                    } else if (i17 == 3) {
                        so2.j5 j5Var3 = (so2.j5) ((mm2.f6) joVar.m56788xbba4bfc0(mm2.f6.class)).f410572o.c(new df2.go(g10Var));
                        if (j5Var3 != null) {
                            df2.ho hoVar = new df2.ho(j5Var3, joVar, g10Var);
                            if (updateItem.f111309f == 1) {
                                cm2.m0 m0Var3 = j5Var3 instanceof cm2.m0 ? (cm2.m0) j5Var3 : null;
                                if (m0Var3 != null) {
                                    r45.bd5 bd5Var = (r45.bd5) m0Var3.f124901v.m75936x14adae67(70);
                                    java.lang.Integer valueOf = bd5Var != null ? java.lang.Integer.valueOf(bd5Var.m75939xb282bd08(13)) : null;
                                    bw5.v00 b17 = g10Var.b();
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, b17 != null ? java.lang.Integer.valueOf(b17.f115642t) : null)) {
                                        hoVar.mo152xb9724478();
                                    } else {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotifyShopShelfUpdateType_ProductButton buttonType, local: ");
                                        r45.bd5 bd5Var2 = (r45.bd5) m0Var3.f124901v.m75936x14adae67(70);
                                        sb6.append(bd5Var2 != null ? java.lang.Integer.valueOf(bd5Var2.m75939xb282bd08(13)) : null);
                                        sb6.append(", remote: ");
                                        bw5.v00 b18 = g10Var.b();
                                        sb6.append(b18 != null ? java.lang.Integer.valueOf(b18.f115642t) : null);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                                    }
                                }
                            } else {
                                hoVar.mo152xb9724478();
                            }
                        }
                    } else if (i17 != 5) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "refreshShelfAction, type: " + updateItem.f111307d);
                    } else {
                        so2.j5 j5Var4 = (so2.j5) ((mm2.f6) joVar.m56788xbba4bfc0(mm2.f6.class)).f410572o.c(new df2.io(g10Var));
                        if (j5Var4 != null) {
                            cm2.m0 m0Var4 = j5Var4 instanceof cm2.m0 ? (cm2.m0) j5Var4 : null;
                            if (m0Var4 != null) {
                                r45.y23 y23Var2 = m0Var4.f124901v;
                                java.util.LinkedList<bw5.b10> linkedList3 = g10Var.f109158p1;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList3, "getEvalutionLabelList(...)");
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
                                for (bw5.b10 b10Var2 : linkedList3) {
                                    r45.p56 p56Var2 = new r45.p56();
                                    byte[] mo14344x5f01b1f62 = b10Var2.mo14344x5f01b1f6();
                                    if (mo14344x5f01b1f62 != null) {
                                        try {
                                            p56Var2.mo11468x92b714fd(mo14344x5f01b1f62);
                                        } catch (java.lang.Exception e18) {
                                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                                        }
                                    }
                                    arrayList2.add(p56Var2);
                                }
                                y23Var2.set(49, new java.util.LinkedList(arrayList2));
                            }
                            android.view.View S63 = joVar.S6(com.p314xaae8f345.mm.R.id.flh);
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = S63 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) S63 : null;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = c1163xf1deaba43 != null ? c1163xf1deaba43.mo7946xf939df19() : null;
                            tt2.e1 e1Var3 = mo7946xf939df193 instanceof tt2.e1 ? (tt2.e1) mo7946xf939df193 : null;
                            if (e1Var3 != null) {
                                e1Var3.T(g10Var.f109146d, 11);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "NotifyShopShelfUpdateType_EvalutionLabel productId: " + g10Var.f109146d);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
