package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f93327a;

    /* renamed from: b, reason: collision with root package name */
    public long f93328b = 0;

    /* renamed from: c, reason: collision with root package name */
    public android.content.SharedPreferences f93329c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences.Editor f93330d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f93332f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 f93333g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.b0 f93334h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.z f93335i;

    /* renamed from: j, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.a0 f93336j;

    public c0(android.content.Context context) {
        this.f93327a = context;
        this.f93332f = context.getPackageName() + "_preferences";
    }

    public android.content.SharedPreferences.Editor a() {
        if (!this.f93331e) {
            return b().edit();
        }
        if (this.f93330d == null) {
            this.f93330d = b().edit();
        }
        return this.f93330d;
    }

    public android.content.SharedPreferences b() {
        if (this.f93329c == null) {
            this.f93329c = this.f93327a.getSharedPreferences(this.f93332f, 0);
        }
        return this.f93329c;
    }
}
