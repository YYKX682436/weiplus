package com.p314xaae8f345.p2926x359365.ui;

/* loaded from: classes14.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f296824a;

    /* renamed from: b, reason: collision with root package name */
    private final int f296825b;

    /* renamed from: c, reason: collision with root package name */
    private final int f296826c;

    /* renamed from: d, reason: collision with root package name */
    private final int f296827d;

    /* renamed from: e, reason: collision with root package name */
    private final int f296828e;

    private b(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, int i17, int i18, int i19, int i27) {
        this.f296824a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        this.f296825b = i17;
        this.f296826c = i18;
        this.f296827d = i19;
        this.f296828e = i27;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, int i17, int i18, int i19, int i27) {
        return new com.p314xaae8f345.p2926x359365.ui.b(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, i17, i18, i19, i27);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f296824a.setBackgroundColor(android.graphics.Color.argb(this.f296825b, this.f296826c, this.f296827d, this.f296828e));
    }
}
