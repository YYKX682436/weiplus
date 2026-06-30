package com.p314xaae8f345.p485x5dc4f1ad.p489x6a710b1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¨\u0006\f"}, d2 = {"Lcom/tencent/magicbrush/utils/NativeTaskHelper;", "", "", "ptr", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "createSurfaceTextureFrameListener", "Ljz5/f0;", "doRunTask", "<init>", "()V", "com/tencent/magicbrush/utils/a", "NativeTaskWrapper", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tencent.magicbrush.utils.NativeTaskHelper */
/* loaded from: classes6.dex */
public final class C4217xd9f6b92a {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p485x5dc4f1ad.p489x6a710b1.C4217xd9f6b92a f16216x4fbc8495 = new com.p314xaae8f345.p485x5dc4f1ad.p489x6a710b1.C4217xd9f6b92a();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"Lcom/tencent/magicbrush/utils/NativeTaskHelper$NativeTaskWrapper;", "", "Ljz5/f0;", "releaseTask", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.tencent.magicbrush.utils.NativeTaskHelper$NativeTaskWrapper */
    /* loaded from: classes6.dex */
    public static class NativeTaskWrapper {

        /* renamed from: d, reason: collision with root package name */
        public long f130195d;

        public NativeTaskWrapper(long j17) {
            this.f130195d = j17;
        }

        /* renamed from: releaseTask */
        public final synchronized void m34877xcb7762c() {
            this.f130195d = 0L;
        }
    }

    private C4217xd9f6b92a() {
    }

    /* renamed from: createSurfaceTextureFrameListener */
    public static final android.graphics.SurfaceTexture.OnFrameAvailableListener m34875x4ef26597(long ptr) {
        return new com.p314xaae8f345.p485x5dc4f1ad.p489x6a710b1.a(ptr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doRunTask */
    public final native void m34876xb4f98fa5(long j17);
}
