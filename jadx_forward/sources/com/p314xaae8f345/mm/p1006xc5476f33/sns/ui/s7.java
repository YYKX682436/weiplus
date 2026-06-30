package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 f251977d;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var) {
        this.f251977d = p7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.PicWidget$3");
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var = this.f251977d;
        java.util.ArrayList<java.lang.String> d17 = p7Var.f251697g.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.PicWidget");
        p7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        for (java.lang.String str : d17) {
            com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 m43587xb5c99c46 = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str);
            int i17 = (m43587xb5c99c46.f27815xaa2bac6c < 0.0d || m43587xb5c99c46.f27817x83009af < 0.0d) ? 0 : 1;
            java.lang.String str2 = m43587xb5c99c46.f27822x633fb29;
            int i18 = m43587xb5c99c46.f27813xa98b352b;
            int i19 = m43587xb5c99c46.f27812x6e0c7662;
            if (i18 <= 0 || i19 <= 0) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
                int i27 = options.outWidth;
                i19 = options.outHeight;
                i18 = i27;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15523, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf((int) m43587xb5c99c46.m43594xb79e176e()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.PicWidget");
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.PicWidget$3");
    }
}
