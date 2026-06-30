package n0;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.k4 f415201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f415202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0.k4 k4Var, n0.d dVar) {
        super(3);
        this.f415201d = k4Var;
        this.f415202e = dVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.e) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int i17 = slots.f415188m;
        slots.f415188m = i17 + 1;
        if (i17 == 0) {
            slots.f415191p.b(((slots.f415177b.length / 5) - slots.f415181f) - slots.f415182g);
        }
        n0.d dVar = this.f415202e;
        dVar.getClass();
        n0.k4 slots2 = this.f415201d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots2, "slots");
        slots.s(slots2, slots2.e(dVar));
        slots.i();
        return jz5.f0.f384359a;
    }
}
