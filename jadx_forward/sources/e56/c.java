package e56;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331218a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f331219b;

    public c(e56.d dVar, e56.b bVar) {
        java.lang.String substring;
        java.lang.String str = dVar.f331220a;
        int length = str.length();
        java.lang.String str2 = dVar.f331221b;
        int min = java.lang.Math.min(length, str2.length());
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= min) {
                substring = str.substring(0, min);
                break;
            } else {
                if (str.charAt(i18) != str2.charAt(i18)) {
                    substring = str.substring(0, i18);
                    break;
                }
                i18++;
            }
        }
        this.f331218a = substring;
        java.lang.String str3 = dVar.f331220a;
        int min2 = java.lang.Math.min(str3.length() - substring.length(), str2.length() - substring.length()) - 1;
        while (i17 <= min2 && str3.charAt((str3.length() - 1) - i17) == str2.charAt((str2.length() - 1) - i17)) {
            i17++;
        }
        this.f331219b = str3.substring(str3.length() - i17);
    }

    public final java.lang.String a(java.lang.String str) {
        return "[" + str.substring(this.f331218a.length(), str.length() - this.f331219b.length()) + "]";
    }
}
