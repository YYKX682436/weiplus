package bv4;

/* loaded from: classes.dex */
public class s implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            com.tencent.mm.plugin.websearch.w1 w1Var = (com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class);
            if (w1Var == null) {
                com.tencent.mars.xlog.Log.e("PreloadWebSearchDataLsn", "PreGetWebSearchDataTask: PluginWebSearch service is null, skip preGetData");
            } else {
                ((com.tencent.mm.plugin.websearch.a0) w1Var.Zi()).e(bundle.getString("reqId"), bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID), bundle.getString("subSessionId"), bundle.getString("query"), bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), bundle.getString("parentSearchID"), bundle.getString("sugId"), bundle.getInt("sceneActionType"), bundle.getInt("businessType"), bundle.getInt("chatSearch"), bundle.getString("reqKey"), (java.util.Map) bundle.getSerializable("extParams"));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("PreloadWebSearchDataLsn", "PreGetWebSearchDataTask exception: %s", e17.getMessage());
        }
    }
}
