package cj5;

/* loaded from: classes.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final cj5.f0 f123649d = new cj5.f0();

    public f0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (((wi5.e) state.a(wi5.e.class)) != null) {
            state.f527847g |= 64;
        }
        if (((wi5.b) state.a(wi5.b.class)) != null) {
            state.f527847g &= -65;
            state.f527852o.clear();
        }
        return jz5.f0.f384359a;
    }
}
