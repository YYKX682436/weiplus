package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljz5/f0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes14.dex */
public final class ImageCaptureExtKt$takePicture$2$2 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ kotlin.jvm.internal.h0 $delegatingCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCaptureExtKt$takePicture$2$2(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.$delegatingCallback = h0Var;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    public final void invoke(java.lang.Throwable th6) {
        java.lang.Object obj = this.$delegatingCallback.f310123d;
        if (obj != null) {
            ((androidx.camera.core.DelegatingImageCapturedCallback) obj).dispose();
        } else {
            kotlin.jvm.internal.o.o("delegatingCallback");
            throw null;
        }
    }
}
