package df2;

/* loaded from: classes3.dex */
public final class xi extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.yi f313313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(df2.yi yiVar, java.lang.Class cls) {
        super(cls);
        this.f313313b = yiVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.uj1 uj1Var;
        kn0.p pVar;
        r45.fc2 result = (r45.fc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        tn0.w0 w0Var = dk2.ef.f314911d;
        java.lang.Boolean valueOf = (w0Var == null || (pVar = w0Var.D) == null) ? null : java.lang.Boolean.valueOf(pVar.i());
        df2.yi yiVar = this.f313313b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yiVar.f313403m, "isNormalMode=" + valueOf + ", recevie msg = " + pm0.b0.g(result));
        yiVar.f313404n = result.m75934xbce7f2f(1);
        dk2.tb tbVar = dk2.ef.f314925k;
        r45.ec2 ec2Var = new r45.ec2();
        ec2Var.set(0, yiVar.f313404n);
        tbVar.h(43, ec2Var);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE) || (uj1Var = (r45.uj1) result.m75936x14adae67(0)) == null) {
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20127);
        ch1Var.set(4, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(uj1Var.mo14344x5f01b1f6()));
        dk2.x6 x6Var = new dk2.x6(ch1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) yiVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
        if (mgVar != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(x6Var);
            mgVar.I1(linkedList);
        }
    }
}
