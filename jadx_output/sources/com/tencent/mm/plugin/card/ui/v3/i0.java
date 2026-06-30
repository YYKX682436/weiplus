package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, boolean z17) {
        super(1);
        this.f95332d = couponCardListUI;
        this.f95333e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95332d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                r45.ud3 ud3Var = (r45.ud3) fVar.f70618d;
                if (ud3Var != null) {
                    com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "retcode: " + ud3Var.f387255d + ", retmsg: " + ud3Var.f387256e);
                    if (ud3Var.f387255d == 0) {
                        couponCardListUI.f95261t = ud3Var.f387257f;
                        couponCardListUI.f95262u = ud3Var.f387258g >= 1;
                        couponCardListUI.f95264w = true;
                        r45.ru ruVar = ud3Var.f387264p;
                        couponCardListUI.C = ruVar;
                        if (ruVar != null) {
                            int i17 = ud3Var.f387262n;
                            java.util.LinkedList card_sort_info = ruVar.f385209d;
                            if (i17 == 1) {
                                kotlin.jvm.internal.o.f(card_sort_info, "card_sort_info");
                                java.util.Iterator it = card_sort_info.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (((r45.qu) obj2).f384259d == ud3Var.f387263o) {
                                        break;
                                    }
                                }
                                r45.qu quVar = (r45.qu) obj2;
                                if (quVar != null) {
                                    couponCardListUI.E = quVar.f384259d;
                                    java.lang.String sort_wording = quVar.f384261f;
                                    kotlin.jvm.internal.o.f(sort_wording, "sort_wording");
                                    couponCardListUI.D = sort_wording;
                                    couponCardListUI.f95263v = quVar.f384260e;
                                }
                            } else if (couponCardListUI.E == 0) {
                                r45.qu quVar2 = (r45.qu) card_sort_info.getFirst();
                                couponCardListUI.E = quVar2.f384259d;
                                java.lang.String sort_wording2 = quVar2.f384261f;
                                kotlin.jvm.internal.o.f(sort_wording2, "sort_wording");
                                couponCardListUI.D = sort_wording2;
                                couponCardListUI.f95263v = quVar2.f384260e;
                            }
                        }
                        couponCardListUI.Z6();
                        r45.iu iuVar = ud3Var.f387260i;
                        couponCardListUI.A = iuVar;
                        couponCardListUI.B = ud3Var.f387261m;
                        if (iuVar != null) {
                            couponCardListUI.removeAllOptionMenu();
                            couponCardListUI.addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.card.ui.v3.s0(couponCardListUI, iuVar));
                        }
                        if (this.f95333e) {
                            couponCardListUI.f95260s.clear();
                        }
                        couponCardListUI.a7(ud3Var);
                    } else {
                        lu1.a0.r(couponCardListUI.getContext(), ud3Var.f387256e);
                        couponCardListUI.E = couponCardListUI.F;
                    }
                }
                if (couponCardListUI.f95252J) {
                    couponCardListUI.f95252J = false;
                }
            } else {
                lu1.a0.q(couponCardListUI.getContext(), "");
                couponCardListUI.E = couponCardListUI.F;
            }
            couponCardListUI.Z6();
        }
        couponCardListUI.G = false;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = couponCardListUI.f95255n;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.N(0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("mRefreshLayout");
        throw null;
    }
}
