package ic2;

/* loaded from: classes8.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic2.l0 f371863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ic2.l0 l0Var) {
        super(3);
        this.f371863d = l0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        r45.zy2 req = (r45.zy2) obj2;
        r45.az2 resp = (r45.az2) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f371863d.i(true, intValue, req, resp);
        return jz5.f0.f384359a;
    }
}
