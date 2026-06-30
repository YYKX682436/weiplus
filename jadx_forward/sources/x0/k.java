package x0;

/* loaded from: classes14.dex */
public final class k implements x0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f532433a;

    public k(yz5.p pVar) {
        this.f532433a = pVar;
    }

    @Override // x0.i
    /* renamed from: dispose */
    public final void mo174763x63a5261f() {
        yz5.p pVar = this.f532433a;
        synchronized (x0.z.f532496b) {
            ((java.util.ArrayList) x0.z.f532500f).remove(pVar);
        }
    }
}
