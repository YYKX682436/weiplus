package androidx.camera.core.impl.utils;

/* loaded from: classes12.dex */
public final class MainThreadAsyncHandler {
    private static volatile android.os.Handler sHandler;

    private MainThreadAsyncHandler() {
    }

    public static android.os.Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (androidx.camera.core.impl.utils.MainThreadAsyncHandler.class) {
            if (sHandler == null) {
                sHandler = j3.k.a(android.os.Looper.getMainLooper());
            }
        }
        return sHandler;
    }
}
