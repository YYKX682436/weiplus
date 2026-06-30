package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00000\u00000\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "it", "Lwa/a;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Void;)Lwa/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes14.dex */
public final class ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ androidx.camera.core.CameraX $cameraX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1(androidx.camera.core.CameraX cameraX) {
        super(1);
        this.$cameraX = cameraX;
    }

    @Override // yz5.l
    public final wa.a invoke(java.lang.Void r17) {
        return this.$cameraX.getInitializeFuture();
    }
}
