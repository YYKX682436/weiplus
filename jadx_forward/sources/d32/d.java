package d32;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f307673d;

    public d(d32.j jVar) {
        this.f307673d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        int i17;
        java.lang.Object obj = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
        d32.j jVar = this.f307673d;
        javax.microedition.khronos.egl.EGL10 egl10 = jVar.f307683c;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(obj);
        jVar.f307684d = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "egl get display error: %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
        }
        int i18 = 0;
        if (egl10.eglInitialize(jVar.f307684d, new int[2])) {
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = jVar.f307684d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eGLDisplay, "eGLDisplay");
            int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};
            int[] iArr2 = new int[1];
            egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2);
            int i19 = iArr2[0];
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i19];
            if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i19, iArr2)) {
                eGLConfig = eGLConfigArr[0];
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureGLUtil", "egl choose config failed: %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
                eGLConfig = null;
            }
            jVar.f307687g = eGLConfig;
            if (eGLConfig != null) {
                jVar.f307685e = egl10.eglCreateContext(jVar.f307684d, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(jVar.f307684d, eGLConfig, new int[]{12375, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 12374, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 12344});
                jVar.f307686f = eglCreatePbufferSurface;
                if (eglCreatePbufferSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE || jVar.f307685e == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                    if (egl10.eglGetError() == 12299) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglCreateWindowSurface failed : %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
                    }
                    i17 = -1;
                } else {
                    i17 = 0;
                }
                if (i17 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "createEGLContext failed " + i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 25L, 1L);
                } else {
                    javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = jVar.f307684d;
                    javax.microedition.khronos.egl.EGLSurface eGLSurface = jVar.f307686f;
                    if (!egl10.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, jVar.f307685e)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "eglMakeCurrent failed : " + android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 25L, 1L);
                    }
                    javax.microedition.khronos.opengles.GL gl6 = jVar.f307685e.getGL();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gl6, "null cannot be cast to non-null type javax.microedition.khronos.opengles.GL10");
                    jVar.f307688h = (javax.microedition.khronos.opengles.GL10) gl6;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureEGLPixelBuffer", "egl init error: %s", android.opengl.GLUtils.getEGLErrorString(egl10.eglGetError()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markPixelBufferInitFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 25L, 1L);
        }
        d32.k kVar = new d32.k(jVar.f307681a, jVar.f307682b);
        jVar.f307689i = kVar;
        if (!kVar.H) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureMixRenderer", "init: ");
            is0.c b17 = is0.b.b(false, -1L);
            kVar.f307701g = new android.graphics.SurfaceTexture(b17.f375928e);
            kVar.f307700f = b17;
            d32.b bVar = d32.c.f307669a;
            kVar.f307702h = is0.b.b(true, -1L);
            int b18 = bVar.b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        uniform mat4 uMatrix;\n        void main() {\n            gl_Position = uMatrix * a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES videoExternalTexture;\n        uniform sampler2D videoNormalTexture;\n        uniform sampler2D emojiTexture;\n        uniform vec2 size;\n        uniform float radius;\n        uniform int hasEmojiTexture;\n        uniform int useNormalVideoTexture;\n        uniform int enableAlpha;\n\n        vec4 blendTexture(vec4 source, vec4 blend) {\n            if (blend.a <= 0.0) {\n                return source;\n            }\n            float sourceAlpha = 1.0 - blend.a;\n            float alpha = max(source.a, blend.a);\n            float r = max(0.0, min(sourceAlpha * source.r + blend.r, 1.0));\n            float g = max(0.0, min(sourceAlpha * source.g + blend.g, 1.0));\n            float b = max(0.0, min(sourceAlpha * source.b + blend.b, 1.0));\n            vec4 result = vec4(r, g, b, alpha);\n            if (alpha != 1.0) {\n                r = r + (1.0 - alpha) * 0.95;\n                g = g + (1.0 - alpha) * 0.95;\n                b = b + (1.0 - alpha) * 0.95;\n                r = max(0.0, min(r, 1.0));\n                g = max(0.0, min(g, 1.0));\n                b = max(0.0, min(b, 1.0));\n                return vec4(r, g, b, 1.0);\n            } else {\n                return vec4(r, g, b, alpha);\n            }\n        }\n\n        void main () {\n            vec2 bottomLeftCenter = vec2(radius, radius);\n            vec2 bottomRightCenter = vec2(size.x - radius, radius);\n            vec2 topLeftCenter = vec2(radius, size.y - radius);\n            vec2 topRightCenter = vec2(size.x - radius, size.y - radius);\n            if ((gl_FragCoord.x < bottomLeftCenter.x && gl_FragCoord.y < bottomLeftCenter.y && distance(gl_FragCoord.xy, bottomLeftCenter) > radius) ||\n                    (gl_FragCoord.x > bottomRightCenter.x && gl_FragCoord.y < bottomRightCenter.y && distance(gl_FragCoord.xy, bottomRightCenter) > radius) ||\n                    (gl_FragCoord.x < topLeftCenter.x && gl_FragCoord.y > topLeftCenter.y && distance(gl_FragCoord.xy, topLeftCenter) > radius) ||\n                    (gl_FragCoord.x > topRightCenter.x && gl_FragCoord.y > topRightCenter.y && distance(gl_FragCoord.xy, topRightCenter) > radius))  {\n                gl_FragColor = vec4(0.0, 0.0, 0.0, 0.0);\n                return;\n            } else {\n                vec4 videoColor;\n                if (useNormalVideoTexture == 1) {\n                    videoColor = texture2D(videoNormalTexture, v_texCoord);\n                } else {\n                    videoColor = texture2D(videoExternalTexture, v_texCoord);\n                }\n                if (enableAlpha == 0) {\n                    if (videoColor.a < 0.3) {\n                        videoColor = vec4(0.0, 0.0, 0.0, 0.0);\n                    } else {\n                        videoColor.a = 1.0;\n                    }\n                } else {\n                    if (videoColor.a == 0.0) {\n                        videoColor = vec4(0.0, 0.0, 0.0, 0.0);\n                    }\n                }\n                if (hasEmojiTexture == 1) {\n                    gl_FragColor = blendTexture(videoColor, texture2D(emojiTexture, v_texCoord));\n                } else {\n                    gl_FragColor = videoColor;\n                }\n            }\n        }\n        ");
            kVar.f307704j = b18;
            kVar.f307705k = android.opengl.GLES20.glGetAttribLocation(b18, "a_position");
            kVar.f307706l = android.opengl.GLES20.glGetAttribLocation(kVar.f307704j, "a_texCoord");
            kVar.f307707m = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "videoExternalTexture");
            kVar.f307708n = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "videoNormalTexture");
            kVar.f307709o = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "emojiTexture");
            kVar.f307710p = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "size");
            kVar.f307711q = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "radius");
            kVar.f307712r = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "hasEmojiTexture");
            kVar.f307714t = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "uMatrix");
            kVar.f307713s = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "useNormalVideoTexture");
            kVar.f307715u = android.opengl.GLES20.glGetUniformLocation(kVar.f307704j, "enableAlpha");
            int b19 = bVar.b("\n        attribute vec4 a_position;\n        attribute vec2 a_texCoord;\n        varying vec2 v_texCoord;\n        void main() {\n            gl_Position = a_position;\n            v_texCoord = a_texCoord;\n        }\n        ", "\n        #extension GL_OES_EGL_image_external : require\n        #ifdef GL_ES\n        precision highp float;\n        #endif\n\n        varying vec2 v_texCoord;\n        uniform samplerExternalOES texture;\n\n        void main () {\n            gl_FragColor = texture2D(texture, v_texCoord);\n        }\n        ");
            kVar.f307716v = b19;
            kVar.f307717w = android.opengl.GLES20.glGetAttribLocation(b19, "a_position");
            kVar.f307718x = android.opengl.GLES20.glGetAttribLocation(kVar.f307716v, "a_texCoord");
            kVar.f307719y = android.opengl.GLES20.glGetUniformLocation(kVar.f307716v, "texture");
            kVar.D.put(d32.c.f307670b);
            kVar.E.put(d32.c.f307671c);
            int[] iArr3 = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr3, 0);
            int i27 = iArr3[0];
            if (i27 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureGLUtil", "gen frame buffer error");
            } else {
                i18 = i27;
            }
            kVar.A = i18;
            kVar.B = is0.b.b(true, -1L);
            kVar.C = is0.b.b(true, -1L);
            kVar.H = true;
        }
        d32.k kVar2 = jVar.f307689i;
        if (kVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
            throw null;
        }
        android.graphics.SurfaceTexture surfaceTexture = kVar2.f307701g;
        if (surfaceTexture == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecodeSurfaceTexture");
            throw null;
        }
        surfaceTexture.setOnFrameAvailableListener(new d32.g(jVar));
        d32.k kVar3 = jVar.f307689i;
        if (kVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
            throw null;
        }
        android.graphics.SurfaceTexture surfaceTexture2 = kVar3.f307701g;
        if (surfaceTexture2 != null) {
            jVar.f307690j = new android.view.Surface(surfaceTexture2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecodeSurfaceTexture");
            throw null;
        }
    }
}
