package t82;

/* loaded from: classes12.dex */
public final class n implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t82.r f497930a;

    public n(t82.r rVar) {
        this.f497930a = rVar;
    }

    @Override // w82.j
    public void a() {
        t82.r rVar = this.f497930a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a.r7(rVar.Q6().S6(), rVar.m80379x76847179(), new t82.l(rVar), true, true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.h(rVar.m80379x76847179(), 4105, rVar.Q6().S6());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterForward] checkFavoriteTransLegal result = false");
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        t82.r rVar = this.f497930a;
        java.util.List S6 = rVar.Q6().S6();
        if (((java.util.ArrayList) S6).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] getSelectFavItemInfos isEmpty = true");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(rVar.m80379x76847179());
        u1Var.a(true);
        u1Var.g(rVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_i));
        u1Var.n(rVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
        u1Var.k(b3.l.m9702x7444d5ad(rVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        u1Var.l(new t82.j(S6, rVar));
        u1Var.j(rVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz));
        u1Var.i(new t82.k(rVar));
        u1Var.q(false);
    }

    @Override // w82.j
    public void d() {
        t82.r rVar = this.f497930a;
        java.util.ArrayList arrayList = (java.util.ArrayList) rVar.Q6().S6();
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavFinderFilterUI", "[onAddTagRequest] select items count <= 0, maybe error!");
            return;
        }
        if (arrayList.size() <= 1) {
            o72.r2 r2Var = (o72.r2) arrayList.get(0);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", r2Var.f67645x88be67a1);
            o72.x1.L0(rVar.m80379x76847179(), ".ui.FavTagEditUI", intent, null);
            o72.z2.a("FavTagEditUI");
            rVar.P6();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 3);
        intent2.putExtra("key_fav_is_add_tag", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList2.add(java.lang.Integer.valueOf(((o72.r2) arrayList.get(i17)).f67643xc8a07680));
        }
        intent2.putExtra("key_fav_item_ids", arrayList2);
        o72.x1.M0(rVar.m80379x76847179(), ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        rVar.P6();
    }
}
