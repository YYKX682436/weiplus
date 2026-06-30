package t82;

/* loaded from: classes12.dex */
public final class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t82.r f497934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f497935e;

    public q(t82.r rVar, java.util.HashMap hashMap) {
        this.f497934d = rVar;
        this.f497935e = hashMap;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        o72.r2 P6;
        o72.r2 P62;
        o72.r2 P63;
        o72.r2 P64;
        jz5.f0 f0Var = null;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            v82.a aVar = v82.a.f515599a;
            java.util.HashMap hashMap = this.f497935e;
            if (itemId == 0) {
                hashMap.put("card_clk_type", 4);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            } else if (itemId == 1) {
                hashMap.put("card_clk_type", 5);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            } else if (itemId == 2) {
                hashMap.put("card_clk_type", 3);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            } else if (itemId == 3) {
                hashMap.put("card_clk_type", 2);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            }
            int itemId2 = menuItem.getItemId();
            t82.r rVar = this.f497934d;
            if (itemId2 != 0) {
                if (itemId2 != 1) {
                    if (itemId2 != 2) {
                        if (itemId2 == 3 && rVar.f497939g != -1 && (P64 = rVar.Q6().P6(rVar.f497939g)) != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleTransmit] favItemInfo id = " + P64.f67643xc8a07680 + ", position = " + rVar.f497939g);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(P64);
                            if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(arrayList, rVar.m80379x76847179(), new t82.m(rVar, arrayList), true, true)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.h(rVar.m80379x76847179(), 4106, arrayList);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleTransmit] checkFavoriteTransLegal result = false");
                            }
                        }
                    } else if (rVar.f497939g != -1 && (P63 = rVar.Q6().P6(rVar.f497939g)) != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleTAG] favItemInfo id = " + P63.f67643xc8a07680 + ", position = " + rVar.f497939g);
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_fav_scene", 4);
                        intent.putExtra("key_fav_item_id", P63.f67645x88be67a1);
                        o72.x1.L0(rVar.m80379x76847179(), ".ui.FavTagEditUI", intent, null);
                        o72.z2.a("FavTagEditUI");
                        rVar.f497938f.mo146xb9724478(4);
                    }
                } else if (rVar.f497939g != -1 && (P62 = rVar.Q6().P6(rVar.f497939g)) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleMore] favItemInfo id = " + P62.f67643xc8a07680 + ", position = " + rVar.f497939g);
                    rVar.Q6().T6(rVar.f497939g);
                    w82.k kVar = rVar.f497937e;
                    if (kVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMoreFooter");
                        throw null;
                    }
                    kVar.d(false, false, false, true);
                    if (!((java.util.ArrayList) rVar.Q6().S6()).isEmpty()) {
                        w82.k kVar2 = rVar.f497937e;
                        if (kVar2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMoreFooter");
                            throw null;
                        }
                        kVar2.b(true);
                    } else {
                        w82.k kVar3 = rVar.f497937e;
                        if (kVar3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMoreFooter");
                            throw null;
                        }
                        kVar3.b(false);
                    }
                    rVar.f497936d = true;
                    rVar.f497938f.mo146xb9724478(15);
                }
            } else if (rVar.f497939g != -1 && (P6 = rVar.Q6().P6(rVar.f497939g)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleDelete] favItemInfo id = " + P6.f67643xc8a07680 + ", position = " + rVar.f497939g);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(rVar.m80379x76847179());
                u1Var.a(true);
                u1Var.g(rVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_h));
                u1Var.n(rVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
                u1Var.k(b3.l.m9702x7444d5ad(rVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
                u1Var.l(new t82.f(P6, rVar));
                u1Var.j(rVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz));
                u1Var.i(new t82.g(rVar));
                u1Var.q(false);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderFilterUI", "[OnMMMenuItemSelectedListener] item = null!!");
        }
    }
}
