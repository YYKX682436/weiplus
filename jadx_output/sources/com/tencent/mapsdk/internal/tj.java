package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tj extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    static final int f51643a = 0;

    /* renamed from: b, reason: collision with root package name */
    static final int f51644b = 1;

    /* renamed from: c, reason: collision with root package name */
    static final int f51645c = 2;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f51646d;

    public tj(com.tencent.mapsdk.internal.tr trVar, android.os.Looper looper) {
        super(looper);
        this.f51646d = trVar;
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.X, trVar.f49018f);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        M m17;
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a17;
        super.handleMessage(message);
        com.tencent.mapsdk.internal.tr trVar = this.f51646d;
        if (trVar == null || (m17 = trVar.e_) == 0 || !((com.tencent.mapsdk.vector.VectorMap) m17).a() || (a17 = trVar.a()) == null) {
            return;
        }
        if (message.what == 2) {
            trVar.am();
            com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.X, trVar.f49018f);
        }
        int i17 = message.what;
        if (i17 == 0) {
            trVar.onCameraChange(a17);
        } else if (i17 == 1) {
            trVar.f52270ap = true;
            com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList = trVar.f52265ak;
            if (tencentMapGestureListenerList != null && trVar.f52266al) {
                tencentMapGestureListenerList.onMapStable();
            }
            trVar.onCameraChangeFinished(a17);
        }
        trVar.ag();
    }
}
