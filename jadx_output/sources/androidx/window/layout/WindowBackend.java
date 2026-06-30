package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\f"}, d2 = {"Landroidx/window/layout/WindowBackend;", "", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "Ljz5/f0;", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a aVar);

    void unregisterLayoutChangeCallback(m3.a aVar);
}
