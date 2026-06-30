package si0;

/* loaded from: classes13.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.v f489709d;

    public u(si0.v vVar) {
        this.f489709d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        si0.b bVar = this.f489709d.C;
        if (bVar != null) {
            bVar.f489570a.start();
        }
    }
}
