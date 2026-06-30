package com.tencent.magicbrush.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¨\u0006\f"}, d2 = {"Lcom/tencent/magicbrush/utils/NativeTaskHelper;", "", "", "ptr", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "createSurfaceTextureFrameListener", "Ljz5/f0;", "doRunTask", "<init>", "()V", "com/tencent/magicbrush/utils/a", "NativeTaskWrapper", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class NativeTaskHelper {
    public static final com.tencent.magicbrush.utils.NativeTaskHelper INSTANCE = new com.tencent.magicbrush.utils.NativeTaskHelper();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"Lcom/tencent/magicbrush/utils/NativeTaskHelper$NativeTaskWrapper;", "", "Ljz5/f0;", "releaseTask", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static class NativeTaskWrapper {

        /* renamed from: d, reason: collision with root package name */
        public long f48662d;

        public NativeTaskWrapper(long j17) {
            this.f48662d = j17;
        }

        public final synchronized void releaseTask() {
            this.f48662d = 0L;
        }
    }

    private NativeTaskHelper() {
    }

    public static final android.graphics.SurfaceTexture.OnFrameAvailableListener createSurfaceTextureFrameListener(long ptr) {
        return new com.tencent.magicbrush.utils.a(ptr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void doRunTask(long j17);
}
