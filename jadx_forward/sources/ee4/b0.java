package ee4;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.c0 f333209d;

    public b0(ee4.c0 c0Var) {
        this.f333209d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        int i18;
        int i19;
        java.lang.String str3 = "run";
        java.lang.String str4 = "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commitInternal$1";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commitInternal$1");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ee4.c0 c0Var = this.f333209d;
        ee4.f1 n17 = c0Var.n();
        java.util.List paths = c0Var.m().v().d();
        n17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        java.util.Iterator it = ((java.util.ArrayList) paths).iterator();
        while (it.hasNext()) {
            java.lang.String str5 = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 m43587xb5c99c46 = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str5);
            if (m43587xb5c99c46.f27815xaa2bac6c >= 0.0d) {
                str = str3;
                str2 = str4;
                if (m43587xb5c99c46.f27817x83009af >= 0.0d) {
                    i17 = 1;
                    java.lang.String str6 = m43587xb5c99c46.f27822x633fb29;
                    i18 = m43587xb5c99c46.f27813xa98b352b;
                    i19 = m43587xb5c99c46.f27812x6e0c7662;
                    if (i18 > 0 || i19 <= 0) {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str5, options);
                        int i27 = options.outWidth;
                        i19 = options.outHeight;
                        i18 = i27;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15523, java.lang.Integer.valueOf(i17), str6, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf((int) m43587xb5c99c46.m43594xb79e176e()));
                    str3 = str;
                    str4 = str2;
                }
            } else {
                str = str3;
                str2 = str4;
            }
            i17 = 0;
            java.lang.String str62 = m43587xb5c99c46.f27822x633fb29;
            i18 = m43587xb5c99c46.f27813xa98b352b;
            i19 = m43587xb5c99c46.f27812x6e0c7662;
            if (i18 > 0) {
            }
            android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str5, options2);
            int i272 = options2.outWidth;
            i19 = options2.outHeight;
            i18 = i272;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15523, java.lang.Integer.valueOf(i17), str62, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf((int) m43587xb5c99c46.m43594xb79e176e()));
            str3 = str;
            str4 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPhotoInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        c0Var.f("report photo info cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
    }
}
