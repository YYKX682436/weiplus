package xx5;

/* loaded from: classes13.dex */
public abstract class h {
    public static void a(com.p314xaae8f345.p3210x3857dc.c2 c2Var, zx5.f fVar) {
        java.lang.String str;
        int i17 = fVar.f558761a != null ? !zx5.p.Z().r().equalsIgnoreCase(fVar.f558761a.r()) ? 1 : 0 : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(fVar.f558764d ? 2 : 1);
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
        sb6.append(",");
        sb6.append(fVar.f558768h);
        sb6.append(",20260502,");
        sb6.append(c2Var.f301757b);
        sb6.append(",");
        sb6.append(c2Var.f301762g);
        sb6.append(",");
        sb6.append(c2Var.f301767l);
        sb6.append(",");
        sb6.append(java.lang.System.currentTimeMillis() - c2Var.f301761f);
        sb6.append(",");
        sb6.append(c2Var.f301764i);
        sb6.append(",");
        sb6.append(c2Var.f301758c);
        sb6.append(",");
        sb6.append(c2Var.f301763h ? 1 : 0);
        sb6.append(",");
        sb6.append(c2Var.f301759d);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156975x966e5ddb());
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getPackageName());
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        sb6.append(fVar.f558772l == 1 ? "1" : "2");
        sb6.append(",");
        com.p314xaae8f345.p3210x3857dc.b.m().getClass();
        sb6.append(com.p314xaae8f345.p3210x3857dc.b.f301741b);
        sb6.append(",");
        try {
            str = fVar.b();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",");
        java.lang.String str2 = fVar.f558773m;
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "None";
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForDownloadRuntime", "report:" + sb7);
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        by5.s0.t(15124, sb7);
    }
}
