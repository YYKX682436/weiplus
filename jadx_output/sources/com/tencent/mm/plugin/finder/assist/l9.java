package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class l9 {
    public final void a(java.lang.String exportId) {
        kotlin.jvm.internal.o.g(exportId, "exportId");
        com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo searchFinderViewEventNotifier$OnSearchFinderViewInfo = new com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo();
        searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101992d = "onFinderFeedFocusChange";
        searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101993e = "{\"currentTid\": \"" + exportId + "\"}";
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SearchFinderViewEvent", "disable tools");
            new com.tencent.mm.plugin.finder.assist.k9().invoke(searchFinderViewEventNotifier$OnSearchFinderViewInfo, null);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.o(com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SearchFinderViewEvent", "tools not exits");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchFinderViewEvent", "send tools");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools", searchFinderViewEventNotifier$OnSearchFinderViewInfo, com.tencent.mm.plugin.finder.assist.k9.class, null);
    }

    public final void b(java.lang.String exportId) {
        kotlin.jvm.internal.o.g(exportId, "exportId");
        com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo searchFinderViewEventNotifier$OnSearchFinderViewInfo = new com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo();
        searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101992d = "onFinderFeedNegativeFeedback";
        searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101993e = "{\"currentTid\": \"" + exportId + "\"}";
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SearchFinderViewEvent", "disable tools");
            new com.tencent.mm.plugin.finder.assist.k9().invoke(searchFinderViewEventNotifier$OnSearchFinderViewInfo, null);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.o(com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SearchFinderViewEvent", "tools not exits");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchFinderViewEvent", "send tools");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b + ":tools", searchFinderViewEventNotifier$OnSearchFinderViewInfo, com.tencent.mm.plugin.finder.assist.k9.class, null);
    }
}
