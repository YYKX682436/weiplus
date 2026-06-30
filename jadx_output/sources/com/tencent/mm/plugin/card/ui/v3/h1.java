package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, boolean z17) {
        super(1);
        this.f95327d = vipCardListUI;
        this.f95328e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95327d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i(vipCardListUI.f95269i, "errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                r45.ni3 ni3Var = (r45.ni3) fVar.f70618d;
                if (ni3Var != null) {
                    com.tencent.mars.xlog.Log.i(vipCardListUI.f95269i, "retcode: " + ni3Var.f381418d + ", retmsg: " + ni3Var.f381419e);
                    if (ni3Var.f381418d == 0) {
                        vipCardListUI.f95280w = ni3Var.f381420f;
                        vipCardListUI.f95282y = ni3Var.f381421g >= 1;
                        vipCardListUI.f95283z = true;
                        r45.ru ruVar = ni3Var.f381423i;
                        vipCardListUI.E = ruVar;
                        if (ruVar != null) {
                            int i17 = ni3Var.f381424m;
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
                                    if (((r45.qu) obj2).f384259d == ni3Var.f381425n) {
                                        break;
                                    }
                                }
                                r45.qu quVar = (r45.qu) obj2;
                                if (quVar != null) {
                                    vipCardListUI.K = quVar.f384259d;
                                    java.lang.String sort_wording = quVar.f384261f;
                                    kotlin.jvm.internal.o.f(sort_wording, "sort_wording");
                                    vipCardListUI.f95268J = sort_wording;
                                    vipCardListUI.f95281x = quVar.f384260e;
                                }
                            } else if (vipCardListUI.K == 0) {
                                r45.qu quVar2 = (r45.qu) card_sort_info.getFirst();
                                vipCardListUI.K = quVar2.f384259d;
                                java.lang.String sort_wording2 = quVar2.f384261f;
                                kotlin.jvm.internal.o.f(sort_wording2, "sort_wording");
                                vipCardListUI.f95268J = sort_wording2;
                                vipCardListUI.f95281x = quVar2.f384260e;
                            }
                        }
                        vipCardListUI.C = ni3Var.f381426o;
                        vipCardListUI.I = ni3Var.f381431t;
                        vipCardListUI.D = ni3Var.f381427p;
                        vipCardListUI.F = ni3Var.f381428q;
                        vipCardListUI.G = ni3Var.f381430s;
                        vipCardListUI.H = ni3Var.f381429r;
                        vipCardListUI.b7();
                        if (this.f95328e) {
                            vipCardListUI.f95279v.clear();
                        }
                        vipCardListUI.d7(ni3Var);
                    } else {
                        lu1.a0.r(vipCardListUI.getContext(), ni3Var.f381419e);
                        vipCardListUI.K = vipCardListUI.L;
                    }
                }
                if (vipCardListUI.Q) {
                    vipCardListUI.Q = false;
                }
            } else {
                lu1.a0.q(vipCardListUI.getContext(), "");
                vipCardListUI.K = vipCardListUI.L;
            }
            vipCardListUI.c7();
        }
        vipCardListUI.M = false;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = vipCardListUI.f95271n;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.N(0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("mRefreshLayout");
        throw null;
    }
}
