package go0;

/* loaded from: classes10.dex */
public final class o0 extends os0.a {
    public final java.lang.String C;
    public int D;
    public android.graphics.Bitmap E;
    public final jz5.g F;
    public final jz5.g G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f355341J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final java.nio.FloatBuffer U;
    public final java.nio.FloatBuffer V;
    public final int W;
    public int X;

    public o0(int i17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(i17, i18, (i28 & 4) != 0 ? i17 : i19, (i28 & 8) != 0 ? i18 : i27, 2, 2);
        this.C = "MircoMsg.LiveScreenRenderProcBlend";
        this.F = jz5.h.b(go0.m0.f355334d);
        this.G = jz5.h.b(go0.l0.f355330d);
        jz5.h.b(go0.n0.f355338d);
        rs0.g gVar = rs0.i.f480829a;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.U = asFloatBuffer;
        this.V = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.W = 3553;
        int t17 = rs0.i.f480829a.t("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        attribute vec2 a_texBlurBgCoord;\n        attribute vec2 a_texEmojiCoord;\n        varying vec2 v_texCoord;\n        varying vec2 v_texBlurBgCoord;\n        varying vec2 v_texEmojiCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n            v_texBlurBgCoord = a_texBlurBgCoord;\n            v_texEmojiCoord = a_texEmojiCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        varying vec2 v_texBlurBgCoord;\n        varying vec2 v_texEmojiCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform sampler2D blurBgTexture;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n        uniform int hasBlurBgTexture;\n        uniform vec4 centerLocation; //按top bottom left right来传\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec4 videoColor;\n            vec4 blendElementsColor;\n\n            if (hasBlurBgTexture == 1) {\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texBlurBgCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texBlurBgCoord);\n                }\n                if (videoColor.a != 1.0) {\n                    videoColor.a = 0.0;\n                }\n                if (gl_FragCoord.y > centerLocation[0] || gl_FragCoord.y < centerLocation[1] ||\n                    gl_FragCoord.x > centerLocation[3] || gl_FragCoord.x < centerLocation[2]) {\n                    if (hasEmojiTexture == 1) {\n                        gl_FragColor = blendTexture(texture2D(blurBgTexture, v_texCoord), texture2D(emojiTexture, v_texEmojiCoord));\n                    } else {\n                        gl_FragColor = texture2D(blurBgTexture, v_texCoord);\n                    }\n                } else {\n                    if (hasEmojiTexture == 1) {\n                        gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texEmojiCoord));\n                    } else {\n                        gl_FragColor = videoColor;\n                    }\n                }\n            } else {\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texCoord);\n                }\n                if (videoColor.a != 1.0) {\n                    videoColor.a = 0.0;\n                }\n                if (hasEmojiTexture == 1) {\n                    gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texEmojiCoord));\n                } else {\n                    gl_FragColor = videoColor;\n                }\n            }\n        }\n        ");
        this.H = t17;
        this.I = android.opengl.GLES20.glGetAttribLocation(t17, "a_position");
        this.f355341J = android.opengl.GLES20.glGetAttribLocation(t17, "a_texCoord");
        this.K = android.opengl.GLES20.glGetAttribLocation(t17, "a_texEmojiCoord");
        this.T = android.opengl.GLES20.glGetAttribLocation(t17, "a_texBlurBgCoord");
        this.L = android.opengl.GLES20.glGetUniformLocation(t17, "videoExternalTexture");
        this.M = android.opengl.GLES20.glGetUniformLocation(t17, "videoNormalTexture");
        this.N = android.opengl.GLES20.glGetUniformLocation(t17, "emojiTexture");
        this.O = android.opengl.GLES20.glGetUniformLocation(t17, "hasEmojiTexture");
        this.Q = android.opengl.GLES20.glGetUniformLocation(t17, "uMatrix");
        this.P = android.opengl.GLES20.glGetUniformLocation(t17, "useNormalVideoTexture");
        this.S = android.opengl.GLES20.glGetUniformLocation(t17, "blurBgTexture");
        this.R = android.opengl.GLES20.glGetUniformLocation(t17, "hasBlurBgTexture");
        android.opengl.GLES20.glGetUniformLocation(t17, "centerLocation");
        asFloatBuffer.position(0);
        asFloatBuffer.put(rs0.i.f480833e);
        asFloatBuffer.position(0);
    }

