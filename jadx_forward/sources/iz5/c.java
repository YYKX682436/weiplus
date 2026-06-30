package iz5;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f377700a;

    /* renamed from: b, reason: collision with root package name */
    public int f377701b;

    /* renamed from: c, reason: collision with root package name */
    public int f377702c;

    public c(int i17, java.lang.String str, java.lang.String str2) {
        this.f377700a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2 = "[" + str.substring(this.f377701b, (str.length() - this.f377702c) + 1) + "]";
        int i17 = this.f377701b;
        java.lang.String str3 = this.f377700a;
        if (i17 > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(this.f377701b > 20 ? "..." : "");
            sb7.append(str3.substring(java.lang.Math.max(0, this.f377701b - 20), this.f377701b));
            sb6.append(sb7.toString());
            sb6.append(str2);
            str2 = sb6.toString();
        }
        if (this.f377702c <= 0) {
            return str2;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str2);
        int min = java.lang.Math.min((str3.length() - this.f377702c) + 1 + 20, str3.length());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(str3.substring((str3.length() - this.f377702c) + 1, min));
        sb9.append((str3.length() - this.f377702c) + 1 >= str3.length() - 20 ? "" : "...");
        sb8.append(sb9.toString());
        return sb8.toString();
    }
}
