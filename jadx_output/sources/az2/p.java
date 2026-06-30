package az2;

/* loaded from: classes.dex */
public final class p extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f16146t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.p f16147u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, yz5.p callback) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f16146t = i17;
        this.f16147u = callback;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveentranceverify";
        lVar.f70667d = 6826;
        r45.op1 op1Var = new r45.op1();
        op1Var.set(2, java.lang.Integer.valueOf(i17));
        lVar.f70664a = op1Var;
        lVar.f70665b = new r45.pp1();
        p(lVar.a());
        this.f16137p = false;
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pp1 resp = (r45.pp1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderLiveEntranceVerif", "onCgiEnd errType: " + i17 + " errCode: " + i18 + " errMsg: " + str + " isValid: " + resp.getBoolean(1) + " request_interval_sec: " + resp.getInteger(2));
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(resp.getBoolean(1));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(resp.getInteger(2));
        if (!(valueOf2.intValue() > 0)) {
            valueOf2 = null;
        }
        this.f16147u.invoke(valueOf, java.lang.Integer.valueOf(valueOf2 != null ? valueOf2.intValue() : 7200));
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i("FinderLiveEntranceVerif", "FinderLiveEntranceVerify run dynamicStatus: " + this.f16146t);
        return super.l();
    }
}