    @Override // os0.a
    public void g() {
        super.g();
        int i17 = this.X;
        if (i17 > 0) {
            this.X = i17 - 1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cubeBuffer:[");
            java.nio.FloatBuffer floatBuffer = this.f429532h;
            sb6.append(floatBuffer.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer.get(7));
            sb6.append("]\ntextureCoordBuff:[");
            java.nio.FloatBuffer floatBuffer2 = this.f429531g;
            sb6.append(floatBuffer2.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer2.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer2.get(7));
            sb6.append("]\nblendTextureCoordBuff:[");
            java.nio.FloatBuffer floatBuffer3 = this.U;
            sb6.append(floatBuffer3.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer3.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer3.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer3.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer3.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer3.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer3.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer3.get(7));
            sb6.append("]\nbgTextureCoordBuff:[");
            java.nio.FloatBuffer floatBuffer4 = this.V;
            sb6.append(floatBuffer4.get(0));
            sb6.append(", ");
            sb6.append(floatBuffer4.get(1));
            sb6.append(" \n ");
            sb6.append(floatBuffer4.get(2));
            sb6.append(", ");
            sb6.append(floatBuffer4.get(3));
            sb6.append(" \n ");
            sb6.append(floatBuffer4.get(4));
            sb6.append(", ");
            sb6.append(floatBuffer4.get(5));
            sb6.append(" \n ");
            sb6.append(floatBuffer4.get(6));
            sb6.append(", ");
            sb6.append(floatBuffer4.get(7));
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, sb6.toString());
        }
    }

    @Override // os0.a
    public void n() {
        super.n();
        ((is0.c) ((jz5.n) this.F).mo141623x754a37bb()).close();
        ((is0.c) ((jz5.n) this.G).mo141623x754a37bb()).close();
        this.E = null;
    }

