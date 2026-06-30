package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.MeteringPointFactory */
/* loaded from: classes14.dex */
public abstract class AbstractC0549x195d1fd3 {

    /* renamed from: mSurfaceAspectRatio */
    private android.util.Rational f1159xea299af3;

    public AbstractC0549x195d1fd3() {
        this(null);
    }

    /* renamed from: getDefaultPointSize */
    public static float m4695x710d8be6() {
        return 0.15f;
    }

    /* renamed from: convertPoint */
    public abstract android.graphics.PointF mo4381x2ce0df9d(float f17, float f18);

    /* renamed from: createPoint */
    public final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 m4696xe1bf01f4(float f17, float f18) {
        return m4697xe1bf01f4(f17, f18, m4695x710d8be6());
    }

    /* renamed from: setSurfaceAspectRatio */
    public void m4698x956223a8(android.util.Rational rational) {
        this.f1159xea299af3 = rational;
    }

    public AbstractC0549x195d1fd3(android.util.Rational rational) {
        this.f1159xea299af3 = rational;
    }

    /* renamed from: createPoint */
    public final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37 m4697xe1bf01f4(float f17, float f18, float f19) {
        android.graphics.PointF mo4381x2ce0df9d = mo4381x2ce0df9d(f17, f18);
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0548xb03aad37(mo4381x2ce0df9d.x, mo4381x2ce0df9d.y, f19, this.f1159xea299af3);
    }
}
