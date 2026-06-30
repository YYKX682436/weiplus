package sb4;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$9");
        java.util.Iterator it = sb4.z.a().entrySet().iterator();
        while (it.hasNext()) {
            sb4.e0 e0Var = (sb4.e0) ((java.util.Map.Entry) it.next()).getValue();
            android.os.Vibrator vibrator = ca4.z0.f121601a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 1;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 2;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 3;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 4;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
                i17 = 0;
            }
            e0Var.f487021g = i17;
            e0Var.f487016b.size();
            java.util.Iterator it6 = e0Var.f487017c.iterator();
            java.lang.String str = "";
            java.lang.String str2 = "";
            while (it6.hasNext()) {
                str2 = str2 + ((java.lang.Integer) it6.next()) + "|";
            }
            if (str2.length() >= 2) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            java.lang.String str3 = str2;
            java.util.Iterator it7 = e0Var.f487018d.iterator();
            java.lang.String str4 = "";
            while (it7.hasNext()) {
                str4 = str4 + ((java.lang.Integer) it7.next()) + "|";
            }
            java.lang.String substring = str4.length() >= 2 ? str4.substring(0, str4.length() - 1) : str4;
            java.util.Iterator it8 = e0Var.f487019e.iterator();
            while (it8.hasNext()) {
                str = str + ((java.lang.Integer) it8.next()) + "|";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11599, java.lang.Integer.valueOf(e0Var.f487015a), java.lang.Integer.valueOf(e0Var.f487016b.size()), java.lang.Integer.valueOf(e0Var.f487020f), java.lang.Integer.valueOf(e0Var.f487021g), 0, e0Var.f487022h, java.lang.Long.valueOf(e0Var.f487023i), java.lang.Integer.valueOf(e0Var.f487024j), 0, 0, java.lang.Integer.valueOf(e0Var.f487025k), java.lang.Integer.valueOf(e0Var.f487026l), 0, str3, substring, str.length() >= 2 ? str.substring(0, str.length() - 1) : str, 0, "", java.lang.Integer.valueOf(e0Var.f487027m));
        }
        sb4.z.a().clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$9");
    }
}
