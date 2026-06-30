package av4;

/* loaded from: classes.dex */
public final class b0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.b0 f14266d = new av4.b0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        double doubleValue;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenWXSearchHalfPageJSApi", "handleMsg params:" + msg.f340790a);
        java.util.Map map = msg.f340790a;
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "query");
        int e18 = com.tencent.mm.plugin.websearch.l2.e(map, "hiddenSearchHeader", 0);
        java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(map, "webviewHeightRatio");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f18)) {
            try {
                doubleValue = java.lang.Double.valueOf(f18).doubleValue();
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.plugin.websearch.l2.c(map, "forceFullPageSearch", true);
            boolean c17 = com.tencent.mm.plugin.websearch.l2.c(map, "allowGestureClose", true);
            boolean c18 = com.tencent.mm.plugin.websearch.l2.c(map, "halfScreenAdjustable", false);
            int e19 = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
            java.lang.String f19 = com.tencent.mm.plugin.websearch.l2.f(map, "thirdExtParam");
            java.lang.String f27 = com.tencent.mm.plugin.websearch.l2.f(map, "extReqParams");
            android.content.Intent a17 = su4.r2.a();
            a17.putExtra("key_load_js_without_delay", true);
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams(e17, e19), av4.x.class, new av4.a0(e17, f17, f19, e19, f27, e18, c18, a17, env, doubleValue, c17));
            return true;
        }
        doubleValue = 0.7d;
        com.tencent.mm.plugin.websearch.l2.c(map, "forceFullPageSearch", true);
        boolean c172 = com.tencent.mm.plugin.websearch.l2.c(map, "allowGestureClose", true);
        boolean c182 = com.tencent.mm.plugin.websearch.l2.c(map, "halfScreenAdjustable", false);
        int e192 = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
        java.lang.String f192 = com.tencent.mm.plugin.websearch.l2.f(map, "thirdExtParam");
        java.lang.String f272 = com.tencent.mm.plugin.websearch.l2.f(map, "extReqParams");
        android.content.Intent a172 = su4.r2.a();
        a172.putExtra("key_load_js_without_delay", true);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams(e17, e192), av4.x.class, new av4.a0(e17, f17, f192, e192, f272, e18, c182, a172, env, doubleValue, c172));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openWXSearchHalfPage";
    }
}
