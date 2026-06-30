package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public abstract class o0 {
    public o0(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
    }

    public static com.tencent.maas.moviecomposing.o0 c(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, android.util.Size size, boolean z17) {
        clipSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        int intValue = (D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.C0(clipSegment, D) : -1).intValue();
        if (intValue == 0) {
            return new com.tencent.maas.moviecomposing.VideoThumbnailProvider(clipSegment, size, z17, 0, 1, -1);
        }
        if (intValue == 2) {
            return new com.tencent.maas.moviecomposing.ImageThumbnailProvider(clipSegment, size);
        }
        throw new java.lang.IllegalArgumentException("Invalid clip segment, clip type is unknown!");
    }

    public abstract void a();

    public abstract void b(com.tencent.maas.moviecomposing.m0 m0Var);

    public abstract com.tencent.maas.moviecomposing.m0 d(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.moviecomposing.l0 l0Var);
}
