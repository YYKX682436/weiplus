package q26;

/* loaded from: classes10.dex */
public final class m implements q26.n {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f441403a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f441404b;

    public m(yz5.a getInitialValue, yz5.l getNextValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getInitialValue, "getInitialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getNextValue, "getNextValue");
        this.f441403a = getInitialValue;
        this.f441404b = getNextValue;
    }

    @Override // q26.n
    /* renamed from: iterator */
    public java.util.Iterator mo144672x467c086e() {
        return new q26.l(this);
    }
}
