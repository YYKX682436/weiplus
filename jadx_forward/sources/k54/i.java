package k54;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final k54.i f385965a = new k54.i();

    public final k54.h a(int i17, java.util.Map map, fe0.z3 z3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertToWebViewData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewDataConvertor");
        if (map == null) {
            k54.h hVar = new k54.h(i17, "", "", "", z3Var, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertToWebViewData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewDataConvertor");
            return hVar;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) h54.i.f360629a.a(map);
        java.lang.Object obj = linkedHashMap.get("url");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = obj2 == null ? "" : obj2;
        java.lang.Object obj3 = linkedHashMap.get("canvasKey");
        java.lang.String obj4 = obj3 != null ? obj3.toString() : null;
        java.lang.String str2 = obj4 == null ? "" : obj4;
        java.lang.Object obj5 = linkedHashMap.get("componentId");
        java.lang.String obj6 = obj5 != null ? obj5.toString() : null;
        java.lang.String str3 = obj6 == null ? "" : obj6;
        java.lang.Object obj7 = linkedHashMap.get("bgTransparent");
        k54.h hVar2 = new k54.h(i17, str, str2, str3, z3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(obj7 instanceof java.lang.Boolean ? (java.lang.Boolean) obj7 : null));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertToWebViewData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewDataConvertor");
        return hVar2;
    }
}
