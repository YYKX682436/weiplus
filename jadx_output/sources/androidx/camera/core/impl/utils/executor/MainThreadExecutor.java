package androidx.camera.core.impl.utils.executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class MainThreadExecutor {
    private static volatile java.util.concurrent.ScheduledExecutorService sInstance;

    private MainThreadExecutor() {
    }

    public static java.util.concurrent.ScheduledExecutorService getInstance() {
        if (sInstance != null) {
            return sInstance;
        }
        synchronized (androidx.camera.core.impl.utils.executor.MainThreadExecutor.class) {
            if (sInstance == null) {
                sInstance = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        }
        return sInstance;
    }
}
