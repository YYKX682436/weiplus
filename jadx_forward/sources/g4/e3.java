package g4;

/* loaded from: classes5.dex */
public final class e3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.d3 f349805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(g4.d3 d3Var) {
        super(3);
        this.f349805d = d3Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        g4.a1 type = (g4.a1) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        g4.y0 state = (g4.y0) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ((g4.p3) this.f349805d).d(type, booleanValue, state);
        return jz5.f0.f384359a;
    }
}
