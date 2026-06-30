package t56;

/* loaded from: classes16.dex */
public final class w extends p56.q {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f497475e;

    public w(java.util.concurrent.ThreadFactory threadFactory) {
        this.f497475e = threadFactory;
    }

    @Override // p56.q
    /* renamed from: createWorker */
    public p56.p mo157871x6217339a() {
        return new t56.y(this.f497475e);
    }
}
