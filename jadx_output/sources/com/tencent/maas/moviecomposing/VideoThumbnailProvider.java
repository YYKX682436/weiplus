package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class VideoThumbnailProvider extends com.tencent.maas.moviecomposing.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f48427a;
    private final com.facebook.jni.HybridData mHybridData;

    public VideoThumbnailProvider(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, android.util.Size size, boolean z17, int i17, int i18, int i19) {
        super(clipSegment);
        this.f48427a = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.mHybridData = initHybrid(size.getWidth(), size.getHeight(), z17, i17, i18, i19);
        nativeOpen(clipSegment.D(), clipSegment.f48532a.value());
    }

    private native com.facebook.jni.HybridData initHybrid(int i17, int i18, boolean z17, int i19, int i27, int i28);

    private native void nativeCancelTask(int i17);

    private native int nativeOpen(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeReopen(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeRequestThumbnailAtTime(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.NativeThumbnailEventCallback nativeThumbnailEventCallback);

    private native int nativeRequestThumbnailAtTimeRange(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.moviecomposing.NativeThumbnailEventCallback nativeThumbnailEventCallback);

    @Override // com.tencent.maas.moviecomposing.o0
    public void a() {
        java.util.Iterator it = this.f48427a.iterator();
        while (it.hasNext()) {
            b((com.tencent.maas.moviecomposing.m0) it.next());
        }
    }

    @Override // com.tencent.maas.moviecomposing.o0
    public void b(com.tencent.maas.moviecomposing.m0 m0Var) {
        java.util.Set set = this.f48427a;
        if (set.contains(m0Var)) {
            nativeCancelTask(m0Var.f48513a);
            set.remove(m0Var);
        }
    }

    @Override // com.tencent.maas.moviecomposing.o0
    public com.tencent.maas.moviecomposing.m0 d(com.tencent.maas.model.time.MJTimeRange mJTimeRange, final com.tencent.maas.moviecomposing.l0 l0Var) {
        com.tencent.maas.moviecomposing.m0 m0Var = new com.tencent.maas.moviecomposing.m0(nativeRequestThumbnailAtTimeRange(mJTimeRange, new com.tencent.maas.moviecomposing.NativeThumbnailEventCallback() { // from class: com.tencent.maas.moviecomposing.VideoThumbnailProvider$$a
            @Override // com.tencent.maas.moviecomposing.NativeThumbnailEventCallback
            public final void onThumbnailAvailable(int i17, int i18, android.graphics.Bitmap bitmap, com.tencent.maas.model.time.MJTime mJTime, int i19) {
                com.tencent.maas.moviecomposing.l0 l0Var2 = com.tencent.maas.moviecomposing.l0.this;
                if (l0Var2 != null) {
                    l0Var2.a(new com.tencent.maas.moviecomposing.m0(i17), i18, new com.tencent.maas.moviecomposing.n0(bitmap, mJTime, i19));
                }
            }
        }));
        if (!m0Var.equals(com.tencent.maas.moviecomposing.m0.f48512c) && !(!m0Var.equals(com.tencent.maas.moviecomposing.m0.f48511b))) {
            this.f48427a.add(m0Var);
        }
        return m0Var;
    }
}
