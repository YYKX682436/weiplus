package qn0;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: u, reason: collision with root package name */
    public static final float f446422u = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f446425c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f446426d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f446427e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f446428f;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.GestureDetector f446430h;

    /* renamed from: l, reason: collision with root package name */
    public android.hardware.SensorEventListener f446434l;

    /* renamed from: q, reason: collision with root package name */
    public int f446439q;

    /* renamed from: r, reason: collision with root package name */
    public int f446440r;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f446423a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f446424b = new float[16];

    /* renamed from: g, reason: collision with root package name */
    public boolean f446429g = false;

    /* renamed from: i, reason: collision with root package name */
    public float f446431i = 35.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f446432j = 35.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f446433k = false;

    /* renamed from: m, reason: collision with root package name */
    public float f446435m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f446436n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public float f446437o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f446438p = -1.0f;

    /* renamed from: s, reason: collision with root package name */
    public float f446441s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    public float f446442t = 0.0f;

    public c(android.content.Context context) {
        float[] fArr = new float[16];
        this.f446425c = fArr;
        float[] fArr2 = new float[16];
        this.f446426d = fArr2;
        float[] fArr3 = new float[16];
        this.f446427e = fArr3;
        float[] fArr4 = new float[16];
        this.f446428f = fArr4;
        this.f446430h = null;
        android.opengl.Matrix.setIdentityM(fArr4, 0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        android.opengl.Matrix.frustumM(fArr3, 0, -1.0f, 1.0f, -1.0f, 1.0f, 1.4f, 500.0f);
        this.f446430h = new android.view.GestureDetector(context, new qn0.a(this));
    }

    public static float a(float f17, float f18, float f19, float f27) {
        return (float) java.lang.Math.sqrt(java.lang.Math.pow(f17 - f19, 2.0d) + java.lang.Math.pow(f18 - f27, 2.0d));
    }
}
