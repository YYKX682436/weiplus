package dq1;

/* loaded from: classes8.dex */
public final class t extends dq1.a {
    public t() {
        dq1.u[] uVarArr = dq1.u.f323891d;
    }

    @Override // dq1.k
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 ui6, dq1.b context, com.p314xaae8f345.mm.p2495xc50a8b8b.g actionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f323886a;
        if (!pVar.a(dq1.c.f323879d, context, pVar.b())) {
            return false;
        }
        r45.n00 n00Var = new r45.n00();
        try {
            n00Var.mo11468x92b714fd(actionBuffer.g());
            ab0.a Di = ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Di(ui6.mo55332x76847179(), n00Var.f462504d, 1, null, null, false, new dq1.s(new java.lang.ref.WeakReference(ui6), this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ui6.f175410h;
            if (u3Var == null) {
                return true;
            }
            u3Var.setOnCancelListener(new dq1.r(Di, ui6));
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeWWProfile", "e = " + e17.getMessage());
            return false;
        }
    }
}
