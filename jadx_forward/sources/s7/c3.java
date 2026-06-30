package s7;

/* loaded from: classes16.dex */
public class c3 extends s7.d3 {

    /* renamed from: a, reason: collision with root package name */
    public float f485151a;

    /* renamed from: b, reason: collision with root package name */
    public final float f485152b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f485153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f485154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(s7.f3 f3Var, float f17, float f18) {
        super(f3Var, null);
        this.f485154d = f3Var;
        this.f485153c = new android.graphics.RectF();
        this.f485151a = f17;
        this.f485152b = f18;
    }

    @Override // s7.d3
    public boolean a(s7.l2 l2Var) {
        if (!(l2Var instanceof s7.m2)) {
            return true;
        }
        s7.m2 m2Var = (s7.m2) l2Var;
        s7.a2 h17 = l2Var.f485118a.h(m2Var.f485257n);
        if (h17 == null) {
            java.lang.String.format("TextPath path reference '%s' not found", m2Var.f485257n);
            return false;
        }
        s7.z0 z0Var = (s7.z0) h17;
        android.graphics.Path path = new s7.x2(z0Var.f485441o).f485424a;
        android.graphics.Matrix matrix = z0Var.f485298n;
        if (matrix != null) {
            path.transform(matrix);
        }
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        this.f485153c.union(rectF);
        return false;
    }

    @Override // s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f485154d;
        if (f3Var.W()) {
            android.graphics.Rect rect = new android.graphics.Rect();
            f3Var.f485190d.f485130d.getTextBounds(str, 0, str.length(), rect);
            android.graphics.RectF rectF = new android.graphics.RectF(rect);
            rectF.offset(this.f485151a, this.f485152b);
            this.f485153c.union(rectF);
        }
        this.f485151a += f3Var.f485190d.f485130d.measureText(str);
    }
}
