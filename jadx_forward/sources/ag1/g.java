package ag1;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f47x366c91de = 817;

    /* renamed from: NAME */
    public static final java.lang.String f48x24728b = "operateXWebLivePlayerBackground";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b(i17, jSONObject, lVar, this);
        tf1.f a17 = tf.k.a(bVar);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "audioOfVideoBackgroundPlayManager is null");
            lVar.a(i17, o("fail:audioOfVideoBackgroundPlayManager is null"));
            return;
        }
        tf.q g17 = a17.g();
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "videoPlayer is null");
            lVar.a(i17, o("fail:videoPlayer is null"));
        } else if (g17 instanceof wf.b) {
            ((wf.b) g17).f(bVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiOperateXWebLivePlayerBackground", "videoPlayer is not LivePlayerPluginHandler");
            lVar.a(i17, o("fail:videoPlayer is not for XWebLivePlayer"));
        }
    }
}
