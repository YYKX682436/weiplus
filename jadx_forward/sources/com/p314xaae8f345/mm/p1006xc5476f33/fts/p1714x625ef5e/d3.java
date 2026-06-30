package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes9.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f219031a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f219032b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f219033c = new java.util.ArrayList();

    public static com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.d3 a(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.d3 d3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.d3();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TemplateMsgContent", "values map is null.");
            return d3Var;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        d3Var.f219031a = str2;
        d3Var.f219032b = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.title");
        int i17 = 0;
        while (true) {
            if (i17 >= 100) {
                break;
            }
            java.lang.String str3 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
            if (i17 != 0) {
                str3 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + i17;
            }
            java.lang.String str4 = (java.lang.String) d17.get(str3 + ".value.word");
            java.lang.String str5 = (java.lang.String) d17.get(str3 + ".key.word");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TemplateMsgContent", "visit lines: lines count=%d", java.lang.Integer.valueOf(i17));
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c3();
            c3Var.f219015a = str4;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(str3 + ".key.hide"), 0);
            ((java.util.ArrayList) d3Var.f219033c).add(c3Var);
            i17++;
        }
        return d3Var;
    }
}
