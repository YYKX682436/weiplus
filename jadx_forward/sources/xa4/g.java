package xa4;

/* loaded from: classes4.dex */
public final class g implements com.p314xaae8f345.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public static final xa4.g f534363d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f534364e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f534365f;

    /* renamed from: g, reason: collision with root package name */
    public static r45.gd6 f534366g;

    /* renamed from: h, reason: collision with root package name */
    public static int f534367h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f534368i;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f534369m;

    static {
        xa4.g gVar = new xa4.g();
        f534363d = gVar;
        java.lang.String str = c50.l0.f120143a;
        f534364e = c50.l0.f120144b;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        f534365f = L;
        f534366g = new r45.gd6();
        f534368i = "sns_normal_mode";
        try {
            byte[] j17 = L.j("SnsSpring2024Config_V0");
            if (j17 != null) {
                f534366g.mo11468x92b714fd(j17);
            }
            boolean z17 = java.lang.System.currentTimeMillis() - L.q("sns_spring_ui_crash_time_ms", 0L) <= 3600000;
            f534369m = z17;
            f534368i = I() ? "sns_spring_mode" : "sns_normal_mode";
            com.p314xaae8f345.mm.app.i4.a(gVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "init config=" + gVar.J(f534366g) + " snsProtectForUICrash:" + z17);
            if (z65.c.a()) {
                int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_CRASH_PROTECT_INT_SYNC, 0);
                if (r17 == 1) {
                    f534369m = false;
                } else {
                    if (r17 != 3) {
                        return;
                    }
                    f534369m = false;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsSpringLogic", e17, "SnsSpringLogic init Error", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:117:0x004c, B:119:0x0050, B:121:0x0054, B:11:0x005c, B:15:0x0065, B:18:0x0070, B:21:0x007a, B:24:0x00bb, B:26:0x00da, B:28:0x00e2, B:33:0x00f0, B:34:0x00fb), top: B:116:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(android.content.Context r37, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa4.g.D(android.content.Context, com.tencent.mm.protocal.protobuf.TimeLineObject, boolean):void");
    }

    public static final void E(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        xa4.h[] hVarArr = xa4.h.f534370d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildIntentForLaunchUploadSnsSpring$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.content.Intent intent = new android.content.Intent();
        d(activity, intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildIntentForLaunchUploadSnsSpring$default", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1006);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/spring/SnsSpringLogic", "launchUploadSnsSpring", "(Landroid/app/Activity;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromSpringSheetOnTimeline", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            dx1.f fVar = dx1.g.f326022a;
            fVar.i("SnsPublishProcess", "fromPage", 1);
            fVar.i("SnsPublishProcess", "source_", 10L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromSpringSheetOnTimeline", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.i0 i0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromSpringSheetOnUserPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            dx1.f fVar2 = dx1.g.f326022a;
            fVar2.i("SnsPublishProcess", "fromPage", 2);
            fVar2.i("SnsPublishProcess", "source_", 10L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromSpringSheetOnUserPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }
        xa4.a aVar = xa4.a.f534352a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markClickActivityPostEntrance", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        if (xa4.a.f534353b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markClickActivityPostEntranceAfterConsume", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            aVar.a(3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markClickActivityPostEntranceAfterConsume", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            xa4.a.f534353b = false;
        }
        aVar.a(5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markClickActivityPostEntrance", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0048, code lost:
    
        if ((r1 instanceof android.view.View) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(android.content.Context r18, android.view.View r19, int r20, boolean r21, java.lang.Integer r22, java.lang.Integer r23, android.view.View.OnClickListener r24) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa4.g.H(android.content.Context, android.view.View, int, boolean, java.lang.Integer, java.lang.Integer, android.view.View$OnClickListener):void");
    }

    public static final boolean I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (f534369m) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SPRING_2024_STYLE_STATUS_INT_SYNC, -1);
        if (r17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "local set not show spring style");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (r17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "local set show spring style");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        if (!f534363d.B()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "snsSpringStyleEnable: xconfig failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsSpringFestivalYear", 0);
        if (b17 != f534367h) {
            f534367h = b17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "AV_Item_Key_SnsSpringFestivalYear:" + f534367h);
        }
        boolean z17 = b17 == 2025 || f534366g.f456678g == 2025;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsSpringStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public static final void K(r45.ga6 ga6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsServerConfig", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        r45.gd6 gd6Var = ga6Var != null ? ga6Var.f456591t : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "updateSnsServerConfig: " + f534363d.J(gd6Var));
        if (gd6Var != null) {
            f534366g = gd6Var;
        } else {
            f534366g = new r45.gd6();
        }
        f534368i = I() ? "sns_spring_mode" : "sns_normal_mode";
        f534365f.H("SnsSpring2024Config_V0", f534366g.mo14344x5f01b1f6());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsServerConfig", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public static final android.content.Intent c(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildIntentForLaunchUploadSnsNormal", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "buildIntentForLaunchUploadSnsNormal: from " + context);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.class);
        intent.putExtra("KSnsPostManu", true);
        intent.putExtra("KTouchCameraTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        intent.putExtra("sns_comment_type", 1);
        intent.putExtra("is_spring", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildIntentForLaunchUploadSnsNormal", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return intent;
    }

    public static final android.content.Intent d(android.content.Context context, android.content.Intent intent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildIntentForLaunchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "buildIntentForLaunchUploadSnsSpring: from " + context + ", feedType=" + i17);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18112x849f7cfa.class);
        intent.putExtra("KSnsPostManu", true);
        intent.putExtra("KTouchCameraTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        intent.putExtra("sns_comment_type", 1);
        intent.putExtra("is_spring", true);
        intent.putExtra("spring_feed_type", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildIntentForLaunchUploadSnsSpring", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return intent;
    }

    public static final boolean f() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (v()) {
            xa4.g gVar = f534363d;
            if (!gVar.u() && gVar.j()) {
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return z17;
            }
        }
        z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public static final boolean i(java.lang.Integer num) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = false;
        if (num == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLocalDebugConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SPRING_2024_STYLE_STATUS_INT_SYNC, -1) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalDebugConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (z18 && num.intValue() == 2025) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        int i17 = f534366g.f456678g;
        if (i17 != 0 && i17 == num.intValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsSpringFestivalYear", 0);
        if (b17 != 0 && b17 == num.intValue()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkYearValid", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public static final db5.h4 k(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPostSheetSpringMenuItem", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "createPostSheetSpringMenuItem: ");
        db5.h4 h4Var = new db5.h4(context, 8, 0);
        h4Var.f309901i = f534363d.m(context);
        h4Var.f309906q = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6q);
        h4Var.K = new xa4.e(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPostSheetSpringMenuItem", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return h4Var;
    }

    public static final void l(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSpringUnLike", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (textView != null) {
            textView.setImportantForAccessibility(2);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.m6s);
            textView.announceForAccessibility(i65.a.r(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574692ma0));
            textView.setImportantForAccessibility(1);
        }
        if (c22699x3dcdb352 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "doSpringLikeAnim: failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSpringUnLike", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        } else {
            android.graphics.drawable.Drawable i17 = i65.a.i(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f78114xb259f4e2);
            i17.setAlpha(255);
            c22699x3dcdb352.setImageDrawable(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSpringUnLike", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        }
    }

    public static final r45.g92 r() {
        byte[] j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSharedFinderLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        r45.g92 g92Var = null;
        try {
            j17 = f534365f.j(f534364e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsSpringLogic", e17, "unable to parse saved finder live", new java.lang.Object[0]);
        }
        if (j17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSharedFinderLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return null;
        }
        r45.g92 g92Var2 = new r45.g92();
        g92Var2.mo11468x92b714fd(j17);
        g92Var = g92Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSharedFinderLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return g92Var;
    }

    public static final android.graphics.drawable.Drawable s(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpringLikeDrawable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.graphics.drawable.Drawable e17 = m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), com.p314xaae8f345.mm.R.raw.f79593xc742bd23, (i18 * 1.0f) / i65.a.i(r2, com.p314xaae8f345.mm.R.raw.f79593xc742bd23).getIntrinsicWidth());
        e17.setColorFilter(new android.graphics.PorterDuffColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP));
        e17.setBounds(0, 0, i18, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpringLikeDrawable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return e17;
    }

    public static final int t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpringThemeMainColorId", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpringThemeMainColorId", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return com.p314xaae8f345.mm.R.C30859x5a72f63.af9;
    }

    public static final boolean v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SPRING_2024_POST_STATUS_INT_SYNC, -1);
        if (r17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "local set disable entry");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        xa4.g gVar = f534363d;
        if (r17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "local set show entry if u had enter live room,and feed with live tail");
            boolean h17 = gVar.h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return h17;
        }
        if (r17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "local set show entry,show live tail if u had enter live room");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        if (r17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "local set show entry,without live tail");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isXConfigSnsSpringPostSheetEntranceEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = gVar.B() && gVar.A(e42.c0.clicfg_sns_cny_post_sheet_entrance_enable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigSnsSpringPostSheetEntranceEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "isEntryOptionVisible: xconfig failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int i17 = f534366g.f456675d;
        boolean h18 = i17 != 0 ? i17 != 1 ? true : gVar.h() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "isEntryOptionVisible: result:" + h18 + ", postStatus:" + f534366g.f456675d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEntryOptionVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return h18;
    }

    public static final boolean w(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17, boolean z18) {
        r45.a90 a90Var;
        r45.fd6 fd6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isFeedShouldShowSpringLink: FoldFeed failed, ");
            sb6.append(c19807x593d1720 != null ? c19807x593d1720.Id : null);
            sb6.append(", ");
            sb6.append(c19807x593d1720 != null ? java.lang.Integer.valueOf(c19807x593d1720.f39015xc86e6609) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        xa4.g gVar = f534363d;
        if (!gVar.y(c19807x593d1720)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isFeedShouldShowSpringLink: not spring, ");
            sb7.append(c19807x593d1720 != null ? c19807x593d1720.Id : null);
            sb7.append(", ");
            sb7.append(c19807x593d1720 != null ? java.lang.Integer.valueOf(c19807x593d1720.f39015xc86e6609) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", sb7.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (((c19807x593d1720 == null || (a90Var = c19807x593d1720.f39014x86965dde) == null || (fd6Var = a90Var.B) == null) ? null : fd6Var.f455776d) == null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("isFeedShouldShowSpringLink: SpringFinderLive null, ");
            sb8.append(c19807x593d1720 != null ? c19807x593d1720.Id : null);
            sb8.append(", ");
            sb8.append(c19807x593d1720 != null ? java.lang.Integer.valueOf(c19807x593d1720.f39015xc86e6609) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", sb8.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SPRING_2024_LINK_STATUS_INT_SYNC, -1);
        if (r17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: debug hide");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (r17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: debug show");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isXConfigSnsSpringFeedLiveLinkEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z19 = gVar.B() && gVar.A(e42.c0.clicfg_sns_cny_feed_live_link_enable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigSnsSpringFeedLiveLinkEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: xConfig hide");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (f534366g.f456676e == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int n17 = gVar.n();
        boolean g17 = gVar.g(n17, c19807x593d1720, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "isFeedShouldShowSpringLink: enable=" + g17 + ", jumpType=" + n17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedShouldShowSpringLink", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return g17;
    }

    public static final boolean x(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        boolean y17 = f534363d.y(c17933xe8d1b226.m70371x485d7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return y17;
    }

    public final boolean A(e42.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(c0Var, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        if (r26.n0.B(Zi, "CloseCny", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (android.text.TextUtils.isEmpty(Zi)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        java.util.Set d07 = kz5.n0.d0(r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null), com.p314xaae8f345.mm.app.l0.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "xconfig:" + Zi + " crash list:" + com.p314xaae8f345.mm.app.l0.b() + " intersect:" + d07);
        boolean isEmpty = d07.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return isEmpty;
    }

    public final boolean B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isXConfigSnsSpringGlobalEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean A = A(e42.c0.clicfg_sns_cny_global_enable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigSnsSpringGlobalEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return A;
    }

    public final boolean C(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpFinderLiveUIWithUserName", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "jumpFinderLiveUIWithUserName finderUserName:" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpFinderLiveUIWithUserName", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Intent q17 = q();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        ((vd2.f1) e0Var).Di(context, q17, str, null, b(), null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpFinderLiveUIWithUserName", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return true;
    }

    public final void F(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView, android.view.animation.Animation.AnimationListener lastAnimListener, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshSpringLikedView", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastAnimListener, "lastAnimListener");
        if (textView != null) {
            textView.setImportantForAccessibility(2);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ok_);
            textView.announceForAccessibility(i65.a.r(textView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574693ma1));
            textView.setImportantForAccessibility(1);
        }
        if (c22699x3dcdb352 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "doSpringLikeAnim: failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshSpringLikedView", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return;
        }
        c22699x3dcdb352.setImageDrawable(null);
        c22699x3dcdb352.m82037xa10c26f6(false);
        c22699x3dcdb352.setImageDrawable(i65.a.i(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f78116x6274a663));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSpringLikeAnim", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(j17);
        scaleAnimation.setFillAfter(true);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        animationSet.setAnimationListener(new xa4.f(c22699x3dcdb352, scaleAnimation2));
        scaleAnimation2.setAnimationListener(lastAnimListener);
        c22699x3dcdb352.clearAnimation();
        c22699x3dcdb352.startAnimation(animationSet);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSpringLikeAnim", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshSpringLikedView", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final void G(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveSnsCrashInfo", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.String h17 = com.p314xaae8f345.mm.app.w.INSTANCE.h();
        if ((h17 != null && r26.n0.B(h17, "SnsTimelineUI", false)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f534368i, "sns_spring_mode")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f534365f;
            int o17 = o4Var.o("sns_spring_mode", 0) + 1;
            if (o17 >= 3) {
                o4Var.B("sns_spring_ui_crash_time_ms", java.lang.System.currentTimeMillis());
                o4Var.A("sns_spring_mode", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveSnsCrashInfo", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return;
            }
            o4Var.A("sns_spring_mode", o17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveSnsCrashInfo", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final java.lang.String J(r45.gd6 gd6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("springServerConfigToString", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (gd6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("springServerConfigToString", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return "null";
        }
        r45.r86 r86Var = gd6Var.f456677f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SpringServerConfig(Year:");
        sb6.append(gd6Var.f456678g);
        sb6.append(", PostStatus:");
        sb6.append(gd6Var.f456675d);
        sb6.append(", LinkVisible:");
        sb6.append(gd6Var.f456676e);
        sb6.append(",DisableLikeBack:");
        sb6.append(gd6Var.f456680i);
        sb6.append(" ForceFinderUserName:");
        sb6.append(r86Var != null ? r86Var.f466171f : null);
        sb6.append(" ObjId:");
        sb6.append(r86Var != null ? r86Var.f466169d : null);
        sb6.append(" FinderNonceID:");
        sb6.append(r86Var != null ? r86Var.f466170e : null);
        sb6.append(" ForceLiveId:");
        sb6.append(r86Var != null ? r86Var.f466174i : null);
        sb6.append("  JoinLiveMode:");
        sb6.append(gd6Var.f456679h);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("springServerConfigToString", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return sb7;
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void a(java.lang.Thread crashThread, java.lang.String str, java.lang.Throwable thr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onJavaCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crashThread, "crashThread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thr, "thr");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        thr.printStackTrace(printWriter);
        printWriter.close();
        G(str + '\n' + stringWriter);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onJavaCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final r45.wk0 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildFinderEnterLiveParam", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(4, 2, 65);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, Gj);
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildFinderEnterLiveParam", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return wk0Var;
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void e(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNativeCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        G(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNativeCrash", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
    }

    public final boolean g(int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17) {
        r45.a90 a90Var;
        r45.fd6 fd6Var;
        r45.a90 a90Var2;
        r45.fd6 fd6Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        r45.g92 g92Var = null;
        boolean z18 = false;
        if (i17 == 0) {
            if (c19807x593d1720 != null && (a90Var = c19807x593d1720.f39014x86965dde) != null && (fd6Var = a90Var.B) != null) {
                g92Var = fd6Var.f455776d;
            }
            if (g92Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return false;
            }
            if (!android.text.TextUtils.isEmpty(g92Var.m75945x2fec8307(1)) && !android.text.TextUtils.isEmpty(g92Var.m75945x2fec8307(2)) && !android.text.TextUtils.isEmpty(g92Var.m75945x2fec8307(0)) && !android.text.TextUtils.isEmpty(g92Var.m75945x2fec8307(12))) {
                z18 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return z18;
        }
        if (i17 == 1) {
            if (c19807x593d1720 != null && (a90Var2 = c19807x593d1720.f39014x86965dde) != null && (fd6Var2 = a90Var2.B) != null) {
                g92Var = fd6Var2.f455776d;
            }
            if (g92Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return false;
            }
            boolean z19 = !android.text.TextUtils.isEmpty(g92Var.m75945x2fec8307(1));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return z19;
        }
        if (i17 == 2) {
            r45.r86 r86Var = f534366g.f456677f;
            if (r86Var != null && !android.text.TextUtils.isEmpty(r86Var.f466171f) && !android.text.TextUtils.isEmpty(r86Var.f466169d) && !android.text.TextUtils.isEmpty(r86Var.f466170e) && !android.text.TextUtils.isEmpty(r86Var.f466174i)) {
                z18 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return z18;
        }
        if (i17 != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        r45.r86 r86Var2 = f534366g.f456677f;
        if (r86Var2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        boolean z27 = !android.text.TextUtils.isEmpty(r86Var2.f466171f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFinderLiveJumpEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z27;
    }

    public final boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkHadEnterSpringLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = r() != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "checkHadEnterSpringLive:" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkHadEnterSpringLive", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public final boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        java.lang.Object d17 = bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17843x8fdcdbe());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, 2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, 3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsSpringFestivalPostRedDot", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "SnsSpringFestivalPostRedDot: " + b17);
        boolean z17 = b17 == 2025;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configEnableNowShowRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }

    public final java.lang.String m(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        try {
            if (!android.text.TextUtils.isEmpty(f534366g.f456681m)) {
                cl0.g gVar = new cl0.g(f534366g.f456681m);
                java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                if (d17 != null) {
                    int hashCode = d17.hashCode();
                    if (hashCode != 115861276) {
                        if (hashCode != 115861428) {
                            if (hashCode == 115861812 && d17.equals("zh_TW")) {
                                java.lang.String o17 = o(gVar, "zh_TW", string);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                                return o17;
                            }
                        } else if (d17.equals("zh_HK")) {
                            java.lang.String o18 = o(gVar, "zh_HK", string);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                            return o18;
                        }
                    } else if (d17.equals("zh_CN")) {
                        java.lang.String o19 = o(gVar, "zh_CN", string);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                        return o19;
                    }
                }
                java.lang.String o27 = o(gVar, "en", string);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return o27;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsSpringLogic", e17, "getActionSheetTitle error:" + f534366g.f456681m, new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionSheetTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return string;
    }

    public final int n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderLiveJumpMode", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        int i17 = 0;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SPRING_2024_LINK_JUMP_INT_SYNC, 0);
        int i18 = f534366g.f456679h;
        if (r17 == 1) {
            i17 = 2;
        } else if (r17 == 2) {
            i17 = 3;
        } else if (r17 != 3) {
            i17 = r17 != 4 ? i18 : 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderLiveJumpMode", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return i17;
    }

    public final java.lang.String o(cl0.g gVar, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJsonValue", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (gVar.has(str)) {
            java.lang.String mo15074x2fec8307 = gVar.mo15074x2fec8307(str);
            if (!android.text.TextUtils.isEmpty(mo15074x2fec8307)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15074x2fec8307);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsonValue", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return mo15074x2fec8307;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsonValue", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return str2;
    }

    public final java.lang.String p(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        try {
            if (!android.text.TextUtils.isEmpty(f534366g.f456682n)) {
                cl0.g gVar = new cl0.g(f534366g.f456682n);
                java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                if (d17 != null) {
                    int hashCode = d17.hashCode();
                    if (hashCode != 115861276) {
                        if (hashCode != 115861428) {
                            if (hashCode == 115861812 && d17.equals("zh_TW")) {
                                java.lang.String o17 = o(gVar, "zh_TW", string);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                                return o17;
                            }
                        } else if (d17.equals("zh_HK")) {
                            java.lang.String o18 = o(gVar, "zh_HK", string);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                            return o18;
                        }
                    } else if (d17.equals("zh_CN")) {
                        java.lang.String o19 = o(gVar, "zh_CN", string);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                        return o19;
                    }
                }
                java.lang.String o27 = o(gVar, "en", string);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
                return o27;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsSpringLogic", e17, "getLiveLinkTitle error:" + f534366g.f456682n, new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveLinkTitle", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return string;
    }

    public final android.content.Intent q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportIntent", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        android.content.Intent intent = new android.content.Intent();
        cl0.g gVar = new cl0.g();
        gVar.h("is_temporary", "1");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("is_temporary", "1");
        intent.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
        intent.putExtra("key_chnl_extra", gVar.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportIntent", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return intent;
    }

    public final boolean u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hadShowSpringRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean i17 = f534365f.i("SnsSpring2025_ShowPostRedDot", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpringLogic", "hadShowRedDotOnPost: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hadShowSpringRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return i17;
    }

    public final boolean y(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        r45.fd6 fd6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (!I()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isXConfigSnsSpringFeedStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z17 = B() && A(e42.c0.clicfg_sns_cny_feed_style_enable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigSnsSpringFeedStyleEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
        if (a90Var == null || (fd6Var = a90Var.B) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        boolean i17 = i(java.lang.Integer.valueOf(fd6Var.f455778f));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedSpringVisible", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return i17;
    }

    public final boolean z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_SPRING_2024_STYLE_BLESS_INT_SYNC, -1);
        boolean z17 = false;
        if (r17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (r17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isXConfigSnsSpringBlessEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        boolean z18 = B() && A(e42.c0.clicfg_sns_cny_bless_enable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isXConfigSnsSpringBlessEnable", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSpringLogic", "x config not support");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
            return false;
        }
        if (f534366g.f456680i != 1 && I()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMsgBlessOpen", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic");
        return z17;
    }
}
