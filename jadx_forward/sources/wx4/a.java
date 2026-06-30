package wx4;

/* loaded from: classes.dex */
public final class a extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f532121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f532121d = "MicroMsg.OpenHalfFinderProfileUIC";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        jz5.f0 f0Var = null;
        if (P6 != null) {
            P6.setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575938m6);
            o25.n1.e(m158354x19263085());
            P6.mo64405x4dab7448(0);
            P6.mo54450xbf7c1df6("");
            P6.mo78530x8b45058f();
            P6.mo78529xe76c1b79();
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = P6.mo2533x106ab264();
            if (mo2533x106ab264 != null) {
                mo2533x106ab264.o();
            }
            P6.overridePendingTransition(0, 0);
            db5.f.c(P6, null);
            f0Var = jz5.f0.f384359a;
        }
        java.lang.String str = this.f532121d;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "getMvvmActivity is null");
            return;
        }
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_EXT_INFO");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_WEB_URL");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_LAST_GMSG_ID");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        java.lang.String stringExtra4 = m158359x1e885992().getStringExtra("OPEN_HALF_FINDER_PROFILE_KEY_KEEP_ALIVE_TOKEN");
        java.lang.String str2 = stringExtra4 != null ? stringExtra4 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "openFinderView in halfPage mode, extInfo: " + stringExtra + ", webUrl: " + stringExtra2 + ", lastGMsgId: " + stringExtra3 + ", keepAliveToken: " + str2);
        try {
            jSONObject = stringExtra.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(stringExtra);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "parse extInfo failed: " + e17.getMessage());
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("keepSrcAliveToken", str2);
        jSONObject.put("KEY_JSAPI_SOURCE_TYPE", 2);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("extInfo", jSONObject);
        jSONObject2.put("webUrl", stringExtra2);
        jSONObject2.put("KShareTraceLastGMsgId", stringExtra3);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.d(ya2.e1.f542005a, m158354x19263085(), jSONObject2.toString(), null, null, 12, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "enterFinderUI");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.overridePendingTransition(0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.overridePendingTransition(0, 0);
        }
    }
}
