package q26;

/* loaded from: classes5.dex */
public final class r0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441423a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f441424b;

    public r0(q26.n sequence, yz5.l transformer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transformer, "transformer");
        this.f441423a = sequence;
        this.f441424b = transformer;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.q0(this);
    }
}
