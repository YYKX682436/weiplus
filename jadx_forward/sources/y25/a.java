package y25;

/* loaded from: classes.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str, java.util.HashMap hashMap) {
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallManager", "getWapPayKey key: " + str + " value is empty");
        return "";
    }
}
