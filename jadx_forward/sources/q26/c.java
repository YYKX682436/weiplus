package q26;

/* loaded from: classes7.dex */
public final class c implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441363a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f441364b;

    public c(q26.n source, yz5.l keySelector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keySelector, "keySelector");
        this.f441363a = source;
        this.f441364b = keySelector;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.b(this.f441363a.mo144672x467c086e(), this.f441364b);
    }
}
