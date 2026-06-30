package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.c3 f101615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.plugin.fav.ui.c3 c3Var) {
        super(1);
        this.f101615d = c3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.fav.ui.c3 c3Var = this.f101615d;
        if (intValue == 4) {
            c3Var.c().O6(7, false);
        } else if (intValue == 6) {
            c3Var.c().O6(3, false);
        } else if (intValue == 8) {
            c3Var.b().P6();
            c3Var.c().O6(3, false);
        } else if (intValue == 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[CONTEXT_OPERATE_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + c3Var.f100541h);
            if (c3Var.f100541h != -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(java.lang.Integer.valueOf(c3Var.f100541h));
                ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) c3Var.f100539f).F0(arrayList);
                c3Var.c().O6(6, false);
            }
        } else if (intValue == 13) {
            java.util.List R6 = c3Var.a().R6();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[CONTEXT_OPERATE_BATCH_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + R6);
            ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) c3Var.f100539f).F0(R6);
            c3Var.a().O6();
            c3Var.b().P6();
            c3Var.c().O6(6, false);
        } else if (intValue == 15) {
            java.util.List R62 = c3Var.a().R6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CONTEXT_OPERATE_MORE_STATE_ENTER] enterMultiSelectType selectIndexList size = ");
            java.util.ArrayList arrayList2 = (java.util.ArrayList) R62;
            sb6.append(arrayList2.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", sb6.toString());
            ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) c3Var.f100539f).z0(((java.lang.Number) arrayList2.get(0)).intValue());
        } else if (intValue == 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[CONTEXT_OPERATE_MORE_STATE_EXIT] exitMultiSelectType");
            ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) c3Var.f100539f).A0();
            c3Var.a().O6();
        }
        return jz5.f0.f302826a;
    }
}
