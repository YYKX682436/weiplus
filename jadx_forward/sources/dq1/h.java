package dq1;

/* loaded from: classes8.dex */
public final class h extends dq1.a {
    public h() {
        dq1.u[] uVarArr = dq1.u.f323891d;
    }

    @Override // dq1.k
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 ui6, dq1.b context, com.p314xaae8f345.mm.p2495xc50a8b8b.g actionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f323886a;
        if (!pVar.a(dq1.c.f323879d, context, pVar.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderProfile", "context self check fail!");
            return false;
        }
        r45.l00 l00Var = new r45.l00();
        try {
            l00Var.mo11468x92b714fd(actionBuffer.g());
            java.lang.String m75945x2fec8307 = l00Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderProfile", "exportUsername is empty!");
                return false;
            }
            zy2.i9 i9Var = new zy2.i9();
            i9Var.f558953a = l00Var.m75945x2fec8307(0);
            i9Var.f558957e = l00Var.m75939xb282bd08(3);
            i9Var.f558955c = l00Var.m75939xb282bd08(1);
            i9Var.f558956d = l00Var.m75939xb282bd08(2);
            i9Var.f558958f = true;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j5.f183816a.c(ui6.mo55332x76847179(), i9Var);
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeFinderProfile", "parse CheckExternalFinderOpenProfileActionBuffer error: e = " + e17.getMessage());
            return false;
        }
    }
}
