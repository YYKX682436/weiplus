package dp5;

/* loaded from: classes14.dex */
public final class c implements dp5.e {

    /* renamed from: a, reason: collision with root package name */
    public static final dp5.c f323811a = new dp5.c();

    /* renamed from: b, reason: collision with root package name */
    public static final dp5.e f323812b = new dp5.b();

    public int a(java.lang.String vertexShaderSource, java.lang.String fragmentShaderSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vertexShaderSource, "vertexShaderSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentShaderSource, "fragmentShaderSource");
        dp5.b bVar = (dp5.b) f323812b;
        bVar.getClass();
        int[] iArr = new int[1];
        int c17 = bVar.c(vertexShaderSource, 35633);
        if (c17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvOp", "load vertex shader failed");
            return 0;
        }
        int c18 = bVar.c(fragmentShaderSource, 35632);
        if (c18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvOp", "load fragment shader failed");
            return 0;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, c17);
        android.opengl.GLES20.glAttachShader(glCreateProgram, c18);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvOp", "link program failed");
            return 0;
        }
        android.opengl.GLES20.glDeleteShader(c17);
        android.opengl.GLES20.glDeleteShader(c18);
        return glCreateProgram;
    }
}
