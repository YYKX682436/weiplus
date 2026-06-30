package q26;

/* loaded from: classes14.dex */
public final class n0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441409a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f441410b;

    public n0(q26.n sequence, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        this.f441409a = sequence;
        this.f441410b = predicate;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.m0(this);
    }
}
