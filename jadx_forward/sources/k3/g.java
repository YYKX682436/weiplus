package k3;

/* loaded from: classes13.dex */
public class g implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f385319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k3.f f385320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f385321g;

    public g(java.lang.String str, android.content.Context context, k3.f fVar, int i17) {
        this.f385318d = str;
        this.f385319e = context;
        this.f385320f = fVar;
        this.f385321g = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return k3.l.a(this.f385318d, this.f385319e, this.f385320f, this.f385321g);
    }
}
