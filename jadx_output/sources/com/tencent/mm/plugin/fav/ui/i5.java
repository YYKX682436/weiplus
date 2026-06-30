package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.j5 f101165g;

    public i5(com.tencent.mm.plugin.fav.ui.j5 j5Var, java.util.List list, java.util.List list2, java.util.List list3) {
        this.f101165g = j5Var;
        this.f101162d = list;
        this.f101163e = list2;
        this.f101164f = list3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = this.f101162d;
        boolean isEmpty = list.isEmpty();
        java.util.List list2 = this.f101163e;
        com.tencent.mm.plugin.fav.ui.j5 j5Var = this.f101165g;
        if (isEmpty && list2.isEmpty()) {
            com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = j5Var.f101199a;
            int i17 = com.tencent.mm.plugin.fav.ui.FavSearchUI.N;
            if (favSearchUI.d7()) {
                com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI2 = j5Var.f101199a;
                com.tencent.mm.plugin.fav.ui.FavSearchUI.U6(favSearchUI2, false);
                com.tencent.mm.plugin.fav.ui.FavSearchUI.V6(favSearchUI2, list, list2);
                return;
            }
        }
        com.tencent.mm.plugin.fav.ui.FavSearchUI.V6(j5Var.f101199a, list, list2);
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI3 = j5Var.f101199a;
        favSearchUI3.f100410x = list;
        favSearchUI3.f100411y = list2;
        java.util.List list3 = this.f101164f;
        favSearchUI3.f100409w = list3;
        java.util.Set set = favSearchUI3.f100401o.f100500g;
        ((java.util.HashSet) set).clear();
        if (list2 != null) {
            set.addAll(list2);
        }
        favSearchUI3.f100400n.f(list3, list, list2);
        com.tencent.mm.plugin.fav.ui.FavSearchUI.W6(favSearchUI3, false);
    }
}
