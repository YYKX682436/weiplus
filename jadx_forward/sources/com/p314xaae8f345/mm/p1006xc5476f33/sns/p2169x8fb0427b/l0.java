package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l0 f247576a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l0();

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdClickFlagInfoKey", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUin", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                str2 = gm0.j1.b().j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            } else {
                str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69896xb5887524();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdClickStorage", th6);
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUin", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        sb6.append(str2);
        sb6.append('_');
        sb6.append(str);
        sb6.append("_click");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdClickFlagInfoKey", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        return sb7;
    }
}
