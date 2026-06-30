package bq;

/* loaded from: classes.dex */
public final class f0 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String finderUsername, java.util.List list) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        r45.o51 o51Var = new r45.o51();
        o51Var.set(2, finderUsername);
        if (list != null) {
            o51Var.getList(3).addAll(list);
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.A9).getValue()).r()).intValue() == 1) {
            o51Var.set(4, java.lang.Integer.valueOf(o51Var.getInteger(4) | 1));
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B9).getValue()).r()).intValue() == 1) {
            o51Var.set(4, java.lang.Integer.valueOf(o51Var.getInteger(4) | 2));
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 21564;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetdiagnosisdata";
        lVar.f70664a = o51Var;
        lVar.f70665b = new r45.p51();
        p(lVar.a());
    }
}
