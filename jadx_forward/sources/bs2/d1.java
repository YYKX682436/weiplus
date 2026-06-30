package bs2;

/* loaded from: classes2.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.i2 f105358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ey2.i2 i2Var, bs2.n1 n1Var) {
        super(1);
        this.f105358d = i2Var;
        this.f105359e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        boolean O6 = this.f105358d.O6(feed.m76784x5db1b11());
        if (O6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f105359e.f105442c, "refreshFirstPage: remove read feed, id = ".concat(pm0.v.u(feed.m76784x5db1b11())));
        }
        return java.lang.Boolean.valueOf(O6);
    }
}
