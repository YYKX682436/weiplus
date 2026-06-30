package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class zs implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253245c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.at f253246d;

    public zs(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.at atVar, java.lang.String str, android.content.Context context, java.lang.String str2) {
        this.f253246d = atVar;
        this.f253243a = str;
        this.f253244b = context;
        this.f253245c = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
        android.content.Context context = this.f253244b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.at atVar = this.f253246d;
        if (!z17) {
            db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3u));
            atVar.f249324p.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33130x6942258 = atVar.f249316e;
        c11286x34a5504.f33121x993583fc = atVar.f249318g;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
        c11300x89dbd7a1.f33245xc682a690 = this.f253243a;
        c11300x89dbd7a1.f33249xa1713a8c = atVar.f249319h;
        c11286x34a5504.f33122xe4128443 = c11300x89dbd7a1;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee.f249013e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18126x284db4ee activityC18126x284db4ee = atVar.f249324p;
        java.util.Map map = activityC18126x284db4ee.f249014d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        java.lang.String str2 = atVar.f249317f;
        if (!((java.util.HashMap) map).containsKey(str2)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str2);
            za4.t0.b("adId", atVar.f249317f, false, 1000000001, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ys(this, c11286x34a5504, str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        java.util.Map map2 = activityC18126x284db4ee.f249014d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.HashMap) map2).get(str2);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsTransparentUI", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        java.lang.String str3 = this.f253245c;
        jtVar.f88616d = str3;
        jtVar.f88617e = 49;
        jtVar.f88618f = "";
        jtVar.f88619g = "";
        jtVar.f88630r = atVar.f249320i;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openAdCanvasPage doTransmit confirm dialog in SnsTransparentUI, uxInfo is ");
        java.lang.String str4 = atVar.f249321m;
        sb6.append(str4);
        sb6.append(", selfUserName is ");
        sb6.append(atVar.f249322n);
        sb6.append(", sendUserName is ");
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", sb6.toString());
        o94.a.b(str3, str4, atVar.f249323o);
        db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        activityC18126x284db4ee.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDialogClick", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1$1");
    }
}
