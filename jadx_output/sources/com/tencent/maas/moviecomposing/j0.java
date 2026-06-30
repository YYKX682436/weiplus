package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class j0 extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.y f48507a;

    public j0(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, boolean z17, com.tencent.maas.moviecomposing.y yVar) {
        super(playbackSession, z17);
        this.f48507a = yVar;
    }

    @Override // com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.moviecomposing.PlaybackSession playbackSession, java.lang.Object obj) {
        java.lang.String segmentID;
        com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnSafeAreaTrackingArg onSafeAreaTrackingArg = (com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg.OnSafeAreaTrackingArg) obj;
        com.tencent.maas.moviecomposing.y yVar = this.f48507a;
        if (yVar == null || onSafeAreaTrackingArg == null) {
            return;
        }
        boolean z17 = onSafeAreaTrackingArg.isSafe;
        segmentID = onSafeAreaTrackingArg.segmentID;
        yw0.t tVar = (yw0.t) yVar;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        boolean z18 = tVar.f466594h && tVar.f466593g;
        yw0.r rVar = tVar.f466587a;
        if (!z18 && (!tVar.f466592f.isEmpty()) && !z17) {
            ((yw0.l) rVar).f466569a.f466571a.performHapticFeedback(0, 2);
        }
        tVar.f466593g = !z17;
        yw0.l lVar = (yw0.l) rVar;
        lVar.a();
        boolean z19 = tVar.f466594h && tVar.f466593g;
        java.lang.String safaPlaceTip = tVar.f466590d;
        if (z19) {
            kotlin.jvm.internal.o.f(safaPlaceTip, "safaPlaceTip");
            lVar.c(safaPlaceTip, true);
        } else {
            kotlin.jvm.internal.o.f(safaPlaceTip, "safaPlaceTip");
            lVar.c(safaPlaceTip, false);
        }
    }
}
