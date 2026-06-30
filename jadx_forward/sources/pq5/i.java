package pq5;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f439218a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f439219b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final pq5.d f439220c;

    public i(pq5.d dVar) {
        this.f439220c = dVar;
    }

    public java.lang.Object a() {
        if (this.f439218a == null) {
            synchronized (this.f439219b) {
                if (this.f439218a == null) {
                    this.f439218a = this.f439220c.get();
                }
            }
        }
        return this.f439218a;
    }
}
