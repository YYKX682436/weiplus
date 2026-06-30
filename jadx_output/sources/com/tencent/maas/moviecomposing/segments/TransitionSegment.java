package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class TransitionSegment extends com.tencent.maas.moviecomposing.segments.Segment {
    public static com.tencent.maas.moviecomposing.segments.TransitionDesc E(com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return transitionSegment.nativeGetTransitionDesc(timeline, transitionSegment.f48532a.value());
    }

    public static java.lang.Object F(com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.Timeline timeline) {
        transitionSegment.nativeSetDuration(timeline, transitionSegment.f48532a.value(), mJTime);
        return null;
    }

    public static java.lang.Boolean G(com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment, com.tencent.maas.moviecomposing.Timeline timeline) {
        return java.lang.Boolean.valueOf(transitionSegment.nativeIsBlankTransition(timeline, transitionSegment.f48532a.value()));
    }

    public static java.lang.Object H(com.tencent.maas.moviecomposing.segments.TransitionSegment transitionSegment, com.tencent.maas.moviecomposing.segments.TransitionDesc transitionDesc, com.tencent.maas.moviecomposing.Timeline timeline) {
        transitionSegment.nativeSetTransitionDesc(timeline, transitionSegment.f48532a.value(), transitionDesc);
        return null;
    }

    private native com.tencent.maas.moviecomposing.segments.TransitionDesc nativeGetTransitionDesc(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsBlankTransition(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsTransitionEnabled(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeSetDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeSetTransitionDesc(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, com.tencent.maas.moviecomposing.segments.TransitionDesc transitionDesc);

    private native com.tencent.maas.model.time.MJTimeRange nativeUsableDurationRange(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    public com.tencent.maas.moviecomposing.segments.TransitionDesc I() {
        return (com.tencent.maas.moviecomposing.segments.TransitionDesc) u(null, new r.a() { // from class: ug.o$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.TransitionSegment.E(com.tencent.maas.moviecomposing.segments.TransitionSegment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }
}
