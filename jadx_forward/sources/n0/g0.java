package n0;

/* loaded from: classes14.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f415043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0.y0 y0Var, n0.u2 u2Var, n0.u2 u2Var2) {
        super(3);
        this.f415043d = y0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.e) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        n0.t2 h17 = this.f415043d.f415295c.h(null);
        if (h17 == null) {
            n0.e1.c("Could not resolve state for movable content");
            throw null;
        }
        h17.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(null, "table");
        n0.e1.f(slots.f415188m <= 0 && slots.n(slots.f415193r + 1) == 1);
        int i17 = slots.f415193r;
        int i18 = slots.f415183h;
        int i19 = slots.f415184i;
        slots.a(1);
        slots.H();
        int i27 = slots.f415188m;
        slots.f415188m = i27 + 1;
        if (i27 == 0) {
            slots.f415191p.b(((slots.f415177b.length / 5) - slots.f415181f) - slots.f415182g);
        }
        throw null;
    }
}
