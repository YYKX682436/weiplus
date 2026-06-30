package km5;

/* loaded from: classes16.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm5.a f390862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f390863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f390864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km5.q f390865g;

    public l(km5.q qVar, gm5.a aVar, java.lang.Object obj, boolean z17) {
        this.f390865g = qVar;
        this.f390862d = aVar;
        this.f390863e = obj;
        this.f390864f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f390865g.f390891t.a(this.f390862d, this.f390863e, this.f390864f);
    }
}
