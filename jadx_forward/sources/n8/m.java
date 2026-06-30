package n8;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f417069a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.n f417070b;

    public m(android.os.Handler handler, n8.n nVar) {
        if (nVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f417069a = handler;
        this.f417070b = nVar;
    }

    public void a(o8.f fVar) {
        if (this.f417070b != null) {
            this.f417069a.post(new n8.k(this, fVar));
        }
    }
}
