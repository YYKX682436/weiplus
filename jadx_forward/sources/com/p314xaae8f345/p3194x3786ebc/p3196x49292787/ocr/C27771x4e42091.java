package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.Utils */
/* loaded from: classes14.dex */
public class C27771x4e42091 {
    static {
        int i17 = fx5.a.f348690a;
    }

    /* renamed from: getPerspectiveWarppedImageSize */
    public static native android.util.Size m119945xfb9e075b(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46, android.graphics.PointF[] pointFArr, int i17);

    /* renamed from: warpPerspective */
    public static native android.util.Size m119946x5de7ea94(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46, android.graphics.PointF[] pointFArr, int i17, java.nio.ByteBuffer byteBuffer);

    /* renamed from: warpPerspective */
    public static com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 m119947x5de7ea94(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46, android.graphics.PointF[] pointFArr, int i17) {
        android.util.Size m119945xfb9e075b;
        java.nio.ByteBuffer allocateDirect;
        android.util.Size m119946x5de7ea94;
        if (c27752xfde37e46 == null || pointFArr == null || pointFArr.length != 4 || (m119945xfb9e075b = m119945xfb9e075b(c27752xfde37e46, pointFArr, i17)) == null || m119945xfb9e075b.getWidth() <= 0 || m119945xfb9e075b.getHeight() <= 0 || (m119946x5de7ea94 = m119946x5de7ea94(c27752xfde37e46, pointFArr, i17, (allocateDirect = java.nio.ByteBuffer.allocateDirect(m119945xfb9e075b.getWidth() * m119945xfb9e075b.getHeight() * 4)))) == null || m119946x5de7ea94.getWidth() <= 0 || m119946x5de7ea94.getHeight() <= 0) {
            return null;
        }
        return new com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46(m119946x5de7ea94.getWidth(), m119946x5de7ea94.getHeight(), c27752xfde37e46.m119879x19771aed(), allocateDirect);
    }
}
