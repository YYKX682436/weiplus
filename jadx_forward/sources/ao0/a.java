package ao0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f94039a;

    /* renamed from: b, reason: collision with root package name */
    public int f94040b;

    /* renamed from: c, reason: collision with root package name */
    public int f94041c;

    /* renamed from: d, reason: collision with root package name */
    public int f94042d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94043e;

    /* renamed from: f, reason: collision with root package name */
    public int f94044f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.FloatBuffer f94045g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.FloatBuffer f94046h;

    public final int a(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GLTextureCrop", "Shader compile failed: " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void b() {
        int i17;
        int i18 = this.f94039a;
        if (i18 != 0 && (i17 = this.f94040b) != 0) {
            rs0.i.f480829a.i(new int[]{i18}, new int[]{i17});
        }
        this.f94039a = 0;
        this.f94040b = 0;
        int i19 = this.f94044f;
        if (i19 != 0) {
            android.opengl.GLES20.glDeleteProgram(i19);
            this.f94044f = 0;
        }
        this.f94045g = null;
        this.f94046h = null;
        this.f94043e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLTextureCrop", "CropFBO resources released");
    }
}
