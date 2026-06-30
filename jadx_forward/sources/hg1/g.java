package hg1;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f69838x366c91de = 819;

    /* renamed from: NAME */
    public static final java.lang.String f69839x24728b = "operateXWebVideoBackground";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b(i17, jSONObject, lVar, this);
        tf1.f a17 = tf.k.a(bVar);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "audioOfVideoBackgroundPlayManager is null");
            lVar.a(i17, o("fail:audioOfVideoBackgroundPlayManager is null"));
            return;
        }
        tf.q g17 = a17.g();
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "videoPlayer is null. data:%s", jSONObject.toString());
            lVar.a(i17, o("fail:videoPlayer is null"));
        } else if (g17 instanceof bg.f) {
            ((bg.f) g17).f(bVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOperateXWebVideoBackground", "videoPlayer is not VideoPluginHandler");
            lVar.a(i17, o("fail:videoPlayer is not for XwebVideo"));
        }
    }
}
