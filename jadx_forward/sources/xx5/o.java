package xx5;

/* loaded from: classes13.dex */
public abstract class o {
    public static void a(xx5.m mVar) {
        java.lang.String str;
        try {
            if (mVar == null) {
                by5.c4.c("KVReportForPluginUpdate", "reportPluginConfigUpdate error, data is null");
                return;
            }
            if ("5".equals(mVar.f539586b)) {
                by5.c4.f("KVReportForPluginUpdate", "reportPluginConfigUpdate, checkType is config only, skip report");
                return;
            }
            if (mVar.f539590f == null) {
                zx5.t tVar = new zx5.t();
                mVar.f539590f = tVar;
                tVar.f558792a = "";
                tVar.f558793b = "";
                tVar.f558794c = 0;
                tVar.f558795d = -1;
                zx5.t tVar2 = mVar.f539590f;
                tVar2.f558796e = -1;
                tVar2.f558797f = -1L;
                tVar2.f558798g = -1L;
                tVar2.f558799h = -1;
            }
            android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
            java.lang.String packageName = context != null ? context.getPackageName() : "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mVar.f539585a);
            sb6.append(",");
            if (packageName == null) {
                packageName = "";
            }
            sb6.append(packageName);
            sb6.append(",20260502,");
            java.lang.String str2 = mVar.f539586b;
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(",");
            java.lang.String str3 = mVar.f539587c;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(",");
            java.lang.String str4 = mVar.f539588d;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(str4);
            sb6.append(",");
            java.lang.String str5 = mVar.f539589e;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(",");
            sb6.append(mVar.f539590f.f558794c);
            sb6.append(",");
            sb6.append(mVar.f539590f.f558795d);
            sb6.append(",");
            sb6.append(mVar.f539590f.f558796e);
            sb6.append(",");
            sb6.append(mVar.f539590f.f558797f);
            sb6.append(",");
            sb6.append(mVar.f539590f.f558798g);
            sb6.append(",");
            sb6.append(mVar.f539590f.f558799h);
            sb6.append(",");
            java.lang.StringBuilder sb7 = mVar.f539591g;
            sb6.append(sb7 != null ? sb7.toString() : "");
            java.lang.String sb8 = sb6.toString();
            by5.c4.f("KVReportForPluginUpdate", "reportPluginConfigUpdate, key = 26264, value = " + sb8);
            by5.s0.t(26264, sb8);
            if (mVar.f539585a == 0 || (str = mVar.f539587c) == null || str.isEmpty()) {
                return;
            }
            by5.c4.f("KVReportForPluginUpdate", "reportPluginConfigUpdate, config error, single plugin is not empty, try reportPluginUpdate");
            xx5.n nVar = new xx5.n();
            nVar.f539598g = mVar;
            java.lang.String str6 = mVar.f539587c;
            nVar.f539593b = str6;
            cy5.h d17 = cy5.m.d(str6);
            if (d17 != null) {
                nVar.f539594c = d17.f306412a;
            }
            nVar.f539592a = -1;
            b(nVar);
        } catch (java.lang.Exception e17) {
            by5.c4.c("KVReportForPluginUpdate", "reportPluginConfigUpdate error: " + e17.getMessage());
        }
    }

    public static void b(xx5.n nVar) {
        int i17;
        try {
            if (nVar == null) {
                by5.c4.c("KVReportForPluginUpdate", "reportPluginUpdate error, data is null");
                return;
            }
            xx5.m mVar = nVar.f539598g;
            if (mVar == null) {
                by5.c4.c("KVReportForPluginUpdate", "reportPluginUpdate error, configReportData is null");
                return;
            }
            if ("5".equals(mVar.f539586b)) {
                by5.c4.f("KVReportForPluginUpdate", "reportPluginUpdate, checkType is config only, skip report");
                return;
            }
            com.p314xaae8f345.p3210x3857dc.c2 c2Var = nVar.f539599h;
            long j17 = -1;
            if (c2Var == null) {
                com.p314xaae8f345.p3210x3857dc.c2 c2Var2 = new com.p314xaae8f345.p3210x3857dc.c2();
                nVar.f539599h = c2Var2;
                i17 = -1;
                c2Var2.f301758c = -1;
                c2Var2.f301759d = "";
                c2Var2.f301760e = "";
                c2Var2.f301761f = -1L;
                c2Var2.f301762g = -1;
                c2Var2.f301763h = false;
                c2Var2.f301764i = -1L;
                c2Var2.f301765j = false;
                c2Var2.f301766k = -1;
                c2Var2.f301767l = -1;
            } else {
                i17 = c2Var.f301763h ? 1 : 0;
            }
            long j18 = nVar.f539603l;
            long j19 = nVar.f539602k;
            if (j18 > j19 && j19 > 0) {
                j17 = j18 - j19;
            }
            android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
            java.lang.String packageName = context != null ? context.getPackageName() : "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(nVar.f539592a);
            sb6.append(",");
            if (packageName == null) {
                packageName = "";
            }
            sb6.append(packageName);
            sb6.append(",20260502,");
            java.lang.String str = nVar.f539593b;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(",");
            sb6.append(nVar.f539594c);
            sb6.append(",");
            sb6.append(nVar.f539595d);
            sb6.append(",");
            sb6.append(nVar.f539596e);
            sb6.append(",");
            java.lang.String str2 = nVar.f539597f;
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(",");
            java.lang.String str3 = nVar.f539598g.f539586b;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(",");
            java.lang.String str4 = nVar.f539598g.f539587c;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(str4);
            sb6.append(",");
            java.lang.String str5 = nVar.f539598g.f539588d;
            if (str5 == null) {
                str5 = "";
            }
            sb6.append(str5);
            sb6.append(",");
            java.lang.String str6 = nVar.f539598g.f539589e;
            sb6.append(str6 != null ? str6 : "");
            sb6.append(",");
            sb6.append(nVar.f539598g.f539585a);
            sb6.append(",");
            sb6.append(nVar.f539599h.f301757b);
            sb6.append(",");
            sb6.append(nVar.f539599h.f301758c);
            sb6.append(",");
            sb6.append(nVar.f539599h.f301762g);
            sb6.append(",");
            sb6.append(nVar.f539599h.f301767l);
            sb6.append(",");
            sb6.append(nVar.f539600i);
            sb6.append(",");
            sb6.append(nVar.f539599h.f301764i);
            sb6.append(",");
            sb6.append(i17);
            sb6.append(",");
            sb6.append(nVar.f539601j);
            sb6.append(",");
            sb6.append(j17);
            java.lang.String sb7 = sb6.toString();
            by5.c4.f("KVReportForPluginUpdate", "reportPluginUpdate, key = 26265, value = " + sb7);
            by5.s0.t(26265, sb7);
        } catch (java.lang.Exception e17) {
            by5.c4.c("KVReportForPluginUpdate", "reportPluginUpdate error: " + e17.getMessage());
        }
    }
}
