package c23;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.o f38049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c23.o oVar) {
        super(1);
        this.f38049d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof b23.b)) {
            this.f38049d.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "10000");
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            kotlin.jvm.internal.o.f(f17, "getCurrentLanguage(...)");
            hashMap.put("lang", f17);
            hashMap.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
            hashMap.put("version", java.lang.String.valueOf(com.tencent.mm.plugin.websearch.l2.g(9).b()));
            hashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mm.plugin.websearch.l2.b());
            java.lang.String CLIENT_VERSION = com.tencent.mm.sdk.platformtools.z.f193111g;
            kotlin.jvm.internal.o.f(CLIENT_VERSION, "CLIENT_VERSION");
            hashMap.put("wechatVersion", CLIENT_VERSION);
            hashMap.put("nativeHeight", "0");
            float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (!(q17 == 1.0f)) {
                if (!(q17 == 0.8f)) {
                    if (!(q17 == 1.1f)) {
                        if (!(q17 == 1.12f)) {
                            if (!(q17 == 1.125f)) {
                                if (!(q17 == 1.4f)) {
                                    if (!(q17 == 1.55f)) {
                                        if (!(q17 == 1.65f)) {
                                            q17 = 1.0f;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            hashMap.put("fontRatio", java.lang.String.valueOf(q17));
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.lang.String.valueOf(o13.p.f342250c));
            o13.p.f342251d = o13.n.g(3);
            hashMap.put("entranceExptValue", "2");
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "103");
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "" + o13.p.f342251d);
            hashMap.put("subSessionId", "" + o13.p.f342250c);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
            stringBuffer.append(com.tencent.mm.plugin.websearch.l2.g(9).l());
            stringBuffer.append("/app.html?");
            stringBuffer.append(com.tencent.mm.plugin.websearch.l2.k(hashMap));
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "getHotSearchUrl， rawurl, urlBuffer.toString() = " + ((java.lang.Object) stringBuffer));
            java.lang.String stringBuffer2 = stringBuffer.toString();
            kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
            state.f17385e = stringBuffer2;
        }
        return jz5.f0.f302826a;
    }
}
