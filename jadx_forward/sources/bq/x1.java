package bq;

/* loaded from: classes.dex */
public final class x1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.lang.String finderUsername, java.lang.String templateId) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        r45.c13 c13Var = new r45.c13();
        c13Var.set(2, finderUsername);
        c13Var.set(3, templateId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 20077;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderunpublishcreatortemplate";
        lVar.f152197a = c13Var;
        lVar.f152198b = new r45.d13();
        p(lVar.a());
    }
}
