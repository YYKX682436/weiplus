package rc4;

/* loaded from: classes4.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final rc4.c f475667a = new rc4.c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        java.lang.CharSequence charSequence5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$registerPageReport$1");
        java.util.HashMap hashMap = new java.util.HashMap();
        rc4.e.f475669a.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$groupExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.Iterator it = rc4.e.f475673e.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((rc4.a) it.next()).a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$groupExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        rc4.e eVar = rc4.e.f475669a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$groupClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.Iterator it6 = rc4.e.f475673e.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            rc4.a aVar = (rc4.a) it6.next();
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            int i19 = aVar.f475656c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            i18 += i19;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$groupClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("if_expose_finderbar", java.lang.Integer.valueOf(i17 > 0 ? 1 : 0));
        hashMap.put("if_click_finderbar", java.lang.Integer.valueOf(i18 > 0 ? 1 : 0));
        hashMap.put("finderbar_expose_cnt", java.lang.Integer.valueOf(i17));
        rc4.e eVar2 = rc4.e.f475669a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUnreadTierExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        boolean z17 = rc4.e.f475675g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUnreadTierExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("if_expose_loudubar", java.lang.Integer.valueOf(z17 ? 1 : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUnreadTierClicked", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        boolean z18 = rc4.e.f475676h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUnreadTierClicked", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("if_click_loudubar", java.lang.Integer.valueOf(z18 ? 1 : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$groupPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it7 = rc4.e.f475673e.iterator();
        while (it7.hasNext()) {
            rc4.a aVar2 = (rc4.a) it7.next();
            if (aVar2.a() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNextPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                java.lang.String str2 = aVar2.f475657d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                stringBuffer.append(str2);
                stringBuffer.append("|");
            }
        }
        int H = r26.n0.H(stringBuffer);
        while (true) {
            charSequence = "";
            if (-1 >= H) {
                charSequence2 = "";
                break;
            }
            if ((stringBuffer.charAt(H) == '|') != true) {
                charSequence2 = stringBuffer.subSequence(0, H + 1);
                break;
            }
            H--;
        }
        java.lang.String obj = charSequence2.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$groupPageFeedid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("next_page_feedid", obj);
        rc4.e eVar3 = rc4.e.f475669a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastSnsUsername", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.String str3 = rc4.e.f475677i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastSnsUsername", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("last_sns_username", str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$groupReason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupReason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it8 = rc4.e.f475673e.iterator();
        while (it8.hasNext()) {
            rc4.a aVar3 = (rc4.a) it8.next();
            if (aVar3.a() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                int i27 = aVar3.f475658e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                stringBuffer2.append(i27);
                stringBuffer2.append("|");
            }
        }
        int H2 = r26.n0.H(stringBuffer2);
        while (true) {
            if (-1 >= H2) {
                charSequence3 = "";
                break;
            }
            if (!(stringBuffer2.charAt(H2) == '|')) {
                charSequence3 = stringBuffer2.subSequence(0, H2 + 1);
                break;
            }
            H2--;
        }
        java.lang.String obj2 = charSequence3.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupReason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$groupReason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("finderbar_unexpose_reason", obj2);
        rc4.e eVar4 = rc4.e.f475669a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$groupUserName", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupUserName", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
        java.util.Iterator it9 = rc4.e.f475673e.iterator();
        while (it9.hasNext()) {
            rc4.a aVar4 = (rc4.a) it9.next();
            if (aVar4.a() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShow_username", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                java.lang.String str4 = aVar4.f475659f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShow_username", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                stringBuffer3.append(str4);
                stringBuffer3.append("|");
            }
        }
        int H3 = r26.n0.H(stringBuffer3);
        while (true) {
            if (-1 >= H3) {
                charSequence4 = "";
                break;
            }
            if (!(stringBuffer3.charAt(H3) == '|')) {
                charSequence4 = stringBuffer3.subSequence(0, H3 + 1);
                break;
            }
            H3--;
        }
        java.lang.String obj3 = charSequence4.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupUserName", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$groupUserName", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("show_username", obj3);
        rc4.e eVar5 = rc4.e.f475669a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$groupContentType", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupContentType", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
        java.util.Iterator it10 = rc4.e.f475673e.iterator();
        while (it10.hasNext()) {
            rc4.a aVar5 = (rc4.a) it10.next();
            if (aVar5.a() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContent_type", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                int i28 = aVar5.f475661h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContent_type", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                stringBuffer4.append(i28);
                stringBuffer4.append("|");
            }
        }
        int H4 = r26.n0.H(stringBuffer4);
        while (true) {
            if (-1 >= H4) {
                charSequence5 = "";
                break;
            }
            if (!(stringBuffer4.charAt(H4) == '|')) {
                charSequence5 = stringBuffer4.subSequence(0, H4 + 1);
                break;
            }
            H4--;
        }
        java.lang.String obj4 = charSequence5.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupContentType", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$groupContentType", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put(ya.b.f77470xbd76cf60, obj4);
        rc4.e eVar6 = rc4.e.f475669a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$groupTipsId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("groupTipsId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer();
        java.util.Iterator it11 = rc4.e.f475673e.iterator();
        while (it11.hasNext()) {
            rc4.a aVar6 = (rc4.a) it11.next();
            if (aVar6.a() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTips_uuid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                java.lang.String str5 = aVar6.f475660g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTips_uuid", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                stringBuffer5.append(str5);
                stringBuffer5.append("|");
            }
        }
        int H5 = r26.n0.H(stringBuffer5);
        while (true) {
            if (-1 >= H5) {
                break;
            }
            if (!(stringBuffer5.charAt(H5) == '|')) {
                charSequence = stringBuffer5.subSequence(0, H5 + 1);
                break;
            }
            H5--;
        }
        java.lang.String obj5 = charSequence.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("groupTipsId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$groupTipsId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        hashMap.put("tips_uuid", obj5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicParams", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$registerPageReport$1");
        return hashMap;
    }
}
