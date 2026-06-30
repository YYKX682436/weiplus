package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaPayMenuRedDotHelper */
/* loaded from: classes9.dex */
public class C3137x8456e820 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3495xa06bae42 {
    private static final java.lang.String TAG = "KindaPayMenuRedDotHelper";

    /* renamed from: clearReddotConfigWithId */
    private void m25218xe30796c8(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clear reddot: %s", str);
        org.json.JSONObject m25219xd6c026d0 = m25219xd6c026d0();
        if (m25219xd6c026d0 == null) {
            return;
        }
        m25219xd6c026d0.remove(str);
        m25219xd6c026d0.remove(java.lang.String.format("%s_expiretime", str));
        m25219xd6c026d0.remove(java.lang.String.format("%s_wording", str));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, m25219xd6c026d0.toString());
    }

    /* renamed from: getRedDotConfig */
    private org.json.JSONObject m25219xd6c026d0() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                return new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3495xa06bae42
    /* renamed from: clearPayMenuRedDot */
    public void mo25220xd99e36b2(java.lang.String str) {
        m25218xe30796c8(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3495xa06bae42
    /* renamed from: getRedDotItemWithRedDotId */
    public com.p314xaae8f345.p347x615374d.gen.C3496x44a1aea7 mo25221x52842dda(java.lang.String str) {
        org.json.JSONObject m25219xd6c026d0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (m25219xd6c026d0 = m25219xd6c026d0()) != null) {
            if (!(m25219xd6c026d0.optInt(str, 0) == 1)) {
                return new com.p314xaae8f345.p347x615374d.gen.C3496x44a1aea7();
            }
            com.p314xaae8f345.p347x615374d.gen.C3496x44a1aea7 c3496x44a1aea7 = new com.p314xaae8f345.p347x615374d.gen.C3496x44a1aea7();
            c3496x44a1aea7.f13641xaa7114d9 = m25219xd6c026d0.optLong(java.lang.String.format("%s_expiretime", str), 0L) / 1000;
            c3496x44a1aea7.f13643xf8fdaf6b = m25219xd6c026d0.optString(java.lang.String.format("%s_wording", str), "");
            c3496x44a1aea7.f13642x6b2a4fcb = str;
            return c3496x44a1aea7;
        }
        return new com.p314xaae8f345.p347x615374d.gen.C3496x44a1aea7();
    }
}
