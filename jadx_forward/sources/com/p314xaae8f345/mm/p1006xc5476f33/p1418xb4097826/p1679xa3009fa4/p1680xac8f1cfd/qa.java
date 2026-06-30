package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 f217211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711) {
        super(1);
        this.f217211d = c15449xa84711;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gr.a0 a0Var = (gr.a0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711 = this.f217211d;
        c15449xa84711.getClass();
        if (c15449xa84711.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) {
            java.lang.String ProductID = ((so2.p) a0Var).f492068d.f113989d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ProductID, "ProductID");
            qk.c0 c0Var = new qk.c0(ProductID);
            c0Var.f445731g = 106;
            c0Var.f445688a = 57;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderEmojiListUIC", "emoticon liteapp service not found");
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(c15449xa84711.m80379x76847179(), c0Var);
            }
        } else if (c15449xa84711.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13945xb319c50) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            c19786x6a1e2862.m76550x2592a27b(3);
            c19786x6a1e2862.m76527x75c48317(6);
            bw5.ra raVar = ((so2.p) a0Var).f492068d;
            c19786x6a1e2862.m76570xc2385d6(raVar.f113991f);
            c19786x6a1e2862.m76561xb5ff6fa9("表情专辑");
            c19786x6a1e2862.m76567x22dcbf1d(1);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 c19801x2fd32185 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185();
            c19801x2fd32185.m77229xd89c28a0(6);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("productId", raVar.f113989d);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, raVar.f113991f);
            c19801x2fd32185.m77230x8be9d4f8(jSONObject.toString());
            c19786x6a1e2862.m76553xd896fe14(c19801x2fd32185);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("JUMP_INFO", c19786x6a1e2862.mo14344x5f01b1f6());
            c15449xa84711.m158354x19263085().setResult(-1, intent);
            c15449xa84711.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
