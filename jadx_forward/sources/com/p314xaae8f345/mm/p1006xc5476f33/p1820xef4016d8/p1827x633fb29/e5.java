package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public abstract class e5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f226795a = lp0.b.e() + "luckymoneynewyear/";

    public static boolean a() {
        java.lang.String e17 = e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "checkPAGAnimResource: %s", e17);
        if (!com.p314xaae8f345.mm.vfs.w6.j(e17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath is not exist");
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(e17).G();
        if (G == null || G.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath empty: %s", e17);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath has size : %s", java.lang.Integer.valueOf(G.length));
        return true;
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        int m37789x737fa05e;
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.f226760d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "downnloadPAGAnimResource fileId：%s aesKey:%s", str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m37789x737fa05e = -1;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 26);
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
            java.lang.String str4 = f226795a + "pagResource.zip";
            c2CDownloadRequest.url = str;
            c2CDownloadRequest.f17792xcd096f43 = str;
            c2CDownloadRequest.f17775x596916e = 3;
            c2CDownloadRequest.f17769xd0bc10db = 266;
            c2CDownloadRequest.f17793xd428dad6 = 20303;
            c2CDownloadRequest.m37861xfb0731c4(str4);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c2CDownloadRequest.f17840xf3a4da4a = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download beginTime: %s", java.lang.Long.valueOf(currentTimeMillis));
            m37789x737fa05e = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(c2CDownloadRequest, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c4(currentTimeMillis, str, str4, str2), 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "downloadRet:%s", java.lang.Integer.valueOf(m37789x737fa05e));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6280x249e84 c6280x249e84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6280x249e84();
        c6280x249e84.f136529g.f89874a = m37789x737fa05e == 0;
        c6280x249e84.e();
        if (m37789x737fa05e == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 27);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 28);
        }
    }

    public static boolean c(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p947xba6de98f.q0 q0Var) {
        dn.m mVar = new dn.m();
        mVar.f69601xaca5bdda = "VoiceData" + str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f226795a + "voice/");
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        mVar.f69595x6d25b0d9 = sb7;
        mVar.f69592xf1ebe47b = 15;
        mVar.f69575xf11df5f5 = str2;
        mVar.f69591xf9dbbe9c = str;
        mVar.f69586x737ec037 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "downloadVoiceFile %s %s %s", mVar.f69601xaca5bdda, sb7, str2);
        return ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(q0Var)) != null;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = f226795a + "pagResource/" + str + str2 + ".pag";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource :%s", str3);
        if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource succ");
            return str3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource fail");
        return "";
    }

    public static java.lang.String e() {
        return f226795a + "pagResource";
    }

    public static java.lang.String f() {
        java.lang.String str = c01.z1.r() + "_" + java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f226795a + "voice/");
        sb6.append(str);
        sb6.append(".amr");
        return sb6.toString();
    }

    public static void g(android.view.View view, android.view.animation.Animation.AnimationListener animationListener) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator(1.0f));
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d5(view, scaleAnimation2));
        if (animationListener != null) {
            scaleAnimation2.setAnimationListener(animationListener);
        }
        if (view != null) {
            view.startAnimation(scaleAnimation);
        }
    }

    public static java.lang.String h(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        java.lang.String r17 = r6Var.n().r();
        if (!r17.endsWith("/")) {
            r17 = r17.concat("/");
        }
        if (!com.p314xaae8f345.mm.vfs.w6.P(r17, r6Var.n().m82467xfb82e301(), str2)) {
            return "";
        }
        return r17 + str2;
    }

    public static boolean i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "saveFiletoLocal");
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "fileExists exist, first delete file ：%s", str2);
            com.p314xaae8f345.mm.vfs.w6.g(str2, true);
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(e());
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            m17.f294799a.r(m17.f294800b);
        }
        int Q = com.p314xaae8f345.mm.vfs.w6.Q(str, e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "unzip ret: %s", java.lang.Integer.valueOf(Q));
        p();
        com.p314xaae8f345.mm.vfs.w6.h(str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6280x249e84 c6280x249e84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6280x249e84();
        c6280x249e84.f136529g.f89875b = Q == 0;
        c6280x249e84.e();
        return Q == 0;
    }

    public static void j(android.view.View view, int i17) {
        if (i17 == 4) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z4(view));
            view.startAnimation(alphaAnimation);
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(300L);
        alphaAnimation2.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a5(view));
        view.startAnimation(alphaAnimation2);
    }

    public static void k(android.view.View view, int i17) {
        l(view, i17, 250);
    }

    public static void l(android.view.View view, int i17, int i18) {
        if (i17 == 0) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(i18);
            alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.b5(view, i17));
            view.startAnimation(alphaAnimation);
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(i18);
        alphaAnimation2.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c5(view, i17));
        view.startAnimation(alphaAnimation2);
    }

    public static void m(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2, ym5.w1 w1Var, ym5.w1 w1Var2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "startPAGAnim ：%s ", str);
        boolean z17 = true;
        if (str.equals("loop")) {
            c22789xd23e9a9b.i(w1Var);
            c22789xd23e9a9b.a(w1Var2);
            c22789xd23e9a9b.m82583xcde73672(0);
        } else {
            c22789xd23e9a9b.i(w1Var2);
            c22789xd23e9a9b.a(w1Var);
            c22789xd23e9a9b.m82583xcde73672(1);
            if (c22789xd23e9a9b2 != null) {
                o(c22789xd23e9a9b2, w1Var, w1Var2);
                c22789xd23e9a9b.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w4(c22789xd23e9a9b, str2), 200L);
                z17 = false;
            } else {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                c22789xd23e9a9b.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x4());
            }
        }
        if (z17) {
            c22789xd23e9a9b.m82581x764e93a7(str2);
            c22789xd23e9a9b.n();
            c22789xd23e9a9b.d();
            c22789xd23e9a9b.g();
            c22789xd23e9a9b.setVisibility(0);
        }
    }

    public static void n(android.widget.ImageView imageView) {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        if (imageView == null || !(imageView.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) || (animationDrawable = (android.graphics.drawable.AnimationDrawable) imageView.getDrawable()) == null) {
            return;
        }
        animationDrawable.stop();
        animationDrawable.selectDrawable(0);
    }

    public static void o(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, ym5.w1 w1Var, ym5.w1 w1Var2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "stopPAGAnim");
        c22789xd23e9a9b.i(w1Var);
        c22789xd23e9a9b.i(w1Var2);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        c22789xd23e9a9b.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.y4(c22789xd23e9a9b));
    }

    public static void p() {
        java.lang.String str = e() + "/WXfzysc.ttf.zip";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewYearLogic", "%s not exist", str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "%s exist, need to unzip", str);
        int Q = com.p314xaae8f345.mm.vfs.w6.Q(str, e());
        if (Q == 0) {
            com.p314xaae8f345.mm.vfs.w6.g(str, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "unzip font ret: %s", java.lang.Integer.valueOf(Q));
    }
}
