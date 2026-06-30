package bq;

/* loaded from: classes.dex */
public final class j extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(java.lang.String md52, long j17) {
        super(null, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(md52, "md5");
        r45.ow0 ow0Var = new r45.ow0();
        ow0Var.set(2, md52);
        ow0Var.set(3, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 22866;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercheckemoji";
        lVar.f70664a = ow0Var;
        lVar.f70665b = new r45.pw0();
        p(lVar.a());
    }
}
