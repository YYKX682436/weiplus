package ap;

/* loaded from: classes12.dex */
public abstract class j {
    public static final void a(int i17, java.lang.String bizName, java.lang.Throwable th6, java.util.Map map, java.lang.String... keys) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        if (th6 != null) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            str = r26.i0.t(r26.i0.u(stackTraceString, '\n', ';', false, 4, null), "\t", "", false);
        } else {
            str = "";
        }
        java.lang.String[] keys2 = (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys2, "keys");
        java.lang.String a17 = ap.d.a();
        java.lang.String str2 = keys2.length + (-1) >= 0 ? keys2[0] : "";
        java.lang.String str3 = 1 <= keys2.length + (-1) ? keys2[1] : "";
        java.lang.String str4 = 2 <= keys2.length + (-1) ? keys2[2] : "";
        java.lang.String str5 = 3 <= keys2.length + (-1) ? keys2[3] : "";
        java.lang.String str6 = 4 <= keys2.length + (-1) ? keys2[4] : "";
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("dev-fingerprint", android.os.Build.FINGERPRINT);
        java.lang.String b17 = ap.c.b(linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageReporter", "#reportCommon: ".concat(bizName));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageReporter", "report to KV_ID_STORAGE: ilogs=38211, bizType=" + i17 + ", bizName=" + bizName);
        jx3.f.INSTANCE.d(38211, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, java.lang.Integer.valueOf(i17), bizName, a17, str, b17, str2, str3, str4, str5, str6);
    }
}
