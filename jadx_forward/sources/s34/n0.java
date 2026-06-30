package s34;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f484251a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484252b;

    public n0(java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f484251a = str;
        this.f484252b = str2;
    }

    public static final s34.n0 b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
        s34.n0 n0Var = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".finderUsername"));
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".finderLiveId"));
            s34.n0 n0Var2 = new s34.n0(str2, str3 != null ? str3 : "", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo$Companion");
            n0Var = n0Var2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        return n0Var;
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        boolean z17 = false;
        java.lang.String str = this.f484251a;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = this.f484252b;
            if (!(str2 == null || str2.length() == 0)) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
        return z17;
    }
}
