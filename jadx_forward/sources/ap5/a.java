package ap5;

/* loaded from: classes14.dex */
public final class a extends ap5.b {

    /* renamed from: m, reason: collision with root package name */
    public final int f94323m;

    /* renamed from: n, reason: collision with root package name */
    public final int f94324n;

    /* renamed from: o, reason: collision with root package name */
    public final int f94325o;

    /* renamed from: p, reason: collision with root package name */
    public final int f94326p;

    /* renamed from: q, reason: collision with root package name */
    public final int f94327q;

    /* renamed from: r, reason: collision with root package name */
    public final int f94328r;

    /* renamed from: s, reason: collision with root package name */
    public final int f94329s;

    /* renamed from: t, reason: collision with root package name */
    public cp5.e f94330t;

    /* renamed from: u, reason: collision with root package name */
    public int f94331u;

    public a(int i17, int i18, int i19, int i27, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(i17, i18, (i29 & 4) != 0 ? i17 : i19, (i29 & 8) != 0 ? i18 : i27, (i29 & 16) != 0 ? 1 : i28);
        this.f94331u = -1;
        int a17 = dp5.c.f323811a.a("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform sampler2D y_texture;\n        uniform sampler2D u_texture;\n        uniform sampler2D v_texture;\n\n        void main () {\n           float r, g, b, y, u, v;\n\n        //We had put the Y values of each pixel to the R,G,B components by GL_LUMINANCE,\n        //that's why we're pulling it from the R component, we could also use G or B\n           y = texture2D(y_texture, v_texCoord).r;\n\n        //We had put the U and V values of each pixel to the A and R,G,B components of the\n        //texture respectively using GL_LUMINANCE_ALPHA. Since U,V bytes are interspread\n        //in the texture, this is probably the fastest way to use them in the shader\n        //GL_LUMINANCE_ALPHA is a luminance/alpha pair, so r correspond to v, and\n        //a correspond to u\n        //NV21 is a VUVU pair\n           v = texture2D(v_texture, v_texCoord).r;\n           u = texture2D(u_texture, v_texCoord).r;\n           u = u - 0.5;\n           v = v - 0.5;\n\n        //The numbers are just YUV to RGB conversion constants\n        //https://en.wikipedia.org/wiki/YUV#Y.E2.80.B2UV420sp_.28NV21.29_to_RGB_conversion_.28Android.29\n           r = y + 1.370705 * v;\n           g = y - 0.337633 * u - 0.698001 * v;\n           b = y + 1.732446 * u;\n\n        //We finally set the RGB color of our pixel\n           gl_FragColor = vec4(r, g, b, 1.0);\n        }\n        ");
        this.f94323m = a17;
        if (a17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTR.GLRenderProcI420ToRgb", "checkInit, load program failed!");
        }
        this.f94325o = android.opengl.GLES20.glGetAttribLocation(a17, "a_position");
        this.f94324n = android.opengl.GLES20.glGetAttribLocation(a17, "a_texCoord");
        this.f94326p = android.opengl.GLES20.glGetUniformLocation(a17, "y_texture");
        this.f94327q = android.opengl.GLES20.glGetUniformLocation(a17, "u_texture");
        this.f94328r = android.opengl.GLES20.glGetUniformLocation(a17, "v_texture");
        this.f94329s = android.opengl.GLES20.glGetUniformLocation(a17, "uMatrix");
    }

    @Override // ap5.b
    public void a() {
        super.a();
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    @Override // ap5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r10 = this;
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)
            int r0 = r10.f94323m
            if (r0 == 0) goto Lcc
            int r1 = r10.f94334c
            if (r1 <= 0) goto Lcc
            int r1 = r10.f94335d
            if (r1 <= 0) goto Lcc
            android.opengl.GLES20.glUseProgram(r0)
            cp5.e r0 = r10.f94330t
            r1 = 3553(0xde1, float:4.979E-42)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L90
            r4 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            int r4 = r10.f94331u
            r5 = 0
            if (r4 < 0) goto L31
            android.opengl.GLES20.glBindTexture(r1, r4)
            goto L48
        L31:
            boolean r4 = r0.f302670d
            if (r4 == 0) goto L3e
            cp5.f r4 = r0.f302667a
            boolean r6 = r4.f302673b
            if (r6 == 0) goto L3e
            dp5.f r4 = r4.f302672a
            goto L3f
        L3e:
            r4 = r5
        L3f:
            if (r4 == 0) goto L48
            dp5.a r4 = (dp5.a) r4
            int r4 = r4.f323805d
            android.opengl.GLES20.glBindTexture(r1, r4)
        L48:
            int r4 = r10.f94326p
            android.opengl.GLES20.glUniform1i(r4, r3)
            r4 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            boolean r4 = r0.f302670d
            if (r4 == 0) goto L60
            cp5.f r4 = r0.f302668b
            boolean r6 = r4.f302673b
            if (r6 == 0) goto L60
            dp5.f r4 = r4.f302672a
            goto L61
        L60:
            r4 = r5
        L61:
            if (r4 == 0) goto L6a
            dp5.a r4 = (dp5.a) r4
            int r4 = r4.f323805d
            android.opengl.GLES20.glBindTexture(r1, r4)
        L6a:
            int r4 = r10.f94327q
            android.opengl.GLES20.glUniform1i(r4, r2)
            r4 = 33986(0x84c2, float:4.7625E-41)
            android.opengl.GLES20.glActiveTexture(r4)
            boolean r4 = r0.f302670d
            if (r4 == 0) goto L81
            cp5.f r0 = r0.f302669c
            boolean r4 = r0.f302673b
            if (r4 == 0) goto L81
            dp5.f r5 = r0.f302672a
        L81:
            if (r5 == 0) goto L8a
            dp5.a r5 = (dp5.a) r5
            int r0 = r5.f323805d
            android.opengl.GLES20.glBindTexture(r1, r0)
        L8a:
            int r0 = r10.f94328r
            r4 = 2
            android.opengl.GLES20.glUniform1i(r0, r4)
        L90:
            int r0 = r10.f94329s
            float[] r4 = r10.f94339h
            android.opengl.GLES20.glUniformMatrix4fv(r0, r2, r3, r4, r3)
            java.nio.FloatBuffer r0 = r10.f94338g
            r0.position(r3)
            int r4 = r10.f94325o
            r5 = 2
            r6 = 5126(0x1406, float:7.183E-42)
            r7 = 0
            r8 = 0
            java.nio.FloatBuffer r9 = r10.f94338g
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r0 = r10.f94325o
            android.opengl.GLES20.glEnableVertexAttribArray(r0)
            java.nio.FloatBuffer r2 = r10.f94337f
            r2.position(r3)
            int r4 = r10.f94324n
            java.nio.FloatBuffer r9 = r10.f94337f
            android.opengl.GLES20.glVertexAttribPointer(r4, r5, r6, r7, r8, r9)
            int r2 = r10.f94324n
            android.opengl.GLES20.glEnableVertexAttribArray(r2)
            r4 = 5
            r5 = 4
            android.opengl.GLES20.glDrawArrays(r4, r3, r5)
            android.opengl.GLES20.glDisableVertexAttribArray(r0)
            android.opengl.GLES20.glDisableVertexAttribArray(r2)
            android.opengl.GLES20.glBindTexture(r1, r3)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ap5.a.c():void");
    }
}
