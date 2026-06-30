package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes9.dex */
public class uc implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252109b;

    public uc(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vc vcVar, java.lang.String str, android.content.Context context) {
        this.f252108a = str;
        this.f252109b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33130x6942258 = "test title";
        c11286x34a5504.f33121x993583fc = "test desc";
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
        c11300x89dbd7a1.f33245xc682a690 = "<xml></xml>";
        c11300x89dbd7a1.f33249xa1713a8c = "http://www.baidu.com/";
        c11286x34a5504.f33122xe4128443 = c11300x89dbd7a1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        java.lang.String Bi = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adId_image_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150".getBytes()));
        java.lang.String str2 = Bi + sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(str2, 1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            bitmap = null;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        java.lang.String str3 = this.f252108a;
        jtVar.f88616d = str3;
        jtVar.f88617e = 49;
        jtVar.f88618f = "";
        jtVar.f88619g = "";
        c5987xfe669c12.e();
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
            am.mt mtVar = c5990xd50ae361.f136285g;
            mtVar.f88895a = str3;
            mtVar.f88896b = str;
            mtVar.f88897c = c01.e2.C(str3);
            mtVar.f88898d = 0;
            c5990xd50ae361.e();
        }
        android.content.Context context = this.f252109b;
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1$1");
    }
}
