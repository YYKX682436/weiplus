package c4;

/* loaded from: classes15.dex */
public class n implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f38322d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38323e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38324f;

    /* renamed from: g, reason: collision with root package name */
    public final c4.l0 f38325g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f38326h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public c4.l f38327i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.media.MediaBrowserServiceCompat f38328m;

    public n(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat, java.lang.String str, int i17, int i18, android.os.Bundle bundle, c4.l0 l0Var) {
        this.f38328m = mediaBrowserServiceCompat;
        this.f38322d = str;
        this.f38323e = i17;
        this.f38324f = i18;
        if (str == null) {
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            new c4.q0(str, i17, i18);
        }
        this.f38325g = l0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.f38328m.f11706h.post(new c4.m(this));
    }
}
