package os0;

/* loaded from: classes14.dex */
public abstract class a {
    public android.graphics.Point A;
    public android.graphics.Point B;

    /* renamed from: a, reason: collision with root package name */
    public int f429525a;

    /* renamed from: b, reason: collision with root package name */
    public int f429526b;

    /* renamed from: c, reason: collision with root package name */
    public int f429527c;

    /* renamed from: d, reason: collision with root package name */
    public int f429528d;

    /* renamed from: e, reason: collision with root package name */
    public int f429529e;

    /* renamed from: f, reason: collision with root package name */
    public int f429530f;

    /* renamed from: g, reason: collision with root package name */
    public final java.nio.FloatBuffer f429531g;

    /* renamed from: h, reason: collision with root package name */
    public final java.nio.FloatBuffer f429532h;

    /* renamed from: i, reason: collision with root package name */
    public is0.c f429533i;

    /* renamed from: j, reason: collision with root package name */
    public is0.a f429534j;

    /* renamed from: k, reason: collision with root package name */
    public java.nio.ByteBuffer f429535k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f429536l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f429537m;

    /* renamed from: n, reason: collision with root package name */
    public int f429538n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f429539o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f429540p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Rect f429541q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f429542r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f429543s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.q f429544t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f429545u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f429546v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f429547w;

    /* renamed from: x, reason: collision with root package name */
    public int f429548x;

    /* renamed from: y, reason: collision with root package name */
    public int f429549y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f429550z;

    public a(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f429525a = i17;
        this.f429526b = i18;
        this.f429527c = i19;
        this.f429528d = i27;
        this.f429529e = i28;
        this.f429530f = i29;
        rs0.g gVar = rs0.i.f480829a;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.f429531g = asFloatBuffer;
        rs0.g gVar2 = rs0.i.f480829a;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.f429532h = asFloatBuffer2;
        this.f429536l = new float[16];
        this.f429545u = true;
        this.f429548x = -1;
        this.f429549y = -1;
        this.f429550z = new java.util.concurrent.LinkedBlockingQueue();
        this.A = new android.graphics.Point(0, this.f429526b);
        this.B = new android.graphics.Point(this.f429525a, 0);
        int i37 = this.f429529e;
        if (i37 == 2) {
            this.f429533i = is0.b.b(true, 3L);
            this.f429534j = is0.b.f375924a.a(3L);
        } else if (i37 == 3) {
            h();
        }
    }

    public void f() {
        java.nio.IntBuffer asIntBuffer;
        if (!this.f429546v || !this.f429547w) {
            int i17 = this.f429529e;
            if (i17 == 3) {
                if (this.f429535k == null) {
                    h();
                }
                java.nio.ByteBuffer byteBuffer = this.f429535k;
                if (byteBuffer != null) {
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    android.opengl.GLES20.glReadPixels(0, 0, this.f429527c, this.f429528d, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, this.f429535k);
                    android.opengl.GLES20.glFinish();
                    yz5.l lVar = this.f429542r;
                    if (lVar != null) {
                        java.nio.ByteBuffer byteBuffer2 = this.f429535k;
                        asIntBuffer = byteBuffer2 != null ? byteBuffer2.asIntBuffer() : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(asIntBuffer);
                        lVar.mo146xb9724478(asIntBuffer);
                    }
                }
            } else if (i17 == 2) {
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
            }
            android.opengl.GLES20.glUseProgram(0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        this.f429547w = false;
        if (this.f429550z.size() < 2 && this.f429548x > 0 && this.f429549y > 0) {
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f429550z;
            if (linkedBlockingQueue.size() < 2) {
                if (this.f429545u) {
                    int size = 2 - linkedBlockingQueue.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        linkedBlockingQueue.add(java.nio.ByteBuffer.allocateDirect(this.f429548x * this.f429549y * 4).order(java.nio.ByteOrder.nativeOrder()));
                    }
                } else {
                    int size2 = 2 - linkedBlockingQueue.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        linkedBlockingQueue.add(java.nio.ByteBuffer.allocate(this.f429548x * this.f429549y * 4).order(java.nio.ByteOrder.nativeOrder()));
                    }
                }
            }
        }
        if (this.f429550z.size() < 2 || this.f429548x < 0 || this.f429549y < 0) {
            this.f429546v = false;
            return;
        }
        is0.a aVar = this.f429534j;
        if (aVar != null) {
            android.opengl.GLES20.glBindFramebuffer(36160, aVar.f375920e);
        }
        java.nio.ByteBuffer order = this.f429550z.size() > 0 ? (java.nio.ByteBuffer) this.f429550z.take() : java.nio.ByteBuffer.allocate(this.f429548x * this.f429549y * 4).order(java.nio.ByteOrder.nativeOrder());
        if (order != null) {
            order.position(0);
        }
        android.opengl.GLES20.glReadPixels(0, 0, this.f429548x, this.f429549y, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, order);
        android.opengl.GLES20.glFinish();
        yz5.l lVar2 = this.f429543s;
        if (lVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(order);
            lVar2.mo146xb9724478(order);
        }
        yz5.q qVar = this.f429544t;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(order);
            qVar.mo147xb9724478(order, java.lang.Integer.valueOf(this.f429548x), java.lang.Integer.valueOf(this.f429549y));
        }
        yz5.l lVar3 = this.f429542r;
        if (lVar3 != null) {
            asIntBuffer = order != null ? order.asIntBuffer() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(asIntBuffer);
            lVar3.mo146xb9724478(asIntBuffer);
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        this.f429546v = false;
        if (this.f429550z.size() < 2) {
            this.f429550z.add(order);
        }
    }

