package fp;

/* loaded from: classes12.dex */
public abstract class b {
    public static final java.lang.String a(android.content.Context context) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x0 x0Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.x0("softtype");
        java.lang.String str = (java.lang.String) wo.t.c().get("Processor");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        x0Var.a("cpu", str);
        java.lang.String a17 = wo.w0.f529380i.a();
        if (a17 == null) {
            a17 = "";
        }
        x0Var.a(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce.f16230x4a21bdb, a17);
        x0Var.a("osversion", android.os.Build.VERSION.RELEASE);
        java.lang.String g17 = wo.w0.g(true);
        java.lang.String h17 = wo.w0.h();
        x0Var.a("deviceId", g17);
        x0Var.a("imsi", h17);
        x0Var.a("iccid", "");
        x0Var.a("androidid", wo.w0.c());
        java.lang.String a18 = wo.w0.f529374c.a();
        if (a18 == null) {
            a18 = "";
        }
        x0Var.a("serial", a18);
        x0Var.a("model", wo.w0.m());
        x0Var.a("core_count", wo.t.d() + "");
        java.lang.String str2 = (java.lang.String) wo.t.a().get("Hardware");
        if (str2 == null) {
            str2 = "";
        }
        x0Var.a("cpuhardware", str2);
        java.lang.String str3 = (java.lang.String) wo.t.a().get("CPU revision");
        if (str3 == null) {
            str3 = "";
        }
        x0Var.a("cpureversion", str3);
        java.lang.String str4 = (java.lang.String) wo.t.a().get("Serial");
        if (str4 == null) {
            str4 = "";
        }
        x0Var.a("cpuserial", str4);
        java.lang.String str5 = (java.lang.String) wo.t.a().get("Features");
        if (str5 == null) {
            str5 = "";
        }
        x0Var.a("Features", str5);
        x0Var.a("wifi-mac", wo.w0.i());
        x0Var.a("bluetooth", "");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f274602a);
        java.lang.StringBuffer stringBuffer = x0Var.f274603b;
        if (!K0) {
            stringBuffer.append("</" + x0Var.f274602a + ">");
            x0Var.f274602a = "";
        }
        return stringBuffer.toString();
    }
}
