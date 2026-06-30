package b73;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b73.j f18209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f18210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b73.f f18211f;

    public e(b73.f fVar, b73.j jVar, android.content.Intent intent) {
        this.f18211f = fVar;
        this.f18209d = jVar;
        this.f18210e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f18211f.f18214f.a(this.f18209d, this.f18210e);
    }
}
