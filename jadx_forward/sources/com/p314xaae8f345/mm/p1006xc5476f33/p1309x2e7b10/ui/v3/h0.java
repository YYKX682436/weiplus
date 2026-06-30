package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176859a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8) {
        this.f176859a = activityC13072x745567c8;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176859a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ic3 ic3Var = (r45.ic3) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "retCode: %s, refresh: %s", java.lang.Integer.valueOf(ic3Var.f458459d), java.lang.Integer.valueOf(ic3Var.f458462g));
            if (ic3Var.f458459d != 0) {
                lu1.a0.r(activityC13072x745567c8.mo55332x76847179(), ic3Var.f458460e);
            } else if (ic3Var.f458462g == 1) {
                activityC13072x745567c8.Y6(true);
            } else {
                int size = ic3Var.f458461f.f470969p.size();
                java.util.ArrayList arrayList = activityC13072x745567c8.f176793s;
                if (size == 0) {
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it = arrayList.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i18 = i17 + 1;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w) it.next()).a().f470960d, ic3Var.f458461f.f470960d)) {
                                arrayList.remove(i17);
                                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC13072x745567c8.f176792r;
                                if (c22848x6ddd90cf == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
                                    throw null;
                                }
                                c22848x6ddd90cf.m8146xced61ae5();
                            } else {
                                i17 = i18;
                            }
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    java.util.Iterator it6 = arrayList.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        int i27 = i19 + 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w) it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar.a().f470960d, ic3Var.f458461f.f470960d)) {
                            r45.wt card_pkg_mch_info = ic3Var.f458461f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pkg_mch_info, "card_pkg_mch_info");
                            wVar.f176924d = card_pkg_mch_info;
                            if (activityC13072x745567c8.E <= 0 || activityC13072x745567c8.C == null) {
                                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = activityC13072x745567c8.f176792r;
                                if (c22848x6ddd90cf2 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
                                    throw null;
                                }
                                c22848x6ddd90cf2.m8147xed6e4d18(i19);
                            } else {
                                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = activityC13072x745567c8.f176792r;
                                if (c22848x6ddd90cf3 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCouponCardListAdapter");
                                    throw null;
                                }
                                c22848x6ddd90cf3.m8147xed6e4d18(i27);
                            }
                        } else {
                            i19 = i27;
                        }
                    }
                }
            }
        } else {
            lu1.a0.q(activityC13072x745567c8.mo55332x76847179(), "");
        }
        activityC13072x745567c8.f176798x = false;
        return jz5.f0.f384359a;
    }
}
