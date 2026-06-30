package ko4;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f391582a;

    /* renamed from: b, reason: collision with root package name */
    public int f391583b;

    /* renamed from: c, reason: collision with root package name */
    public final int f391584c;

    /* renamed from: d, reason: collision with root package name */
    public final int f391585d;

    /* renamed from: e, reason: collision with root package name */
    public final int f391586e;

    /* renamed from: f, reason: collision with root package name */
    public final int f391587f;

    /* renamed from: g, reason: collision with root package name */
    public final int f391588g;

    /* renamed from: h, reason: collision with root package name */
    public final int f391589h;

    /* renamed from: i, reason: collision with root package name */
    public final int f391590i;

    /* renamed from: j, reason: collision with root package name */
    public final int f391591j;

    /* renamed from: k, reason: collision with root package name */
    public final int f391592k;

    /* renamed from: l, reason: collision with root package name */
    public final int f391593l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f391594m;

    /* renamed from: n, reason: collision with root package name */
    public final java.nio.FloatBuffer f391595n;

    /* renamed from: o, reason: collision with root package name */
    public final java.nio.FloatBuffer f391596o;

    public d() {
        float[] fArr = new float[16];
        this.f391594m = fArr;
        float[] fArr2 = rs0.i.f480832d;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.f391595n = asFloatBuffer;
        float[] fArr3 = rs0.i.f480831c;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.f391596o = asFloatBuffer2;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        asFloatBuffer.position(0);
        asFloatBuffer.put(fArr2);
        asFloatBuffer2.position(0);
        asFloatBuffer2.put(fArr3);
        int t17 = rs0.i.f480829a.t("#version 300 es\n            precision highp float;\n            layout(location = 0) in vec4 a_position;\n            layout(location = 1) in vec2 a_texCoord;\n            uniform mat4 uMatrix;\n            out vec2 v_texCoord;\n            void main() {\n                v_texCoord = a_texCoord;\n                gl_Position = uMatrix * a_position;\n            }\n            ", "#version 300 es\n            precision highp float;\n            layout(location = 0) out vec4 outColor;\n            uniform sampler2D y_texture;\n            uniform sampler2D u_texture;\n            uniform sampler2D v_texture;\n            in vec2 v_texCoord;\n\n            void main() {\n                float r, g, b, y, u, v;\n                ivec2 ySize = textureSize(y_texture, 0);\n                ivec2 uvSize = textureSize(u_texture, 0);\n\n                y = texelFetch(y_texture, ivec2(int(gl_FragCoord.x), int(float(ySize.y) - gl_FragCoord.y)), 0).r;\n                u = texelFetch(u_texture, ivec2(int(gl_FragCoord.x / 2.0), int(float(uvSize.y) - gl_FragCoord.y / 2.0)), 0).r - 0.5;\n                v = texelFetch(v_texture, ivec2(int(gl_FragCoord.x / 2.0), int(float(uvSize.y) - gl_FragCoord.y / 2.0)), 0).r - 0.5;\n\n                r = y + 1.370705 * v;\n                g = y - 0.337633 * u - 0.698001 * v;\n                b = y + 1.732446 * u;\n\n                outColor = vec4(r, g, b, 1.0);\n\n            }\n        ");
        this.f391584c = t17;
        if (t17 == 0) {
            xm5.b.b("GLRenderProc", "checkInit, load program failed!", new java.lang.Object[0]);
        }
        this.f391586e = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.f391585d = 1;
        this.f391587f = android.opengl.GLES20.glGetUniformLocation(t17, "y_texture");
        this.f391588g = android.opengl.GLES20.glGetUniformLocation(t17, "u_texture");
        this.f391589h = android.opengl.GLES20.glGetUniformLocation(t17, "v_texture");
        this.f391590i = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        this.f391591j = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553);
        this.f391592k = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553);
        this.f391593l = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553);
    }

    public static void a(ko4.d dVar, int i17, int i18, int i19, java.nio.Buffer buffer, int i27, int i28, int i29, java.lang.Object obj) {
        int i37 = (i29 & 4) != 0 ? 6408 : i19;
        java.nio.Buffer buffer2 = (i29 & 8) != 0 ? null : buffer;
        int i38 = (i29 & 16) != 0 ? 9729 : i27;
        int i39 = (i29 & 32) != 0 ? 10497 : i28;
        dVar.getClass();
        android.opengl.GLES20.glTexImage2D(3553, 0, i37, i17, i18, 0, i37, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, buffer2);
        float f17 = i38;
        android.opengl.GLES20.glTexParameterf(3553, 10241, f17);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, f17);
        float f18 = i39;
        android.opengl.GLES20.glTexParameterf(3553, 10242, f18);
        android.opengl.GLES20.glTexParameterf(3553, 10243, f18);
    }

    public final void b(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        xm5.b.b("GLRenderProc", "gl error " + glGetError + ", " + str, new java.lang.Object[0]);
        throw new java.lang.RuntimeException("gl error");
    }

    public final void c(java.nio.ByteBuffer buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        xm5.b.c("GLRenderProc", "render start", new java.lang.Object[0]);
        android.opengl.GLES20.glViewport(0, 0, this.f391582a, this.f391583b);
        android.opengl.GLES20.glUseProgram(this.f391584c);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.f391591j);
        buffer.position(0);
        a(this, this.f391582a, this.f391583b, 6409, buffer, 0, 0, 48, null);
        android.opengl.GLES20.glUniform1i(this.f391587f, 0);
        b("bind y tex");
        android.opengl.GLES20.glActiveTexture(33985);
        android.opengl.GLES20.glBindTexture(3553, this.f391592k);
        buffer.position(this.f391582a * this.f391583b);
        a(this, this.f391582a / 2, this.f391583b / 2, 6409, buffer, 0, 0, 48, null);
        android.opengl.GLES20.glUniform1i(this.f391588g, 1);
        b("bind uv tex");
        android.opengl.GLES20.glActiveTexture(33986);
        android.opengl.GLES20.glBindTexture(3553, this.f391593l);
        int i17 = this.f391582a;
        int i18 = this.f391583b;
        buffer.position((i17 * i18) + ((i17 * i18) / 4));
        a(this, this.f391582a / 2, this.f391583b / 2, 6409, buffer, 0, 0, 48, null);
        android.opengl.GLES20.glUniform1i(this.f391589h, 2);
        buffer.position(0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f391590i, 1, false, this.f391594m, 0);
        this.f391596o.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f391586e, 2, 5126, false, 0, (java.nio.Buffer) this.f391596o);
        int i19 = this.f391586e;
        android.opengl.GLES20.glEnableVertexAttribArray(i19);
        this.f391595n.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f391585d, 2, 5126, false, 0, (java.nio.Buffer) this.f391595n);
        int i27 = this.f391585d;
        android.opengl.GLES20.glEnableVertexAttribArray(i27);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i19);
        android.opengl.GLES20.glDisableVertexAttribArray(i27);
        android.opengl.GLES20.glBindTexture(3553, 0);
        b("gl draw");
        xm5.b.c("GLRenderProc", "render end", new java.lang.Object[0]);
    }
}
