package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public abstract class u1 {
    public static void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        java.lang.String[] split = ((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, "")).split("&");
        boolean z17 = split.length >= 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(split[0], false);
        boolean z18 = split.length >= 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(split[1], false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 2; i17 < split.length; i17++) {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[i17], 0L);
            if (V != 0) {
                arrayList.add(java.lang.Long.valueOf(V));
            }
        }
        arrayList.remove(java.lang.Long.valueOf(j17));
        java.util.Collections.reverse(arrayList);
        java.lang.Long l17 = arrayList.size() > 0 ? (java.lang.Long) arrayList.get(0) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, l17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("&");
        sb6.append(z18);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            sb6.append("&");
            sb6.append(arrayList.get(i18));
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
    }

    public static boolean b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
            return false;
        }
        java.lang.String[] split = ((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, "")).split("&");
        boolean z17 = split.length >= 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(split[0], false);
        boolean z18 = split.length >= 2 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(split[1], false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 2; i17 < split.length; i17++) {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split[i17], 0L);
            if (V != 0) {
                arrayList.add(java.lang.Long.valueOf(V));
            }
        }
        if (W0.m70371x485d7().f39014x86965dde.f451370e == 15) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
                return false;
            }
            z17 = true;
        } else {
            if (!W0.m70405x7b43eb28()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
                return false;
            }
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
                return false;
            }
            z18 = true;
        }
        if (!arrayList.contains(java.lang.Long.valueOf(j17))) {
            arrayList.add(java.lang.Long.valueOf(j17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("&");
        sb6.append(z18);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            sb6.append("&");
            sb6.append(arrayList.get(i18));
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, sb6.toString());
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, valueOf);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        return true;
    }
}
