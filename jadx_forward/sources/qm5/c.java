package qm5;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f446325a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f446326b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f446327c;

    /* renamed from: d, reason: collision with root package name */
    public int f446328d;

    /* renamed from: e, reason: collision with root package name */
    public int f446329e;

    /* renamed from: f, reason: collision with root package name */
    public int f446330f;

    /* renamed from: g, reason: collision with root package name */
    public int f446331g;

    /* renamed from: h, reason: collision with root package name */
    public int f446332h;

    /* renamed from: i, reason: collision with root package name */
    public int f446333i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f446334j;

    public c() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public void a() {
    }

    public void b(int i17, int i18, int i19, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        android.opengl.GLES20.glUseProgram(this.f446328d);
        h();
        if (this.f446334j) {
            floatBuffer.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f446329e, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f446329e);
            floatBuffer2.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f446331g, 2, 5126, false, 8, (java.nio.Buffer) floatBuffer2);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f446331g);
            if (i17 != -1) {
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glBindTexture(3553, i17);
                android.opengl.GLES20.glUniform1i(this.f446330f, 0);
            }
            c(i18, floatBuffer, floatBuffer2);
            d(i19, floatBuffer, floatBuffer2);
            android.opengl.GLES20.glViewport(0, 0, this.f446332h, this.f446333i);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f446329e);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f446331g);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
    }

    public void c(int i17, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
    }

    public void d(int i17, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
    }

    public void e() {
        int a17;
        int[] iArr = new int[1];
        int a18 = qm5.k.a(this.f446326b, 35633);
        int i17 = 0;
        if (a18 != 0 && (a17 = qm5.k.a(this.f446327c, 35632)) != 0) {
            int glCreateProgram = android.opengl.GLES20.glCreateProgram();
            android.opengl.GLES20.glAttachShader(glCreateProgram, a18);
            android.opengl.GLES20.glAttachShader(glCreateProgram, a17);
            android.opengl.GLES20.glLinkProgram(glCreateProgram);
            android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] > 0) {
                android.opengl.GLES20.glDeleteShader(a18);
                android.opengl.GLES20.glDeleteShader(a17);
                i17 = glCreateProgram;
            }
        }
        this.f446328d = i17;
        this.f446329e = android.opengl.GLES20.glGetAttribLocation(i17, "position");
        this.f446330f = android.opengl.GLES20.glGetUniformLocation(this.f446328d, "inputImageTexture");
        this.f446331g = android.opengl.GLES20.glGetAttribLocation(this.f446328d, "inputTextureCoordinate");
        this.f446334j = true;
    }

    public void f(int i17, int i18) {
        this.f446332h = i17;
        this.f446333i = i18;
    }

    public void g(java.lang.Runnable runnable) {
        synchronized (this.f446325a) {
            this.f446325a.addLast(runnable);
        }
    }

    public void h() {
        while (true) {
            java.util.LinkedList linkedList = this.f446325a;
            if (linkedList.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) linkedList.removeFirst()).run();
            }
        }
    }

    public c(java.lang.String str, java.lang.String str2) {
        this.f446325a = new java.util.LinkedList();
        this.f446326b = str;
        this.f446327c = str2;
    }
}
