package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l f221229e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l lVar, java.lang.String str) {
        this.f221229e = lVar;
        this.f221228d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.l lVar = this.f221229e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = lVar.f221239f.f221246f.f221253e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", 1);
            jSONObject.put("localIds", this.f221228d);
            jSONObject.put("appId", lVar.f221238e.getStringExtra("key_game_video_appid"));
            jSONObject.put("appName", lVar.f221238e.getStringExtra("key_game_video_appname"));
        } catch (org.json.JSONException unused) {
        }
        lVar.f221239f.f221244d.a(null, jSONObject);
    }
}
