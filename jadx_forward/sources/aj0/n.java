package aj0;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.s f86804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(aj0.s sVar) {
        super(0);
        this.f86804d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aj0.s sVar = this.f86804d;
        aj0.a aVar = sVar.f86816e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (aVar != null) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(36197, iArr[0]);
            android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
            android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
            android.opengl.GLES20.glBindTexture(36197, 0);
            int glGetError = android.opengl.GLES20.glGetError();
            if (glGetError != 0) {
                io.p3284xd2ae381c.Log.i("PreRenderGLUtil", "glGenTextures: GL error: 0x" + java.lang.Integer.toHexString(glGetError));
            }
            sVar.f86817f = iArr[0];
            android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(sVar.f86817f);
            surfaceTexture.setDefaultBufferSize(sVar.f86812a, sVar.f86813b);
            surfaceTexture.setOnFrameAvailableListener(new aj0.m(aVar, sVar));
            sVar.f86818g = surfaceTexture;
            ((p3325xe03a0797.p3326xc267989b.u2) sVar.f86819h).U(f0Var);
        }
        return f0Var;
    }
}
