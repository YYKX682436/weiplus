package sx4;

/* loaded from: classes8.dex */
public class h0 implements tx4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b f495144a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b) {
        this.f495144a = activityC19411xef36c7b;
    }

    @Override // tx4.f
    public void a(android.view.MenuItem menuItem) {
        tx4.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495144a;
        r45.rk4 rk4Var = (r45.rk4) ((java.util.HashMap) activityC19411xef36c7b.E3).get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (rk4Var == null) {
            return;
        }
        int i17 = rk4Var.f466500g;
        java.util.Iterator it = tx4.h.f504220f.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                hVar = tx4.h.HVGAME_MENU_ACTION_DEFAULT;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((java.lang.Integer) entry.getValue()).intValue() == i17) {
                hVar = (tx4.h) entry.getKey();
                break;
            }
        }
        switch (hVar.ordinal()) {
            case 1:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", rk4Var.f466501h);
                j45.l.j(activityC19411xef36c7b.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            case 2:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(activityC19411xef36c7b.F7(), 32, 1);
                if (activityC19411xef36c7b.U8()) {
                    return;
                }
                activityC19411xef36c7b.finish();
                return;
            case 3:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(activityC19411xef36c7b.F7(), 1, 1, activityC19411xef36c7b.getIntent().getStringExtra("KPublisherId"), activityC19411xef36c7b.getIntent().getStringExtra("KAppId"), activityC19411xef36c7b.getIntent().getStringExtra("srcUsername"));
                activityC19411xef36c7b.H8(0);
                return;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(activityC19411xef36c7b.F7(), 3, 1);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(157L, 6L, 1L, false);
                activityC19411xef36c7b.f265382q2.s();
                return;
            case 5:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(activityC19411xef36c7b.F7(), 10, 1);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = activityC19411xef36c7b.f265348f;
                if (c22633x83752a59 != null) {
                    c22633x83752a59.mo120172xc84a8199();
                    return;
                }
                return;
            case 6:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(activityC19411xef36c7b.F7(), 31, 1);
                activityC19411xef36c7b.f265382q2.j();
                return;
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(activityC19411xef36c7b.F7(), 11, 1);
                activityC19411xef36c7b.f265382q2.p(null);
                return;
            case 8:
                nw4.n nVar = activityC19411xef36c7b.f265377p0;
                if (nVar != null) {
                    int i18 = rk4Var.f466497d;
                    if (!nVar.f422428i) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "not ready");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onCustomGameMenuClicked");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("itemId", java.lang.Integer.valueOf(i18));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.i2(nVar, nw4.x2.c("onCustomGameMenuClicked", hashMap, nVar.f422436q, nVar.f422437r)));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
