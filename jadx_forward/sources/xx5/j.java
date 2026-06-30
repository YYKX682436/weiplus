package xx5;

/* loaded from: classes13.dex */
public abstract class j {
    public static void a(int i17, java.lang.String str, int i18, int i19, int i27, int i28, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.f1 f1Var, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
        sb6.append(",");
        sb6.append(f1Var.ordinal());
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(str);
        sb6.append(",");
        sb6.append(by5.y.a(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c));
        sb6.append(",100,-1,");
        sb6.append(i18);
        sb6.append(",");
        sb6.append(i19);
        sb6.append(",");
        sb6.append(i27);
        sb6.append(",");
        sb6.append(i28);
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getPackageName());
        sb6.append(",");
        java.lang.String encode = java.net.URLEncoder.encode(str2);
        java.lang.String str4 = "";
        if (android.text.TextUtils.isEmpty(encode)) {
            encode = "";
        } else if (encode.length() > 200) {
            encode = encode.substring(0, 200);
        }
        sb6.append(encode);
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.k());
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.e() ? 1 : 2);
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        com.p314xaae8f345.p3210x3857dc.b.m().getClass();
        sb6.append(com.p314xaae8f345.p3210x3857dc.b.f301741b);
        sb6.append(",");
        if (str3 != null && !str3.isEmpty()) {
            str4 = str3.replaceAll(",", " ");
        }
        sb6.append(str4);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForLoadUrl", "report:" + sb7);
        by5.s0.t(15003, sb7);
    }
}
