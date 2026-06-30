package qp3;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(java.lang.String str, java.lang.String str2, android.os.PersistableBundle persistableBundle) {
        java.lang.String string;
        java.lang.String str3;
        if (persistableBundle == null) {
            str3 = null;
            string = null;
        } else {
            java.lang.String string2 = persistableBundle.getString("adUxInfo");
            string = persistableBundle.getString("commonUxInfo");
            str3 = string2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayAdUxInfoTracer", "AppBrandRuntime(%s)-%s, adUxInfo=%s, commonUxInfo=%s", str2, str, str3, string);
    }

    public static void b(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayAdUxInfoTracer", "trace: " + str, objArr);
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayAdUxInfoTracer", "trace: scene[%s] api[%s] adUxInfo[%s] source[%s]", str, str2, str3, str4);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayAdUxInfoTracer", "trace: scene[%s] api[%s] commonUxInfo[%s] source[%s]", str, str2, str3, str4);
    }
}
