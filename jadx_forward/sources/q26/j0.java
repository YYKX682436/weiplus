package q26;

/* loaded from: classes14.dex */
public final class j0 implements q26.n, q26.f {

    /* renamed from: a, reason: collision with root package name */
    public final q26.n f441390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441391b;

    /* renamed from: c, reason: collision with root package name */
    public final int f441392c;

    public j0(q26.n sequence, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sequence, "sequence");
        this.f441390a = sequence;
        this.f441391b = i17;
        this.f441392c = i18;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("startIndex should be non-negative, but is " + i17).toString());
        }
        if (!(i18 >= 0)) {
            throw new java.lang.IllegalArgumentException(("endIndex should be non-negative, but is " + i18).toString());
        }
        if (i18 >= i17) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i18 + " < " + i17).toString());
    }

    @Override // q26.f
    public q26.n a(int i17) {
        int i18 = this.f441392c;
        int i19 = this.f441391b;
        return i17 >= i18 - i19 ? q26.g.f441373a : new q26.j0(this.f441390a, i19 + i17, i18);
    }

    @Override // q26.f
    public q26.n b(int i17) {
        int i18 = this.f441392c;
        int i19 = this.f441391b;
        return i17 >= i18 - i19 ? this : new q26.j0(this.f441390a, i19, i17 + i19);
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.i0(this);
    }
}
