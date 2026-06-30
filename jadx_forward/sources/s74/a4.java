package s74;

/* loaded from: classes4.dex */
public final class a4 {

    /* renamed from: e, reason: collision with root package name */
    public static final s74.v3 f485741e = new s74.v3(null);

    /* renamed from: f, reason: collision with root package name */
    public static volatile s74.a4 f485742f;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f485743a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(5);

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f485744b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f485745c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r0 f485746d;

    public a4() {
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        this.f485746d = new s74.z3(p3325xe03a0797.p3326xc267989b.q0.f392100d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(s74.a4 r10, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.a4.a(s74.a4, com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    public final p3325xe03a0797.p3326xc267989b.y0 b() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPreloaderScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        synchronized (this.f485743a) {
            try {
                if (this.f485744b == null) {
                    this.f485744b = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);
                }
                y0Var = this.f485744b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y0Var);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPreloaderScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPreloaderScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        return y0Var;
    }

    public final s74.r4 c(java.lang.String snsId, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        s74.r4 r4Var = null;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Preloader", "getViewById:" + snsId + " but verifyString is null! ");
            return null;
        }
        synchronized (this.f485743a) {
            try {
                s74.r4 r4Var2 = (s74.r4) this.f485743a.get(snsId);
                if (r4Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Preloader", "getViewById:" + snsId + " but no cache");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                    if (r4Var2.f486063c == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Preloader", "getViewById:" + snsId + " but node.verifyString is null! ");
                        this.f485743a.m77803xc84af884(snsId);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                        if (r4Var2.f486061a.c().getParent() != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2008, 11);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getViewById:");
                            sb6.append(snsId);
                            sb6.append(" but has parent! view = ");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            sb6.append(r4Var2.f486061a.c());
                            sb6.append(' ');
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicView.Preloader", sb6.toString());
                            this.f485743a.m77803xc84af884(snsId);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                            if (r4Var2.f486063c != str) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVerifyString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.PreloadViewNode");
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4Var2.f486063c, str)) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2008, 12);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Preloader", "getViewById:" + snsId + " but verifyString may updated! ");
                                    this.f485743a.m77803xc84af884(snsId);
                                }
                            }
                            r4Var = r4Var2;
                        }
                    }
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
            }
        }
        return r4Var;
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinishing", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        android.app.Activity activity = this.f485745c;
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinishing", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Preloader", "isFinishing=true, act=" + this.f485745c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinishing", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        return true;
    }
}
