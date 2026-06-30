package sc1;

/* loaded from: classes7.dex */
public class z extends gb1.d {

    /* renamed from: CTRL_INDEX */
    private static final int f76768x366c91de = 364;

    /* renamed from: NAME */
    public static final java.lang.String f76769x24728b = "insertLivePlayer";

    @Override // gb1.d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        sc1.m1.a();
        if (lVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class) == null || !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2) lVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.q2.class)).g4()) {
            B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePlayer", "wx assistant is enabled, return");
        java.lang.String str = android.text.TextUtils.isEmpty("fail:wx assistant is enabled.") ? "fail:internal error" : "fail:wx assistant is enabled.";
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("livePlayerId");
    }

    @Override // gb1.d
    public android.view.View K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505 c12072x6098f505 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505(tVar.mo50352x76847179(), new sc1.f(tVar, tVar.mo50352x76847179()));
        c12072x6098f505.setBackgroundColor(-16777216);
        return c12072x6098f505;
    }

    @Override // gb1.d
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        android.content.Context context;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePlayer", "onInsertView livePlayerId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertLivePlayer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.p2926x359365.C25481x77f18081.m94465x74dac979(java.lang.String.format("weixin_%s", tVar.mo48798x74292566()));
        sc1.f fVar = (sc1.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(sc1.f.class);
        sc1.m mVar = new sc1.m(this, fVar);
        sc1.n nVar = new sc1.n(this, fVar);
        sc1.o oVar = new sc1.o(this, tVar, fVar);
        sc1.p pVar = new sc1.p(this, fVar, tVar);
        tVar.U(nVar);
        tVar.R(oVar);
        tVar.w(pVar);
        fVar.m164237xda608282(new sc1.q(this, tVar, jSONObject.optBoolean("independent", false), i17, mVar));
        fVar.m164236x20be7174(new sc1.r(this, tVar, oVar, nVar));
        fVar.m164238x9a7d1962(jSONObject.optBoolean("needEvent", false));
        fVar.m164239x679d6c40(new sc1.s(this, i17, tVar));
        android.os.Bundle a17 = sc1.n1.a(jSONObject);
        sc1.k1 k17 = ((sc1.o1) fVar.f487193e).k(fVar, a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "onInsert code:%d info:%s", java.lang.Integer.valueOf(k17.f487221a), k17.f487222b);
        fVar.m164240x7eb26e58(new sc1.t(this, i17, tVar));
        fVar.m164235x4a155f40(new sc1.u(this, i17, tVar));
        if (a17.getInt("mode", 0) == 5) {
            context = view.getContext();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571553io;
        } else {
            context = view.getContext();
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571552in;
        }
        fVar.setContentDescription(context.getString(i18));
    }
}
