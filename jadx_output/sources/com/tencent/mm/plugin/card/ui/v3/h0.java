package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95326a;

    public h0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95326a = couponCardListUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95326a;
        com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ic3 ic3Var = (r45.ic3) fVar.f70618d;
            com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "retCode: %s, refresh: %s", java.lang.Integer.valueOf(ic3Var.f376926d), java.lang.Integer.valueOf(ic3Var.f376929g));
            if (ic3Var.f376926d != 0) {
                lu1.a0.r(couponCardListUI.getContext(), ic3Var.f376927e);
            } else if (ic3Var.f376929g == 1) {
                couponCardListUI.Y6(true);
            } else {
                int size = ic3Var.f376928f.f389436p.size();
                java.util.ArrayList arrayList = couponCardListUI.f95260s;
                if (size == 0) {
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it = arrayList.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i18 = i17 + 1;
                            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.card.ui.v3.w) it.next()).a().f389427d, ic3Var.f376928f.f389427d)) {
                                arrayList.remove(i17);
                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = couponCardListUI.f95259r;
                                if (wxRecyclerAdapter == null) {
                                    kotlin.jvm.internal.o.o("mCouponCardListAdapter");
                                    throw null;
                                }
                                wxRecyclerAdapter.notifyDataSetChanged();
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
                        com.tencent.mm.plugin.card.ui.v3.w wVar = (com.tencent.mm.plugin.card.ui.v3.w) it6.next();
                        if (kotlin.jvm.internal.o.b(wVar.a().f389427d, ic3Var.f376928f.f389427d)) {
                            r45.wt card_pkg_mch_info = ic3Var.f376928f;
                            kotlin.jvm.internal.o.f(card_pkg_mch_info, "card_pkg_mch_info");
                            wVar.f95391d = card_pkg_mch_info;
                            if (couponCardListUI.E <= 0 || couponCardListUI.C == null) {
                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = couponCardListUI.f95259r;
                                if (wxRecyclerAdapter2 == null) {
                                    kotlin.jvm.internal.o.o("mCouponCardListAdapter");
                                    throw null;
                                }
                                wxRecyclerAdapter2.notifyItemChanged(i19);
                            } else {
                                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = couponCardListUI.f95259r;
                                if (wxRecyclerAdapter3 == null) {
                                    kotlin.jvm.internal.o.o("mCouponCardListAdapter");
                                    throw null;
                                }
                                wxRecyclerAdapter3.notifyItemChanged(i27);
                            }
                        } else {
                            i19 = i27;
                        }
                    }
                }
            }
        } else {
            lu1.a0.q(couponCardListUI.getContext(), "");
        }
        couponCardListUI.f95265x = false;
        return jz5.f0.f302826a;
    }
}
