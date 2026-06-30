package v31;

/* loaded from: classes7.dex */
public final class j extends gb1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77249x366c91de = 1400;

    /* renamed from: NAME */
    public static final java.lang.String f77250x24728b = "removeMiniProgramPlayableViewNew";

    @Override // gb1.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiRemoveMiniProgramPlayableViewNew", "invoke");
        B(lVar, jSONObject, i17, lVar.getF229341e());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiRemoveMiniProgramPlayableViewNew", "getViewId: " + i17);
        return i17;
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicNewPlayable.JsApiRemoveMiniProgramPlayableViewNew", "onRemoveView");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("extra") : null;
        if (optString == null) {
            optString = "";
        }
        a41.i iVar = (a41.i) i95.n0.c(a41.i.class);
        com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0 c11191xe67ddda0 = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0();
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "removePlayableView");
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, optString);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        ((a41.k) iVar).Ai(c11191xe67ddda0.f229414d, gVar2);
        ((a41.k) ((a41.i) i95.n0.c(a41.i.class))).Ni();
        return true;
    }
}
