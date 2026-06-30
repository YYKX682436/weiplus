package a94;

/* loaded from: classes4.dex */
public class s extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView f2463a;

    public s(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView) {
        this.f2463a = shakeCoverView;
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2");
        if (message.what != 1) {
            str4 = "handleMessage";
            str5 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
        } else {
            long j17 = message.arg1;
            int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = this.f2463a;
            shakeCoverView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            boolean z17 = shakeCoverView.f163838p;
            if (shakeCoverView.f163836n == null || z17) {
                str = "access$100";
                str2 = "handleMessage";
                str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            } else {
                if (j17 < r11.f2432f || j17 > r11.f2433g) {
                    str = "access$100";
                    str2 = "handleMessage";
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                    str6 = "doOnVideoPlay";
                    shakeCoverView.h(false);
                    shakeCoverView.g();
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    if (shakeCoverView.f163847y) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        str = "access$100";
                        str2 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                        str6 = "doOnVideoPlay";
                    } else {
                        shakeCoverView.f163847y = true;
                        com.tencent.mars.xlog.Log.i("ShakeCoverView", "spreadUp");
                        shakeCoverView.A = true;
                        shakeCoverView.e();
                        shakeCoverView.f163833h.setVisibility(0);
                        com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView shakeCoverAnimView = shakeCoverView.f163833h;
                        shakeCoverAnimView.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
                        com.tencent.mars.xlog.Log.i("ShakeCoverAnimView", "spreadUp, scale=" + shakeCoverAnimView.f163587e);
                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(shakeCoverAnimView.f163586d, "alpha", 0.7f, 0.7f);
                        str2 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$2";
                        long j18 = com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE;
                        ofFloat.setDuration(j18);
                        str = "access$100";
                        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(shakeCoverAnimView.f163586d, "scaleX", 1.0f, shakeCoverAnimView.f163587e);
                        ofFloat2.setDuration(j18);
                        str6 = "doOnVideoPlay";
                        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(shakeCoverAnimView.f163586d, "scaleY", 1.0f, shakeCoverAnimView.f163587e);
                        ofFloat3.setDuration(j18);
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                        animatorSet.start();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.ShakeCoverAnimView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        shakeCoverView.f163832g.setVisibility(0);
                        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(shakeCoverView.f163832g, "alpha", 0.0f, 1.0f);
                        ofFloat4.setDuration(500L);
                        ofFloat4.addListener(new a94.t(shakeCoverView));
                        ofFloat4.start();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTipLayout", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spreadUp", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    }
                    if (shakeCoverView.A && !shakeCoverView.f163848z) {
                        shakeCoverView.e();
                    }
                }
                a94.a aVar = shakeCoverView.f163836n;
                if (j17 < aVar.f2430d || j17 > aVar.f2431e) {
                    shakeCoverView.f();
                    shakeCoverView.f163845w = false;
                    if (shakeCoverView.f163844v) {
                        com.tencent.mars.xlog.Log.i("ShakeCoverView", "out shake zone");
                        shakeCoverView.f163844v = false;
                        if (!shakeCoverView.f163846x) {
                            a94.m.b(shakeCoverView.f163835m, 2, shakeCoverView.f163840r);
                        }
                    }
                    shakeCoverView.f163843u = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    if (shakeCoverView.f163838p || shakeCoverView.f163839q) {
                        com.tencent.mars.xlog.Log.w("ShakeCoverView", "startListenShake, isUIPaused=" + shakeCoverView.f163839q + ", isDestroyed=" + shakeCoverView.f163838p);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                    } else {
                        if (shakeCoverView.f163837o == null) {
                            shakeCoverView.f163837o = new a94.b0(shakeCoverView.f163834i);
                        }
                        if (shakeCoverView.f163837o.c()) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 3);
                            if (!shakeCoverView.f163837o.b()) {
                                a94.a aVar2 = shakeCoverView.f163836n;
                                int i18 = aVar2.f2438o;
                                int i19 = aVar2.f2439p;
                                if (i18 < 6) {
                                    i18 = 6;
                                }
                                if (i19 < 9) {
                                    i19 = 9;
                                }
                                fd4.r rVar = shakeCoverView.f163841s;
                                if (rVar != null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                                    if (rVar.f261294n != 0 || (t17 = rVar.t()) == null) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                                    } else {
                                        rVar.h();
                                        t17.Q6(rVar, 100.0f);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMultipleShakeAd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("ShakeCoverView", "startListenShake， min=" + i18 + ", max=" + i19);
                                shakeCoverView.f163837o.d(new a94.y(shakeCoverView, i18, i19));
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        } else {
                            com.tencent.mars.xlog.Log.e("ShakeCoverView", "sensor not support");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 4);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
                        }
                    }
                    shakeCoverView.f163845w = true;
                    if (shakeCoverView.f163843u) {
                        com.tencent.mars.xlog.Log.i("ShakeCoverView", "in shake zone");
                        shakeCoverView.f163843u = false;
                        shakeCoverView.f163846x = false;
                        a94.m.b(shakeCoverView.f163835m, 3, shakeCoverView.f163840r);
                    }
                    shakeCoverView.f163844v = true;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView");
            str4 = str2;
            str5 = str3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str5);
    }
}
