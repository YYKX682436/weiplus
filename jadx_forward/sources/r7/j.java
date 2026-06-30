package r7;

/* loaded from: classes13.dex */
public class j extends r7.k {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f474606a;

    public j() {
        super(null);
    }

    @Override // r7.k
    public void a() {
        if (this.f474606a) {
            throw new java.lang.IllegalStateException("Already released");
        }
    }
}
