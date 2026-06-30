package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class h9 implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f73908a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMFBLoginUI f73909b;

    public h9(com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI) {
        this.f73909b = mMFBLoginUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f73909b;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fields", "name,picture.type(large)");
        try {
            java.lang.String f17 = mMFBLoginUI.f73460d.f("me", bundle, "GET");
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "result json %s", f17);
            this.f73908a = new org.json.JSONObject(f17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FacebookLoginUI", e17, "get name and picture error!", new java.lang.Object[0]);
            db5.e1.s(mMFBLoginUI, "Retrieve Failed, Error Format!", "");
            return true;
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI = this.f73909b;
        if (this.f73908a == null) {
            return true;
        }
        try {
            android.content.Intent intent = new android.content.Intent(mMFBLoginUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class);
            intent.putExtra("third_app_token", mMFBLoginUI.f73460d.f209213a.toString());
            intent.putExtra("register_title", mMFBLoginUI.getString(com.tencent.mm.R.string.bkx));
            intent.putExtra("register_nick_name", this.f73908a.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME));
            intent.putExtra("register_avatar", ((org.json.JSONObject) this.f73908a.get("picture")).getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).getString("url"));
            com.tencent.mm.plugin.account.ui.MMFBLoginUI mMFBLoginUI2 = this.f73909b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mMFBLoginUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$2", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMFBLoginUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mMFBLoginUI2, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$2", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = mMFBLoginUI.f73466m;
            thirdAppRegisterStruct.f61234d = 1L;
            thirdAppRegisterStruct.f61235e = 4L;
            thirdAppRegisterStruct.k();
            mMFBLoginUI.finish();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FacebookLoginUI", e17, "parse json error!", new java.lang.Object[0]);
            db5.e1.s(mMFBLoginUI, "Retrieve Failed, Error Format!", "");
            return true;
        }
    }
}
