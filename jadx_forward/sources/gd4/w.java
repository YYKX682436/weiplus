package gd4;

/* loaded from: classes4.dex */
public final /* synthetic */ class w extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.s {
    public w(java.lang.Object obj) {
        super(5, obj, gd4.y.class, "getClickAreaLayoutParams", "getClickAreaLayoutParams(DILcom/tencent/mm/plugin/sns/storage/AdBreakFrameClickInfo;II)Landroid/widget/FrameLayout$LayoutParams;", 0);
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.String str;
        java.lang.String str2;
        android.widget.FrameLayout.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2");
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        int intValue3 = ((java.lang.Number) obj5).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2");
        gd4.y yVar = (gd4.y) this.f72685xcfcbe9ef;
        yVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) yVar.f352407r.d()).mo144003x754a37bb();
        if (b0Var == null || layoutParams2 == null) {
            str = "invoke";
            str2 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2";
            layoutParams = new android.widget.FrameLayout.LayoutParams(0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAreaWidth", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAreaWidth", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            int i17 = (int) (b0Var.f247466c * doubleValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAreaHeight", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAreaHeight", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            int i18 = (int) (b0Var.f247467d * doubleValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAreaLeft", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAreaLeft", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            str = "invoke";
            str2 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2";
            int i19 = (int) (b0Var.f247464a * doubleValue);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAreaTop", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAreaTop", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
            int i27 = ((int) (b0Var.f247465b * doubleValue)) + intValue3;
            int i28 = (intValue - i18) - i27;
            if (i28 < intValue2) {
                i18 -= intValue2 - i28;
            }
            layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
            layoutParams.leftMargin = i19 + layoutParams2.leftMargin;
            layoutParams.topMargin = i27 + layoutParams2.rightMargin;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        }
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
        return layoutParams;
    }
}
