package r36;

/* loaded from: classes16.dex */
public final class r extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r36.z f450990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r36.z zVar) {
        super("OkHttp %s ping", zVar.f451007g);
        this.f450990e = zVar;
    }

    @Override // m36.b
    public void a() {
        r36.z zVar;
        boolean z17;
        synchronized (this.f450990e) {
            zVar = this.f450990e;
            long j17 = zVar.f451015r;
            long j18 = zVar.f451014q;
            if (j17 < j18) {
                z17 = true;
            } else {
                zVar.f451014q = j18 + 1;
                z17 = false;
            }
        }
        if (z17) {
            zVar.b();
            return;
        }
        try {
            zVar.A.j(false, 1, 0);
        } catch (java.io.IOException unused) {
            zVar.b();
        }
    }
}
