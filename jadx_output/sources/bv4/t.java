package bv4;

/* loaded from: classes8.dex */
public class t extends com.tencent.mm.sdk.event.n {
    public t() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.PreLoadWebSearchDataEvent preLoadWebSearchDataEvent = (com.tencent.mm.autogen.events.PreLoadWebSearchDataEvent) iEvent;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            try {
                com.tencent.mm.plugin.websearch.w1 w1Var = (com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class);
                if (w1Var == null) {
                    com.tencent.mars.xlog.Log.e("PreloadWebSearchDataLsn", "PluginWebSearch service is null, skip preGetData");
                } else {
                    su4.u0 Zi = w1Var.Zi();
                    am.qo qoVar = preLoadWebSearchDataEvent.f54623g;
                    ((com.tencent.mm.plugin.websearch.a0) Zi).e(qoVar.f7729e, qoVar.f7725a, qoVar.f7726b, qoVar.f7727c, qoVar.f7728d, qoVar.f7730f, qoVar.f7731g, qoVar.f7732h, qoVar.f7736l, qoVar.f7733i, qoVar.f7734j, qoVar.f7735k);
                }
                return false;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("PreloadWebSearchDataLsn", "preGetData exception: %s", e17.getMessage());
                return false;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("reqId", preLoadWebSearchDataEvent.f54623g.f7729e);
        am.qo qoVar2 = preLoadWebSearchDataEvent.f54623g;
        bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, qoVar2.f7725a);
        bundle.putString("subSessionId", qoVar2.f7726b);
        bundle.putString("query", qoVar2.f7727c);
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, qoVar2.f7728d);
        bundle.putString("parentSearchID", qoVar2.f7730f);
        bundle.putString("sugId", qoVar2.f7731g);
        bundle.putInt("sceneActionType", qoVar2.f7732h);
        bundle.putInt("businessType", qoVar2.f7736l);
        bundle.putInt("chatSearch", qoVar2.f7733i);
        bundle.putString("reqKey", qoVar2.f7734j);
        bundle.putSerializable("extParams", qoVar2.f7735k != null ? new java.util.HashMap(qoVar2.f7735k) : null);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, bv4.s.class, null);
        return false;
    }
}
