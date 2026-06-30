package df2;

/* loaded from: classes3.dex */
public final class i3 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.j3 f311912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(df2.j3 j3Var, java.lang.Class cls) {
        super(cls);
        this.f311912b = j3Var;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311912b.f311981m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.tc2 result = (r45.tc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.j3 j3Var = this.f311912b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j3Var.f311981m, "onPollingSuccess info: " + pm0.b0.g(result));
        dk2.tb tbVar = dk2.ef.f314925k;
        r45.sc2 sc2Var = new r45.sc2();
        sc2Var.set(0, result.m75934xbce7f2f(1));
        tbVar.h(41, sc2Var);
        r45.pj1 pj1Var = (r45.pj1) result.m75936x14adae67(0);
        if (pj1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j3Var.f311981m, "insert notification");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20111);
        ch1Var.set(4, hc2.b.a(pj1Var));
        dk2.y7 y7Var = new dk2.y7(ch1Var);
        y7Var.f315908b = result.m75939xb282bd08(2);
        linkedList.add(y7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) j3Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
        if (mgVar != null) {
            mgVar.I1(linkedList);
        }
    }
}
