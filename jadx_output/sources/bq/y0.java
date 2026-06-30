package bq;

/* loaded from: classes.dex */
public final class y0 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(java.lang.String finderUsername, int i17) {
        super(null, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        r45.ra1 ra1Var = new r45.ra1();
        ra1Var.set(2, finderUsername);
        ra1Var.set(3, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 17829;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetusermoreinfo";
        lVar.f70664a = ra1Var;
        lVar.f70665b = new r45.sa1();
        p(lVar.a());
    }
}
