package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f176866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, boolean z17) {
        super(1);
        this.f176865d = activityC13072x745567c8;
        this.f176866e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176865d;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                r45.ud3 ud3Var = (r45.ud3) fVar.f152151d;
                if (ud3Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "retcode: " + ud3Var.f468788d + ", retmsg: " + ud3Var.f468789e);
                    if (ud3Var.f468788d == 0) {
                        activityC13072x745567c8.f176794t = ud3Var.f468790f;
                        activityC13072x745567c8.f176795u = ud3Var.f468791g >= 1;
                        activityC13072x745567c8.f176797w = true;
                        r45.ru ruVar = ud3Var.f468797p;
                        activityC13072x745567c8.C = ruVar;
                        if (ruVar != null) {
                            int i17 = ud3Var.f468795n;
                            java.util.LinkedList card_sort_info = ruVar.f466742d;
                            if (i17 == 1) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_sort_info, "card_sort_info");
                                java.util.Iterator it = card_sort_info.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (((r45.qu) obj2).f465792d == ud3Var.f468796o) {
                                        break;
                                    }
                                }
                                r45.qu quVar = (r45.qu) obj2;
                                if (quVar != null) {
                                    activityC13072x745567c8.E = quVar.f465792d;
                                    java.lang.String sort_wording = quVar.f465794f;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sort_wording, "sort_wording");
                                    activityC13072x745567c8.D = sort_wording;
                                    activityC13072x745567c8.f176796v = quVar.f465793e;
                                }
                            } else if (activityC13072x745567c8.E == 0) {
                                r45.qu quVar2 = (r45.qu) card_sort_info.getFirst();
                                activityC13072x745567c8.E = quVar2.f465792d;
                                java.lang.String sort_wording2 = quVar2.f465794f;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sort_wording2, "sort_wording");
                                activityC13072x745567c8.D = sort_wording2;
                                activityC13072x745567c8.f176796v = quVar2.f465793e;
                            }
                        }
                        activityC13072x745567c8.Z6();
                        r45.iu iuVar = ud3Var.f468793i;
                        activityC13072x745567c8.A = iuVar;
                        activityC13072x745567c8.B = ud3Var.f468794m;
                        if (iuVar != null) {
                            activityC13072x745567c8.m78548x39037dd1();
                            activityC13072x745567c8.m78478x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.s0(activityC13072x745567c8, iuVar));
                        }
                        if (this.f176866e) {
                            activityC13072x745567c8.f176793s.clear();
                        }
                        activityC13072x745567c8.a7(ud3Var);
                    } else {
                        lu1.a0.r(activityC13072x745567c8.mo55332x76847179(), ud3Var.f468789e);
                        activityC13072x745567c8.E = activityC13072x745567c8.F;
                    }
                }
                if (activityC13072x745567c8.f176785J) {
                    activityC13072x745567c8.f176785J = false;
                }
            } else {
                lu1.a0.q(activityC13072x745567c8.mo55332x76847179(), "");
                activityC13072x745567c8.E = activityC13072x745567c8.F;
            }
            activityC13072x745567c8.Z6();
        }
        activityC13072x745567c8.G = false;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC13072x745567c8.f176788n;
        if (c22801x87cbdc00 != null) {
            c22801x87cbdc00.N(0);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
        throw null;
    }
}
