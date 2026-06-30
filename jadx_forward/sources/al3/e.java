package al3;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al3.f f87386d;

    public e(al3.f fVar) {
        this.f87386d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        al3.h hVar = this.f87386d.f87389c;
        if (hVar != null) {
            hVar.a();
        }
    }
}
