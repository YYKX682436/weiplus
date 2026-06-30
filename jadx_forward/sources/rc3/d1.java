package rc3;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f475499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float[] f475501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float[] f475502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f475503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f475504i;

    public d1(rc3.f1 f1Var, int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.f475499d = f1Var;
        this.f475500e = i17;
        this.f475501f = fArr;
        this.f475502g = fArr2;
        this.f475503h = fArr3;
        this.f475504i = fArr4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc3.k1 k1Var;
        rc3.f1 f1Var = this.f475499d;
        java.lang.String str = (java.lang.String) f1Var.f475526n.get(java.lang.Integer.valueOf(this.f475500e));
        if (str == null || (k1Var = (sc3.k1) f1Var.f475521f.mo146xb9724478(str)) == null) {
            return;
        }
        k1Var.H0().Bi(this.f475500e, this.f475501f, this.f475502g, this.f475503h, this.f475504i);
    }
}
