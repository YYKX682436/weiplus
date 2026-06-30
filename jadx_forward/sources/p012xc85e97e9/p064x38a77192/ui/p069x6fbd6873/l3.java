package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f92161a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Matrix f92162b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Matrix f92163c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f92164d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f92165e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92166f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92167g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f92168h;

    public l3(yz5.p getMatrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getMatrix, "getMatrix");
        this.f92161a = getMatrix;
        this.f92166f = true;
        this.f92167g = true;
        this.f92168h = true;
    }

    public final float[] a(java.lang.Object obj) {
        float[] fArr = this.f92165e;
        if (fArr == null) {
            fArr = e1.j0.a(null, 1, null);
            this.f92165e = fArr;
        }
        if (this.f92167g) {
            this.f92168h = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j3.a(b(obj), fArr);
            this.f92167g = false;
        }
        if (this.f92168h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(java.lang.Object obj) {
        float[] fArr = this.f92164d;
        if (fArr == null) {
            fArr = e1.j0.a(null, 1, null);
            this.f92164d = fArr;
        }
        if (!this.f92166f) {
            return fArr;
        }
        android.graphics.Matrix matrix = this.f92162b;
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            this.f92162b = matrix;
        }
        this.f92161a.mo149xb9724478(obj, matrix);
        android.graphics.Matrix matrix2 = this.f92163c;
        if (matrix2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(matrix, matrix2)) {
            e1.f.a(fArr, matrix);
            this.f92162b = matrix2;
            this.f92163c = matrix;
        }
        this.f92166f = false;
        return fArr;
    }

    public final void c() {
        this.f92166f = true;
        this.f92167g = true;
    }
}
