package l95;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: GetHeight */
    public static final int f72769x93c1d3fd = 1;

    /* renamed from: GetWidth */
    public static final int f72770x79363830 = 0;

    /* renamed from: Render */
    public static final int f72771x91b02db6 = 2;

    /* renamed from: done */
    public static void m145409x2f2382(android.os.Looper looper) {
        if (looper != null) {
            l95.a aVar = l95.b.f398946a;
            synchronized (l95.b.class) {
                l95.b.f398946a.b(looper);
                l95.b.f398947b.b(looper);
                l95.b.f398948c.b(looper);
                l95.b.f398949d.b(looper);
            }
        }
    }

    /* renamed from: getHeight */
    public static int m145410x1c4fb41d(l95.c cVar) {
        return cVar.mo43368x913c4840(1, new java.lang.Object[0]);
    }

    /* renamed from: getWidth */
    public static int m145411x755bd410(l95.c cVar) {
        return cVar.mo43368x913c4840(0, new java.lang.Object[0]);
    }

    /* renamed from: instanceMatrix */
    public static android.graphics.Matrix m145412xe5ca94b6(android.os.Looper looper) {
        android.graphics.Matrix matrix;
        l95.a aVar = l95.b.f398946a;
        synchronized (l95.b.class) {
            l95.a aVar2 = l95.b.f398948c;
            matrix = (android.graphics.Matrix) aVar2.a(looper);
            if (matrix == null) {
                matrix = new android.graphics.Matrix();
            } else {
                matrix.reset();
            }
            aVar2.c(looper, matrix);
        }
        return matrix;
    }

    /* renamed from: instanceMatrixArray */
    public static float[] m145413xf00d6f43(android.os.Looper looper) {
        float[] fArr;
        l95.a aVar = l95.b.f398946a;
        synchronized (l95.b.class) {
            l95.a aVar2 = l95.b.f398947b;
            fArr = (float[]) aVar2.a(looper);
            if (fArr == null) {
                fArr = new float[9];
            } else {
                java.lang.System.arraycopy(l95.b.f398950e, 0, fArr, 0, 9);
            }
            aVar2.c(looper, fArr);
        }
        return fArr;
    }

    /* renamed from: instancePaint */
    public static android.graphics.Paint m145415xacbd08c9(android.os.Looper looper) {
        return l95.b.a(looper, null);
    }

    /* renamed from: instancePath */
    public static android.graphics.Path m145417xd4061a5a(android.os.Looper looper) {
        return l95.b.b(looper, null);
    }

    /* renamed from: render */
    public static void m145418xc84b4196(l95.c cVar, android.graphics.Canvas canvas, android.os.Looper looper) {
        cVar.mo43368x913c4840(2, canvas, looper);
    }

    /* renamed from: setMatrixFloatArray */
    public static float[] m145419x1d8aec80(float[] fArr, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39) {
        if (fArr != null) {
            fArr[0] = f17;
            fArr[1] = f18;
            fArr[2] = f19;
            fArr[3] = f27;
            fArr[4] = f28;
            fArr[5] = f29;
            fArr[6] = f37;
            fArr[7] = f38;
            fArr[8] = f39;
        }
        return fArr;
    }

    /* renamed from: doCommand */
    public abstract int mo43368x913c4840(int i17, java.lang.Object... objArr);

    /* renamed from: instancePaint */
    public static android.graphics.Paint m145414xacbd08c9(android.graphics.Paint paint, android.os.Looper looper) {
        return l95.b.a(looper, paint);
    }

    /* renamed from: instancePath */
    public static android.graphics.Path m145416xd4061a5a(android.graphics.Path path, android.os.Looper looper) {
        return l95.b.b(looper, path);
    }
}
