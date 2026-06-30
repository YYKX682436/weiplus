package ap5;

/* loaded from: classes14.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public int f94332a;

    /* renamed from: b, reason: collision with root package name */
    public int f94333b;

    /* renamed from: c, reason: collision with root package name */
    public int f94334c;

    /* renamed from: d, reason: collision with root package name */
    public int f94335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f94336e;

    /* renamed from: f, reason: collision with root package name */
    public final java.nio.FloatBuffer f94337f;

    /* renamed from: g, reason: collision with root package name */
    public final java.nio.FloatBuffer f94338g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f94339h;

    /* renamed from: i, reason: collision with root package name */
    public int f94340i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f94341j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Point f94342k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Point f94343l;

    public b(int i17, int i18, int i19, int i27, int i28) {
        this.f94332a = i17;
        this.f94333b = i18;
        this.f94334c = i19;
        this.f94335d = i27;
        this.f94336e = i28;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.f94337f = asFloatBuffer;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.f94338g = asFloatBuffer2;
        this.f94339h = new float[16];
        this.f94342k = new android.graphics.Point(0, this.f94333b);
        this.f94343l = new android.graphics.Point(this.f94332a, 0);
    }

    public void a() {
        android.opengl.GLES20.glUseProgram(0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    public void b() {
        float f17;
        float f18;
        float f19;
        float f27;
        int i17;
        float f28;
        float f29;
        float f37;
        float f38;
        float f39;
        float f47;
        float f48;
        float[] fArr = this.f94339h;
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.setRotateM(this.f94339h, 0, this.f94340i, 0.0f, 0.0f, -1.0f);
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, 1.0f, 1.0f);
        if (this.f94341j) {
            int i18 = this.f94340i;
            if (i18 == 90 || i18 == 270) {
                android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
            } else {
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        int i19 = this.f94336e;
        if (i19 == 5) {
            float f49 = this.f94334c / this.f94335d;
            float f57 = this.f94332a / this.f94333b;
            if (f57 > f49) {
                float f58 = f57 / f49;
                f48 = 1.0f;
                f47 = -1.0f;
                f39 = -f58;
                f38 = f58;
            } else {
                float f59 = (-f49) / f57;
                f38 = 1.0f;
                f39 = -1.0f;
                f47 = f59;
                f48 = -f59;
            }
            android.opengl.Matrix.orthoM(this.f94339h, 0, f47, f48, f39, f38, 1.0f, -1.0f);
        }
        java.nio.FloatBuffer floatBuffer = this.f94337f;
        floatBuffer.position(0);
        int i27 = this.f94332a;
        int i28 = this.f94333b;
        android.graphics.Point textureValidLTPoint = this.f94342k;
        android.graphics.Point textureValidRBPoint = this.f94343l;
        int i29 = this.f94340i;
        int i37 = this.f94334c;
        int i38 = this.f94335d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidLTPoint, "textureValidLTPoint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidRBPoint, "textureValidRBPoint");
        float[] copyOf = java.util.Arrays.copyOf(ap5.e.f94357a, 8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        float f66 = i27;
        float f67 = 1;
        float f68 = i28;
        android.graphics.RectF rectF = new android.graphics.RectF(textureValidLTPoint.x / f66, (textureValidLTPoint.y - f67) / f68, (textureValidRBPoint.x - f67) / f66, textureValidRBPoint.y / f68);
        float f69 = rectF.left;
        float f76 = rectF.top;
        float f77 = rectF.right;
        float f78 = rectF.bottom;
        if (i19 == 2) {
            boolean z17 = i29 == 90 || i29 == 270;
            int i39 = textureValidRBPoint.x - textureValidLTPoint.x;
            int i47 = textureValidLTPoint.y - textureValidRBPoint.y;
            int i48 = z17 ? i47 : i39;
            if (!z17) {
                i39 = i47;
            }
            float f79 = i37;
            float f86 = i48;
            float f87 = f79 / f86;
            float f88 = i38;
            float f89 = i39;
            float f96 = f88 / f89;
            float f97 = 0.0f;
            if (f87 < f96) {
                f97 = f86 - (f79 / f96);
                f28 = 0.0f;
            } else {
                f28 = f87 > f96 ? f89 - (f88 / f87) : 0.0f;
            }
            if (z17) {
                f37 = (f28 / 2.0f) / f89;
                f29 = (f97 / 2.0f) / f86;
            } else {
                float f98 = (f97 / 2.0f) / f86;
                f29 = (f28 / 2.0f) / f89;
                f37 = f98;
            }
            f69 += f37;
            f77 -= f37;
            f78 += f29;
            f76 -= f29;
        }
        copyOf[0] = f69;
        copyOf[1] = f76;
        copyOf[2] = f77;
        copyOf[3] = f76;
        copyOf[4] = f69;
        copyOf[5] = f78;
        copyOf[6] = f77;
        copyOf[7] = f78;
        floatBuffer.put(copyOf);
        floatBuffer.position(0);
        java.nio.FloatBuffer floatBuffer2 = this.f94338g;
        floatBuffer2.position(0);
        android.graphics.Point textureValidLTPoint2 = this.f94342k;
        android.graphics.Point textureValidRBPoint2 = this.f94343l;
        int i49 = this.f94340i;
        int i57 = this.f94334c;
        int i58 = this.f94335d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidLTPoint2, "textureValidLTPoint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureValidRBPoint2, "textureValidRBPoint");
        float[] copyOf2 = java.util.Arrays.copyOf(ap5.e.f94358b, 8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf2, "copyOf(...)");
        if (i19 == 6) {
            boolean z18 = i49 == 90 || i49 == 270;
            int i59 = textureValidRBPoint2.x - textureValidLTPoint2.x;
            int i66 = textureValidLTPoint2.y - textureValidRBPoint2.y;
            int i67 = z18 ? i66 : i59;
            if (!z18) {
                i59 = i66;
            }
            float f99 = i57;
            float f100 = i67;
            float f101 = f99 / f100;
            float f102 = i58;
            float f103 = i59;
            float f104 = f102 / f103;
            if (f101 <= f104) {
                float f105 = (((f104 - f101) * f103) * 1.0f) / f102;
                i17 = 0;
                f18 = f105 - 1.0f;
                f19 = 1.0f;
                f17 = 1.0f - f105;
                f27 = -1.0f;
                copyOf2[i17] = f18;
                copyOf2[1] = f27;
                copyOf2[2] = f17;
                copyOf2[3] = f27;
                copyOf2[4] = f18;
                copyOf2[5] = f19;
                copyOf2[6] = f17;
                copyOf2[7] = f19;
                floatBuffer2.put(copyOf2);
                floatBuffer2.position(i17);
                android.opengl.GLES20.glViewport(i17, i17, this.f94334c, this.f94335d);
                c();
                a();
            }
            float f106 = (f101 - f104) * f100;
            f17 = 1.0f;
            float f107 = (f106 * 1.0f) / f99;
            f19 = 1.0f - f107;
            f18 = -1.0f;
            f27 = f107 - 1.0f;
        } else {
            f17 = 1.0f;
            f18 = -1.0f;
            f19 = 1.0f;
            f27 = -1.0f;
        }
        i17 = 0;
        copyOf2[i17] = f18;
        copyOf2[1] = f27;
        copyOf2[2] = f17;
        copyOf2[3] = f27;
        copyOf2[4] = f18;
        copyOf2[5] = f19;
        copyOf2[6] = f17;
        copyOf2[7] = f19;
        floatBuffer2.put(copyOf2);
        floatBuffer2.position(i17);
        android.opengl.GLES20.glViewport(i17, i17, this.f94334c, this.f94335d);
        c();
        a();
    }

    public abstract void c();

    public void d(int i17, int i18) {
        this.f94332a = i17;
        this.f94333b = i18;
        android.graphics.Point point = this.f94342k;
        point.x = 0;
        point.y = i18;
        android.graphics.Point point2 = this.f94343l;
        point2.x = i17;
        point2.y = 0;
    }
}
