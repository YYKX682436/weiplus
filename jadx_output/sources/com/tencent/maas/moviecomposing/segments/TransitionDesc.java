package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class TransitionDesc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48534a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48535b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48536c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48537d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48538e;

    private TransitionDesc(java.lang.String str, boolean z17, boolean z18, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, com.tencent.maas.model.time.MJTime mJTime3) {
        this.f48534a = str;
        this.f48535b = z17;
        this.f48536c = mJTime;
        this.f48537d = mJTime2;
        this.f48538e = mJTime3;
    }

    public static com.tencent.maas.moviecomposing.segments.TransitionDesc a() {
        return nativeMakeBlankTransitionDesc();
    }

    public static com.tencent.maas.moviecomposing.segments.TransitionDesc b(java.lang.String str) {
        return nativeMakeTransitionDesc(str);
    }

    private static native com.tencent.maas.moviecomposing.segments.TransitionDesc nativeMakeBlankTransitionDesc();

    private static native com.tencent.maas.moviecomposing.segments.TransitionDesc nativeMakeTransitionDesc(java.lang.String str);

    public com.tencent.maas.model.time.MJTime getSuggestedTotalDuration() {
        return this.f48536c;
    }

    public com.tencent.maas.model.time.MJTime getSuggestedTransInDuration() {
        return this.f48537d;
    }

    public com.tencent.maas.model.time.MJTime getSuggestedTransOutDuration() {
        return this.f48538e;
    }

    public java.lang.String getTransitionID() {
        return this.f48534a;
    }
}
