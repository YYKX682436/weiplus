package a84;

/* loaded from: classes4.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f83882a;

    static {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedSet, "synchronizedSet(...)");
        f83882a = synchronizedSet;
    }

    public static final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, android.widget.TextView textView, int i17, int i18) {
        int b17;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        if (c17902x72cc1771 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.i0 i0Var = c17902x72cc1771.f38069x589e8431;
        if (i0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        java.lang.String str2 = c17902x72cc1771.f38057x2f13d7b2;
        int i19 = 0;
        boolean z17 = str2 == null || str2.length() == 0;
        if (z17) {
            textView.setOnClickListener(null);
        }
        int i27 = z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834 : com.p314xaae8f345.mm.R.C30859x5a72f63.f561048a62;
        textView.setTextColor(context.getColor(i27));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        java.lang.String str3 = i0Var.f247552c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        if (str3.length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            java.lang.String str4 = i0Var.f247553d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            if (str4.length() > 0) {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                    str = i0Var.f247553d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                    str = i0Var.f247552c;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                }
                textView.setTextColor(ca4.n0.e(str, context.getColor(i27)));
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        int i28 = i0Var.f247550a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        if (i28 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            int i29 = i0Var.f247550a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            b17 = i65.a.b(context, i29);
        } else {
            b17 = i65.a.b(context, i17);
        }
        marginLayoutParams.topMargin = b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        int i37 = i0Var.f247551b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        if (i37 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            int i38 = i0Var.f247551b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            i19 = i65.a.b(context, i38 - i18);
        }
        marginLayoutParams.bottomMargin = i19;
        textView.setLayoutParams(marginLayoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
    }
}
