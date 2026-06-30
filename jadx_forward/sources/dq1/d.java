package dq1;

/* loaded from: classes8.dex */
public final class d extends dq1.a {
    public d() {
        dq1.u[] uVarArr = dq1.u.f323891d;
    }

    @Override // dq1.k
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 ui6, dq1.b context, com.p314xaae8f345.mm.p2495xc50a8b8b.g actionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f323886a;
        if (!pVar.a(dq1.c.f323879d, context, pVar.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderFeed", "context self check fail!");
            return false;
        }
        r45.j00 j00Var = new r45.j00();
        try {
            j00Var.mo11468x92b714fd(actionBuffer.g());
            zy2.h9 h9Var = new zy2.h9();
            h9Var.f558933a = j00Var.m75945x2fec8307(0);
            h9Var.f558936d = j00Var.m75939xb282bd08(1);
            h9Var.f558937e = j00Var.m75939xb282bd08(2);
            h9Var.f558938f = j00Var.m75939xb282bd08(3);
            h9Var.f558939g = j00Var.m75939xb282bd08(4);
            h9Var.f558940h = j00Var.m75939xb282bd08(5);
            h9Var.f558941i = j00Var.m75939xb282bd08(6);
            h9Var.f558942j = true;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j5.f183816a.a(ui6.mo55332x76847179(), h9Var);
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderFeed", "e = " + e17.getMessage());
            return false;
        }
    }
}
