package bq;

/* loaded from: classes.dex */
public final class x1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.lang.String finderUsername, java.lang.String templateId) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        r45.c13 c13Var = new r45.c13();
        c13Var.set(2, finderUsername);
        c13Var.set(3, templateId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 20077;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderunpublishcreatortemplate";
        lVar.f70664a = c13Var;
        lVar.f70665b = new r45.d13();
        p(lVar.a());
    }
}
