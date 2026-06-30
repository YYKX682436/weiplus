package h45;

/* loaded from: classes12.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f360487a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f360489c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f360490d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f360491e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f360492f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f360494h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f360495i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f360496j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f360497k;

    /* renamed from: b, reason: collision with root package name */
    public int f360488b = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f360493g = false;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f360498l = new java.util.ArrayList();

    public static h45.v a(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        h45.v vVar = new h45.v();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WXPayTemplateMsgContent", "values map is null.");
            return vVar;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        vVar.f360487a = str2;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        vVar.f360488b = P;
        if (P != 0) {
            java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.display_name");
            if (str3 == null) {
                str3 = "";
            }
            vVar.f360490d = str3;
            java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.title");
            if (str4 == null) {
                str4 = "";
            }
            vVar.f360491e = str4;
            java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.first_data");
            if (str5 == null) {
                str5 = "";
            }
            vVar.f360492f = str5;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.icon_url");
            if (str6 == null) {
                str6 = "";
            }
            vVar.f360494h = str6;
            java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_header.hide_title");
            if (str7 == null) {
                str7 = "";
            }
            if ("1".equals(str7)) {
                vVar.f360493g = true;
            }
            java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.word");
            java.lang.String str9 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.word");
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9);
            java.util.List list = vVar.f360498l;
            if (!K0) {
                java.lang.String str10 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word");
                if (str10 == null) {
                    str10 = "";
                }
                vVar.f360495i = str10;
                h45.u uVar = new h45.u();
                if (str8 == null) {
                    str8 = "";
                }
                uVar.f360484a = str8;
                if (str9 == null) {
                    str9 = "";
                }
                uVar.f360485b = str9;
                uVar.f360486c = true;
                ((java.util.ArrayList) list).add(uVar);
            }
            java.lang.String str11 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.middle_tips_with_background.text");
            if (str11 == null) {
                str11 = "";
            }
            vVar.f360496j = str11;
            java.lang.String str12 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.pay_recepit_middle_tips_word");
            if (str12 == null) {
                str12 = "";
            }
            vVar.f360497k = str12;
            int i17 = 0;
            while (true) {
                if (i17 >= 100) {
                    break;
                }
                java.lang.String str13 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
                if (i17 != 0) {
                    str13 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + i17;
                }
                java.lang.String str14 = (java.lang.String) d17.get(str13 + ".value.word");
                java.lang.String str15 = (java.lang.String) d17.get(str13 + ".key.word");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str15)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WXPayTemplateMsgContent", "visit lines: lines count=%d", java.lang.Integer.valueOf(i17));
                    break;
                }
                h45.u uVar2 = new h45.u();
                if (str14 == null) {
                    str14 = "";
                }
                uVar2.f360485b = str14;
                if (str15 == null) {
                    str15 = "";
                }
                uVar2.f360484a = str15;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(str13 + ".key.hide"), 0);
                ((java.util.ArrayList) list).add(uVar2);
                i17++;
            }
        } else {
            vVar.f360493g = false;
            java.lang.String str16 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.title");
            if (str16 == null) {
                str16 = "";
            }
            vVar.f360491e = str16;
            java.lang.String str17 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.digest");
            vVar.f360489c = str17 != null ? str17 : "";
        }
        return vVar;
    }
}
