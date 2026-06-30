package ev4;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev4.j f338478d;

    public e(ev4.j jVar) {
        this.f338478d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fv4.i iVar = this.f338478d.f338486a;
        iVar.f348547h.compareAndSet(false, true);
        fv4.j jVar = new fv4.j(iVar.f348541b);
        iVar.f348541b.g();
        iVar.f348541b = jVar;
        jVar.f(iVar);
    }
}
