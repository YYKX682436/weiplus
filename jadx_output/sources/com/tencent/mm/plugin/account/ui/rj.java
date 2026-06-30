package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class rj implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f74176a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.WelcomeActivity f74177b;

    public rj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity) {
        this.f74177b = welcomeActivity;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74177b;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fields", "name,picture.type(large)");
        try {
            java.lang.String f17 = welcomeActivity.f73693e.f("me", bundle, "GET");
            com.tencent.mars.xlog.Log.i("MicroMsg.WelcomeActivity", "result json %s", f17);
            this.f74176a = new org.json.JSONObject(f17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WelcomeActivity", e17, "get name and picture error!", new java.lang.Object[0]);
            if (com.tencent.mm.sdk.platformtools.a0.c()) {
                return true;
            }
            db5.e1.s(welcomeActivity, "Retrieve Failed, Error Format!", "");
            return true;
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74177b;
        if (this.f74176a != null) {
            try {
                android.content.Intent intent = new android.content.Intent(welcomeActivity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class);
                intent.putExtra("third_app_token", welcomeActivity.f73693e.f209213a.toString());
                intent.putExtra("reg_3d_app_type", 1);
                intent.putExtra("register_title", welcomeActivity.getString(com.tencent.mm.R.string.bkx));
                intent.putExtra("register_nick_name", this.f74176a.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME));
                intent.putExtra("register_avatar", ((org.json.JSONObject) this.f74176a.get("picture")).getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).getString("url"));
                intent.addFlags(603979776);
                com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity2 = this.f74177b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(welcomeActivity2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$8", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                welcomeActivity2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(welcomeActivity2, "com/tencent/mm/plugin/account/ui/WelcomeActivity$8", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = welcomeActivity.f73694f;
                thirdAppRegisterStruct.f61234d = 1L;
                thirdAppRegisterStruct.f61235e = 3L;
                thirdAppRegisterStruct.k();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WelcomeActivity", e17, "parse json error!", new java.lang.Object[0]);
                if (!com.tencent.mm.sdk.platformtools.a0.c()) {
                    db5.e1.s(welcomeActivity, "Retrieve Failed, Error Format!", "");
                }
            }
        }
        return true;
    }
}
