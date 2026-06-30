package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class z extends com.tencent.mm.plugin.appbrand.jsapi.n5 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "WVAAppEvent";

    public z(java.lang.String appId, java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        t(kz5.c1.k(new jz5.l("appId", appId), new jz5.l("event", event), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, data)));
    }
}
