package bs0;

/* loaded from: classes5.dex */
public interface j extends nr0.b0 {
    static /* synthetic */ java.lang.Object F0(bs0.j jVar, int i17, int i18, int i19, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation, int i27, java.lang.Object obj) {
        if (obj == null) {
            return jVar.v((i27 & 1) != 0 ? 0 : i17, (i27 & 2) != 0 ? 0 : i18, (i27 & 4) != 0 ? 0 : i19, str, z17, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takePicture");
    }

    java.lang.Object D0(kotlin.coroutines.Continuation continuation);

    void a();

    java.lang.Object a0(boolean z17, kotlin.coroutines.Continuation continuation);

    void b();

    int c(int i17);

    void e(boolean z17);

    java.lang.Object f(int i17, kotlin.coroutines.Continuation continuation);

    void f0(android.content.Context context, xr0.h hVar);

    boolean g(float f17);

    kotlinx.coroutines.flow.f3 getCameraState();

    java.lang.Float getHorizontalViewAngle();

    void h(float f17, float f18);

    void l0(androidx.lifecycle.y yVar);

    void setCameraViewRatio(bs0.f fVar);

    void setLightTorch(boolean z17);

    void switchCamera();

    java.lang.Object v(int i17, int i18, int i19, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation);

    java.lang.Object y(int i17, int i18, int i19, boolean z17, kotlin.coroutines.Continuation continuation);
}
