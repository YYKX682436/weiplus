package br3;

/* loaded from: classes9.dex */
public final class e implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f105191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f105192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f105193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ br3.f f105194g;

    public e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, br3.f fVar) {
        this.f105191d = abstractActivityC21394xb3d2c0cf;
        this.f105192e = z3Var;
        this.f105193f = z17;
        this.f105194g = fVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
        java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
        boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(stringExtra)) {
            ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
        } else if (((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ni(stringExtra2, stringExtra)) {
            q41.f.e(stringExtra, stringExtra2);
        }
        ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f105191d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_p), null, abstractActivityC21394xb3d2c0cf, null, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f105192e;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(z3Var.d1()) || this.f105193f) {
            return;
        }
        boolean N4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(stringExtra2);
        this.f105194g.getClass();
        if (z3Var == null) {
            return;
        }
        int b17 = vh0.l2.b(abstractActivityC21394xb3d2c0cf.getIntent());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", z3Var.d1());
        hashMap.put("enter_type", java.lang.Integer.valueOf(b17));
        hashMap.put("view_id", "yuanbao_recom_friend_suc");
        hashMap.put("recom_type", java.lang.Integer.valueOf(N4 ? 1 : 0));
        hashMap.put("recom_chat", stringExtra);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }
}
