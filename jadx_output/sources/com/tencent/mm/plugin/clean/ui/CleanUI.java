package com.tencent.mm.plugin.clean.ui;

@db5.a(19)
/* loaded from: classes.dex */
public class CleanUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95642d = "com.tencent.qqpimsecure";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95643e = "00B1208638DE0FCD3E920886D658DAF6";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f95644f = "11206657";

    /* renamed from: g, reason: collision with root package name */
    public org.json.JSONObject f95645g;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488624yv;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String g17;
        super.onCreate(bundle);
        boolean z17 = true;
        if (!(!"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_hide_qqmgr", "0"))) && !com.tencent.mm.sdk.platformtools.u9.a() && com.tencent.mm.sdk.platformtools.a0.f192439b != 1 && getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) {
            java.lang.String str = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_CLEANUI_QQMGRINFO_STRING, "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    this.f95645g = jSONObject;
                    this.f95642d = jSONObject.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
                    this.f95645g.get("md5");
                    this.f95644f = this.f95645g.getString("launcherID");
                    this.f95643e = this.f95645g.getString("signature");
                    this.f95645g.get("url");
                    this.f95645g.getLong("size");
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CleanUI", e17, "", new java.lang.Object[0]);
                }
            }
            if (!com.tencent.mm.pluginsdk.model.app.j1.f(getContext(), this.f95642d) || (a17 = com.tencent.mm.pluginsdk.model.app.c.a(this, this.f95642d, false)) == null || (signature = a17[0]) == null || (g17 = kk.k.g(signature.toByteArray())) == null || !g17.equalsIgnoreCase(this.f95643e)) {
                z17 = false;
            } else {
                try {
                    android.content.Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(this.f95642d);
                    if (launchIntentForPackage != null) {
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        com.tencent.mm.pluginsdk.model.app.j1.i(bundle2, this.f95644f);
                        launchIntentForPackage.putExtras(bundle2);
                        launchIntentForPackage.addFlags(268435456);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(launchIntentForPackage);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/CleanUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/clean/ui/CleanUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(282L, 6L, 1L, false);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CleanUI", e18, "", new java.lang.Object[0]);
                }
            }
            if (z17) {
                finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.class);
        intent.putExtras(getIntent());
        if (getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) {
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
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
