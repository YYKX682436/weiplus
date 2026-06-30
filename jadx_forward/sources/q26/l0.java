package q26;

/* loaded from: classes14.dex */
public final class l0 implements q26.n, q26.f {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441402b;

    public l0(q26.n sequence, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        this.f441401a = sequence;
        this.f441402b = i17;
        if (i17 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i17 + '.').toString());
    }

    @Override // q26.f
    public q26.n a(int i17) {
        int i18 = this.f441402b;
        return i17 >= i18 ? q26.g.f441373a : new q26.j0(this.f441401a, i17, i18);
    }

    @Override // q26.f
    public q26.n b(int i17) {
        return i17 >= this.f441402b ? this : new q26.l0(this.f441401a, i17);
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.k0(this);
    }
}
