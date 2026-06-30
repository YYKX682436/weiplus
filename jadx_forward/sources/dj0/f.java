package dj0;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj0.i f314357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f314358e;

    public f(dj0.i iVar, float f17) {
        this.f314357d = iVar;
        this.f314358e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dj0.z zVar = this.f314357d.f314369n;
        if (zVar != null) {
            zVar.a(this.f314358e);
        }
    }
}
