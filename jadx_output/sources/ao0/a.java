package ao0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f12506a;

    /* renamed from: b, reason: collision with root package name */
    public int f12507b;

    /* renamed from: c, reason: collision with root package name */
    public int f12508c;

    /* renamed from: d, reason: collision with root package name */
    public int f12509d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12510e;

    /* renamed from: f, reason: collision with root package name */
    public int f12511f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.FloatBuffer f12512g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.FloatBuffer f12513h;

    public final int a(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateShader;
        }
        com.tencent.mars.xlog.Log.e("GLTextureCrop", "Shader compile failed: " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void b() {
        int i17;
        int i18 = this.f12506a;
        if (i18 != 0 && (i17 = this.f12507b) != 0) {
            rs0.i.f399296a.i(new int[]{i18}, new int[]{i17});
        }
        this.f12506a = 0;
        this.f12507b = 0;
        int i19 = this.f12511f;
        if (i19 != 0) {
            android.opengl.GLES20.glDeleteProgram(i19);
            this.f12511f = 0;
        }
        this.f12512g = null;
        this.f12513h = null;
        this.f12510e = false;
        com.tencent.mars.xlog.Log.i("GLTextureCrop", "CropFBO resources released");
    }
}
