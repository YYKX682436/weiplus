package wo;

/* loaded from: classes.dex */
public class n0 extends wo.r0 {
    @Override // wo.r0
    public java.lang.String b() {
        try {
            android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("android_id");
            arrayList.add(contentResolver);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            return (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/DeviceInfo$8", "newValue", "()Ljava/lang/String;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceInfo", th6, "[-] Fail to get android id.", new java.lang.Object[0]);
            return "";
        }
    }
}
