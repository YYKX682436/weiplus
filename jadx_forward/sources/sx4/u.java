package sx4;

/* loaded from: classes8.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx4.v f495193a;

    public u(sx4.v vVar) {
        this.f495193a = vVar;
    }

    public void a() {
        java.lang.String str;
        sx4.v vVar = this.f495193a;
        if (vVar.f495196c == 0) {
            return;
        }
        vVar.f495194a = java.lang.System.currentTimeMillis() - vVar.f495196c;
        if (vVar.f495197d != 0) {
            vVar.f495195b += java.lang.System.currentTimeMillis() - vVar.f495197d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "visit page(%s), stayTime:%sms, foregroundTime:%sms", java.lang.Integer.valueOf(vVar.hashCode()), java.lang.Long.valueOf(vVar.f495194a), java.lang.Long.valueOf(vVar.f495195b));
        android.os.Bundle bundle = vVar.f495198e;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "report game page time fail. ReportData is null");
            return;
        }
        java.lang.String string = bundle.getString("game_page_report_format_data");
        java.lang.String string2 = vVar.f495198e.getString("game_page_report_tabs_format_data");
        java.lang.String str2 = "__FOREGROUNDTIME__";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            java.lang.String replace = string.replace("__ALLSTAYTIME__", java.lang.String.valueOf(vVar.f495194a / 1000)).replace("__FOREGROUNDTIME__", java.lang.String.valueOf(vVar.f495195b / 1000));
            vVar.f495198e.putString("game_page_report_format_data", replace);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportFormatData:%s", java.lang.Integer.valueOf(vVar.hashCode()), replace);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                return;
            }
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\(.*?\\)").matcher(string2);
            while (matcher.find()) {
                try {
                    java.lang.String group = matcher.group();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (group == null) {
                        group = "";
                    }
                    java.lang.String replace2 = group.replace("(", "").replace(")", "").replace(" ", "");
                    if (replace2.contains("__ALLSTAYTIME__")) {
                        str = str2;
                        java.lang.String replace3 = replace2.replace("__ALLSTAYTIME__", java.lang.String.valueOf(vVar.f495194a / 1000));
                        java.lang.String[] split = replace3.split("\\+");
                        if (split.length == 2) {
                            replace3 = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[0]) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split[1]));
                        }
                        string2 = string2.replace(group, replace3);
                    } else {
                        str = str2;
                        if (group.contains(str)) {
                            java.lang.String replace4 = replace2.replace(str, java.lang.String.valueOf(vVar.f495195b / 1000));
                            java.lang.String[] split2 = replace4.split("\\+");
                            if (split2.length == 2) {
                                replace4 = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split2[0]) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(split2[1]));
                            }
                            string2 = string2.replace(group, replace4);
                        }
                    }
                    str2 = str;
                } catch (java.lang.NumberFormatException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "matchTimeMark, err:%s", e17.getMessage());
                    string2 = null;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                return;
            }
            vVar.f495198e.putString("game_page_report_tabs_format_data", string2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "visit page(%s), after replace time, reportTabsFormatdata:%s", java.lang.Integer.valueOf(vVar.hashCode()), string2);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            sx4.v.a(vVar.f495198e);
        } else {
            vVar.b(vVar.f495198e);
        }
        vVar.f495198e = null;
    }

    public void b() {
        sx4.v vVar = this.f495193a;
        if (vVar.f495197d != 0) {
            vVar.f495195b += java.lang.System.currentTimeMillis() - vVar.f495197d;
        }
    }

    public void c(android.os.Bundle bundle) {
        sx4.v vVar = this.f495193a;
        vVar.f495198e = bundle;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "setGamePageReportData");
        if (bundle == null || !bundle.getBoolean("game_page_report_time_begin")) {
            return;
        }
        vVar.f495195b = 0L;
        vVar.f495196c = java.lang.System.currentTimeMillis();
        vVar.f495197d = java.lang.System.currentTimeMillis();
    }

    public void d() {
        sx4.v vVar = this.f495193a;
        if (vVar.f495197d != 0) {
            vVar.f495197d = java.lang.System.currentTimeMillis();
        }
    }
}
