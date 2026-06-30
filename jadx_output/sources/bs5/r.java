package bs5;

/* loaded from: classes13.dex */
public abstract class r {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (android.text.TextUtils.isEmpty(str2)) {
            throw new java.lang.IllegalArgumentException("bizId".concat(" can not be empty"));
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("token".concat(" can not be empty"));
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        return java.lang.String.format(java.util.Locale.US, str4, str, kr5.p.f311571b.f311563r, str2, str3);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        if (android.text.TextUtils.isEmpty(str2)) {
            throw new java.lang.IllegalArgumentException("bizId".concat(" can not be empty"));
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        return java.lang.String.format(java.util.Locale.US, str3, str, z17 ? "" : kr5.p.f311571b.f311563r, str2);
    }
}
