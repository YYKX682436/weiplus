package u4;

/* loaded from: classes13.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f506075a = new android.graphics.Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f506076b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f506077c;

    /* renamed from: d, reason: collision with root package name */
    public float f506078d;

    /* renamed from: e, reason: collision with root package name */
    public float f506079e;

    public s(android.view.View view, float[] fArr) {
        this.f506076b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.f506077c = fArr2;
        this.f506078d = fArr2[2];
        this.f506079e = fArr2[5];
        a();
    }

    public final void a() {
        float f17 = this.f506078d;
        float[] fArr = this.f506077c;
        fArr[2] = f17;
        fArr[5] = this.f506079e;
        android.graphics.Matrix matrix = this.f506075a;
        matrix.setValues(fArr);
        u4.w1.a(this.f506076b, matrix);
    }
}
