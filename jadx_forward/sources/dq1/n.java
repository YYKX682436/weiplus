package dq1;

/* loaded from: classes8.dex */
public final class n extends dq1.a {
    public n() {
        dq1.u[] uVarArr = dq1.u.f323891d;
    }

    @Override // dq1.k
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 ui6, dq1.b context, com.p314xaae8f345.mm.p2495xc50a8b8b.g actionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBuffer, "actionBuffer");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeQQAssistantProfile", "handle BizSchemeQQAssistantProfile");
        dq1.p pVar = dq1.p.f323886a;
        if (!pVar.a(dq1.c.f323879d, context, pVar.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSchemeQQAssistantProfile", "contextSelfCheck failed");
            return false;
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20305xd648a222()) != 1 || c01.e2.a0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizSchemeQQAssistantProfile", "QQAssistant closed");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeQQAssistantProfile", "ready to jump QQAssistant from deeplink.");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "gh_051d9102de63");
        intent.putExtra("Contact_NeedBackToLauncherUI", true);
        intent.addFlags(268435456);
        j45.l.j(ui6.mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeQQAssistantProfile", "start QQAssistant from BizSchemeQQAssistantProfile.");
        return true;
    }
}
