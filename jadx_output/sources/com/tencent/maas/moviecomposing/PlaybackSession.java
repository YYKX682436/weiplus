package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class PlaybackSession {
    private final com.tencent.maas.internal.NativeCallbackManager mCallbackManager;
    private final com.facebook.jni.HybridData mHybridData;

    /* loaded from: classes5.dex */
    public static class SegmentIDAndFrame {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.String f48397a;

        public SegmentIDAndFrame(java.lang.String str, com.tencent.maas.base.Rect2 rect2) {
            this.f48397a = str;
        }
    }

    public PlaybackSession(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(android.os.Looper.getMainLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeAddDecorationBoxes(java.util.List<com.tencent.maas.moviecomposing.DecorationBoxConfig> list);

    private native com.tencent.maas.instamovie.base.MJError nativeBeginClipSkimming(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeBeginClipSkimmingWrapper(com.tencent.maas.moviecomposing.VideoClipWrapper videoClipWrapper, int i17);

    private native void nativeBeginTrackingSafeArea(java.lang.String str, com.tencent.maas.base.Rect2 rect2, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeBindRenderView(java.lang.Object obj);

    private native com.tencent.maas.base.Vec2 nativeCalcPoint(com.tencent.maas.base.Vec2 vec2);

    private native com.tencent.maas.base.Vec2 nativeCalcRenderCoord(com.tencent.maas.base.Vec2 vec2);

    private native com.tencent.maas.base.Vec2 nativeCalcViewPoint(com.tencent.maas.base.Vec2 vec2);

    private native com.tencent.maas.model.time.MJTime nativeClipSkimToTime(com.tencent.maas.model.time.MJTime mJTime, boolean z17);

    private native void nativeClose(int i17);

    private native void nativeCommitUpdate(com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime, boolean z17, boolean z18, int i17);

    private native void nativeCommitUpdateSynthSpec(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, com.tencent.maas.model.time.MJTime mJTime, boolean z17, int i17);

    private native void nativeEndClipSkimming(int i17);

    private native void nativeEndTrackingSafeArea();

    private native void nativeFetchRenderAreaPosition(int i17);

    private native void nativeFetchRenderAreaRotation(int i17);

    private native void nativeFetchRenderAreaScale(int i17);

    private native int nativeFindHandleBoxRectCorner(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native com.tencent.maas.model.time.MJTime nativeGetCurrentPlaybackTime();

    private native com.tencent.maas.model.time.MJTimeRange nativeGetPlaybackTimeRange();

    private native com.tencent.maas.base.Rect2 nativeGetRenderFrame(java.lang.String str);

    private native com.tencent.maas.base.Vec2 nativeGetRenderNodeModelSize(java.lang.String str);

    private native java.lang.String nativeGetSegmentID(com.tencent.maas.base.Vec2 vec2);

    private native com.tencent.maas.moviecomposing.PlaybackSession.SegmentIDAndFrame nativeGetSegmentIDAndFrame(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets);

    private native boolean nativeIsHandleBoxEnabled();

    private native boolean nativeIsHandleBoxHitted(com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Rect2 rect2);

    private native com.tencent.maas.instamovie.base.MJError nativeOpen(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeOpenWithTimeline(com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime, int i17);

    private native void nativeRemoveAllDecorationBoxes();

    private native void nativeRemoveAllHandleBoxButtons();

    private native void nativeRemoveAllHandleBoxTitles();

    private native void nativeRemoveHandleBox();

    private native void nativeSetOnHandleBoxSettingsChangeCallback(int i17);

    private native void nativeSetOnMediaTimeDidChangeCallback(int i17);

    private native void nativeSetOnPlaybackDidFinishCallback(int i17);

    private native void nativeSetOnPlaybackFailCallback(int i17);

    private native void nativeShowHandleBox(java.lang.String str, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> list, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxTitle> list2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle);

    private native com.tencent.maas.model.time.MJTime nativeSkimTo(com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, boolean z18);

    private native void nativeSkipRefreshNextVideoFrame();

    private native void nativeSnapshotAtTime(com.tencent.maas.model.time.MJTime mJTime, int i17);

    private native void nativeStartPlaying(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z17, int i18);

    private native void nativeStopPlaying(int i17);

    private native com.tencent.maas.instamovie.base.MJError nativeUnbindRenderView();

    private native void nativeUpdateHandleBoxEnabled(boolean z17);

    private native void nativeUpdatePlaybackOptions(com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17, boolean z17);

    private native void nativeUpdateRenderAreaPosition(com.tencent.maas.base.Vec2 vec2);

    private native void nativeUpdateRenderAreaRotation(float f17);

    private native void nativeUpdateRenderAreaScale(float f17);

    private void updateHandleBoxEnabled(boolean z17) {
        nativeUpdateHandleBoxEnabled(z17);
    }

    public void addDecorationBoxes(java.util.List<com.tencent.maas.moviecomposing.DecorationBoxConfig> list) {
        nativeAddDecorationBoxes(list);
    }

    public com.tencent.maas.instamovie.base.MJError beginClipSkimming(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, com.tencent.maas.moviecomposing.u uVar) {
        return nativeBeginClipSkimming(clipSegment.D(), clipSegment.f48532a.value(), uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void beginTrackingSafeArea(com.tencent.maas.base.MJID mjid, com.tencent.maas.base.Rect2 rect2, com.tencent.maas.moviecomposing.y yVar) {
        nativeBeginTrackingSafeArea(mjid.value(), rect2, yVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.j0(this, false, yVar)) : -1);
    }

    public void bindRenderView(android.view.SurfaceView surfaceView) {
        if (!(surfaceView instanceof io.clipworks.displaysys.DSRenderView)) {
            throw new java.lang.IllegalArgumentException("renderView must be SDK DSRenderView");
        }
        com.tencent.maas.instamovie.base.MJError nativeBindRenderView = nativeBindRenderView(((io.clipworks.displaysys.DSRenderView) surfaceView).getDSViewProxy());
        if (nativeBindRenderView == null) {
            return;
        }
        throw new java.lang.IllegalStateException("Fail to connect to RenderView, " + nativeBindRenderView.message);
    }

    public android.graphics.PointF calcPoint(android.graphics.PointF pointF) {
        com.tencent.maas.base.Vec2 nativeCalcPoint = nativeCalcPoint(new com.tencent.maas.base.Vec2(pointF.x, pointF.y));
        return new android.graphics.PointF(nativeCalcPoint.f47799x, nativeCalcPoint.f47800y);
    }

    public android.graphics.PointF calcRenderCoord(android.graphics.PointF pointF) {
        com.tencent.maas.base.Vec2 nativeCalcRenderCoord = nativeCalcRenderCoord(new com.tencent.maas.base.Vec2(pointF.x, pointF.y));
        return new android.graphics.PointF(nativeCalcRenderCoord.f47799x, nativeCalcRenderCoord.f47800y);
    }

    public float calcRenderSpaceRotationAngle(float f17) {
        return -f17;
    }

    public android.graphics.PointF calcViewPoint(android.graphics.PointF pointF) {
        com.tencent.maas.base.Vec2 nativeCalcViewPoint = nativeCalcViewPoint(new com.tencent.maas.base.Vec2(pointF.x, pointF.y));
        return new android.graphics.PointF(nativeCalcViewPoint.f47799x, nativeCalcViewPoint.f47800y);
    }

    public float calcViewSpaceRotationAngle(float f17) {
        return -f17;
    }

    public com.tencent.maas.model.time.MJTime clipSkimToTime(com.tencent.maas.model.time.MJTime mJTime, boolean z17) {
        return nativeClipSkimToTime(mJTime, z17);
    }

    public void close(com.tencent.maas.moviecomposing.u uVar) {
        nativeClose(uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void commitUpdate(com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime, boolean z17, boolean z18, com.tencent.maas.moviecomposing.u uVar) {
        nativeCommitUpdate(timeline, mJTime, z17, z18, uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void disableHandleBox() {
        updateHandleBoxEnabled(false);
    }

    public void enableHandleBox() {
        updateHandleBoxEnabled(true);
    }

    public void endClipSkimming(com.tencent.maas.moviecomposing.u uVar) {
        nativeEndClipSkimming(uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void endTrackingSafeArea() {
        nativeEndTrackingSafeArea();
    }

    public void fetchRenderAreaPosition(com.tencent.maas.moviecomposing.w wVar) {
        nativeFetchRenderAreaPosition(wVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.f0(this, true, wVar)) : -1);
    }

    public void fetchRenderAreaRotation(com.tencent.maas.moviecomposing.v vVar) {
        nativeFetchRenderAreaScale(vVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.e0(this, true, vVar)) : -1);
    }

    public void fetchRenderAreaScale(com.tencent.maas.moviecomposing.v vVar) {
        nativeFetchRenderAreaScale(vVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.e0(this, true, vVar)) : -1);
    }

    public com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner findHandleBoxRectCorner(android.graphics.PointF pointF, com.tencent.maas.base.Rect2 rect2) {
        return com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner.fromInt(nativeFindHandleBoxRectCorner(new com.tencent.maas.base.Vec2(pointF.x, pointF.y), rect2));
    }

    public com.tencent.maas.model.time.MJTime getCurrentPlaybackTime() {
        return nativeGetCurrentPlaybackTime();
    }

    public com.tencent.maas.model.time.MJTimeRange getPlaybackTimeRange() {
        return nativeGetPlaybackTimeRange();
    }

    public com.tencent.maas.base.Rect2 getRenderFrame(com.tencent.maas.base.MJID mjid) {
        return mjid == null ? new com.tencent.maas.base.Rect2(new com.tencent.maas.base.Vec2(0.0f, 0.0f), new com.tencent.maas.base.Vec2(0.0f, 0.0f)) : nativeGetRenderFrame(mjid.value());
    }

    @java.lang.Deprecated
    public android.graphics.PointF getRenderNodeModelSize(com.tencent.maas.base.MJID mjid) {
        com.tencent.maas.base.Vec2 nativeGetRenderNodeModelSize = nativeGetRenderNodeModelSize(mjid.value());
        return new android.graphics.PointF(nativeGetRenderNodeModelSize.f47799x, nativeGetRenderNodeModelSize.f47800y);
    }

    @java.lang.Deprecated
    public com.tencent.maas.base.MJID getSegmentID(android.graphics.PointF pointF) {
        return com.tencent.maas.base.MJID.of(nativeGetSegmentID(new com.tencent.maas.base.Vec2(pointF.x, pointF.y)));
    }

    public com.tencent.maas.moviecomposing.PlaybackSession.SegmentIDAndFrame getSegmentIDAndFrame(android.graphics.PointF pointF) {
        return getSegmentIDAndFrame(pointF, new com.tencent.maas.model.MJEdgeInsets(0.0f, 0.0f, 0.0f, 0.0f));
    }

    public boolean isHandleBoxEnabled() {
        return nativeIsHandleBoxEnabled();
    }

    public boolean isHandleBoxHitted(android.graphics.PointF pointF, com.tencent.maas.base.Rect2 rect2) {
        return nativeIsHandleBoxHitted(new com.tencent.maas.base.Vec2(pointF.x, pointF.y), rect2);
    }

    public com.tencent.maas.instamovie.base.MJError open(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, com.tencent.maas.moviecomposing.u uVar) {
        return nativeOpen(synthSpecWrapper, uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public com.tencent.maas.instamovie.base.MJError openWithTimeline(com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.u uVar) {
        return nativeOpenWithTimeline(timeline, mJTime, uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void release() {
        this.mCallbackManager.removeAllCallback();
        this.mCallbackManager.removeAllCallbackWithReturnValue();
        this.mHybridData.resetNative();
    }

    public void removeAllDecorationBoxes() {
        nativeRemoveAllDecorationBoxes();
    }

    public void removeAllHandleBoxButtons() {
        nativeRemoveAllHandleBoxButtons();
    }

    public void removeAllHandleBoxTitles() {
        nativeRemoveAllHandleBoxTitles();
    }

    public void removeHandleBox() {
        nativeRemoveHandleBox();
    }

    public void setMediaTimeChangeListener(com.tencent.maas.moviecomposing.t tVar) {
        nativeSetOnMediaTimeDidChangeCallback(tVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.d0(this, tVar, false)) : -1);
    }

    public void setOnHandleBoxSettingsChangeCallback(com.tencent.maas.moviecomposing.x xVar) {
        nativeSetOnHandleBoxSettingsChangeCallback(xVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.g0(this, false, xVar)) : -1);
    }

    public void setPlaybackFailListener(com.tencent.maas.moviecomposing.a0 a0Var) {
        nativeSetOnPlaybackFailCallback(a0Var != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.i0(this, a0Var, false)) : -1);
    }

    public void setPlaybackFinishListener(com.tencent.maas.moviecomposing.b0 b0Var) {
        nativeSetOnPlaybackDidFinishCallback(b0Var != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.h0(this, b0Var, false)) : -1);
    }

    public void showHandleBox(com.tencent.maas.base.MJID mjid, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> list, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle) {
        nativeShowHandleBox(mjid.value(), list, new java.util.ArrayList(), mJEdgeInsets, mJHandleBoxBorderStyle);
    }

    public com.tencent.maas.model.time.MJTime skimTo(com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, boolean z18) {
        return nativeSkimTo(mJTime, j17, z17, z18);
    }

    public void skipRefreshNextVideoFrame() {
        nativeSkipRefreshNextVideoFrame();
    }

    public void snapshotAtTime(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.z zVar) {
        nativeSnapshotAtTime(mJTime, zVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.k0(this, zVar)) : -1);
    }

    public void startPlaying(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z17, com.tencent.maas.moviecomposing.u uVar) {
        nativeStartPlaying(mJTimeRange, mJTime, i17, z17, uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void stopPlaying(com.tencent.maas.moviecomposing.u uVar) {
        nativeStopPlaying(uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void unbindRenderView() {
        nativeUnbindRenderView();
    }

    public void updatePlaybackOptions(com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17, boolean z17) {
        nativeUpdatePlaybackOptions(mJTimeRange, i17, z17);
    }

    public void updateRenderAreaPosition(com.tencent.maas.base.Vec2 vec2) {
        nativeUpdateRenderAreaPosition(vec2);
    }

    public void updateRenderAreaRotation(float f17) {
        nativeUpdateRenderAreaRotation(f17);
    }

    public void updateRenderAreaScale(float f17) {
        nativeUpdateRenderAreaScale(f17);
    }

    public com.tencent.maas.moviecomposing.PlaybackSession.SegmentIDAndFrame getSegmentIDAndFrame(android.graphics.PointF pointF, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets) {
        return nativeGetSegmentIDAndFrame(new com.tencent.maas.base.Vec2(pointF.x, pointF.y), mJEdgeInsets);
    }

    public void showHandleBox(com.tencent.maas.base.MJID mjid, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> list, java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxTitle> list2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle) {
        nativeShowHandleBox(mjid.value(), list, list2, mJEdgeInsets, mJHandleBoxBorderStyle);
    }

    public com.tencent.maas.model.time.MJTime skimTo(com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17) {
        return skimTo(mJTime, j17, z17, false);
    }

    public com.tencent.maas.instamovie.base.MJError beginClipSkimming(com.tencent.maas.moviecomposing.VideoClipWrapper videoClipWrapper, com.tencent.maas.moviecomposing.u uVar) {
        return nativeBeginClipSkimmingWrapper(videoClipWrapper, uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public void commitUpdate(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, com.tencent.maas.model.time.MJTime mJTime, boolean z17, com.tencent.maas.moviecomposing.u uVar) {
        nativeCommitUpdateSynthSpec(synthSpecWrapper, mJTime, z17, uVar != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.moviecomposing.c0(this, uVar)) : -1);
    }

    public com.tencent.maas.model.time.MJTime skimTo(com.tencent.maas.model.time.MJTime mJTime, boolean z17, boolean z18) {
        return nativeSkimTo(mJTime, 0L, z17, z18);
    }

    public com.tencent.maas.model.time.MJTime skimTo(com.tencent.maas.model.time.MJTime mJTime, boolean z17) {
        return skimTo(mJTime, 0L, z17, false);
    }
}
