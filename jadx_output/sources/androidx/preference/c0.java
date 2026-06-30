package androidx.preference;

/* loaded from: classes13.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f11794a;

    /* renamed from: b, reason: collision with root package name */
    public long f11795b = 0;

    /* renamed from: c, reason: collision with root package name */
    public android.content.SharedPreferences f11796c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences.Editor f11797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f11799f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.preference.PreferenceScreen f11800g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.preference.b0 f11801h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.preference.z f11802i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.preference.a0 f11803j;

    public c0(android.content.Context context) {
        this.f11794a = context;
        this.f11799f = context.getPackageName() + "_preferences";
    }

    public android.content.SharedPreferences.Editor a() {
        if (!this.f11798e) {
            return b().edit();
        }
        if (this.f11797d == null) {
            this.f11797d = b().edit();
        }
        return this.f11797d;
    }

    public android.content.SharedPreferences b() {
        if (this.f11796c == null) {
            this.f11796c = this.f11794a.getSharedPreferences(this.f11799f, 0);
        }
        return this.f11796c;
    }
}