    public void g() {
        float[] fArr = this.f429536l;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        yz5.l lVar = this.f429537m;
        if (lVar != null) {
            lVar.mo146xb9724478(fArr);
        }
        android.opengl.Matrix.rotateM(this.f429536l, 0, this.f429538n, 0.0f, 0.0f, -1.0f);
        if (this.f429539o || this.f429529e == 3) {
            int i17 = this.f429538n;
            if (i17 == 90 || i17 == 270) {
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            }
        } else {
            android.opengl.Matrix.scaleM(fArr, 0, 1.0f, 1.0f, 1.0f);
        }
        if (this.f429540p) {
            android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        }
        if (this.f429530f == 5) {
            i(this.f429527c / this.f429528d, this.f429525a / this.f429526b);
        }
        m();
        v();
    }

    public final void h() {
        int i17;
        int i18 = this.f429527c;
        if (i18 <= 0 || (i17 = this.f429528d) <= 0 || this.f429535k != null) {
            return;
        }
        this.f429535k = java.nio.ByteBuffer.allocateDirect(i18 * i17 * 4).order(java.nio.ByteOrder.nativeOrder());
    }

    public final void i(float f17, float f18) {
        float f19;
        float f27;
        float f28;
        float f29;
        if (f18 > f17) {
            float f37 = f18 / f17;
            f28 = -f37;
            f29 = f37;
            f19 = -1.0f;
            f27 = 1.0f;
        } else {
            float f38 = (-f17) / f18;
            f19 = f38;
            f27 = -f38;
            f28 = -1.0f;
            f29 = 1.0f;
        }
        android.opengl.Matrix.orthoM(this.f429536l, 0, f19, f27, f28, f29, 1.0f, -1.0f);
    }

    public void j(boolean z17) {
        this.f429540p = z17;
    }

