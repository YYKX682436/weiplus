package a94;

/* loaded from: classes4.dex */
public class s extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 f83996a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6) {
        this.f83996a = c17812x947672b6;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        r44.f t17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2");
        if (message.what != 1) {
            str4 = "handleMessage";
            str5 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
        } else {
            long j17 = message.arg1;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6.C;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17812x947672b6 c17812x947672b6 = this.f83996a;
            c17812x947672b6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            boolean z17 = c17812x947672b6.f245371p;
            if (c17812x947672b6.f245369n == null || z17) {
                str = "access$100";
                str2 = "handleMessage";
                str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            } else {
                if (j17 < r11.f83965f || j17 > r11.f83966g) {
                    str = "access$100";
                    str2 = "handleMessage";
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                    str6 = "doOnVideoPlay";
                    c17812x947672b6.h(false);
                    c17812x947672b6.g();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    if (c17812x947672b6.f245380y) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        str = "access$100";
                        str2 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                        str6 = "doOnVideoPlay";
                    } else {
                        c17812x947672b6.f245380y = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "spreadUp");
                        c17812x947672b6.A = true;
                        c17812x947672b6.e();
                        c17812x947672b6.f245366h.setVisibility(0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17798x4367c7e7 c17798x4367c7e7 = c17812x947672b6.f245366h;
                        c17798x4367c7e7.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverAnimView", "spreadUp, scale=" + c17798x4367c7e7.f245120e);
                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c17798x4367c7e7.f245119d, "alpha", 0.7f, 0.7f);
                        str2 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                        long j18 = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a;
                        ofFloat.setDuration(j18);
                        str = "access$100";
                        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c17798x4367c7e7.f245119d, "scaleX", 1.0f, c17798x4367c7e7.f245120e);
                        ofFloat2.setDuration(j18);
                        str6 = "doOnVideoPlay";
                        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c17798x4367c7e7.f245119d, "scaleY", 1.0f, c17798x4367c7e7.f245120e);
                        ofFloat3.setDuration(j18);
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                        animatorSet.start();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        c17812x947672b6.f245365g.setVisibility(0);
                        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c17812x947672b6.f245365g, "alpha", 0.0f, 1.0f);
                        ofFloat4.setDuration(500L);
                        ofFloat4.addListener(new a94.t(c17812x947672b6));
                        ofFloat4.start();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    }
                    if (c17812x947672b6.A && !c17812x947672b6.f245381z) {
                        c17812x947672b6.e();
                    }
                }
                a94.a aVar = c17812x947672b6.f245369n;
                if (j17 < aVar.f83963d || j17 > aVar.f83964e) {
                    c17812x947672b6.f();
                    c17812x947672b6.f245378w = false;
                    if (c17812x947672b6.f245377v) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "out shake zone");
                        c17812x947672b6.f245377v = false;
                        if (!c17812x947672b6.f245379x) {
                            a94.m.b(c17812x947672b6.f245368m, 2, c17812x947672b6.f245373r);
                        }
                    }
                    c17812x947672b6.f245376u = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    if (c17812x947672b6.f245371p || c17812x947672b6.f245372q) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShakeCoverView", "startListenShake, isUIPaused=" + c17812x947672b6.f245372q + ", isDestroyed=" + c17812x947672b6.f245371p);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    } else {
                        if (c17812x947672b6.f245370o == null) {
                            c17812x947672b6.f245370o = new a94.b0(c17812x947672b6.f245367i);
                        }
                        if (c17812x947672b6.f245370o.c()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 3);
                            if (!c17812x947672b6.f245370o.b()) {
                                a94.a aVar2 = c17812x947672b6.f245369n;
                                int i18 = aVar2.f83971o;
                                int i19 = aVar2.f83972p;
                                if (i18 < 6) {
                                    i18 = 6;
                                }
                                if (i19 < 9) {
                                    i19 = 9;
                                }
                                fd4.r rVar = c17812x947672b6.f245374s;
                                if (rVar != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                                    if (rVar.f342827n != 0 || (t17 = rVar.t()) == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                                    } else {
                                        rVar.h();
                                        t17.Q6(rVar, 100.0f);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                                    }
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "startListenShake， min=" + i18 + ", max=" + i19);
                                c17812x947672b6.f245370o.d(new a94.y(c17812x947672b6, i18, i19));
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeCoverView", "sensor not support");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 4);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        }
                    }
                    c17812x947672b6.f245378w = true;
                    if (c17812x947672b6.f245376u) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCoverView", "in shake zone");
                        c17812x947672b6.f245376u = false;
                        c17812x947672b6.f245379x = false;
                        a94.m.b(c17812x947672b6.f245368m, 3, c17812x947672b6.f245373r);
                    }
                    c17812x947672b6.f245377v = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            str4 = str2;
            str5 = str3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
    }
}
