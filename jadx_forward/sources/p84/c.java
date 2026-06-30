package p84;

/* loaded from: classes4.dex */
public final class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p84.e f434309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p84.e eVar, android.os.Looper looper) {
        super(looper);
        this.f434309a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.arg1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        p84.e eVar = this.f434309a;
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.u uVar = eVar.f434316e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = eVar.f434315d;
        if (uVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            if (c17933xe8d1b226 != null) {
                int i18 = uVar.f247680b;
                int i19 = uVar.f247681c;
                boolean z17 = eVar.f434321j;
                boolean z18 = eVar.f434322k;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2141x433d5f83.C17787x45e5e488 c17787x45e5e488 = eVar.f434317f;
                if (i17 >= i18) {
                    if (i17 < i19) {
                        eVar.f434322k = false;
                        if (z17) {
                            str = "handleMessage";
                        } else {
                            eVar.f434321j = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                            android.view.View view = eVar.f434318g;
                            if (view != null) {
                                if (view.getVisibility() == 0) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                    android.view.View view2 = eVar.f434318g;
                                    if (view2 == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                    } else {
                                        if (view2.getVisibility() == 0) {
                                            if (eVar.f434320i == null) {
                                                str = "handleMessage";
                                                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(eVar.f434318g, "translationX", 0.0f, i65.a.b(c17787x45e5e488.getContext(), 16));
                                                ofFloat.setDuration(500L);
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                ofFloat.setInterpolator(pathInterpolator);
                                                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(eVar.f434318g, "alpha", 1.0f, 0.0f);
                                                ofFloat2.setDuration(500L);
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                                ofFloat2.setInterpolator(pathInterpolator2);
                                                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                                                animatorSet.play(ofFloat).with(ofFloat2);
                                                animatorSet.addListener(new p84.d(eVar));
                                                eVar.f434320i = animatorSet;
                                            } else {
                                                str = "handleMessage";
                                            }
                                            android.animation.AnimatorSet animatorSet2 = eVar.f434320i;
                                            if (animatorSet2 != null) {
                                                animatorSet2.start();
                                            }
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startOutViewDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                        }
                                    }
                                    str = "handleMessage";
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                                }
                            }
                            str = "handleMessage";
                            c17787x45e5e488.a();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAppearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                        }
                    } else {
                        str = "handleMessage";
                        eVar.f434321j = false;
                        if (!z18) {
                            eVar.f434322k = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                            c17787x45e5e488.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startContentDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            if (c17787x45e5e488.f245051p == null) {
                                float b17 = i65.a.b(c17787x45e5e488.getContext(), 12);
                                android.view.View view3 = c17787x45e5e488.f245043e;
                                if (view3 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
                                    throw null;
                                }
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view3, "translationX", 0.0f, b17);
                                str3 = "startContentDisappearAnim";
                                ofFloat3.setDuration(500L);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                android.view.animation.PathInterpolator pathInterpolator3 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                ofFloat3.setInterpolator(pathInterpolator3);
                                android.view.View view4 = c17787x45e5e488.f245043e;
                                if (view4 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
                                    throw null;
                                }
                                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f);
                                ofFloat4.setDuration(500L);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                android.view.animation.PathInterpolator pathInterpolator4 = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
                                ofFloat4.setInterpolator(pathInterpolator4);
                                android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
                                animatorSet3.addListener(new p84.h(c17787x45e5e488));
                                animatorSet3.play(ofFloat3).with(ofFloat4);
                                c17787x45e5e488.f245051p = animatorSet3;
                            } else {
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                                str3 = "startContentDisappearAnim";
                            }
                            android.animation.AnimatorSet animatorSet4 = c17787x45e5e488.f245051p;
                            if (animatorSet4 != null) {
                                animatorSet4.start();
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDisappearAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                        }
                    }
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                } else {
                    str = "handleMessage";
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
                    if (c17787x45e5e488.getVisibility() == 0) {
                        eVar.d();
                    }
                    eVar.f434323l.removeCallbacksAndMessages(null);
                    eVar.f434321j = false;
                    eVar.f434322k = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        }
        str = "handleMessage";
        str2 = "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$mUIHandler$1";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$handleVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