    @Override // os0.a
    public void p() {
        android.opengl.GLES20.glUseProgram(this.H);
        android.opengl.GLES20.glActiveTexture(33984);
        int i17 = this.D;
        int i18 = this.W;
        android.opengl.GLES20.glBindTexture(i18, i17);
        android.opengl.GLES20.glTexParameterf(i18, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i18, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i18, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(i18, 10243, 10497.0f);
        int i19 = this.L;
        int i27 = this.M;
        int i28 = this.P;
        if (i18 == 3553) {
            android.opengl.GLES20.glUniform1i(i28, 1);
            android.opengl.GLES20.glUniform1i(i27, 0);
            android.opengl.GLES20.glUniform1i(i19, 3);
        } else {
            android.opengl.GLES20.glUniform1i(i28, 0);
            android.opengl.GLES20.glUniform1i(i27, 3);
            android.opengl.GLES20.glUniform1i(i19, 0);
        }
        android.graphics.Bitmap bitmap = this.E;
        int i29 = this.O;
        int i37 = this.N;
        if (bitmap != null) {
            android.opengl.GLES20.glActiveTexture(33985);
            android.graphics.Bitmap bitmap2 = this.E;
            if (bitmap2 != null) {
                is0.c.c((is0.c) ((jz5.n) this.F).mo141623x754a37bb(), bitmap2, 0, 33071, 2, null);
            }
            android.opengl.GLES20.glUniform1i(i37, 1);
            android.opengl.GLES20.glUniform1i(i29, 1);
        } else {
            android.opengl.GLES20.glUniform1i(i37, 1);
            android.opengl.GLES20.glUniform1i(i29, 0);
        }
        android.opengl.GLES20.glUniform1i(this.R, 0);
        android.opengl.GLES20.glUniform1i(this.S, 2);
        this.f429532h.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.I, 2, 5126, false, 0, (java.nio.Buffer) this.f429532h);
        int i38 = this.I;
        android.opengl.GLES20.glEnableVertexAttribArray(i38);
        this.U.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.K, 2, 5126, false, 0, (java.nio.Buffer) this.U);
        int i39 = this.K;
        android.opengl.GLES20.glEnableVertexAttribArray(i39);
        this.f429531g.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f355341J, 2, 5126, false, 0, (java.nio.Buffer) this.f429531g);
        int i47 = this.f355341J;
        android.opengl.GLES20.glEnableVertexAttribArray(i47);
        android.opengl.GLES20.glUniformMatrix4fv(this.Q, 1, false, this.f429536l, 0);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(i38);
        android.opengl.GLES20.glDisableVertexAttribArray(i47);
        android.opengl.GLES20.glDisableVertexAttribArray(i39);
        android.opengl.GLES20.glDisableVertexAttribArray(this.T);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glUseProgram(0);
    }

    @Override // os0.a
    public void r(int i17) {
        this.D = i17;
    }

    @Override // os0.a
    public void s(int i17) {
        this.f429538n = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, "[setRotate] degree:" + i17);
    }

    public final void x(android.graphics.Bitmap bitmap, int i17, int i18, boolean z17) {
        float f17;
        float f18;
        float f19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setBlendBitmap bitmap:");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.hashCode()) : null);
        sb6.append('(');
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append('*');
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        sb6.append("),size:");
        sb6.append(i17);
        sb6.append('*');
        sb6.append(i18);
        sb6.append(',');
        float f27 = i17;
        float f28 = i18;
        sb6.append(f27 / f28);
        sb6.append(",drawWidth:");
        sb6.append(this.f429527c);
        sb6.append(",drawHeight:");
        sb6.append(this.f429528d);
        sb6.append(",textureWidth:");
        sb6.append(this.f429525a);
        sb6.append(",textureHeight:");
        sb6.append(this.f429526b);
        sb6.append(',');
        sb6.append(this.f429527c / this.f429528d);
        sb6.append(",flip:");
        sb6.append(z17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        this.E = bitmap;
        java.nio.FloatBuffer floatBuffer = this.U;
        floatBuffer.position(0);
        float f29 = this.f429527c;
        float f37 = f29 / f27;
        float f38 = this.f429528d;
        float f39 = f38 / f28;
        float[] fArr = new float[8];
        float f47 = 1.0f;
        if (f37 < f39) {
            float f48 = ((f38 - (f28 * f37)) / f38) / 2.0f;
            float f49 = 1 + f48;
            f19 = 0 - f48;
            f18 = 1.0f;
            f47 = f49;
            f17 = 0.0f;
        } else {
            float f57 = (((f29 - (f27 * f39)) / f29) + 0.12f) / 2.0f;
            f17 = 0.0f - f57;
            f18 = f57 + 1.0f;
            f19 = 0.0f;
        }
        if (z17) {
            fArr[0] = f17;
            fArr[1] = f19;
            fArr[2] = f18;
            fArr[3] = f19;
            fArr[4] = f17;
            fArr[5] = f47;
            fArr[6] = f18;
            fArr[7] = f47;
        } else {
            fArr[0] = f17;
            fArr[1] = f47;
            fArr[2] = f18;
            fArr[3] = f47;
            fArr[4] = f17;
            fArr[5] = f19;
            fArr[6] = f18;
            fArr[7] = f19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "calcBlurBgTextureCoord:[" + f17 + ", " + f47 + " \n " + f18 + ", " + f47 + " \n " + f17 + ", " + f19 + " \n " + f18 + ", " + f19 + "], flip:" + z17 + '!');
        floatBuffer.put(fArr);
        floatBuffer.position(0);
        this.X = this.X + 1;
    }
}
