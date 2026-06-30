package q26;

/* loaded from: classes12.dex */
public final class a implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f441357a;

    public a(q26.n sequence) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        this.f441357a = new java.util.concurrent.atomic.AtomicReference(sequence);
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        q26.n nVar = (q26.n) this.f441357a.getAndSet(null);
        if (nVar != null) {
            return nVar.mo144672x467c086e();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
