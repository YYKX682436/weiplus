package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFinderFilterUI f101446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.fav.ui.FavFinderFilterUI favFinderFilterUI) {
        super(1);
        this.f101446d = favFinderFilterUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.fav.ui.FavFinderFilterUI favFinderFilterUI = this.f101446d;
        if (intValue == 4) {
            int i17 = com.tencent.mm.plugin.fav.ui.FavFinderFilterUI.f100347o;
            favFinderFilterUI.W6().O6(7, false);
        } else if (intValue == 6) {
            int i18 = com.tencent.mm.plugin.fav.ui.FavFinderFilterUI.f100347o;
            favFinderFilterUI.W6().O6(3, false);
        } else if (intValue == 8) {
            int i19 = com.tencent.mm.plugin.fav.ui.FavFinderFilterUI.f100347o;
            favFinderFilterUI.V6().P6();
            favFinderFilterUI.W6().O6(3, false);
        } else if (intValue == 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + favFinderFilterUI.f100352h);
            if (favFinderFilterUI.f100352h != -1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add(java.lang.Integer.valueOf(favFinderFilterUI.f100352h));
                q40.g gVar = favFinderFilterUI.f100350f;
                if (gVar == null) {
                    kotlin.jvm.internal.o.o("mGlobalFavFragment");
                    throw null;
                }
                ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar).F0(arrayList);
                favFinderFilterUI.W6().O6(6, false);
            }
        } else if (intValue == 13) {
            int i27 = com.tencent.mm.plugin.fav.ui.FavFinderFilterUI.f100347o;
            java.util.List R6 = favFinderFilterUI.U6().R6();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_BATCH_DELETE_SUCCESS] removeItemsAndRefresh indexs = " + R6);
            q40.g gVar2 = favFinderFilterUI.f100350f;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("mGlobalFavFragment");
                throw null;
            }
            ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar2).F0(R6);
            favFinderFilterUI.U6().O6();
            favFinderFilterUI.V6().P6();
            favFinderFilterUI.W6().O6(6, false);
        } else if (intValue == 15) {
            int i28 = com.tencent.mm.plugin.fav.ui.FavFinderFilterUI.f100347o;
            java.util.List R62 = favFinderFilterUI.U6().R6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CONTEXT_OPERATE_MORE_STATE_ENTER] enterMultiSelectType selectIndexList size = ");
            java.util.ArrayList arrayList2 = (java.util.ArrayList) R62;
            sb6.append(arrayList2.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", sb6.toString());
            q40.g gVar3 = favFinderFilterUI.f100350f;
            if (gVar3 == null) {
                kotlin.jvm.internal.o.o("mGlobalFavFragment");
                throw null;
            }
            ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar3).z0(((java.lang.Number) arrayList2.get(0)).intValue());
        } else if (intValue == 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[CONTEXT_OPERATE_MORE_STATE_EXIT] exitMultiSelectType");
            q40.g gVar4 = favFinderFilterUI.f100350f;
            if (gVar4 == null) {
                kotlin.jvm.internal.o.o("mGlobalFavFragment");
                throw null;
            }
            ((com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) gVar4).A0();
            favFinderFilterUI.U6().O6();
        }
        return jz5.f0.f302826a;
    }
}
