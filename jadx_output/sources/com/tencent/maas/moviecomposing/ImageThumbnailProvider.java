package com.tencent.maas.moviecomposing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ImageThumbnailProvider extends com.tencent.maas.moviecomposing.o0 {
    private final com.facebook.jni.HybridData mHybridData;

    public ImageThumbnailProvider(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, android.util.Size size) {
        super(clipSegment);
        this.mHybridData = initHybrid(clipSegment.D(), clipSegment.f48532a.value(), size.getWidth(), size.getHeight());
    }

    private native com.facebook.jni.HybridData initHybrid(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, int i17, int i18);

    private native void nativeCancelAllTasks();

    private native void nativeCancelTask(int i17);

    private native int nativeRequestThumbnail(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.moviecomposing.NativeThumbnailEventCallback nativeThumbnailEventCallback);

    @Override // com.tencent.maas.moviecomposing.o0
    public void a() {
        nativeCancelAllTasks();
    }

    @Override // com.tencent.maas.moviecomposing.o0
    public void b(com.tencent.maas.moviecomposing.m0 m0Var) {
        nativeCancelTask(m0Var.f48513a);
    }

    @Override // com.tencent.maas.moviecomposing.o0
    public com.tencent.maas.moviecomposing.m0 d(com.tencent.maas.model.time.MJTimeRange mJTimeRange, final com.tencent.maas.moviecomposing.l0 l0Var) {
        return new com.tencent.maas.moviecomposing.m0(nativeRequestThumbnail(mJTimeRange, new com.tencent.maas.moviecomposing.NativeThumbnailEventCallback() { // from class: com.tencent.maas.moviecomposing.ImageThumbnailProvider$$a
            @Override // com.tencent.maas.moviecomposing.NativeThumbnailEventCallback
            public final void onThumbnailAvailable(int i17, int i18, android.graphics.Bitmap bitmap, com.tencent.maas.model.time.MJTime mJTime, int i19) {
                com.tencent.maas.moviecomposing.l0 l0Var2 = com.tencent.maas.moviecomposing.l0.this;
                if (l0Var2 != null) {
                    l0Var2.a(new com.tencent.maas.moviecomposing.m0(i17), i18, new com.tencent.maas.moviecomposing.n0(bitmap, mJTime, i19));
                }
            }
        }));
    }
}
