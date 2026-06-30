package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ic implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.kc f290451b;

    public ic(com.p314xaae8f345.mm.ui.kc kcVar, java.util.HashMap hashMap) {
        this.f290451b = kcVar;
        this.f290450a = hashMap;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMErrorProcessor", "onDialogClick %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            xv.j0 j0Var = (xv.j0) i95.n0.c(xv.j0.class);
            android.app.Activity activity = this.f290451b.f290575d;
            java.util.HashMap hashMap = this.f290450a;
            ((wv.a) j0Var).getClass();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16108xa09a31af.f223920q;
            try {
                java.lang.String str2 = (java.lang.String) hashMap.get("task_name");
                java.lang.String str3 = (java.lang.String) hashMap.get("task_url");
                java.lang.String str4 = (java.lang.String) hashMap.get("alternative_url");
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) hashMap.get("task_size"), 0L);
                java.lang.String str5 = (java.lang.String) hashMap.get("file_md5");
                java.lang.String str6 = (java.lang.String) hashMap.get("extInfo");
                java.lang.String str7 = (java.lang.String) hashMap.get("appid");
                java.lang.String str8 = (java.lang.String) hashMap.get("package_name");
                java.lang.String str9 = (java.lang.String) hashMap.get("thumb_url");
                java.lang.String str10 = (java.lang.String) hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16108xa09a31af.class);
                intent.putExtra("task_name", str2);
                intent.putExtra("task_download_type", 1);
                intent.putExtra("app_developer", (java.lang.String) hashMap.get("developer"));
                intent.putExtra("app_version", (java.lang.String) hashMap.get("app_version"));
                intent.putExtra("app_desc", (java.lang.String) hashMap.get("app_desc"));
                intent.putExtra("app_privacy_url", (java.lang.String) hashMap.get("privacy_agreement_url"));
                intent.putExtra("app_permission_url", (java.lang.String) hashMap.get("permission_url"));
                intent.putExtra("task_url", str3);
                intent.putExtra("alternative_url", str4);
                intent.putExtra("task_size", V);
                intent.putExtra("file_md5", str5);
                intent.putExtra("extInfo", str6);
                intent.putExtra("fileType", 1);
                intent.putExtra("appid", str7);
                intent.putExtra("package_name", str8);
                intent.putExtra("thumb_url", str9);
                intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str10);
                intent.putExtra("page_url", (java.lang.String) hashMap.get("page_url"));
                intent.putExtra("notify_type_extra", "mmdiff_download_full_apk_notify");
                intent.putExtra("page_scene", 0);
                activity.startService(intent);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffInstallApkService.HdiffApk", "doAddDownloadTask, e = %s", e17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 35L, 1L, false);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbz), 1).show();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("update_has_new_package", false);
    }
}
