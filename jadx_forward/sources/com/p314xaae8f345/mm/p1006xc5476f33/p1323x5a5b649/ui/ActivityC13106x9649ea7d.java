package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.clean.ui.CleanUI */
/* loaded from: classes.dex */
public class ActivityC13106x9649ea7d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f177175d = "com.tencent.qqpimsecure";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177176e = "00B1208638DE0FCD3E920886D658DAF6";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f177177f = "11206657";

    /* renamed from: g, reason: collision with root package name */
    public org.json.JSONObject f177178g;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570157yv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String g17;
        super.onCreate(bundle);
        boolean z17 = true;
        if (!(!"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_hide_qqmgr", "0"))) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.u9.a() && com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b != 1 && getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) {
            java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CLEANUI_QQMGRINFO_STRING, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    this.f177178g = jSONObject;
                    this.f177175d = jSONObject.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
                    this.f177178g.get("md5");
                    this.f177177f = this.f177178g.getString("launcherID");
                    this.f177176e = this.f177178g.getString("signature");
                    this.f177178g.get("url");
                    this.f177178g.getLong("size");
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CleanUI", e17, "", new java.lang.Object[0]);
                }
            }
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(mo55332x76847179(), this.f177175d) || (a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(this, this.f177175d, false)) == null || (signature = a17[0]) == null || (g17 = kk.k.g(signature.toByteArray())) == null || !g17.equalsIgnoreCase(this.f177176e)) {
                z17 = false;
            } else {
                try {
                    android.content.Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(this.f177175d);
                    if (launchIntentForPackage != null) {
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle2, this.f177177f);
                        launchIntentForPackage.putExtras(bundle2);
                        launchIntentForPackage.addFlags(268435456);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(launchIntentForPackage);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/CleanUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/clean/ui/CleanUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(282L, 6L, 1L, false);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CleanUI", e18, "", new java.lang.Object[0]);
                }
            }
            if (z17) {
                finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.class);
        intent.putExtras(getIntent());
        if (getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) {
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/CleanUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/clean/ui/CleanUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
