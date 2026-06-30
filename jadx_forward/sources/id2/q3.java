package id2;

/* loaded from: classes.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f372296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f372297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372298h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(id2.u3 u3Var, android.content.Context context, long j17, long j18, yz5.l lVar) {
        super(1);
        this.f372294d = u3Var;
        this.f372295e = context;
        this.f372296f = j17;
        this.f372297g = j18;
        this.f372298h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.nw1 nw1Var = (r45.nw1) obj;
        if (nw1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePersonalCente", "showReplayCancelWidget:liveInfo is null");
        } else {
            int m75939xb282bd08 = nw1Var.m75939xb282bd08(31);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "Current replay status: " + m75939xb282bd08);
            id2.u3 u3Var = this.f372294d;
            if (m75939xb282bd08 == 1) {
                java.lang.String string = u3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nv7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this.f372295e);
                e4Var.f293309c = string;
                e4Var.c();
            } else if (m75939xb282bd08 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePersonalCente", "showReplayCancelWidget Unexpected replay status: " + nw1Var.m75939xb282bd08(31));
            } else {
                android.content.Context context = this.f372295e;
                long j17 = this.f372296f;
                long j18 = this.f372297g;
                u3Var.getClass();
                id2.c2 c2Var = new id2.c2(u3Var, context, this.f372298h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[cancelLongFeedGen]");
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 0);
                r45.r02 r02Var = new r45.r02();
                r02Var.set(0, 0);
                r02Var.set(1, 0);
                r02Var.set(2, 0);
                r02Var.set(3, 0);
                r02Var.set(4, 0);
                r02Var.set(5, 1);
                r02Var.set(6, 0);
                hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r02Var.mo14344x5f01b1f6()));
                u3Var.R6(context, j17, j18, hx0Var, c2Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
