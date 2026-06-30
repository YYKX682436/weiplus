package az2;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f97656d;

    public d(az2.f fVar) {
        this.f97656d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        az2.f fVar = this.f97656d;
        az2.s sVar = fVar.f97660b;
        if (sVar != null) {
            sVar.a();
        }
        az2.s sVar2 = fVar.f97660b;
        if (sVar2 != null) {
            sVar2.b();
        }
    }
}
