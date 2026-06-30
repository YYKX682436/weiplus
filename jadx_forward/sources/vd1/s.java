package vd1;

/* loaded from: classes7.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77298x366c91de = 108;

    /* renamed from: NAME */
    public static final java.lang.String f77299x24728b = "reportRealtimeAction";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        try {
            C((ze.n) d0Var.t3(), d0Var instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b ? (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) d0Var : (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) d0Var).W0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b.class), jSONObject);
            d0Var.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportRealtimeAction", "report by service(%s), e = %s", d0Var.mo48798x74292566(), e17);
            d0Var.a(i17, o("fail:internal error"));
        }
    }

    public final void C(ze.n nVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("actionData");
        r45.uc7 uc7Var = new r45.uc7();
        uc7Var.f468764d = 2;
        uc7Var.f468765e = nVar.f156336n;
        uc7Var.f468767g = 0;
        uc7Var.f468768h = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        uc7Var.f468769i = 0;
        uc7Var.f468770m = optString;
        uc7Var.f468771n = nVar.E0().f387385r.f156932d + 1;
        uc7Var.f468773p = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        uc7Var.f468772o = nVar.u0().f128809v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = nVar.l2();
        uc7Var.f468774q = l27.f169323f;
        uc7Var.f468776s = l27.f169324g;
        uc7Var.f468778u = l27.f169321d;
        uc7Var.f468779v = l27.f169322e;
        uc7Var.f468775r = l27.f169325h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y g17 = nVar.x0().mo51924x62662257().g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v o17 = bVar != null ? g17.o(bVar) : g17.mo52410x34715b();
        java.lang.String str = o17.f169647b;
        uc7Var.f468766f = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.w wVar = o17.f169649d;
        uc7Var.f468777t = wVar == null ? null : wVar.f169650a;
        uc7Var.f468780w = g17.c(str) ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportRealtimeAction", "report(%s), path %s, appState %d, sessionId %s, scene %d, sceneNote %s, preScene %d, preSceneNote %s, usedState %d, referPath %s, isEntrance %d", nVar.f156336n, uc7Var.f468766f, java.lang.Integer.valueOf(uc7Var.f468771n), uc7Var.f468772o, java.lang.Integer.valueOf(uc7Var.f468774q), uc7Var.f468776s, java.lang.Integer.valueOf(uc7Var.f468778u), uc7Var.f468779v, java.lang.Integer.valueOf(uc7Var.f468775r), uc7Var.f468777t, java.lang.Integer.valueOf(uc7Var.f468780w));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d3) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c3.f169356a.mo152xb9724478()).b(uc7Var);
    }
}
