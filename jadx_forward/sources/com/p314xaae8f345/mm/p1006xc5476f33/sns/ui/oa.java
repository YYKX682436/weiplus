package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public abstract class oa {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f251624a = new java.util.HashMap();

    public static int a(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
        java.lang.Integer num = (java.lang.Integer) f251624a.get(i17 + "_" + j17);
        if (num == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
            return 0;
        }
        int intValue = num.intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
        return intValue;
    }

    public static void b(int i17, long j17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
        f251624a.put(i17 + "_" + j17, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
    }
}
