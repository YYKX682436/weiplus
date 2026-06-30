package x64;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final x64.u f533866a = new x64.u();

    /* renamed from: b, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.y0 f533867b;

    public final void a(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, int i18, java.lang.String str, int i19) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            return;
        }
        java.lang.String str3 = c17702x544f64e9.f244131o0;
        if (str3 == null || str3.length() == 0) {
            str2 = null;
        } else {
            str2 = "ADKEFU_" + c17702x544f64e9.f244131o0;
        }
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "fetchContact, kefuUrl is ".concat(str2));
        j41.h0 h0Var = new j41.h0(i19, "", str2);
        h0Var.f379168e = true;
        h0Var.f379170g = null;
        h0Var.f379171h = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = context instanceof android.app.Activity ? db5.e1.Q(context, "", ((android.app.Activity) context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, true, null) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, 14);
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        x64.n nVar = new x64.n(new java.lang.ref.WeakReference(context), new java.lang.ref.WeakReference(Q), new java.lang.ref.WeakReference(view), c17702x544f64e9, c17933xe8d1b226, i18, i17, str);
        ((l41.b2) yVar).getClass();
        k41.h1.b(h0Var, new l41.z1(h0Var, nVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fetchContact", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }

    public final void b(android.content.Context adContext, java.lang.String jumpKefuUrl, java.lang.String uxInfo, int i17, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToWxKefuPage", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adContext, "adContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpKefuUrl, "jumpKefuUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "jumpToWxKefuPage() called with: jumpKefuUrl = " + jumpKefuUrl + ", isFromLandingPage = " + z17);
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
        c11207x71c7a1c1.f153805d = adContext;
        c11207x71c7a1c1.f153807f = i17;
        r45.s4 s4Var = new r45.s4();
        s4Var.f467019d = jumpKefuUrl;
        s4Var.f467020e = jumpKefuUrl;
        r45.l05 l05Var = new r45.l05();
        l05Var.f460594f = jumpKefuUrl;
        l05Var.f460592d = i17;
        l05Var.f460593e = uxInfo;
        s4Var.f467022g = l05Var;
        c11207x71c7a1c1.f153810i = s4Var;
        c11207x71c7a1c1.f153806e = java.lang.System.currentTimeMillis();
        c11207x71c7a1c1.f153809h = j41.f0.a(i17);
        c11207x71c7a1c1.f153814p = true;
        android.content.res.Resources resources = adContext.getResources();
        if (resources == null || (str = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hez)) == null) {
            str = "";
        }
        c11207x71c7a1c1.f153815q = str;
        android.content.Intent intent = new android.content.Intent();
        c11207x71c7a1c1.f153821w = intent;
        android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77777x504cd8a2, "createFreeHandler(...)");
        intent.putExtra("key_result_receiver", new com.p314xaae8f345.mm.p983xc3c3c8ee.p984x633fb29.ResultReceiverC11209x6faff39d(m77777x504cd8a2, new x64.o(new java.lang.ref.WeakReference(adContext), z17)));
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            ((l41.g2) zVar).Bi(c11207x71c7a1c1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToWxKefuPage", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, 5);
        d(c17702x544f64e9 != null ? c17702x544f64e9.f244131o0 : null, c17933xe8d1b226 != null ? c17933xe8d1b226.m70375x338a8cc7() : null, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }

    public final void d(java.lang.String str, java.lang.String str2, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0) && context != null) {
                p3325xe03a0797.p3326xc267989b.y0 y0Var = f533867b;
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
                }
                p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
                f533867b = b17;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new x64.t(context, str, str2, null), 2, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdJumpWxKefuClick", "jumpkefu param is null!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }
}
