package bu2;

/* loaded from: classes.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f106100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f106101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f106100d = j17;
        this.f106101e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.p21 item = (r45.p21) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = false;
        if (item.m75939xb282bd08(5) == 0 && item.m75939xb282bd08(0) != 2) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) item.m75936x14adae67(2);
            if (c19792x256d2725 != null && c19792x256d2725.m76784x5db1b11() == this.f106100d) {
                z17 = true;
            }
        }
        if (z17) {
            this.f106101e.f391645d = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
