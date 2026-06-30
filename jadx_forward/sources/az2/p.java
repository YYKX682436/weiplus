package az2;

/* loaded from: classes.dex */
public final class p extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f97679t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.p f97680u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, yz5.p callback) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f97679t = i17;
        this.f97680u = callback;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveentranceverify";
        lVar.f152200d = 6826;
        r45.op1 op1Var = new r45.op1();
        op1Var.set(2, java.lang.Integer.valueOf(i17));
        lVar.f152197a = op1Var;
        lVar.f152198b = new r45.pp1();
        p(lVar.a());
        this.f97670p = false;
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pp1 resp = (r45.pp1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntranceVerif", "onCgiEnd errType: " + i17 + " errCode: " + i18 + " errMsg: " + str + " isValid: " + resp.m75933x41a8a7f2(1) + " request_interval_sec: " + resp.m75939xb282bd08(2));
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(resp.m75933x41a8a7f2(1));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(resp.m75939xb282bd08(2));
        if (!(valueOf2.intValue() > 0)) {
            valueOf2 = null;
        }
        this.f97680u.mo149xb9724478(valueOf, java.lang.Integer.valueOf(valueOf2 != null ? valueOf2.intValue() : 7200));
    }

    @Override // az2.j, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntranceVerif", "FinderLiveEntranceVerify run dynamicStatus: " + this.f97679t);
        return super.l();
    }
}
