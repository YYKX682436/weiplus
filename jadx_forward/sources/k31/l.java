package k31;

/* loaded from: classes9.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.b f385379d;

    public l(l31.b bVar) {
        this.f385379d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k31.o.f385386d.remove(java.lang.Long.valueOf(this.f385379d.hashCode()));
    }
}
