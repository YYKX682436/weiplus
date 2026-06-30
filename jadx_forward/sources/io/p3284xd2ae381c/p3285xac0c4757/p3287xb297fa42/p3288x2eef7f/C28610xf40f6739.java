package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f;

/* renamed from: io.flutter.embedding.engine.dart.PlatformTaskQueue */
/* loaded from: classes12.dex */
public class C28610xf40f6739 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue {

    /* renamed from: handler */
    private final android.os.Handler f71049x294b574a = io.p3284xd2ae381c.p3319x36f002.C28967xf5fe874c.m139409x287dc44a(android.os.Looper.getMainLooper());

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue
    /* renamed from: dispatch */
    public void mo137884x10f9447a(java.lang.Runnable runnable) {
        this.f71049x294b574a.post(runnable);
    }
}
