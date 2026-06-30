package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class a extends com.tencent.maas.instamovie.MJSegment {
    public a(com.tencent.maas.internal.MJClipSegmentInfo mJClipSegmentInfo, com.tencent.maas.instamovie.MJMovieSession mJMovieSession) {
        super(mJClipSegmentInfo.f48211a, 3, mJMovieSession);
    }

    public com.tencent.maas.model.time.MJTimeRange a() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession = (com.tencent.maas.instamovie.MJMovieSession) this.f48166b.get();
        return mJMovieSession == null ? com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange : mJMovieSession.getSegmentTimeRangeInClip(this.f48165a);
    }

    public com.tencent.maas.model.time.MJTimeRange b() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession = (com.tencent.maas.instamovie.MJMovieSession) this.f48166b.get();
        return mJMovieSession == null ? com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange : mJMovieSession.getSegmentTimeRangeInTimeline(this.f48165a);
    }
}
