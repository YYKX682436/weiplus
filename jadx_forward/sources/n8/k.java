package n8;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.f f417065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n8.m f417066e;

    public k(n8.m mVar, o8.f fVar) {
        this.f417066e = mVar;
        this.f417065d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f417065d) {
        }
        this.f417066e.f417070b.i(this.f417065d);
    }
}
