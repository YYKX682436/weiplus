package tj;

/* loaded from: classes7.dex */
public final class f extends gb1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76816x366c91de = 1196;

    /* renamed from: NAME */
    public static final java.lang.String f76817x24728b = "removeMiniProgramPlayableView";

    @Override // gb1.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "invoke");
        B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
    }

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i17 = data.getInt("viewId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "getViewId: " + i17);
        return i17;
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiRemoveMiniProgramPlayableView", "onRemoveView");
        uj.f.f509685a.a();
        return true;
    }
}
