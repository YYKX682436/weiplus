package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f10628a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Matrix f10629b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Matrix f10630c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f10631d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f10632e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10633f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10634g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10635h;

    public l3(yz5.p getMatrix) {
        kotlin.jvm.internal.o.g(getMatrix, "getMatrix");
        this.f10628a = getMatrix;
        this.f10633f = true;
        this.f10634g = true;
        this.f10635h = true;
    }

    public final float[] a(java.lang.Object obj) {
        float[] fArr = this.f10632e;
        if (fArr == null) {
            fArr = e1.j0.a(null, 1, null);
            this.f10632e = fArr;
        }
        if (this.f10634g) {
            this.f10635h = androidx.compose.ui.platform.j3.a(b(obj), fArr);
            this.f10634g = false;
        }
        if (this.f10635h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(java.lang.Object obj) {
        float[] fArr = this.f10631d;
        if (fArr == null) {
            fArr = e1.j0.a(null, 1, null);
            this.f10631d = fArr;
        }
        if (!this.f10633f) {
            return fArr;
        }
        android.graphics.Matrix matrix = this.f10629b;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.f10629b = matrix;
        }
        this.f10628a.invoke(obj, matrix);
        android.graphics.Matrix matrix2 = this.f10630c;
        if (matrix2 == null || !kotlin.jvm.internal.o.b(matrix, matrix2)) {
            e1.f.a(fArr, matrix);
            this.f10629b = matrix2;
            this.f10630c = matrix;
        }
        this.f10633f = false;
        return fArr;
    }

    public final void c() {
        this.f10633f = true;
        this.f10634g = true;
    }
}
