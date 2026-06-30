package wa4;

/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f525840a = new java.lang.StringBuffer();

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("append", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f525840a.append(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("append", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        this.f525840a.append("</" + str + ">");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        java.lang.String stringBuffer = this.f525840a.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        return stringBuffer;
    }

    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.StringBuffer stringBuffer = this.f525840a;
        if (K0) {
            stringBuffer.append("");
        } else if (str.contains("]]>")) {
            stringBuffer.append("<![CDATA[" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str) + "]]>");
        } else {
            stringBuffer.append("<![CDATA[" + str + "]]>");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        this.f525840a.append("<" + str + ">");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void f(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        java.lang.StringBuffer stringBuffer = this.f525840a;
        stringBuffer.append("<" + str);
        for (java.lang.String str2 : map.keySet()) {
            stringBuffer.append(" " + str2 + "=\"" + ((java.lang.String) map.get(str2)) + "\" ");
        }
        stringBuffer.append(">");
        map.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void g(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        this.f525840a.append(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void h(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }
}
