package el2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(el2.i0 i0Var) {
        super(3);
        this.f335450d = i0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.z42 info = (r45.z42) obj;
        android.view.View view = (android.view.View) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        el2.i0 i0Var = this.f335450d;
        if (!i0Var.f335344p0.contains(java.lang.Integer.valueOf(info.m75939xb282bd08(1))) || ((java.lang.Boolean) ae2.in.f85298h6.r()).booleanValue()) {
            rl5.r rVar = new rl5.r(view.getContext());
            rVar.g(view, intValue, 0L, new el2.s(i0Var), new el2.t(i0Var, info), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            rVar.m();
        }
        return jz5.f0.f384359a;
    }
}
