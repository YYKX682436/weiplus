package w9;

/* loaded from: classes13.dex */
public class f extends android.util.Property {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f525575a;

    public f() {
        super(android.graphics.Matrix.class, "imageMatrixProperty");
        this.f525575a = new android.graphics.Matrix();
    }

    @Override // android.util.Property
    public java.lang.Object get(java.lang.Object obj) {
        android.graphics.Matrix matrix = this.f525575a;
        matrix.set(((android.widget.ImageView) obj).getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        ((android.widget.ImageView) obj).setImageMatrix((android.graphics.Matrix) obj2);
    }
}
