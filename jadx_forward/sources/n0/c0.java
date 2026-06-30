package n0;

/* loaded from: classes14.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f415002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f415003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, n0.d dVar) {
        super(3);
        this.f415002d = f0Var;
        this.f415003e = dVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int c17 = slots.c(this.f415003e);
        n0.e1.f(slots.f415193r < c17);
        n0.y0.x(slots, applier, c17);
        int i18 = slots.f415193r;
        int i19 = slots.f415194s;
        while (i19 >= 0 && !slots.r(i19)) {
            i19 = slots.w(i19);
        }
        int i27 = i19 + 1;
        int i28 = 0;
        while (i27 < i18) {
            if (slots.o(i18, i27)) {
                if (slots.r(i27)) {
                    i28 = 0;
                }
                i27++;
            } else {
                i28 += slots.r(i27) ? 1 : n0.l4.h(slots.f415177b, slots.m(i27));
                i27 += slots.n(i27);
            }
        }
        while (true) {
            i17 = slots.f415193r;
            if (i17 >= c17) {
                break;
            }
            if (slots.o(c17, i17)) {
                int i29 = slots.f415193r;
                if (i29 < slots.f415182g && n0.l4.f(slots.f415177b, slots.m(i29))) {
                    applier.h(slots.v(slots.f415193r));
                    i28 = 0;
                }
                slots.H();
            } else {
                i28 += slots.D();
            }
        }
        n0.e1.f(i17 == c17);
        this.f415002d.f391649d = i28;
        return jz5.f0.f384359a;
    }
}
