package yx;

/* loaded from: classes5.dex */
public final class a implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed f548535d;

    public a(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed) {
        this.f548535d = activityC10499xbd0fa9ed;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548535d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "height: " + i17 + ", isResized: " + z17);
        android.view.View findViewById = activityC10499xbd0fa9ed.findViewById(com.p314xaae8f345.mm.R.id.j8c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ly.g.c((android.view.ViewGroup) findViewById, 200L, null, null, null, null, kz5.c0.j(activityC10499xbd0fa9ed.f146815h), new yx.k(activityC10499xbd0fa9ed, i17), 30, null);
        if (i17 > 0) {
            xx.y yVar = activityC10499xbd0fa9ed.f146816i;
            yVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportUserClickField");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_click_chat_clk", xx.y.b(yVar, yVar.f539370j, null, 2, null), 36708);
        }
    }
}
