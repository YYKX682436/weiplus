package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 f183148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var) {
        super(1);
        this.f183148d = c3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c3 c3Var = this.f183148d;
        if (intValue == 4) {
            c3Var.c().O6(7, false);
        } else if (intValue == 6) {
            c3Var.c().O6(3, false);
        } else if (intValue == 8) {
            c3Var.b().P6();
            c3Var.c().O6(3, false);
        } else if (intValue == 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[CONTEXT_OPERATE_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + c3Var.f182074h);
            if (c3Var.f182074h != -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(java.lang.Integer.valueOf(c3Var.f182074h));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) c3Var.f182072f).F0(arrayList);
                c3Var.c().O6(6, false);
            }
        } else if (intValue == 13) {
            java.util.List R6 = c3Var.a().R6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[CONTEXT_OPERATE_BATCH_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + R6);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) c3Var.f182072f).F0(R6);
            c3Var.a().O6();
            c3Var.b().P6();
            c3Var.c().O6(6, false);
        } else if (intValue == 15) {
            java.util.List R62 = c3Var.a().R6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CONTEXT_OPERATE_MORE_STATE_ENTER] enterMultiSelectType selectIndexList size = ");
            java.util.ArrayList arrayList2 = (java.util.ArrayList) R62;
            sb6.append(arrayList2.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", sb6.toString());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) c3Var.f182072f).z0(((java.lang.Number) arrayList2.get(0)).intValue());
        } else if (intValue == 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderManager", "[CONTEXT_OPERATE_MORE_STATE_EXIT] exitMultiSelectType");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00) c3Var.f182072f).A0();
            c3Var.a().O6();
        }
        return jz5.f0.f384359a;
    }
}
