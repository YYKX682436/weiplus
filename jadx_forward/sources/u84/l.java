package u84;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f507109a;

    /* renamed from: b, reason: collision with root package name */
    public s34.g1 f507110b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f507111c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f507112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f507113e;

    /* renamed from: f, reason: collision with root package name */
    public s34.g1 f507114f;

    public static final u84.l b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        u84.l lVar = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        } else if (map.containsKey(str)) {
            lVar = new u84.l();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".title"));
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f507109a = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            s34.f1 f1Var = s34.g1.f484179c;
            s34.g1 a17 = f1Var.a(map, str.concat(".titleColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f507110b = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".numberRequestId"));
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberRequestId", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f507111c = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberRequestId", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".numberDefaultTitle"));
            if (str4 == null) {
                str4 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f507113e = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".numberDesc"));
            java.lang.String str6 = str5 != null ? str5 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f507112d = str6;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberDesc", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            s34.g1 a18 = f1Var.a(map, str.concat(".numberTitleColor"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNumberColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            lVar.f507114f = a18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNumberColorEntity", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        return lVar;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        java.lang.String str = this.f507113e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagInfo");
        return str;
    }
}
