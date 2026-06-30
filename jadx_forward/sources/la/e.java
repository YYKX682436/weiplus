package la;

/* loaded from: classes15.dex */
public class e extends la.f {

    /* renamed from: b, reason: collision with root package name */
    public float f398982b;

    /* renamed from: c, reason: collision with root package name */
    public float f398983c;

    @Override // la.f
    public void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.f398984a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f398982b, this.f398983c);
        path.transform(matrix);
    }
}
