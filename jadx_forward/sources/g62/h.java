package g62;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350616a;

    /* renamed from: b, reason: collision with root package name */
    public final long f350617b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f350618c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f350619d;

    public h(long j17, java.lang.String str, long j18, boolean z17) {
        this.f350616a = str;
        this.f350617b = j18;
        this.f350619d = z17;
        this.f350618c = new java.text.SimpleDateFormat("[yy-MM-dd HH:mm:ss:SSS]").format(new java.util.Date(j18));
    }

    /* renamed from: toString */
    public java.lang.String m130985x9616526c() {
        return this.f350618c + ":" + this.f350616a;
    }
}
