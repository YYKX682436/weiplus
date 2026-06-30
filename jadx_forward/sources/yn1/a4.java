package yn1;

/* loaded from: classes11.dex */
public final class a4 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f545140b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f545141c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a f545142d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f545143e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f545139a = "MM.Mig.MigrationProviderImpl";

    /* renamed from: f, reason: collision with root package name */
    public final yn1.u2 f545144f = new yn1.u2(this);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f545145g = jz5.h.b(new yn1.t2(this));

    public static final void a(yn1.a4 a4Var) {
        if (a4Var.f545141c) {
            return;
        }
        synchronized (a4Var) {
            if (a4Var.f545141c) {
                return;
            }
            a4Var.f545141c = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "startRecover");
            ((ku5.t0) ku5.t0.f394148d).r(fo1.i.f346410d, "RoamBackup.MediaPullObserver");
        }
    }

    public final vn1.m b() {
        return (vn1.m) ((jz5.n) this.f545145g).mo141623x754a37bb();
    }
}
