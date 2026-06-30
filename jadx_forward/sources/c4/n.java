package c4;

/* loaded from: classes15.dex */
public class n implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f119855d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119856e;

    /* renamed from: f, reason: collision with root package name */
    public final int f119857f;

    /* renamed from: g, reason: collision with root package name */
    public final c4.l0 f119858g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f119859h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public c4.l f119860i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 f119861m;

    public n(p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33, java.lang.String str, int i17, int i18, android.os.Bundle bundle, c4.l0 l0Var) {
        this.f119861m = abstractServiceC1134x1ae0da33;
        this.f119855d = str;
        this.f119856e = i17;
        this.f119857f = i18;
        if (str == null) {
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            new c4.q0(str, i17, i18);
        }
        this.f119858g = l0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.f119861m.f93239h.post(new c4.m(this));
    }
}
