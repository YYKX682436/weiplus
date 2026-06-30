package qm5;

/* loaded from: classes14.dex */
public abstract class h extends qm5.j {

    /* renamed from: o, reason: collision with root package name */
    public int f446361o;

    /* renamed from: p, reason: collision with root package name */
    public int f446362p;

    /* renamed from: q, reason: collision with root package name */
    public int f446363q;

    /* renamed from: r, reason: collision with root package name */
    public int f446364r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Bitmap f446365s;

    public h(java.lang.String str) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", str);
        this.f446364r = -1;
        j(qm5.l.NORMAL, false, false);
    }

    @Override // qm5.j, qm5.c
    public void a() {
        super.a();
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f446364r}, 0);
        this.f446364r = -1;
    }

    @Override // qm5.j, qm5.c
    public void b(int i17, int i18, int i19, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        android.opengl.GLES20.glUseProgram(this.f446328d);
        h();
        floatBuffer.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f446329e, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f446329e);
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f446331g, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f446331g);
        if (i17 != -1) {
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glUniform1i(this.f446330f, 0);
        }
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f446368k, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f446368k);
        android.opengl.GLES20.glActiveTexture(33986);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glUniform1i(this.f446369l, 2);
        floatBuffer2.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f446361o, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f446361o);
        android.opengl.GLES20.glActiveTexture(33987);
        android.opengl.GLES20.glBindTexture(3553, i19);
        android.opengl.GLES20.glUniform1i(this.f446362p, 3);
        android.opengl.GLES20.glViewport(0, 0, this.f446332h, this.f446333i);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f446329e);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f446331g);
        android.opengl.GLES20.glDisableVertexAttribArray(0);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f446368k);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f446363q);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f446361o);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    @Override // qm5.j, qm5.c
    public void e() {
        super.e();
        this.f446363q = android.opengl.GLES20.glGetAttribLocation(this.f446328d, "position");
        this.f446361o = android.opengl.GLES20.glGetAttribLocation(this.f446328d, "inputTextureCoordinate3");
        this.f446362p = android.opengl.GLES20.glGetUniformLocation(this.f446328d, "inputImageTexture3");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f446361o);
        android.graphics.Bitmap bitmap = this.f446365s;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        i(this.f446365s);
    }

    @Override // qm5.j
    public void i(android.graphics.Bitmap bitmap) {
        if (bitmap == null || !bitmap.isRecycled()) {
            this.f446365s = bitmap;
            if (bitmap == null) {
                return;
            }
            g(new qm5.g(this, bitmap));
        }
    }

    @Override // qm5.j
    public void j(qm5.l lVar, boolean z17, boolean z18) {
        float[] b17 = qm5.o.b(lVar, z17, z18);
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(b17);
        asFloatBuffer.flip();
    }
}
