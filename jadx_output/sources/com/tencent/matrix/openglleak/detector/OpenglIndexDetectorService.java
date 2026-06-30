package com.tencent.matrix.openglleak.detector;

/* loaded from: classes12.dex */
public class OpenglIndexDetectorService extends android.app.Service {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f52916e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.matrix.openglleak.detector.b f52917d = new com.tencent.matrix.openglleak.detector.d(this);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.f52917d;
    }
}
