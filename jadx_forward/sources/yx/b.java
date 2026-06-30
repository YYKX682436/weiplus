package yx;

/* loaded from: classes14.dex */
public final class b implements fl5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed f548537a;

    public b(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed) {
        this.f548537a = activityC10499xbd0fa9ed;
    }

    @Override // fl5.g
    public final boolean a(fl5.i iVar, int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548537a;
        if (i17 != 4 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "_setOnEditorActionListener false");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC10499xbd0fa9ed.f146814g;
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(c22621x7603e017 != null ? c22621x7603e017.getText() : null)).toString();
        if (obj.length() > 0) {
            ay.l lVar = activityC10499xbd0fa9ed.f146813f;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
                throw null;
            }
            hy.a0 a0Var = lVar.f96686h;
            if (a0Var != null) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b.j(obj, 0, a0Var.f367254a);
            }
            lVar.Q6(false, false);
            lVar.f96693n.f539373m.f539376a++;
            int length = obj.length();
            xx.y yVar = activityC10499xbd0fa9ed.f146816i;
            yVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportUserSendQuestionWithWordCnt");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_user_send_question", yVar.a(yVar.f539370j, new xx.u(length)), 36708);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC10499xbd0fa9ed.f146814g;
            if (c22621x7603e0172 != null) {
                c22621x7603e0172.setText("");
            }
        }
        activityC10499xbd0fa9ed.mo48674x36654fab();
        return true;
    }
}
