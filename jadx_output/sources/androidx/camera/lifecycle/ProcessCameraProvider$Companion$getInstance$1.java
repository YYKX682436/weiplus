package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "kotlin.jvm.PlatformType", "cameraX", "Landroidx/camera/core/CameraX;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProcessCameraProvider$Companion$getInstance$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ android.content.Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCameraProvider$Companion$getInstance$1(android.content.Context context) {
        super(1);
        this.$context = context;
    }

    @Override // yz5.l
    public final androidx.camera.lifecycle.ProcessCameraProvider invoke(androidx.camera.core.CameraX cameraX) {
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider = androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance;
        kotlin.jvm.internal.o.f(cameraX, "cameraX");
        processCameraProvider.setCameraX(cameraX);
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider2 = androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance;
        android.content.Context applicationContext = androidx.camera.core.impl.utils.ContextUtil.getApplicationContext(this.$context);
        kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(context)");
        processCameraProvider2.setContext(applicationContext);
        return androidx.camera.lifecycle.ProcessCameraProvider.sAppInstance;
    }
}
