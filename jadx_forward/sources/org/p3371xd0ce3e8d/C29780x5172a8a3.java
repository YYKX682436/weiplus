package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.GlGenericDrawer */
/* loaded from: classes14.dex */
public class C29780x5172a8a3 implements org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer {

    /* renamed from: DEFAULT_VERTEX_SHADER_STRING */
    private static final java.lang.String f75401xcf2e79ae = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";

    /* renamed from: FULL_RECTANGLE_BUFFER */
    private static final java.nio.FloatBuffer f75402xb96bd8e0 = org.p3371xd0ce3e8d.C29784x7f4262a7.m155562xa4cb3f20(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});

    /* renamed from: FULL_RECTANGLE_TEXTURE_BUFFER */
    private static final java.nio.FloatBuffer f75403x9b82d4a4 = org.p3371xd0ce3e8d.C29784x7f4262a7.m155562xa4cb3f20(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    /* renamed from: INPUT_TEXTURE_COORDINATE_NAME */
    private static final java.lang.String f75404x182edc19 = "in_tc";

    /* renamed from: INPUT_VERTEX_COORDINATE_NAME */
    private static final java.lang.String f75405x647da88c = "in_pos";

    /* renamed from: TEXTURE_MATRIX_NAME */
    private static final java.lang.String f75406xf5d1ef05 = "tex_mat";

    /* renamed from: currentShader */
    private org.p3371xd0ce3e8d.C29782xb41dd54a f75407x850562be;

    /* renamed from: currentShaderType */
    private org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType f75408xea21d718;

    /* renamed from: genericFragmentSource */
    private final java.lang.String f75409xe1b8c42;

    /* renamed from: inPosLocation */
    private int f75410xa54a83c4;

    /* renamed from: inTcLocation */
    private int f75411x15dbb249;

    /* renamed from: shaderCallbacks */
    private final org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks f75412x40dda269;

    /* renamed from: texMatrixLocation */
    private int f75413xeb6e069d;

    /* renamed from: vertexShader */
    private final java.lang.String f75414x9d1f4aa9;

    /* renamed from: org.webrtc.GlGenericDrawer$ShaderCallbacks */
    /* loaded from: classes14.dex */
    public interface ShaderCallbacks {
        /* renamed from: onNewShader */
        void mo155543xd9f79286(org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a);

        /* renamed from: onPrepareShader */
        void mo155544x7a6c342d(org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a, float[] fArr, int i17, int i18, int i19, int i27);
    }

    /* renamed from: org.webrtc.GlGenericDrawer$ShaderType */
    /* loaded from: classes14.dex */
    public enum ShaderType {
        OES,
        RGB,
        YUV
    }

    public C29780x5172a8a3(java.lang.String str, org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks shaderCallbacks) {
        this(f75401xcf2e79ae, str, shaderCallbacks);
    }

    /* renamed from: createFragmentShaderString */
    public static java.lang.String m155536x1aa641e2(java.lang.String str, org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType shaderType) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType shaderType2 = org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType.OES;
        if (shaderType == shaderType2) {
            sb6.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb6.append("precision mediump float;\nvarying vec2 tc;\n");
        if (shaderType == org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType.YUV) {
            sb6.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nvec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            sb6.append(str);
        } else {
            java.lang.String str2 = shaderType == shaderType2 ? "samplerExternalOES" : "sampler2D";
            sb6.append("uniform ");
            sb6.append(str2);
            sb6.append(" tex;\n");
            sb6.append(str.replace("sample(", "texture2D(tex, "));
        }
        return sb6.toString();
    }

    /* renamed from: prepareShader */
    private void m155537x475d4fcc(org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType shaderType, float[] fArr, int i17, int i18, int i19, int i27) {
        org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a;
        if (shaderType.equals(this.f75408xea21d718)) {
            c29782xb41dd54a = this.f75407x850562be;
        } else {
            this.f75408xea21d718 = null;
            org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a2 = this.f75407x850562be;
            if (c29782xb41dd54a2 != null) {
                c29782xb41dd54a2.m155551x41012807();
                this.f75407x850562be = null;
            }
            org.p3371xd0ce3e8d.C29782xb41dd54a m155538x5ad95801 = m155538x5ad95801(shaderType);
            this.f75408xea21d718 = shaderType;
            this.f75407x850562be = m155538x5ad95801;
            m155538x5ad95801.m155554x8cecfafd();
            if (shaderType == org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType.YUV) {
                android.opengl.GLES20.glUniform1i(m155538x5ad95801.m155550xd5a6bb53("y_tex"), 0);
                android.opengl.GLES20.glUniform1i(m155538x5ad95801.m155550xd5a6bb53("u_tex"), 1);
                android.opengl.GLES20.glUniform1i(m155538x5ad95801.m155550xd5a6bb53("v_tex"), 2);
            } else {
                android.opengl.GLES20.glUniform1i(m155538x5ad95801.m155550xd5a6bb53("tex"), 0);
            }
            org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("Create shader");
            this.f75412x40dda269.mo155543xd9f79286(m155538x5ad95801);
            this.f75413xeb6e069d = m155538x5ad95801.m155550xd5a6bb53(f75406xf5d1ef05);
            this.f75410xa54a83c4 = m155538x5ad95801.m155549xcad29595(f75405x647da88c);
            this.f75411x15dbb249 = m155538x5ad95801.m155549xcad29595(f75404x182edc19);
            c29782xb41dd54a = m155538x5ad95801;
        }
        c29782xb41dd54a.m155554x8cecfafd();
        android.opengl.GLES20.glEnableVertexAttribArray(this.f75410xa54a83c4);
        android.opengl.GLES20.glVertexAttribPointer(this.f75410xa54a83c4, 2, 5126, false, 0, (java.nio.Buffer) f75402xb96bd8e0);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f75411x15dbb249);
        android.opengl.GLES20.glVertexAttribPointer(this.f75411x15dbb249, 2, 5126, false, 0, (java.nio.Buffer) f75403x9b82d4a4);
        android.opengl.GLES20.glUniformMatrix4fv(this.f75413xeb6e069d, 1, false, fArr, 0);
        this.f75412x40dda269.mo155544x7a6c342d(c29782xb41dd54a, fArr, i17, i18, i19, i27);
        org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("Prepare shader");
    }

    /* renamed from: createShader */
    public org.p3371xd0ce3e8d.C29782xb41dd54a m155538x5ad95801(org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType shaderType) {
        return new org.p3371xd0ce3e8d.C29782xb41dd54a(this.f75414x9d1f4aa9, m155536x1aa641e2(this.f75409xe1b8c42, shaderType));
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: drawOes */
    public void mo155539x7205d179(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        m155537x475d4fcc(org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType.OES, fArr, i18, i19, i29, i37);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, i17);
        android.opengl.GLES20.glViewport(i27, i28, i29, i37);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glBindTexture(36197, 0);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: drawRgb */
    public void mo155540x7205dce9(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        m155537x475d4fcc(org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType.RGB, fArr, i18, i19, i29, i37);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glViewport(i27, i28, i29, i37);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: drawYuv */
    public void mo155541x7205f8f6(int[] iArr, float[] fArr, int i17, int i18, int i19, int i27, int i28, int i29) {
        m155537x475d4fcc(org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderType.YUV, fArr, i17, i18, i28, i29);
        for (int i37 = 0; i37 < 3; i37++) {
            android.opengl.GLES20.glActiveTexture(33984 + i37);
            android.opengl.GLES20.glBindTexture(3553, iArr[i37]);
        }
        android.opengl.GLES20.glViewport(i19, i27, i28, i29);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        for (int i38 = 0; i38 < 3; i38++) {
            android.opengl.GLES20.glActiveTexture(i38 + 33984);
            android.opengl.GLES20.glBindTexture(3553, 0);
        }
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: release */
    public void mo155542x41012807() {
        org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a = this.f75407x850562be;
        if (c29782xb41dd54a != null) {
            c29782xb41dd54a.m155551x41012807();
            this.f75407x850562be = null;
            this.f75408xea21d718 = null;
        }
    }

    public C29780x5172a8a3(java.lang.String str, java.lang.String str2, org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks shaderCallbacks) {
        this.f75414x9d1f4aa9 = str;
        this.f75409xe1b8c42 = str2;
        this.f75412x40dda269 = shaderCallbacks;
    }
}
