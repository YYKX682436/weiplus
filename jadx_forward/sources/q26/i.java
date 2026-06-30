package q26;

/* loaded from: classes5.dex */
public final class i implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441380a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f441381b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f441382c;

    public i(q26.n sequence, boolean z17, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        this.f441380a = sequence;
        this.f441381b = z17;
        this.f441382c = predicate;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.h(this);
    }
}
