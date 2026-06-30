package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class ys implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f253178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zs f253180c;

    public ys(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zs zsVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str) {
        this.f253180c = zsVar;
        this.f253178a = c11286x34a5504;
        this.f253179b = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zs zsVar = this.f253180c;
        android.content.Context context = zsVar.f253244b;
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3u));
        zsVar.f253246d.f249324p.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        java.lang.String str2 = this.f253179b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zs zsVar = this.f253180c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
        try {
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.at atVar = zsVar.f253246d;
            java.lang.String str3 = zsVar.f253245c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.at atVar2 = zsVar.f253246d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee activityC18126x284db4ee = atVar.f249324p;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee.f249013e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            java.util.Map map = activityC18126x284db4ee.f249014d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            ((java.util.HashMap) map).put(atVar2.f249317f, J2);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f253178a;
            if (J2 != null && !J2.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsTransparentUI", "thumb image is not null");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                J2.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
            am.jt jtVar = c5987xfe669c12.f136282g;
            jtVar.f88613a = c11286x34a5504;
            jtVar.f88616d = str3;
            jtVar.f88617e = 49;
            jtVar.f88618f = "";
            jtVar.f88619g = "";
            jtVar.f88630r = atVar2.f249320i;
            c5987xfe669c12.e();
            if (!android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = str3;
                mtVar.f88896b = str2;
                mtVar.f88897c = c01.e2.C(str3);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "openAdCanvasPage doTransmit confirm dialog download ad img callback in SnsTransparentUI, uxInfo is " + atVar2.f249321m + ", selfUserName is " + atVar2.f249322n + ", sendUserName is " + str3);
            o94.a.b(str3, atVar2.f249321m, atVar2.f249323o);
            android.content.Context context = zsVar.f253244b;
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            atVar2.f249324p.finish();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsTransparentUI", "this has a error : " + e17.toString());
            zsVar.f253246d.f249324p.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1$1");
    }
}
