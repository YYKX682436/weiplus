package m21;

/* loaded from: classes4.dex */
public final class h implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.g92 f404521a = new r45.g92();

    @Override // m21.u
    public java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        java.lang.String c17 = zy2.d5.c(b());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "makeContent(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return c17;
    }

    public r45.g92 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        r45.g92 g92Var = this.f404521a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return g92Var;
    }

    public java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeFestivalContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        r45.g92 b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (b17 != null) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.m75945x2fec8307(0))) {
                    sb6.append("<SpringFinderLive>");
                    sb6.append("<finderLiveID>");
                    sb6.append(b17.m75945x2fec8307(0));
                    sb6.append("</finderLiveID>");
                    sb6.append("<finderUsername>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(b17.m75945x2fec8307(1)));
                    sb6.append("</finderUsername>");
                    sb6.append("<finderObjectID>");
                    sb6.append(b17.m75945x2fec8307(2));
                    sb6.append("</finderObjectID>");
                    sb6.append("<nickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(b17.m75945x2fec8307(3)));
                    sb6.append("</nickname>");
                    sb6.append("<finderNonceID>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(b17.m75945x2fec8307(12)));
                    sb6.append("</finderNonceID>");
                    sb6.append("<liveStatus>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(b17.m75939xb282bd08(13) + ""));
                    sb6.append("</liveStatus>");
                    sb6.append("<headUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(b17.m75945x2fec8307(11)));
                    sb6.append("</headUrl>");
                    sb6.append("<media>");
                    sb6.append("<coverUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(b17.m75945x2fec8307(5)));
                    sb6.append("</coverUrl>");
                    sb6.append("<width>");
                    sb6.append(b17.m75938x746dc8a6(6));
                    sb6.append("</width>");
                    sb6.append("<height>");
                    sb6.append(b17.m75938x746dc8a6(7));
                    sb6.append("</height>");
                    sb6.append("</media>");
                    sb6.append("</SpringFinderLive>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "makeFestivalContent(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeFestivalContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return sb7;
    }

    public void d(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        e(zy2.d5.l(str, map));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
    }

    public void e(r45.g92 g92Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g92Var, "<set-?>");
        this.f404521a = g92Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
    }
}
