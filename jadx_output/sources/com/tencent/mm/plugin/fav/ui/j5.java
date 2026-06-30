package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class j5 implements w82.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f101199a;

    public j5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI) {
        this.f101199a = favSearchUI;
    }

    public void a(java.util.List list, java.util.List list2, java.util.List list3, boolean z17) {
        boolean isEmpty = list2.isEmpty();
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f101199a;
        if (isEmpty && list3.isEmpty()) {
            int i17 = com.tencent.mm.plugin.fav.ui.FavSearchUI.N;
            if (favSearchUI.d7()) {
                com.tencent.mm.plugin.fav.ui.FavSearchUI.U6(favSearchUI, true);
                com.tencent.mm.plugin.fav.ui.FavSearchUI.V6(favSearchUI, list2, list3);
                return;
            }
        }
        favSearchUI.f100410x = list2;
        favSearchUI.f100411y = list3;
        favSearchUI.f100409w = list;
        java.util.Set set = favSearchUI.f100401o.f100500g;
        ((java.util.HashSet) set).clear();
        if (list3 != null) {
            set.addAll(list3);
        }
        if (z17) {
            com.tencent.mm.plugin.fav.ui.FavSearchUI.Y6(favSearchUI);
            com.tencent.mm.plugin.fav.ui.FavSearchUI.V6(favSearchUI, list2, list3);
        } else {
            favSearchUI.f100400n.f(list, list2, list3);
            com.tencent.mm.plugin.fav.ui.FavSearchUI.W6(favSearchUI, true);
            com.tencent.mm.plugin.fav.ui.FavSearchUI.V6(favSearchUI, list2, list3);
        }
    }
}
