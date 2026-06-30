package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f244322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e4 f244323e;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e4 e4Var, android.graphics.Bitmap bitmap) {
        this.f244323e = e4Var;
        this.f244322d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e4 e4Var = this.f244323e;
        android.graphics.Bitmap bitmap = this.f244322d;
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.g4 g4Var = e4Var.f244329f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            boolean z17 = g4Var.H;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.g4 g4Var2 = e4Var.f244329f;
            java.lang.String str = e4Var.f244327d;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                java.util.Map map = g4Var2.G;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                ((java.util.HashMap) map).put(str, e4Var.f244328e);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadAvatarByUserName end, userName=");
            sb6.append(str);
            sb6.append(", bmp=null, isNeedRetry=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            boolean z18 = g4Var2.H;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            sb6.append(z18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingSocialCardComponent", sb6.toString());
        } else {
            e4Var.f244328e.setImageBitmap(bitmap);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(e4Var.f244328e, "alpha", 0.5f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingSocialCardComponent", "loadAvatarByUserName end, userName=" + e4Var.f244327d + ", w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$3$1");
    }
}
