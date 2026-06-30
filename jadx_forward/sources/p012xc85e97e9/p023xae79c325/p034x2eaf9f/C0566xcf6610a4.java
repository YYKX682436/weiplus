package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.SurfaceOrientedMeteringPointFactory */
/* loaded from: classes14.dex */
public class C0566xcf6610a4 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0549x195d1fd3 {

    /* renamed from: mHeight */
    private final float f1215x6a4b7f4;

    /* renamed from: mWidth */
    private final float f1216xbefb7959;

    public C0566xcf6610a4(float f17, float f18) {
        this.f1216xbefb7959 = f17;
        this.f1215x6a4b7f4 = f18;
    }

    /* renamed from: getUseCaseAspectRatio */
    private static android.util.Rational m4766x10cf46b2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        if (abstractC0580x5a5e3137 == null) {
            return null;
        }
        android.util.Size m4810x59ee93f = abstractC0580x5a5e3137.m4810x59ee93f();
        if (m4810x59ee93f != null) {
            return new android.util.Rational(m4810x59ee93f.getWidth(), m4810x59ee93f.getHeight());
        }
        throw new java.lang.IllegalStateException("UseCase " + abstractC0580x5a5e3137 + " is not bound.");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0549x195d1fd3
    /* renamed from: convertPoint */
    public android.graphics.PointF mo4381x2ce0df9d(float f17, float f18) {
        return new android.graphics.PointF(f17 / this.f1216xbefb7959, f18 / this.f1215x6a4b7f4);
    }

    public C0566xcf6610a4(float f17, float f18, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        super(m4766x10cf46b2(abstractC0580x5a5e3137));
        this.f1216xbefb7959 = f17;
        this.f1215x6a4b7f4 = f18;
    }
}
