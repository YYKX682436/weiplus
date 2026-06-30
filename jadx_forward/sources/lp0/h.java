package lp0;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final lp0.h f401799b = new lp0.h(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f401800a;

    public h(android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            this.f401800a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        } else {
            this.f401800a = sharedPreferences;
        }
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_Name_LastLoginInfo").contains(str)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_Name_LastLoginInfo").getString(str, str2);
        }
        java.lang.String string = this.f401800a.getString(str, str2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_Name_LastLoginInfo").putString(str, string);
        return string;
    }
}
