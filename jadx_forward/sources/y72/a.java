package y72;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f541230d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f541231e = null;

    public a(java.util.List list) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u00();
        lVar.f152198b = new r45.v00();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkfavitem";
        lVar.f152200d = 405;
        lVar.f152201e = 196;
        lVar.f152202f = 1000000196;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f541230d = a17;
        r45.u00 u00Var = (r45.u00) a17.f152243a.f152217a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        u00Var.f468438d = linkedList;
        linkedList.addAll(list);
        u00Var.f468439e = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_OBJECT %s", java.lang.Integer.valueOf(list.size()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f541231e = u0Var;
        return mo9409x10f9447a(sVar, this.f541230d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 405;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.v00 v00Var = (r45.v00) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem,cgi return error,errcode:%d,errType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
            this.f541231e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.util.Iterator it = v00Var.f469315d.iterator();
        while (it.hasNext()) {
            r45.w00 w00Var = (r45.w00) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem, onGYNetEnd,favid: %d, ret: %d", java.lang.Integer.valueOf(w00Var.f470276d), java.lang.Integer.valueOf(w00Var.f470277e));
        }
        this.f541231e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    public a(r45.eq0 eq0Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u00();
        lVar.f152198b = new r45.v00();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkfavitem";
        lVar.f152200d = 405;
        lVar.f152201e = 196;
        lVar.f152202f = 1000000196;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f541230d = a17;
        r45.u00 u00Var = (r45.u00) a17.f152243a.f152217a;
        u00Var.f468440f = eq0Var;
        u00Var.f468439e = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NetSceneCheckFavItem", "NetSceneCheckFavItem CHECK_FAV_ITEM_SCENE_FIX_DATA %s", java.lang.Integer.valueOf(eq0Var.f455203d));
    }
}
