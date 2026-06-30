package q26;

/* loaded from: classes8.dex */
public final class g0 implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q26.n f441374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f441375b;

    public g0(q26.n nVar, java.util.Comparator comparator) {
        this.f441374a = nVar;
        this.f441375b = comparator;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        java.util.List z17 = q26.h0.z(this.f441374a);
        kz5.g0.t(z17, this.f441375b);
        return z17.iterator();
    }
}
