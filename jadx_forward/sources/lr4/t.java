package lr4;

/* loaded from: classes11.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.ActivityC18985xe6e49aee f402296d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.ActivityC18985xe6e49aee activityC18985xe6e49aee, java.lang.String str) {
        this.f402296d = activityC18985xe6e49aee;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String clickId = mr4.a.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.ActivityC18985xe6e49aee activityC18985xe6e49aee = this.f402296d;
        activityC18985xe6e49aee.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickId, "clickId");
        java.lang.String Di = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Di();
        gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
        java.lang.String str = activityC18985xe6e49aee.f259082h;
        java.lang.String str2 = activityC18985xe6e49aee.f259083i;
        java.lang.String str3 = activityC18985xe6e49aee.f259084m;
        ((fr4.g0) fVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] opening settings for curUsername=" + Di + ", clickId=" + clickId);
        q80.d0 d0Var = new q80.d0();
        d0Var.f442182a = "wxalite2fd372f050eecd471a4392786dfae78c";
        d0Var.f442183b = "pages/personal-msg-settings/entry";
        d0Var.f442185d = java.lang.Boolean.TRUE;
        int i17 = 0;
        d0Var.f442190i = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] scene params: scene=" + str + ", sceneNote=" + str2 + ", referSessionId=" + str3);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str != null) {
            try {
                java.lang.Integer h17 = r26.h0.h(str);
                if (h17 != null) {
                    i17 = h17.intValue();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] failed to create query JSON for curUsername=".concat(Di), e17);
                d0Var.f442184c = "";
            }
        }
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("sceneNote", str2);
        jSONObject.put("referrerClickId", clickId);
        jSONObject.put("personalMsgFromUsername", Di);
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str3);
        fr4.s[] sVarArr = fr4.s.f347393d;
        jSONObject.put("referrerPagePath", "w1w-personal-msg-chat-list");
        d0Var.f442184c = jSONObject.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] query JSON created successfully");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] starting liteapp for curUsername=".concat(Di));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(activityC18985xe6e49aee, d0Var, null);
        activityC18985xe6e49aee.T6().K0(vu4.d.f521836s, mr4.a.a("more:more"), "", "");
        return true;
    }
}
