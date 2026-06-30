package m54;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.t f405839a = new m54.t();

    public final java.lang.String a(m54.l pageParam, m54.u shareParam) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createShareXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageParam, "pageParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareParam, "shareParam");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str = shareParam.f405841b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str2 = shareParam.f405842c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str3 = shareParam.f405843d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str4 = shareParam.f405840a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createCanvasXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        java.lang.String str5 = "<adCanvasInfo><shareTitle>" + android.text.TextUtils.htmlEncode(str) + "</shareTitle><shareDesc>" + android.text.TextUtils.htmlEncode(str2) + "</shareDesc><shareWebUrl>" + android.text.TextUtils.htmlEncode(str3) + "</shareWebUrl><shareThumbUrl>" + android.text.TextUtils.htmlEncode(str4) + "</shareThumbUrl><PageList><Page><componentItemList><componentItem><type>2147483647</type></componentItem></componentItemList></Page></PageList></adCanvasInfo>";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createCanvasXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<canvasShareInfo><uxInfo>");
        sb6.append(a54.h.a(pageParam));
        sb6.append("</uxInfo><canvasId>");
        java.lang.String i17 = pageParam.i();
        if (i17 == null) {
            i17 = "";
        }
        sb6.append(i17);
        sb6.append("</canvasId><canvasDynamicInfo>");
        sb6.append(android.text.TextUtils.htmlEncode(pageParam.D()));
        sb6.append("</canvasDynamicInfo><canvasDynamicExtInfo>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str6 = shareParam.f405844e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        sb6.append(android.text.TextUtils.htmlEncode(str6));
        sb6.append("</canvasDynamicExtInfo><canvasDynamicLoadExtInfo>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        java.lang.String str7 = shareParam.f405845f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
        sb6.append(android.text.TextUtils.htmlEncode(str7));
        sb6.append("</canvasDynamicLoadExtInfo></canvasShareInfo>");
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("<originAdType>");
        sb8.append(pageParam.C());
        sb8.append("</originAdType><originAid>");
        sb8.append(pageParam.c());
        sb8.append("</originAid><originTraceId>");
        sb8.append(pageParam.m());
        sb8.append("</originTraceId> <originSnsId>");
        sb8.append(pageParam.j());
        sb8.append("</originSnsId>\n<originUxInfo>");
        sb8.append(a54.h.a(pageParam));
        sb8.append("</originUxInfo><originAdCanvasExt>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCanvasExtXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        java.lang.String str8 = pageParam.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCanvasExtXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        sb8.append(str8);
        sb8.append("</originAdCanvasExt>");
        java.lang.String str9 = "<adxml>" + sb7 + sb8.toString() + str5 + "</adxml>";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createShareXml", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        return str9;
    }

    public final java.lang.String b(m54.l pageParam) {
        java.lang.String str = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("statExtStr", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageParam, "pageParam");
        try {
            r45.ud6 ud6Var = new r45.ud6();
            ud6Var.f468802f = a54.h.a(pageParam);
            java.lang.String j17 = pageParam.j();
            if (j17 == null) {
                j17 = "";
            }
            ud6Var.f468801e = j17;
            ud6Var.f468800d = pageParam.C();
            r45.td6 td6Var = new r45.td6();
            td6Var.f467862d = ud6Var;
            java.lang.String encodeToString = android.util.Base64.encodeToString(td6Var.mo14344x5f01b1f6(), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
            str = encodeToString;
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("statExtStr", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareHelper");
        return str;
    }
}
