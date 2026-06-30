package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public abstract class di {
    public static final boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isForbidShow", "com.tencent.mm.plugin.sns.ui.SnsExceprtUtils");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForbidShow", "com.tencent.mm.plugin.sns.ui.SnsExceprtUtils");
            return true;
        }
        boolean z17 = false;
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("forbidShowSource");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsExceprtUtils", "sns excerpt url = " + str + ", forbidShowSource = " + queryParameter);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(queryParameter);
            z17 = java.lang.Integer.parseInt(queryParameter) == 1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsExceprtUtils", "sns excerpt url exception = " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForbidShow", "com.tencent.mm.plugin.sns.ui.SnsExceprtUtils");
        return z17;
    }
}
