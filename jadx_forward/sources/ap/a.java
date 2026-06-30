package ap;

/* loaded from: classes12.dex */
public abstract class a {
    public static void a(int i17, java.lang.String str, java.lang.Throwable th6, java.util.Map map, java.lang.String... strArr) {
        b(i17, str, th6 != null ? android.util.Log.getStackTraceString(th6).replace('\n', ';').replace("\t", "") : "", map, strArr);
    }

    public static void b(int i17, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String... strArr) {
        java.lang.String a17 = ap.d.a();
        java.lang.String str3 = strArr.length >= 1 ? strArr[0] : "";
        java.lang.String str4 = strArr.length >= 2 ? strArr[1] : "";
        java.lang.String str5 = strArr.length >= 3 ? strArr[2] : "";
        java.lang.String str6 = strArr.length >= 4 ? strArr[3] : "";
        java.lang.String str7 = strArr.length >= 5 ? strArr[4] : "";
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("key5", str7);
        linkedHashMap.put("dev-fingerprint", android.os.Build.FINGERPRINT);
        java.lang.String b17 = ap.c.b(linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CompatReporter", "#reportCommon: " + str);
        ap.c.a(i17, 0, str, a17, str2, str3, str4, str5, str6, b17);
    }
}
