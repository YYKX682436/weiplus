package w91;

/* loaded from: classes13.dex */
public abstract class f implements w91.d {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f525598c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f525599d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f525600e = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f525597b = b();

    /* renamed from: a, reason: collision with root package name */
    public w91.e f525596a = w91.e.POST;

    public f(java.lang.String str, java.lang.String str2) {
        this.f525598c = str;
        this.f525599d = str2;
    }

    public abstract java.lang.String b();

    public void c(java.lang.String str, java.lang.String str2) {
        ((java.util.HashMap) this.f525600e).put(str, str2);
    }

    public void d() {
        c("Content-Type", "text/xml;charset=\"utf-8\"");
        c("Connection", "close");
    }
}
