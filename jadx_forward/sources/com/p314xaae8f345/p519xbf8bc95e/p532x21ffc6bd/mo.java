package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mo {

    /* renamed from: a, reason: collision with root package name */
    public static final long f131964a = 20;

    /* renamed from: b, reason: collision with root package name */
    public static int f131965b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f131966c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f131967d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f131968e = 2;

    static {
        long maxMemory = java.lang.Runtime.getRuntime().maxMemory();
        if (maxMemory <= 16777216) {
            f131965b = 1;
        } else if (maxMemory >= 67108864) {
            f131965b = 2;
        } else {
            f131965b = 0;
        }
    }

    public static double a(double d17, double d18, long j17, long j18) {
        return ((d18 - d17) * (j18 / j17)) + d17;
    }

    public static double b(double d17, double d18, long j17, long j18) {
        double d19 = j18 / j17;
        return ((d18 - d17) * d19 * d19) + d17;
    }

    public static double c(double d17, double d18, long j17, long j18) {
        double d19 = (j18 / j17) - 1.0d;
        return ((d18 - d17) * (1.0d - (d19 * d19))) + d17;
    }

    public static double d(double d17, double d18, long j17, long j18) {
        double d19 = j18 / j17;
        double d27 = d19 * d19;
        double d28 = d27 * d27;
        return ((d18 - d17) * d28 * d28) + d17;
    }

    public static double e(double d17, double d18, long j17, long j18) {
        double d19 = (j18 / j17) - 1.0d;
        double d27 = d19 * d19;
        double d28 = d27 * d27;
        return ((d18 - d17) * (1.0d - (d28 * d28))) + d17;
    }

    private static double f(double d17, double d18, long j17, long j18) {
        double d19 = j18 / j17;
        return ((d18 - d17) * d19 * d19 * d19 * d19) + d17;
    }

    private static double g(double d17, double d18, long j17, long j18) {
        double d19 = (j18 / j17) - 1.0d;
        return ((d18 - d17) * (1.0d - (((d19 * d19) * d19) * d19))) + d17;
    }

    private static double h(double d17, double d18, long j17, long j18) {
        double d19 = j18 / (j17 - 1);
        double d27 = d19 * d19;
        return ((d17 - d18) * (1.0d - (d27 * d27))) + d18;
    }

    private static boolean a() {
        return f131965b == 1;
    }

    private static java.nio.ShortBuffer b(int i17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17 * 2);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.rewind();
        return asShortBuffer;
    }

    private static float[] c(int i17) {
        return new float[]{((i17 >> 16) & 255) / 255.0f, ((i17 >> 8) & 255) / 255.0f, (i17 & 255) / 255.0f, ((i17 >> 24) & 255) / 255.0f};
    }

    private static java.nio.FloatBuffer a(float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    private static java.nio.FloatBuffer a(int i17) {
        java.nio.ByteBuffer allocateDirect;
        java.nio.ByteBuffer.allocate(0);
        int i18 = i17 * 4;
        try {
            allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
        } catch (java.lang.OutOfMemoryError unused) {
            allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
        }
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    private static java.nio.FloatBuffer a(float[] fArr, java.nio.FloatBuffer floatBuffer) {
        int length = fArr.length;
        if (floatBuffer == null || floatBuffer.capacity() != length) {
            floatBuffer = a(length);
        }
        floatBuffer.put(fArr);
        floatBuffer.rewind();
        return floatBuffer;
    }

    private static java.nio.ShortBuffer a(short[] sArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.put(sArr);
        asShortBuffer.rewind();
        return asShortBuffer;
    }

    private static java.nio.ShortBuffer a(short[] sArr, java.nio.ShortBuffer shortBuffer) {
        int length = sArr.length;
        if (shortBuffer == null || shortBuffer.capacity() != length) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(length * 2);
            allocateDirect.order(java.nio.ByteOrder.nativeOrder());
            shortBuffer = allocateDirect.asShortBuffer();
            shortBuffer.rewind();
        }
        shortBuffer.put(sArr);
        shortBuffer.rewind();
        return shortBuffer;
    }

    private static int a(javax.microedition.khronos.opengles.GL10 gl10, android.graphics.Bitmap bitmap) {
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        gl10.glBindTexture(3553, i17);
        gl10.glTexParameterf(3553, 10241, 9729.0f);
        gl10.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        return i17;
    }

    private static android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = 2;
        int i18 = 2;
        while (i18 < width) {
            i18 <<= 1;
        }
        while (i17 < height) {
            i17 <<= 1;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(false);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i18, i17, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        createBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    private static int a(float f17) {
        int i17 = 1;
        while (true) {
            int i18 = i17 + 1;
            int i19 = 2 << i17;
            if (i19 >= ((int) java.lang.Math.ceil(f17))) {
                return i19;
            }
            i17 = i18;
        }
    }
}
