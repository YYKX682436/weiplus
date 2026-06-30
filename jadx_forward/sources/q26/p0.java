package q26;

/* loaded from: classes8.dex */
public final class p0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441418a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f441419b;

    public p0(q26.n sequence, yz5.p transformer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transformer, "transformer");
        this.f441418a = sequence;
        this.f441419b = transformer;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.o0(this);
    }
}
