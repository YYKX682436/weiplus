package c52;

/* loaded from: classes11.dex */
public abstract class c {
    public static byte[] a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return b().j(str);
    }

    public static com.tencent.mm.sdk.platformtools.o4 b() {
        return com.tencent.mm.sdk.platformtools.o4.M("_hellhound_mmkv");
    }

    public static java.lang.String c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return b().getString(str, null);
    }

    public static void d(java.lang.String str, byte[] bArr) {
        if (android.text.TextUtils.isEmpty(str) || bArr == null) {
            return;
        }
        b().H(str, bArr);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        b().putString(str, str2);
    }
}
