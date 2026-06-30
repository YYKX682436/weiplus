package dj0;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj0.i f314359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f314360e;

    public g(dj0.i iVar, float f17) {
        this.f314359d = iVar;
        this.f314360e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dj0.z zVar = this.f314359d.f314369n;
        if (zVar != null) {
            zVar.a(this.f314360e);
        }
    }
}
