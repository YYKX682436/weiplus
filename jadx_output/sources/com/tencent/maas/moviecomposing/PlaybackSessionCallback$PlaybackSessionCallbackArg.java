package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class PlaybackSessionCallback$PlaybackSessionCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

    /* loaded from: classes5.dex */
    public static class CompleteArg extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
        public final com.tencent.maas.instamovie.base.MJError error;

        public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class MediaTimeChangeArg extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {

        /* renamed from: a, reason: collision with root package name */
        public final com.tencent.maas.model.time.MJTime f48398a;

        /* renamed from: b, reason: collision with root package name */
        public final com.tencent.maas.model.time.MJTimeRange f48399b;

        /* renamed from: c, reason: collision with root package name */
        public final long f48400c;

        public MediaTimeChangeArg(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, long j17) {
            this.f48398a = mJTime;
            this.f48399b = mJTimeRange;
            this.f48400c = j17;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnFetchRenderAreaFloatArg extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
        public final float value;

        public OnFetchRenderAreaFloatArg(float f17) {
            this.value = f17;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnFetchRenderAreaPositionArg extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
        public final com.tencent.maas.base.Vec2 position;

        public OnFetchRenderAreaPositionArg(com.tencent.maas.base.Vec2 vec2) {
            this.position = vec2;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnHandleBoxSettingsDidChangeArg extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
        public final com.tencent.maas.moviecomposing.HandleBoxSettings handleBoxSettings;

        public OnHandleBoxSettingsDidChangeArg(com.tencent.maas.moviecomposing.HandleBoxSettings handleBoxSettings) {
            this.handleBoxSettings = handleBoxSettings;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnPlaybackDidFinishArgs extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
    }

    /* loaded from: classes5.dex */
    public static class OnPlaybackFailArgs extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
        public com.tencent.maas.instamovie.base.MJError error;

        public OnPlaybackFailArgs(com.tencent.maas.instamovie.base.MJError mJError) {
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnSafeAreaTrackingArg extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
        public final boolean isSafe;
        private final java.lang.String segmentID;

        public OnSafeAreaTrackingArg(boolean z17, java.lang.String str) {
            this.isSafe = z17;
            this.segmentID = str;
        }
    }

    /* loaded from: classes5.dex */
    public static class OnSnapshotCompleteArg extends com.tencent.maas.moviecomposing.PlaybackSessionCallback$PlaybackSessionCallbackArg {
        public final android.graphics.Bitmap bitmap;

        public OnSnapshotCompleteArg(android.graphics.Bitmap bitmap) {
            this.bitmap = bitmap;
        }
    }
}
