package b73;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b73.j f99742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f99743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b73.f f99744f;

    public e(b73.f fVar, b73.j jVar, android.content.Intent intent) {
        this.f99744f = fVar;
        this.f99742d = jVar;
        this.f99743e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f99744f.f99747f.a(this.f99742d, this.f99743e);
    }
}
