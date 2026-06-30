package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class il implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jl f228565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f228566b;

    public il(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jl jlVar, int i17) {
        this.f228565a = jlVar;
        this.f228566b = i17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public final void mo48650xaf6b9ae9(android.view.View view) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jl jlVar = this.f228565a;
        r45.wv3 wv3Var = jlVar.f228599d;
        if (wv3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hbEnvelopSource");
            throw null;
        }
        java.lang.String str = wv3Var.f471033f;
        if (str == null) {
            str = "";
        }
        hashMap.put("key_red_packet_preview_material_id", str);
        hashMap.put("key_red_packet_preview_scene", "1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click preview ： ");
        r45.wv3 wv3Var2 = jlVar.f228599d;
        if (wv3Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hbEnvelopSource");
            throw null;
        }
        sb6.append(wv3Var2.f471033f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeItemDetailUI", sb6.toString());
        int intExtra = jlVar.m158359x1e885992().getIntExtra("key_source_original_pos", -1);
        java.lang.String stringExtra = jlVar.m158359x1e885992().getStringExtra("key_source_original_coverid");
        java.lang.String stringExtra2 = jlVar.m158359x1e885992().getStringExtra("key_source_sessionid");
        int intExtra2 = jlVar.m158359x1e885992().getIntExtra("key_source_cover_count", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = 3;
        objArr[1] = java.lang.Integer.valueOf(intExtra + 1);
        objArr[2] = java.lang.Integer.valueOf(this.f228566b + 1);
        objArr[3] = stringExtra;
        r45.wv3 wv3Var3 = jlVar.f228599d;
        if (wv3Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hbEnvelopSource");
            throw null;
        }
        objArr[4] = wv3Var3.f471033f;
        objArr[5] = stringExtra2;
        objArr[6] = java.lang.Integer.valueOf(intExtra2);
        objArr[7] = 2;
        g0Var.d(18892, objArr);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.j) ((mh0.n) i95.n0.c(mh0.n.class))).Ai(jlVar.m80379x76847179(), hashMap);
    }
}
