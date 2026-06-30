package q26;

/* loaded from: classes12.dex */
public final class k implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441393a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f441394b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f441395c;

    public k(q26.n sequence, yz5.l transformer, yz5.l iterator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transformer, "transformer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iterator, "iterator");
        this.f441393a = sequence;
        this.f441394b = transformer;
        this.f441395c = iterator;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.j(this);
    }
}
