package k3;

/* loaded from: classes13.dex */
public class i implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f385324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k3.f f385325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f385326g;

    public i(java.lang.String str, android.content.Context context, k3.f fVar, int i17) {
        this.f385323d = str;
        this.f385324e = context;
        this.f385325f = fVar;
        this.f385326g = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            return k3.l.a(this.f385323d, this.f385324e, this.f385325f, this.f385326g);
        } catch (java.lang.Throwable unused) {
            return new k3.k(-3);
        }
    }
}
