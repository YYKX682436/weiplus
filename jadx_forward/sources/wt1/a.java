package wt1;

/* loaded from: classes11.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276 f530778d;

    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276 c6009xfdc53276 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent account is not ready");
        } else if (c6009xfdc53276 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276) {
            this.f530778d = c6009xfdc53276;
            am.eu euVar = c6009xfdc53276.f136303g;
            java.lang.String str = euVar.f88141a;
            java.lang.String str2 = euVar.f88142b;
            int i17 = euVar.f88143c;
            if (!android.text.TextUtils.isEmpty(str)) {
                gm0.j1.n().f354821b.a(1037, this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent doscene from scene " + i17);
                gm0.j1.n().f354821b.g(new xt1.w(str, i17, "", str2, "", "", 0, 0, null));
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent card_id is empty");
            java.lang.Runnable runnable = this.f530778d.f273897d;
            if (runnable != null) {
                runnable.run();
            }
            this.f530778d = null;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof xt1.w) {
            am.fu fuVar = new am.fu();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return errcode " + i18 + " errmsg" + str);
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is success");
                xt1.w wVar = (xt1.w) m1Var;
                int i19 = wVar.f538131g;
                java.lang.String str2 = wVar.f538130f;
                java.lang.String str3 = wVar.f538132h;
                if (i19 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return ok ");
                    fuVar.f88241b = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe();
                    lu1.t.i(c13038x357affe, str2);
                    if (android.text.TextUtils.isEmpty(c13038x357affe.f67736x95970a65)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return card_id is empty ");
                        fuVar.f88240a = "";
                    } else {
                        fuVar.f88240a = c13038x357affe.f67736x95970a65;
                    }
                    xt1.t0.Di().b("key_accept_card_info", c13038x357affe);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return false, retCode " + i19 + " retMsg" + str3);
                    fuVar.f88241b = false;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is fail");
                fuVar.f88241b = false;
            }
            gm0.j1.n().f354821b.q(1037, this);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276 c6009xfdc53276 = this.f530778d;
            c6009xfdc53276.f136304h = fuVar;
            java.lang.Runnable runnable = c6009xfdc53276.f273897d;
            if (runnable != null) {
                runnable.run();
            }
            this.f530778d = null;
        }
    }
}
