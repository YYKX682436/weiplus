package cj5;

/* loaded from: classes.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.a0 f123810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cj5.a0 a0Var) {
        super(1);
        this.f123810d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (((wi5.e) state.a(wi5.e.class)) != null) {
            state.f527847g |= 64;
        }
        if (((wi5.b) state.a(wi5.b.class)) != null) {
            state.f527847g &= -65;
            state.f527852o.clear();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f123810d.m158354x19263085();
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m158354x19263085 : null;
            if (abstractActivityC22579xbed01a37 != null && (m78735x28280f95 = abstractActivityC22579xbed01a37.m78735x28280f95()) != null) {
                m78735x28280f95.m81450x8e764904(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
