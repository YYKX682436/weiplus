package br3;

/* loaded from: classes9.dex */
public final class e implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f23658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f23659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f23660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ br3.f f23661g;

    public e(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.storage.z3 z3Var, boolean z17, br3.f fVar) {
        this.f23658d = mMActivity;
        this.f23659e = z3Var;
        this.f23660f = z17;
        this.f23661g = fVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
        java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
        boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
        if (!com.tencent.mm.storage.z3.p4(stringExtra)) {
            ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
        } else if (((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ni(stringExtra2, stringExtra)) {
            q41.f.e(stringExtra, stringExtra2);
        }
        ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
        com.tencent.mm.ui.MMActivity mMActivity = this.f23658d;
        com.tencent.mm.ui.widget.snackbar.j.c(mMActivity.getString(com.tencent.mm.R.string.f_p), null, mMActivity, null, null);
        com.tencent.mm.storage.z3 z3Var = this.f23659e;
        if (!com.tencent.mm.storage.z3.L3(z3Var.d1()) || this.f23660f) {
            return;
        }
        boolean N4 = com.tencent.mm.storage.z3.N4(stringExtra2);
        this.f23661g.getClass();
        if (z3Var == null) {
            return;
        }
        int b17 = vh0.l2.b(mMActivity.getIntent());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", z3Var.d1());
        hashMap.put("enter_type", java.lang.Integer.valueOf(b17));
        hashMap.put("view_id", "yuanbao_recom_friend_suc");
        hashMap.put("recom_type", java.lang.Integer.valueOf(N4 ? 1 : 0));
        hashMap.put("recom_chat", stringExtra);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }
}
