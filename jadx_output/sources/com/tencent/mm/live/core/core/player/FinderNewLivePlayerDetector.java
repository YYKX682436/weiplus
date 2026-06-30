package com.tencent.mm.live.core.core.player;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/live/core/core/player/FinderNewLivePlayerDetector;", "Lcom/tencent/mm/live/core/core/player/FinderPageExitPlayerDetector;", "<init>", "()V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderNewLivePlayerDetector extends com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector {
    @Override // com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector, com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.lang.String g() {
        return "FinderNewLivePlayerDetector";
    }

    @Override // com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector, com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public int j() {
        return 100;
    }

    @Override // com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector, com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public boolean m() {
        return true;
    }

    @Override // com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector, com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public void o(java.util.Map leaks) {
        kotlin.jvm.internal.o.g(leaks, "leaks");
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.FinderEventDetector, com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.lang.Object q(ns5.a aVar, java.util.Map.Entry entry, com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return jz5.f0.f302826a;
    }
}
