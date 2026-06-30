package n0;

/* loaded from: classes14.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f415242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f415243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.Object obj, int i17, int i18) {
        super(3);
        this.f415242d = obj;
        this.f415243e = i17;
        this.f415244f = i18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.e) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rememberManager, "rememberManager");
        int i17 = this.f415243e;
        int i18 = this.f415244f;
        java.lang.Object F = slots.F(i17, i18);
        java.lang.Object obj4 = this.f415242d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj4, F)) {
            n0.e1.c("Slot table is out of sync".toString());
            throw null;
        }
        ((n0.i1) rememberManager).c((n0.e4) obj4);
        int i19 = n0.o.f415162a;
        slots.C(i18, n0.n.f415153a);
        return jz5.f0.f384359a;
    }
}
