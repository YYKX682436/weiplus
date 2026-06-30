package dq1;

/* loaded from: classes8.dex */
public final class i extends dq1.a {
    public i() {
        dq1.u[] uVarArr = dq1.u.f323891d;
    }

    @Override // dq1.k
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 ui6, dq1.b context, com.p314xaae8f345.mm.p2495xc50a8b8b.g actionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f323886a;
        if (!pVar.a(dq1.c.f323880e, context, pVar.b())) {
            return false;
        }
        r45.n00 n00Var = new r45.n00();
        try {
            n00Var.mo11468x92b714fd(actionBuffer.g());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSchemeH5NoLoginPage", "urlActionBuffer.url:" + n00Var.f462504d);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", n00Var.f462504d);
            intent.putExtra("showShare", false);
            intent.putExtra("KRightBtn", true);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
            intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
            j45.l.j(ui6, "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ui6.f175410h;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeH5NoLoginPage", "e = " + e17.getMessage());
            return false;
        }
    }
}
