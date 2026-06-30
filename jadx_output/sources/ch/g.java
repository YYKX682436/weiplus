package ch;

/* loaded from: classes7.dex */
public class g implements ch.a {

    /* renamed from: d, reason: collision with root package name */
    public final ch.a f41184d;

    public g(long j17, ch.a aVar) {
        this.f41184d = aVar;
    }

    @Override // ch.a
    public java.lang.String a() {
        return this.f41184d.a();
    }

    @Override // ch.a
    public void e() {
        this.f41184d.e();
    }

    @Override // ch.a
    public boolean g() {
        return this.f41184d.g();
    }

    @Override // ch.a
    public boolean j() {
        return this.f41184d.j();
    }

    @Override // ch.a
    public void k(java.lang.Runnable runnable, boolean z17) {
        ch.a aVar = this.f41184d;
        if (aVar.g()) {
            runnable.run();
        } else {
            aVar.k(runnable, z17);
        }
    }
}
