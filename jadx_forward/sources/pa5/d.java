package pa5;

/* loaded from: classes3.dex */
public final class d extends u3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f434630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f434631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float[] f434632c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float[] f434633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f434634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, float[] fArr, float[] fArr2, float[] fArr3, yz5.p pVar) {
        super("matrixProgress");
        this.f434630a = e0Var;
        this.f434631b = fArr;
        this.f434632c = fArr2;
        this.f434633d = fArr3;
        this.f434634e = pVar;
    }

    @Override // u3.t
    public float a(java.lang.Object obj) {
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        return this.f434630a.f391648d;
    }

    @Override // u3.t
    public void b(java.lang.Object obj, float f17) {
        float[] fArr;
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f434630a;
        e0Var.f391648d = e17;
        int i17 = 0;
        while (true) {
            fArr = this.f434631b;
            if (i17 >= 9) {
                break;
            }
            float f18 = this.f434632c[i17];
            fArr[i17] = f18 + ((this.f434633d[i17] - f18) * e0Var.f391648d);
            i17++;
        }
        matrix.setValues(fArr);
        yz5.p pVar = this.f434634e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Float.valueOf(f17), matrix);
        }
    }
}
