package bq;

/* loaded from: classes.dex */
public final class j1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String username, int i17, long j17, long j18, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.as2 as2Var = new r45.as2();
        as2Var.set(1, username);
        as2Var.set(3, java.lang.Integer.valueOf(i17));
        as2Var.set(4, java.lang.Long.valueOf(j17));
        as2Var.set(5, java.lang.Long.valueOf(j18));
        as2Var.set(2, db2.t4.f228171a.a(258));
        lVar.f70664a = as2Var;
        r45.bs2 bs2Var = new r45.bs2();
        bs2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bs2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = bs2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderqrcode";
        lVar.f70667d = 258;
        p(lVar.a());
    }
}