    public final java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f429527c);
        sb6.append(',');
        sb6.append(this.f429528d);
        return sb6.toString();
    }

    public final java.lang.String l() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f429525a);
        sb6.append(',');
        sb6.append(this.f429526b);
        return sb6.toString();
    }

    public void m() {
        float f17;
        float f18;
        float f19;
        if (this.f429530f == 2) {
            int i17 = this.f429538n;
            boolean z17 = i17 == 90 || i17 == 270;
            android.graphics.Point point = this.B;
            int i18 = point.x;
            android.graphics.Point point2 = this.A;
            int i19 = i18 - point2.x;
            int i27 = point2.y - point.y;
            int i28 = z17 ? i27 : i19;
            if (!z17) {
                i19 = i27;
            }
            int i29 = this.f429527c;
            float f27 = i28;
            float f28 = i29 / f27;
            int i37 = this.f429528d;
            float f29 = i19;
            float f37 = i37 / f29;
            float f38 = 0.0f;
            if (f28 < f37) {
                f19 = 0.0f;
                f38 = f27 - (i29 / f37);
            } else {
                f19 = f28 > f37 ? f29 - (i37 / f28) : 0.0f;
            }
            this.f429548x = i28 - ((int) f38);
            this.f429549y = i19 - ((int) f19);
        }
        java.nio.FloatBuffer floatBuffer = this.f429531g;
        floatBuffer.position(0);
        floatBuffer.put(qs0.b.f447741a.a(this.f429530f, this.f429525a, this.f429526b, this.A, this.B, this.f429538n, this.f429527c, this.f429528d, this.f429541q));
        floatBuffer.position(0);
        java.nio.FloatBuffer floatBuffer2 = this.f429532h;
        floatBuffer2.position(0);
        int i38 = this.f429530f;
        android.graphics.Point textureValidLTPoint = this.A;
        android.graphics.Point textureValidRBPoint = this.B;
        int i39 = this.f429538n;
        int i47 = this.f429527c;
        int i48 = this.f429528d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidLTPoint, "textureValidLTPoint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidRBPoint, "textureValidRBPoint");
        float[] copyOf = java.util.Arrays.copyOf(rs0.i.f480831c, 8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        float f39 = -1.0f;
        float f47 = 1.0f;
        if (i38 == 6) {
            boolean z18 = i39 == 90 || i39 == 270;
            int i49 = textureValidRBPoint.x - textureValidLTPoint.x;
            int i57 = textureValidLTPoint.y - textureValidRBPoint.y;
            int i58 = z18 ? i57 : i49;
            if (!z18) {
                i49 = i57;
            }
            float f48 = i47;
            float f49 = i58;
            float f57 = f48 / f49;
            float f58 = i48;
            float f59 = i49;
            float f66 = f58 / f59;
            if (f57 > f66) {
                float f67 = (((f57 - f66) * f49) * 1.0f) / f48;
                f18 = 1.0f - f67;
                f17 = f67 - 1.0f;
            } else {
                float f68 = (((f66 - f57) * f59) * 1.0f) / f58;
                f17 = -1.0f;
                f39 = f68 - 1.0f;
                f18 = 1.0f;
                f47 = 1.0f - f68;
            }
        } else {
            f17 = -1.0f;
            f18 = 1.0f;
        }
        copyOf[0] = f39;
        copyOf[1] = f17;
        copyOf[2] = f47;
        copyOf[3] = f17;
        copyOf[4] = f39;
        copyOf[5] = f18;
        copyOf[6] = f47;
        copyOf[7] = f18;
        floatBuffer2.put(copyOf);
        floatBuffer2.position(0);
    }

    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureRenderProc", hashCode() + " release renderOutputTexture:" + this.f429533i + ", renderOutputTextureFbo:" + this.f429534j + ", drawWidth:" + this.f429527c + ", drawHeight:" + this.f429528d);
        is0.c cVar = this.f429533i;
        if (cVar != null) {
            cVar.close();
        }
        is0.a aVar = this.f429534j;
        if (aVar != null) {
            aVar.close();
        }
    }

    public void o() {
        g();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        p();
        f();
    }

    public abstract void p();

    public void q(byte[] frame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
    }

    public void r(int i17) {
    }

    public void s(int i17) {
        this.f429538n = i17;
    }

    public final void t(int i17, int i18) {
        if (i17 != this.f429548x || i18 != this.f429549y) {
            this.f429550z.clear();
        }
        this.f429548x = i17;
        this.f429549y = i18;
    }

    public void u(int i17, int i18) {
        if (this.f429527c != i17 || this.f429528d != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLTextureRenderProc", "updateDrawViewSize: current width=" + this.f429527c + ", height=" + this.f429528d + ". new width=" + i17 + ", height=" + i18);
        }
        this.f429528d = i18;
        this.f429527c = i17;
        t(i17, i18);
        if (this.f429529e == 3) {
            h();
        }
    }

    public final void v() {
        if (this.f429529e == 2) {
            if (this.f429533i == null) {
                this.f429533i = is0.b.b(true, 3L);
                this.f429534j = is0.b.f375924a.a(3L);
            }
            rs0.i.f480829a.c(this.f429534j, this.f429533i, this.f429527c, this.f429528d);
        }
        android.opengl.GLES20.glViewport(0, 0, this.f429527c, this.f429528d);
        if (this.f429546v) {
            if (this.f429533i == null) {
                this.f429533i = is0.b.b(true, 3L);
                this.f429534j = is0.b.f375924a.a(3L);
            }
            rs0.i.f480829a.c(this.f429534j, this.f429533i, this.f429548x, this.f429549y);
            android.opengl.GLES20.glViewport(0, 0, this.f429548x, this.f429549y);
            int i17 = this.f429538n;
            if (i17 == 90 || i17 == 270) {
                android.opengl.Matrix.scaleM(this.f429536l, 0, -1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(this.f429536l, 0, 1.0f, -1.0f, 1.0f);
            }
            this.f429547w = true;
        }
    }

    public void w(int i17, int i18) {
        this.f429525a = i17;
        this.f429526b = i18;
        android.graphics.Point point = this.A;
        point.x = 0;
        point.y = i18;
        android.graphics.Point point2 = this.B;
        point2.x = i17;
        point2.y = 0;
    }
}
