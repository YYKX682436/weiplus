package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"awaitInstance", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "context", "Landroid/content/Context;", "(Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera-lifecycle_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProcessCameraProviderExtKt {
    public static final java.lang.Object awaitInstance(androidx.camera.lifecycle.ProcessCameraProvider.Companion companion, android.content.Context context, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.ProcessCameraProvider> continuation) {
        return t2.s.a(companion.getInstance(context), continuation);
    }
}
