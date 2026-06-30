package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class bc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f249440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cc f249441e;

    public bc(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cc ccVar, android.graphics.Bitmap bitmap) {
        this.f249441e = ccVar;
        this.f249440d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        int i18;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e97732;
        java.lang.String str7;
        java.lang.String str8;
        boolean z17;
        android.graphics.Bitmap b07;
        java.lang.String str9 = "run";
        java.lang.String str10 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1");
        android.graphics.Bitmap bitmap = this.f249440d;
        if (bitmap == null) {
            try {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.V6(this.f249441e.f249652f.f251271d)) {
                    b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(this.f249441e.f249651e.getChildAt(0));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.W6(this.f249441e.f249652f.f251271d).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                } else {
                    b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.U6(this.f249441e.f249652f.f251271d));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.W6(this.f249441e.f249652f.f251271d).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                }
                bitmap = b07;
            } catch (java.lang.Throwable th6) {
                bitmap = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f249441e.f249652f.f251271d.f248233d, "getBitmapFromView exp=" + th6.toString());
            }
        }
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.b7(this.f249441e.f249652f.f251271d).setAlpha(1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.W6(this.f249441e.f249652f.f251271d).setImageBitmap(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cc ccVar = this.f249441e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e97733 = ccVar.f249652f.f251271d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = ccVar.f249651e;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            activityC18007x6d5e97733.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (activityC18007x6d5e97733.W1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC18007x6d5e97733.f248233d, "is playing animation");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
                str6 = "access$1500";
                str4 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
            } else {
                activityC18007x6d5e97733.W1 = true;
                if (activityC18007x6d5e97733.getF147381t()) {
                    activityC18007x6d5e97733.m78735x28280f95().m81450x8e764904(false);
                    activityC18007x6d5e97733.m78735x28280f95().d(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var = activityC18007x6d5e97733.f248279t2;
                str = "run";
                if (i0Var != null) {
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
                    android.widget.FrameLayout frameLayout = activityC18007x6d5e97733.L1;
                    str3 = "access$1500";
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    c1163xf1deaba4 = c1163xf1deaba42;
                    i17 = height;
                    if (i0Var.f244638e) {
                        int width2 = frameLayout.getWidth();
                        int height2 = frameLayout.getHeight();
                        i18 = width;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSimpleTwistAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        activityC18007x6d5e97732 = activityC18007x6d5e97733;
                        android.view.View view = i0Var.f244651r;
                        str8 = "tryPlayEnterAnimation";
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (!i0Var.B) {
                            android.view.View view2 = i0Var.f244652s;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view3 = i0Var.f244651r;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View view4 = i0Var.f244650q;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View view5 = i0Var.f244652s;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e97734 = i0Var.f244634a;
                        int intExtra = activityC18007x6d5e97734.getIntent().getIntExtra("img_gallery_top", 0);
                        if (com.p314xaae8f345.mm.ui.bk.u(activityC18007x6d5e97734, false)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCanvasFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            boolean z18 = activityC18007x6d5e97734.U2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCanvasFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            if (!z18) {
                                int p17 = com.p314xaae8f345.mm.ui.bk.p(activityC18007x6d5e97734);
                                intExtra -= p17;
                                str7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPageEggCardHelper", "hasCutOut, h=" + p17 + ", thumbTop=" + intExtra);
                                int intExtra2 = activityC18007x6d5e97734.getIntent().getIntExtra("img_gallery_left", 0);
                                int intExtra3 = activityC18007x6d5e97734.getIntent().getIntExtra("img_gallery_width", 0);
                                int intExtra4 = activityC18007x6d5e97734.getIntent().getIntExtra("img_gallery_height", 0);
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putInt("param_thumb_left", intExtra2);
                                bundle.putInt("param_thumb_top", intExtra);
                                bundle.putInt("param_thumb_width", intExtra3);
                                bundle.putInt("param_thumb_height", intExtra4);
                                bundle.putInt("param_target_width", width2);
                                bundle.putInt("param_target_height", height2);
                                vb4.n nVar = new vb4.n(activityC18007x6d5e97734, i0Var.f244649p, bundle, i0Var.f244655v.f484356b.f484319a);
                                nVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i(i0Var));
                                android.view.View view6 = i0Var.f244649p;
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                arrayList6.add(0);
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                nVar.d(0L);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69968xe521e1d1(0L);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSimpleTwistAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                                z17 = true;
                            }
                        }
                        str7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                        int intExtra22 = activityC18007x6d5e97734.getIntent().getIntExtra("img_gallery_left", 0);
                        int intExtra32 = activityC18007x6d5e97734.getIntent().getIntExtra("img_gallery_width", 0);
                        int intExtra42 = activityC18007x6d5e97734.getIntent().getIntExtra("img_gallery_height", 0);
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putInt("param_thumb_left", intExtra22);
                        bundle2.putInt("param_thumb_top", intExtra);
                        bundle2.putInt("param_thumb_width", intExtra32);
                        bundle2.putInt("param_thumb_height", intExtra42);
                        bundle2.putInt("param_target_width", width2);
                        bundle2.putInt("param_target_height", height2);
                        vb4.n nVar2 = new vb4.n(activityC18007x6d5e97734, i0Var.f244649p, bundle2, i0Var.f244655v.f484356b.f484319a);
                        nVar2.c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i(i0Var));
                        android.view.View view62 = i0Var.f244649p;
                        java.util.ArrayList arrayList62 = new java.util.ArrayList();
                        arrayList62.add(0);
                        java.util.Collections.reverse(arrayList62);
                        yj0.a.d(view62, arrayList62.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view62.setVisibility(((java.lang.Integer) arrayList62.get(0)).intValue());
                        yj0.a.f(view62, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        nVar2.d(0L);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69968xe521e1d1(0L);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSimpleTwistAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        z17 = true;
                    } else {
                        activityC18007x6d5e97732 = activityC18007x6d5e97733;
                        i18 = width;
                        str7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                        str8 = "tryPlayEnterAnimation";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        z17 = false;
                    }
                    if (z17) {
                        str4 = str7;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str8, str4);
                        str6 = str3;
                    } else {
                        str4 = str7;
                        str5 = str8;
                        activityC18007x6d5e9773 = activityC18007x6d5e97732;
                    }
                } else {
                    i17 = height;
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
                    c1163xf1deaba4 = c1163xf1deaba42;
                    i18 = width;
                    str3 = "access$1500";
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                    str5 = "tryPlayEnterAnimation";
                    activityC18007x6d5e9773 = activityC18007x6d5e97733;
                }
                if (activityC18007x6d5e9773.U1 == null) {
                    activityC18007x6d5e9773.U1 = new vb4.f(activityC18007x6d5e9773, activityC18007x6d5e9773.f248261n, activityC18007x6d5e9773.f248284w);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69968xe521e1d1(0L);
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putInt("param_thumb_left", activityC18007x6d5e9773.f248272q);
                    bundle3.putInt("param_thumb_top", activityC18007x6d5e9773.f248267p);
                    bundle3.putInt("param_thumb_width", activityC18007x6d5e9773.f248274r);
                    bundle3.putInt("param_thumb_height", activityC18007x6d5e9773.f248276s);
                    bundle3.putInt("param_target_width", i18);
                    bundle3.putInt("param_target_height", i17);
                    activityC18007x6d5e9773.U1.a(bundle3);
                    activityC18007x6d5e9773.U1.c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sb(activityC18007x6d5e9773, c1163xf1deaba4));
                    activityC18007x6d5e9773.U1.d(0L);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str4);
                str6 = str3;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str6, str4);
            str9 = str;
            str10 = str2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.b7(this.f249441e.f249652f.f251271d).setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str9, str10);
    }
}
