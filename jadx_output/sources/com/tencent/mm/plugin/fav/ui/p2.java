package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class p2 implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f101332a;

    public p2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI) {
        this.f101332a = favFilterUI;
    }

    @Override // w82.j
    public void a() {
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f101332a;
        if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(favFilterUI.f100335o.k(false), favFilterUI, new com.tencent.mm.plugin.fav.ui.l2(this), true, true)) {
            com.tencent.mm.plugin.fav.ui.ec.g(favFilterUI.getContext(), 4105, favFilterUI.f100335o, favFilterUI.C);
            favFilterUI.Z6(3, 0, false);
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f101332a;
        java.util.List<o72.r2> k17 = favFilterUI.f100335o.k(true);
        java.util.LinkedList linkedList = (java.util.LinkedList) k17;
        if (linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFilterUI", "FavEditFooter onDelRequest list == null");
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
            db5.e1.u(favFilterUI.getContext(), favFilterUI.getString(com.tencent.mm.R.string.c_i), "", new com.tencent.mm.plugin.fav.ui.o2(this, arrayList, z17), null);
        } else if (hashSet.size() >= 2) {
            com.tencent.mm.plugin.fav.ui.FavFilterUI.U6(favFilterUI);
        } else {
            com.tencent.mm.plugin.fav.ui.FavFilterUI.V6(favFilterUI, null, 0, (o72.r2) linkedList.get(0));
        }
    }

    @Override // w82.j
    public void d() {
    }
}
