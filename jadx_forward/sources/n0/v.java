package n0;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f415254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f415255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.Object obj, int i17, int i18) {
        super(3);
        this.f415254d = obj;
        this.f415255e = i17;
        this.f415256f = i18;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.e) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int i17 = this.f415255e;
        int i18 = this.f415256f;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415254d, slots.F(i17, i18))) {
            n0.e1.c("Slot table is out of sync".toString());
            throw null;
        }
        int i19 = n0.o.f415162a;
        slots.C(i18, n0.n.f415153a);
        return jz5.f0.f384359a;
    }
}
