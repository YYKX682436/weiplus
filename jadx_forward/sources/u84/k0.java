package u84;

/* loaded from: classes4.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f507104a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f507105b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f507106c = new java.util.ArrayList();

    public static u84.k0 a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
        java.lang.String str3 = (java.lang.String) map.get(str + ".title");
        if (android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
            return null;
        }
        u84.k0 k0Var = new u84.k0();
        k0Var.f507104a = str3;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str + ".interactionType"));
        java.lang.String str4 = (java.lang.String) map.get(str + ".themeColor");
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = (java.lang.String) map.get(str + ".themeColorAlpha");
        if (str5 == null) {
            str5 = "";
        }
        if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str5)) {
            str4 = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf((int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1(str5) * 255.0d)), str4.substring(1));
        }
        k0Var.f507105b = str4;
        java.lang.String str6 = str + ".rollingLabels.item";
        int i17 = 0;
        while (true) {
            if (i17 != 0) {
                str2 = str6 + i17;
            } else {
                str2 = str6;
            }
            java.lang.String str7 = (java.lang.String) map.get(str2);
            if (str7 == null) {
                str7 = "";
            }
            if (android.text.TextUtils.isEmpty(str7)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdInteractionLabeInfo");
                return k0Var;
            }
            k0Var.f507106c.add(str7);
            i17++;
        }
    }
}
