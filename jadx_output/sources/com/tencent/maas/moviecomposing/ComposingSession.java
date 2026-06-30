package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class ComposingSession {
    private final com.facebook.jni.HybridData mHybridData;
    private com.tencent.maas.moviecomposing.Project project;
    private final com.tencent.maas.moviecomposing.Timeline timeline;

    private ComposingSession(com.facebook.jni.HybridData hybridData, com.tencent.maas.moviecomposing.Project project, com.tencent.maas.moviecomposing.Timeline timeline) {
        this.mHybridData = hybridData;
        this.project = project;
        this.timeline = timeline;
    }

    private native com.facebook.jni.HybridData initHybrid(com.tencent.maas.moviecomposing.Project project, boolean z17);

    private native boolean nativeCanRedo();

    private native boolean nativeCanUndo();

    private native com.tencent.maas.moviecomposing.Timeline nativeCreateTimeline(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2);

    private native int nativeGetCurrentComposingStepIndex();

    private native int nativeGetMaxComposingStepIndex();

    private native boolean nativeIsClipSegmentMutated(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    private native com.tencent.maas.moviecomposing.TimelineOpDesc nativeRedo();

    private native void nativeTakeSnapshot(com.tencent.maas.moviecomposing.TimelineOpDesc timelineOpDesc);

    private native com.tencent.maas.moviecomposing.TimelineOpDesc nativeUndo();

    private native void nativeUpdateProject();

    public boolean a() {
        return nativeCanRedo();
    }

    public boolean b() {
        return nativeCanUndo();
    }

    public int c() {
        return nativeGetCurrentComposingStepIndex();
    }

    public int d() {
        return nativeGetMaxComposingStepIndex();
    }

    public com.tencent.maas.moviecomposing.Timeline e() {
        return this.timeline;
    }

    public boolean f(java.lang.String str, java.lang.String str2) {
        return nativeIsClipSegmentMutated(this.timeline, str, str2);
    }

    public com.tencent.maas.moviecomposing.TimelineOpDesc g() {
        return nativeRedo();
    }

    public void h(com.tencent.maas.moviecomposing.TimelineOpDesc timelineOpDesc) {
        nativeTakeSnapshot(timelineOpDesc);
    }

    public com.tencent.maas.moviecomposing.TimelineOpDesc i() {
        return nativeUndo();
    }

    public ComposingSession(com.tencent.maas.moviecomposing.Project project, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17) {
        this.mHybridData = initHybrid(project, z17);
        this.project = project;
        this.timeline = nativeCreateTimeline(mJTime, mJTime2);
    }
}
