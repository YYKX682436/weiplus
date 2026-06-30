package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes3.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f244411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.m1 f244412e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.m1 m1Var, android.graphics.Bitmap bitmap) {
        this.f244412e = m1Var;
        this.f244411d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6$1");
        android.graphics.Bitmap bitmap = this.f244411d;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.m1 m1Var = this.f244412e;
            m1Var.f244427e.setImageBitmap(bitmap);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m1Var.f244427e, "alpha", 0.5f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHBCardComponent", "loadAvatarByUserName end, userName=" + m1Var.f244426d + ", w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$6$1");
    }
}
