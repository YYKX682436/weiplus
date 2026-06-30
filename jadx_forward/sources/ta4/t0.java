package ta4;

/* loaded from: classes11.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ta4.t0 f498368d = new ta4.t0();

    public t0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        synchronized (ta4.u0.d()) {
            try {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                if (!r75.d.f474794h) {
                    i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
                } else if (r75.d.f474791e == -100) {
                    i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
                    r75.d.f474791e = i17;
                } else {
                    ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f474791e);
                    i17 = r75.d.f474791e;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setNetType$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                ta4.u0.f498378h = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setNetType$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                ta4.u0 u0Var = ta4.u0.f498371a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                boolean i18 = u0Var.i();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                if (i18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "startSession, already has currentSession");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                } else {
                    ta4.u0.e().clear();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSessionLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    java.lang.Object obj = ta4.u0.f498376f;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSessionLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    synchronized (obj) {
                        try {
                            java.lang.String uuid = java.util.UUID.randomUUID().toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            ta4.u0.f498377g = uuid;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start new session:");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            java.lang.String str = ta4.u0.f498377g;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCurrentSession$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            sb6.append(str);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", sb6.toString());
                        } finally {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
                throw th6;
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startSession$1");
        return f0Var;
    }
}
