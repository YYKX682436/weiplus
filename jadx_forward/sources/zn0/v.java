package zn0;

/* loaded from: classes3.dex */
public class v implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f555939d;

    /* renamed from: e, reason: collision with root package name */
    public int f555940e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f555941f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f555942g;

    /* renamed from: h, reason: collision with root package name */
    public int f555943h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f555944i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f555945m;

    /* renamed from: n, reason: collision with root package name */
    public int f555946n;

    public v(java.lang.String str) {
        this.f555940e = 0;
        this.f555941f = false;
        this.f555942g = true;
        this.f555943h = 50;
        this.f555944i = "";
        this.f555945m = false;
        this.f555939d = str;
    }

    public java.lang.String a() {
        return this.f555939d;
    }

    public void b(int i17) {
        this.f555946n = i17;
    }

    /* renamed from: toString */
    public java.lang.String m179192x9616526c() {
        return "RemoteUserConfig{mUserName='" + this.f555939d + "', mSeatPosition=" + this.f555946n + '}';
    }

    public v(java.lang.String str, int i17) {
        this.f555941f = false;
        this.f555942g = true;
        this.f555943h = 50;
        this.f555944i = "";
        this.f555945m = false;
        this.f555939d = str;
        this.f555940e = i17;
    }
}
