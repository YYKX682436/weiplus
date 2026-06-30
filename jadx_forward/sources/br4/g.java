package br4;

/* loaded from: classes14.dex */
public class g implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public volatile br4.c f105255a;

    /* renamed from: b, reason: collision with root package name */
    public volatile br4.b f105256b;

    /* renamed from: q, reason: collision with root package name */
    public boolean f105271q;

    /* renamed from: r, reason: collision with root package name */
    public int f105272r;

    /* renamed from: x, reason: collision with root package name */
    public qm5.n f105278x;

    /* renamed from: c, reason: collision with root package name */
    public int f105257c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f105258d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f105259e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f105260f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f105261g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f105262h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f105263i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f105264j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f105265k = 3;

    /* renamed from: l, reason: collision with root package name */
    public java.nio.ByteBuffer f105266l = java.nio.ByteBuffer.allocate(0);

    /* renamed from: m, reason: collision with root package name */
    public java.nio.ByteBuffer f105267m = java.nio.ByteBuffer.allocate(0);

    /* renamed from: n, reason: collision with root package name */
    public java.nio.ByteBuffer f105268n = java.nio.ByteBuffer.allocate(0);

    /* renamed from: o, reason: collision with root package name */
    public java.nio.ByteBuffer f105269o = java.nio.ByteBuffer.allocate(0);

    /* renamed from: p, reason: collision with root package name */
    public java.nio.ByteBuffer f105270p = java.nio.ByteBuffer.allocate(0);

    /* renamed from: s, reason: collision with root package name */
    public int f105273s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f105274t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f105275u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f105276v = false;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f105277w = false;

    /* renamed from: y, reason: collision with root package name */
    public int f105279y = 5;

    /* renamed from: z, reason: collision with root package name */
    public float f105280z = 0.0f;
    public int A = 0;
    public int B = 0;
    public int C = 0;

    public boolean a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoipRenderer", "attachGLContext isContextAttached:%b, mHProgram:%s", java.lang.Boolean.valueOf(this.f105264j), this.f105256b);
        if (!this.f105264j && this.f105256b != null) {
            try {
                this.f105256b.a();
                this.f105264j = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "attachGLContext done!");
            } catch (java.lang.Exception e17) {
                this.f105264j = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipRenderer", e17, "attachGLContext error!", new java.lang.Object[0]);
            }
        }
        return this.f105264j;
    }

    public void b(int i17, int i18, float[] fArr, float[] fArr2) {
        float f17;
        int i19 = this.f105257c;
        int i27 = i18 * i19;
        int i28 = this.f105258d;
        float f18 = 0.0f;
        if (i27 < i17 * i28) {
            f17 = 0.5f - (((i18 * 1.0f) * i19) / ((i17 * 2.0f) * i28));
        } else {
            f18 = 0.5f - (((i17 * 1.0f) * i28) / ((i18 * 2.0f) * i19));
            f17 = 0.0f;
        }
        fArr2[0] = f18;
        float f19 = 1.0f - f17;
        fArr2[1] = f19;
        float f27 = 1.0f - f18;
        fArr2[2] = f27;
        fArr2[3] = f19;
        fArr2[4] = f18;
        fArr2[5] = f17;
        fArr2[6] = f27;
        fArr2[7] = f17;
        fArr[0] = -1.0f;
        fArr[1] = 1.0f;
        fArr[2] = -1.0f;
        fArr[3] = -1.0f;
        fArr[4] = 1.0f;
        fArr[5] = 1.0f;
        fArr[6] = 1.0f;
        fArr[7] = -1.0f;
        if (this.f105256b != null) {
            br4.b bVar = this.f105256b;
            bVar.getClass();
            java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            bVar.f105221b = asFloatBuffer;
            asFloatBuffer.put(fArr);
            bVar.f105221b.position(0);
            java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(fArr2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
            bVar.f105222c = asFloatBuffer2;
            asFloatBuffer2.put(fArr2);
            bVar.f105222c.position(0);
        }
    }

    public final void c(int i17, int i18, boolean z17, float[] textureCoords, float[] fArr, int i19) {
        int i27;
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        float f37;
        float f38;
        float f39 = 0.5f;
        if (i19 == 90 || i19 == 270) {
            if (z17) {
                float f47 = i17;
                f27 = ((0.0f / f47) / 2.0f) + 0.005f;
                float f48 = i18;
                float f49 = ((0.0f / f48) / 2.0f) + 0.005f;
                int i28 = i17 - 0;
                int i29 = i18 - 0;
                int i37 = this.f105258d;
                int i38 = i28 * i37;
                int i39 = this.f105257c;
                if (i38 < i29 * i39) {
                    f29 = (0.5f - (((i28 * 1.0f) * i37) / ((f48 * 2.0f) * i39))) + 0.005f;
                    f28 = 0.0f;
                } else {
                    f28 = (0.5f - (((i29 * 1.0f) * i39) / ((f47 * 2.0f) * i37))) + 0.005f;
                    f29 = 0.0f;
                }
                if (f28 > f27) {
                    f27 = f28;
                }
                if (f29 > f49) {
                    f49 = f29;
                }
                f37 = f49;
            } else {
                i27 = this.f105258d;
                int i47 = i17 * i27;
                int i48 = this.f105257c;
                if (i47 < i18 * i48) {
                    f19 = ((i17 * 1.0f) * i27) / ((i18 * 2.0f) * i48);
                    f39 = 0.5f;
                    f37 = f39 - f19;
                    f27 = 0.0f;
                } else {
                    f39 = 0.5f;
                    f17 = i18 * 1.0f;
                    f18 = i48;
                    f27 = f39 - ((f17 * f18) / ((i17 * 2.0f) * i27));
                    f37 = 0.0f;
                }
            }
        } else if (z17) {
            float f57 = i17;
            float f58 = ((0.0f / f57) / 2.0f) + 0.005f;
            float f59 = i18;
            float f66 = ((0.0f / f59) / 2.0f) + 0.005f;
            int i49 = i17 - 0;
            int i57 = i18 - 0;
            int i58 = this.f105257c;
            int i59 = i49 * i58;
            int i66 = this.f105258d;
            if (i59 < i57 * i66) {
                f38 = (0.5f - (((i49 * 1.0f) * i58) / ((f59 * 2.0f) * i66))) + 0.005f;
                f27 = 0.0f;
            } else {
                f27 = (0.5f - (((i57 * 1.0f) * i66) / ((f57 * 2.0f) * i58))) + 0.005f;
                f38 = 0.0f;
            }
            if (f27 <= f58) {
                f27 = f58;
            }
            if (f38 > f66) {
                f66 = f38;
            }
            f37 = f66;
        } else {
            i27 = this.f105257c;
            int i67 = i17 * i27;
            int i68 = this.f105258d;
            if (i67 < i18 * i68) {
                f19 = ((i17 * 1.0f) * i27) / ((i18 * 2.0f) * i68);
                f37 = f39 - f19;
                f27 = 0.0f;
            } else {
                f17 = i18 * 1.0f;
                f18 = i68;
                f27 = f39 - ((f17 * f18) / ((i17 * 2.0f) * i27));
                f37 = 0.0f;
            }
        }
        int i69 = this.f105272r;
        if (i69 == 1) {
            textureCoords[0] = f27;
            boolean z18 = this.f105271q;
            textureCoords[1] = z18 ? 1.0f - f37 : f37;
            float f67 = 1.0f - f27;
            textureCoords[2] = f67;
            textureCoords[3] = z18 ? 1.0f - f37 : f37;
            textureCoords[4] = f27;
            textureCoords[5] = z18 ? f37 : 1.0f - f37;
            textureCoords[6] = f67;
            if (!z18) {
                f37 = 1.0f - f37;
            }
            textureCoords[7] = f37;
            fArr[0] = 1.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = -1.0f;
            fArr[4] = -1.0f;
            fArr[5] = 1.0f;
            fArr[6] = -1.0f;
            fArr[7] = -1.0f;
        } else if (i69 == 3) {
            textureCoords[0] = f27;
            boolean z19 = this.f105271q;
            textureCoords[1] = z19 ? 1.0f - f37 : f37;
            float f68 = 1.0f - f27;
            textureCoords[2] = f68;
            textureCoords[3] = z19 ? 1.0f - f37 : f37;
            textureCoords[4] = f27;
            textureCoords[5] = z19 ? f37 : 1.0f - f37;
            textureCoords[6] = f68;
            if (!z19) {
                f37 = 1.0f - f37;
            }
            textureCoords[7] = f37;
            fArr[0] = -1.0f;
            fArr[1] = -1.0f;
            fArr[2] = -1.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = -1.0f;
            fArr[6] = 1.0f;
            fArr[7] = 1.0f;
        }
        rs0.g gVar = rs0.i.f480829a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureCoords, "textureCoords");
        if (i19 == 90) {
            float f69 = textureCoords[0];
            float f76 = textureCoords[1];
            textureCoords[0] = textureCoords[4];
            textureCoords[1] = textureCoords[5];
            textureCoords[4] = textureCoords[6];
            textureCoords[5] = textureCoords[7];
            textureCoords[6] = textureCoords[2];
            textureCoords[7] = textureCoords[3];
            textureCoords[2] = f69;
            textureCoords[3] = f76;
        } else if (i19 == 180) {
            gVar.w(textureCoords, 0, 6);
            gVar.w(textureCoords, 1, 7);
            gVar.w(textureCoords, 2, 4);
            gVar.w(textureCoords, 3, 5);
        } else if (i19 == 270) {
            float f77 = textureCoords[0];
            float f78 = textureCoords[1];
            textureCoords[0] = textureCoords[2];
            textureCoords[1] = textureCoords[3];
            textureCoords[2] = textureCoords[6];
            textureCoords[3] = textureCoords[7];
            textureCoords[6] = textureCoords[4];
            textureCoords[7] = textureCoords[5];
            textureCoords[4] = f77;
            textureCoords[5] = f78;
        }
        if (this.f105255a != null) {
            this.f105255a.b(fArr, textureCoords);
        }
    }

    public void d(int i17, int i18, int i19) {
        if (this.f105263i == 1 || this.f105255a == null) {
            return;
        }
        int i27 = this.f105265k;
        if (i27 == 0 || i27 == 1) {
            c(i17, i18, true, this.f105255a.f105247w, this.f105255a.f105246v, 0);
        } else {
            c(i17, i18, false, this.f105255a.f105247w, this.f105255a.f105246v, i19);
        }
    }

    public boolean e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoipRenderer", "detachGLContext isContextAttached:%b!", java.lang.Boolean.valueOf(this.f105264j));
        if (this.f105264j && this.f105256b != null) {
            try {
                this.f105256b.b();
                this.f105264j = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "detachGLContext done!");
            } catch (java.lang.Exception e17) {
                this.f105264j = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipRenderer", e17, "detachGLContext error!", new java.lang.Object[0]);
            }
        }
        return this.f105264j;
    }

    public void f(int i17) {
        int i18;
        int i19;
        if (this.f105263i != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "setRenderType: %s, screenWidth: %s, screenHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f105257c), java.lang.Integer.valueOf(this.f105258d));
            this.f105263i = i17;
            if (i17 != 1 && (i18 = this.f105259e) > 0 && (i19 = this.f105260f) > 0) {
                d(i18, i19, this.C);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        synchronized (this) {
            android.opengl.GLES20.glViewport(0, 0, this.f105257c, this.f105258d);
            android.opengl.GLES20.glClear(16640);
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            if (this.f105263i == 0) {
                if (!this.f105277w || this.f105255a == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipRenderer", "render soft draw error, cannot draw yuv now");
                } else {
                    if (this.f105267m.capacity() == this.f105260f * this.f105259e) {
                        this.f105267m.position(0);
                        int i17 = (this.f105260f * this.f105259e) / 4;
                        if (this.f105265k == 3) {
                            if (this.f105270p.capacity() == i17 * 2) {
                                this.f105270p.position(0);
                                br4.c cVar = this.f105255a;
                                java.nio.ByteBuffer byteBuffer = this.f105267m;
                                java.nio.ByteBuffer byteBuffer2 = this.f105270p;
                                int i18 = this.f105259e;
                                int i19 = this.f105260f;
                                cVar.g(byteBuffer, i18, i19, 0);
                                cVar.f105226b[1].a(i18 / 2, i19 / 2, 6410, byteBuffer2, 9729, 33071);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipRenderer", "RENDER_NV21 draw error, uv buffer size not match, uv.capacity:%s, videoSize:%sx%s", java.lang.Integer.valueOf(this.f105270p.capacity()), java.lang.Integer.valueOf(this.f105259e), java.lang.Integer.valueOf(this.f105260f));
                            }
                        } else if (this.f105268n.capacity() == i17 && this.f105269o.capacity() == i17) {
                            this.f105268n.position(0);
                            this.f105269o.position(0);
                            br4.c cVar2 = this.f105255a;
                            java.nio.ByteBuffer byteBuffer3 = this.f105267m;
                            java.nio.ByteBuffer byteBuffer4 = this.f105268n;
                            java.nio.ByteBuffer byteBuffer5 = this.f105269o;
                            int i27 = this.f105259e;
                            int i28 = this.f105260f;
                            cVar2.g(byteBuffer3, i27, i28, 0);
                            int i29 = i27 / 2;
                            int i37 = i28 / 2;
                            cVar2.g(byteBuffer4, i29, i37, 1);
                            cVar2.g(byteBuffer5, i29, i37, 2);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipRenderer", "RENDER_YV12/RENDER_YV12Edge draw error, uv buffer size not match, u.capacity:%s, v.capacity:%s, videoSize:%sx%s", java.lang.Integer.valueOf(this.f105268n.capacity()), java.lang.Integer.valueOf(this.f105269o.capacity()), java.lang.Integer.valueOf(this.f105259e), java.lang.Integer.valueOf(this.f105260f));
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipRenderer", "draw error, y buffer size not match, y.capacity:%s, videoSize:%sx%s", java.lang.Integer.valueOf(this.f105267m.capacity()), java.lang.Integer.valueOf(this.f105259e), java.lang.Integer.valueOf(this.f105260f));
                    }
                    try {
                        if (this.f105274t == 1) {
                            br4.c cVar3 = this.f105255a;
                            int i38 = this.f105279y;
                            float f17 = this.f105280z;
                            if (cVar3.f105237m) {
                                qm5.f fVar = cVar3.f105231g;
                                qm5.e eVar = fVar.f446344l;
                                qm5.d dVar = fVar.f446343k;
                                if (i38 >= 4) {
                                    dVar.g(new qm5.a(dVar, dVar.f446337q, 1));
                                    eVar.g(new qm5.a(eVar, eVar.f446342t, 1));
                                } else {
                                    dVar.g(new qm5.a(dVar, dVar.f446337q, 0));
                                    eVar.g(new qm5.a(eVar, eVar.f446342t, 0));
                                }
                                qm5.d dVar2 = cVar3.f105231g.f446343k;
                                dVar2.f446336p = f17;
                                dVar2.g(new qm5.b(dVar2, dVar2.f446339s, f17));
                            }
                        }
                        this.f105255a.d(this.f105265k, this.f105273s, this.f105272r, this.f105276v);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoipRenderer", e17.getMessage());
                    }
                }
                this.f105277w = false;
            } else if (this.f105256b != null) {
                int i39 = this.B + 1;
                this.B = i39;
                if (i39 % 100 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "steve: remote HW texture videoSize:%sx%s, mHardDrawCnt:%d", java.lang.Integer.valueOf(this.f105261g), java.lang.Integer.valueOf(this.f105262h), java.lang.Integer.valueOf(this.B));
                }
                b(this.f105261g, this.f105262h, br4.b.f105218f, br4.b.f105219g);
                this.f105256b.c();
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "onSurfaceChanged and render type is %s, dataType is %s ", java.lang.Integer.valueOf(this.f105263i), java.lang.Integer.valueOf(this.f105265k));
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        if (this.f105255a == null) {
            this.f105255a = new br4.c();
        }
        if (this.f105256b == null) {
            this.f105256b = new br4.b();
        }
        this.f105258d = i18;
        this.f105257c = i17;
        int i27 = this.f105259e;
        if (i27 > 0 && (i19 = this.f105260f) > 0) {
            d(i27, i19, this.C);
        }
        if (this.f105255a != null) {
            br4.c cVar = this.f105255a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLSProgram", "onSurfaceChanged, width: %s, height: %s, surfaceWidth: %s, surfaceHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(cVar.f105239o), java.lang.Integer.valueOf(cVar.f105240p));
            if (i17 != cVar.f105239o || cVar.f105240p != i18) {
                cVar.f105239o = i17;
                cVar.f105240p = i18;
                br4.a aVar = cVar.f105230f;
                aVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipGLSProgram", "onSurfaceChanged: %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                aVar.f105201d = i17;
                aVar.f105202e = i18;
                qm5.f fVar = cVar.f105231g;
                fVar.f446357y = i17;
                fVar.f446358z = i18;
            }
        }
        this.f105275u = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "onSurfaceCreated and render type is %s", java.lang.Integer.valueOf(this.f105263i));
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.f105255a == null) {
            this.f105255a = new br4.c();
        }
        if (this.f105256b == null) {
            this.f105256b = new br4.b();
        }
        this.f105278x = new qm5.n();
        this.A = 0;
        this.B = 0;
    }
}
