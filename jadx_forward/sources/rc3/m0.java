package rc3;

/* loaded from: classes7.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f475562h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f475563i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float[] f475564m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float[] f475565n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(rc3.w0 w0Var, int i17, int i18, int i19, long j17, int[] iArr, float[] fArr, float[] fArr2) {
        super(0);
        this.f475558d = w0Var;
        this.f475559e = i17;
        this.f475560f = i18;
        this.f475561g = i19;
        this.f475562h = j17;
        this.f475563i = iArr;
        this.f475564m = fArr;
        this.f475565n = fArr2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475558d;
        java.lang.String str = w0Var.f475638z;
        int i17 = this.f475559e;
        int i18 = this.f475560f;
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.M1(i17, i18, this.f475561g, this.f475562h, this.f475563i, this.f475564m, this.f475565n);
        }
        return jz5.f0.f384359a;
    }
}
