package dq1;

/* loaded from: classes8.dex */
public final class m extends dq1.a {
    public m() {
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
        ui6.f175409g = true;
        r45.m00 m00Var = new r45.m00();
        try {
            m00Var.mo11468x92b714fd(actionBuffer.g());
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = m00Var.f461573d;
            b1Var.f398545a = m00Var.f461574e;
            b1Var.f398555f = m00Var.f461575f;
            b1Var.f398549c = m00Var.f461576g;
            b1Var.f398567l = m00Var.f461578i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            b1Var.f398574s = c11812xa040dc98;
            c11812xa040dc98.f158856e = m00Var.f461579m;
            c11812xa040dc98.f158855d = 8;
            b1Var.f398565k = 1065;
            b1Var.L = new dq1.l(new java.lang.ref.WeakReference(ui6));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeMiniProgram", "WeAppOpenBundle init, appid = " + b1Var.f398547b + ", username = " + b1Var.f398545a + ", enterPath = " + b1Var.f398555f + ", versionType = " + b1Var.f398549c);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(ui6.mo55332x76847179(), b1Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ui6.f175410h;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeMiniProgram", "e = " + e17.getMessage());
            return false;
        }
    }
}
