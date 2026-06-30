package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes7.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 f254160d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var) {
        this.f254160d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.json.JSONObject jSONObject;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.a) ((ft.a) i95.n0.c(ft.a.class))).getClass();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158764y1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "parseCommonSetting wxaCommUseSetting: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskBarViewPresenter", "wxaCommUseSettingJson#get, fail since " + e17);
            jSONObject = new org.json.JSONObject();
        }
        this.f254160d.f254198k = jSONObject.optInt("UpdateRegularlySwitch", 0);
    }
}
