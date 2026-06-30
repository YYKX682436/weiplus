package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class s4 implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f101434a;

    public s4(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI) {
        this.f101434a = favSearchUI;
    }

    @Override // w82.j
    public void a() {
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f101434a;
        if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(favSearchUI.f100400n.k(false), favSearchUI, new com.tencent.mm.plugin.fav.ui.o4(this), true, true)) {
            com.tencent.mm.plugin.fav.ui.ec.g(favSearchUI.getContext(), 4105, favSearchUI.f100400n, favSearchUI.K);
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f101434a;
        java.util.List<o72.r2> k17 = favSearchUI.f100400n.k(true);
        java.util.LinkedList linkedList = (java.util.LinkedList) k17;
        if (linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSearchUI", "FavEditFooter onDelRequest list == null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z17 = false;
        for (o72.r2 r2Var : k17) {
            if (r2Var.B1) {
                hashSet.add(java.lang.Long.valueOf(r2Var.field_localId));
                z17 = true;
            } else {
                arrayList.add(r2Var);
            }
        }
        if (arrayList.size() != 0) {
            db5.e1.u(favSearchUI.getContext(), favSearchUI.getString(com.tencent.mm.R.string.c_i), "", new com.tencent.mm.plugin.fav.ui.r4(this, arrayList, z17), null);
        } else if (hashSet.size() >= 2) {
            com.tencent.mm.plugin.fav.ui.FavSearchUI.e7(favSearchUI.getContext());
        } else {
            com.tencent.mm.plugin.fav.ui.FavSearchUI.X6(favSearchUI, null, 0, (o72.r2) linkedList.get(0));
        }
    }

    @Override // w82.j
    public void d() {
    }
}
