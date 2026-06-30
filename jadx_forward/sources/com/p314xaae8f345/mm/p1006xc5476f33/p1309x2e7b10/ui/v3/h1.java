package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f176861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf, boolean z17) {
        super(1);
        this.f176860d = activityC13074xfcf8fabf;
        this.f176861e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176860d;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13074xfcf8fabf.f176802i, "errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                r45.ni3 ni3Var = (r45.ni3) fVar.f152151d;
                if (ni3Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13074xfcf8fabf.f176802i, "retcode: " + ni3Var.f462951d + ", retmsg: " + ni3Var.f462952e);
                    if (ni3Var.f462951d == 0) {
                        activityC13074xfcf8fabf.f176813w = ni3Var.f462953f;
                        activityC13074xfcf8fabf.f176815y = ni3Var.f462954g >= 1;
                        activityC13074xfcf8fabf.f176816z = true;
                        r45.ru ruVar = ni3Var.f462956i;
                        activityC13074xfcf8fabf.E = ruVar;
                        if (ruVar != null) {
                            int i17 = ni3Var.f462957m;
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
                                    if (((r45.qu) obj2).f465792d == ni3Var.f462958n) {
                                        break;
                                    }
                                }
                                r45.qu quVar = (r45.qu) obj2;
                                if (quVar != null) {
                                    activityC13074xfcf8fabf.K = quVar.f465792d;
                                    java.lang.String sort_wording = quVar.f465794f;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sort_wording, "sort_wording");
                                    activityC13074xfcf8fabf.f176801J = sort_wording;
                                    activityC13074xfcf8fabf.f176814x = quVar.f465793e;
                                }
                            } else if (activityC13074xfcf8fabf.K == 0) {
                                r45.qu quVar2 = (r45.qu) card_sort_info.getFirst();
                                activityC13074xfcf8fabf.K = quVar2.f465792d;
                                java.lang.String sort_wording2 = quVar2.f465794f;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sort_wording2, "sort_wording");
                                activityC13074xfcf8fabf.f176801J = sort_wording2;
                                activityC13074xfcf8fabf.f176814x = quVar2.f465793e;
                            }
                        }
                        activityC13074xfcf8fabf.C = ni3Var.f462959o;
                        activityC13074xfcf8fabf.I = ni3Var.f462964t;
                        activityC13074xfcf8fabf.D = ni3Var.f462960p;
                        activityC13074xfcf8fabf.F = ni3Var.f462961q;
                        activityC13074xfcf8fabf.G = ni3Var.f462963s;
                        activityC13074xfcf8fabf.H = ni3Var.f462962r;
                        activityC13074xfcf8fabf.b7();
                        if (this.f176861e) {
                            activityC13074xfcf8fabf.f176812v.clear();
                        }
                        activityC13074xfcf8fabf.d7(ni3Var);
                    } else {
                        lu1.a0.r(activityC13074xfcf8fabf.mo55332x76847179(), ni3Var.f462952e);
                        activityC13074xfcf8fabf.K = activityC13074xfcf8fabf.L;
                    }
                }
                if (activityC13074xfcf8fabf.Q) {
                    activityC13074xfcf8fabf.Q = false;
                }
            } else {
                lu1.a0.q(activityC13074xfcf8fabf.mo55332x76847179(), "");
                activityC13074xfcf8fabf.K = activityC13074xfcf8fabf.L;
            }
            activityC13074xfcf8fabf.c7();
        }
        activityC13074xfcf8fabf.M = false;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC13074xfcf8fabf.f176804n;
        if (c22801x87cbdc00 != null) {
            c22801x87cbdc00.N(0);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
        throw null;
    }
}
