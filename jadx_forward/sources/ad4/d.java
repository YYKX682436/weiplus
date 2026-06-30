package ad4;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f84709d = true;

    /* renamed from: a, reason: collision with root package name */
    public final int f84710a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f84711b = jz5.h.b(ad4.c.f84707d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f84712c = jz5.h.b(new ad4.b(this));

    static {
        new ad4.a(null);
    }

    public d(int i17) {
        this.f84710a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateServerConfig$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().o("MicroMsg.Improve.AutoPlayUtil", 0) <= 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setAutoPlayServerConfig$cp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        f84709d = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setAutoPlayServerConfig$cp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateServerConfig$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
    }

    public final boolean a(android.content.Context context, android.graphics.Rect rect) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        boolean z17 = false;
        if (rect.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
            return false;
        }
        pc4.d dVar = pc4.d.f434943a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay) + com.p314xaae8f345.mm.ui.bl.h(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int i17 = rect.bottom;
        if (i17 > h17 && i17 > h17 + ((i17 - rect.top) / 2)) {
            int i18 = context.getResources().getDisplayMetrics().heightPixels;
            int i19 = rect.top;
            if (i18 - i19 > (rect.bottom - i19) / 2) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        return z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsNetworkMgr", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm zmVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zm) ((jz5.n) this.f84711b).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsNetworkMgr", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        return zmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r12 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r17, int r18, java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad4.d.c(androidx.recyclerview.widget.RecyclerView, int, java.util.ArrayList):void");
    }
}
