package qn0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f446443a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f446444b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public boolean f446445c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f446446d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f446447e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PointF f446448f = new android.graphics.PointF();

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PointF f446449g = new android.graphics.PointF();

    /* renamed from: h, reason: collision with root package name */
    public int f446450h;

    /* renamed from: i, reason: collision with root package name */
    public float f446451i;

    /* renamed from: j, reason: collision with root package name */
    public float f446452j;

    /* renamed from: k, reason: collision with root package name */
    public float f446453k;

    /* renamed from: l, reason: collision with root package name */
    public float f446454l;

    /* renamed from: m, reason: collision with root package name */
    public float f446455m;

    /* renamed from: n, reason: collision with root package name */
    public float f446456n;

    /* renamed from: o, reason: collision with root package name */
    public float f446457o;

    /* renamed from: p, reason: collision with root package name */
    public float f446458p;

    /* renamed from: q, reason: collision with root package name */
    public float f446459q;

    /* renamed from: r, reason: collision with root package name */
    public int f446460r;

    /* renamed from: s, reason: collision with root package name */
    public int f446461s;

    public d() {
        this.f446443a = false;
        b();
        this.f446443a = true;
    }

    public final float a(float f17, float f18) {
        float f19 = this.f446444b[0];
        if (f19 * f18 < 1.0d) {
            return 0.0f;
        }
        float f27 = f19 - 1.0f;
        float f28 = f27 * f18;
        if (f17 > f28) {
            return f28;
        }
        float f29 = f27 * (-f18);
        return f17 < f29 ? f29 : f17;
    }

    public void b() {
        this.f446454l = 0.0f;
        this.f446455m = 0.0f;
        this.f446456n = 0.0f;
        this.f446457o = 0.0f;
        this.f446453k = 1.0f;
        this.f446458p = 1.0f;
        this.f446459q = 1.0f;
        this.f446451i = -1.0f;
        this.f446452j = -1.0f;
        this.f446448f.set(-1.0f, -1.0f);
        this.f446449g.set(-1.0f, -1.0f);
        android.opengl.Matrix.setIdentityM(this.f446444b, 0);
        this.f446445c = false;
        this.f446446d = false;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public final void c() {
        int i17;
        int i18 = this.f446460r;
        float[] fArr = this.f446444b;
        if (i18 <= 0 || (i17 = this.f446461s) <= 0) {
            android.opengl.Matrix.setIdentityM(fArr, 0);
            return;
        }
        float[] fArr2 = new float[16];
        float f17 = (this.f446454l / i18) * 2.0f;
        float f18 = ((-this.f446455m) / i17) * 2.0f;
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        android.opengl.Matrix.translateM(fArr2, 0, f17, f18, 0.0f);
        float[] fArr3 = this.f446444b;
        android.opengl.Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr3, 0);
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        float f19 = this.f446453k;
        android.opengl.Matrix.scaleM(fArr2, 0, f19, f19, 0.0f);
        float[] fArr4 = this.f446444b;
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr2, 0, fArr4, 0);
        float f27 = (this.f446456n / this.f446460r) * 2.0f;
        float f28 = ((-this.f446457o) / this.f446461s) * 2.0f;
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        android.opengl.Matrix.translateM(fArr2, 0, f27, f28, 0.0f);
        float[] fArr5 = this.f446444b;
        android.opengl.Matrix.multiplyMM(fArr5, 0, fArr2, 0, fArr5, 0);
        fArr[12] = a(fArr[12], this.f446458p);
        fArr[13] = a(fArr[13], this.f446459q);
        this.f446453k = 1.0f;
        this.f446454l = 0.0f;
        this.f446455m = 0.0f;
        this.f446456n = 0.0f;
        this.f446457o = 0.0f;
    }
}
