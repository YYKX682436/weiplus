package d55;

/* loaded from: classes12.dex */
public class p0 {

    /* renamed from: f, reason: collision with root package name */
    public static final m3.g f308137f = new m3.g(20);

    /* renamed from: g, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f308138g = new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public int f308139a;

    /* renamed from: b, reason: collision with root package name */
    public long f308140b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f308141c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f308142d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f308143e;

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f308138g.format(java.lang.Long.valueOf(this.f308140b)));
        sb6.append("  ");
        int i17 = this.f308139a;
        sb6.append(i17 != 4 ? i17 != 5 ? "UNKNOWN" : "WARN" : "INFO");
        sb6.append("/");
        sb6.append(this.f308141c);
        sb6.append("  [");
        sb6.append(this.f308143e);
        sb6.append("]  ");
        sb6.append(this.f308142d);
        return sb6.toString();
    }
}
