package i9;

/* loaded from: classes15.dex */
public final class c extends i9.j {

    /* renamed from: h, reason: collision with root package name */
    public final i9.b f371201h;

    public c(i9.b bVar) {
        this.f371201h = bVar;
    }

    @Override // i9.j
    public final void l() {
        i9.b bVar = this.f371201h;
        synchronized (bVar.f425149b) {
            bVar.e(this);
            if (!bVar.f425150c.isEmpty() && bVar.f425155h > 0) {
                bVar.f425149b.notify();
            }
        }
    }
}
