package bu2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f106109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f106108d = i17;
        this.f106109e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.en2 m76811x50f46773;
        r45.p21 item = (r45.p21) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = false;
        if (item.m75939xb282bd08(5) == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) item.m75936x14adae67(2);
            if ((c19792x256d2725 == null || (m76811x50f46773 = c19792x256d2725.m76811x50f46773()) == null || m76811x50f46773.m75939xb282bd08(2) != this.f106108d) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            this.f106109e.f391645d = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
