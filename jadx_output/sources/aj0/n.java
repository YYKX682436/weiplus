package aj0;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.s f5271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(aj0.s sVar) {
        super(0);
        this.f5271d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aj0.s sVar = this.f5271d;
        aj0.a aVar = sVar.f5283e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar != null) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(36197, iArr[0]);
            android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(36197, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
            android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
            android.opengl.GLES20.glBindTexture(36197, 0);
            int glGetError = android.opengl.GLES20.glGetError();
            if (glGetError != 0) {
                io.flutter.Log.i("PreRenderGLUtil", "glGenTextures: GL error: 0x" + java.lang.Integer.toHexString(glGetError));
            }
            sVar.f5284f = iArr[0];
            android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(sVar.f5284f);
            surfaceTexture.setDefaultBufferSize(sVar.f5279a, sVar.f5280b);
            surfaceTexture.setOnFrameAvailableListener(new aj0.m(aVar, sVar));
            sVar.f5285g = surfaceTexture;
            ((kotlinx.coroutines.u2) sVar.f5286h).U(f0Var);
        }
        return f0Var;
    }
}
