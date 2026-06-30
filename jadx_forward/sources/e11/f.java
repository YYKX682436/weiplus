package e11;

/* loaded from: classes15.dex */
public class f implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f327918d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f327919e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f327920f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f327921g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f327922h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f327923i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f327924m = false;

    public e11.f a(int i17, long j17, long j18, int i18) {
        long j19 = j18 - j17;
        if (this.f327922h == i18 && j19 <= e11.g.b() + 20000) {
            this.f327918d = i17;
            if (this.f327920f <= 0) {
                this.f327920f = j17;
                this.f327919e = c01.id.a();
            }
            this.f327921g = j18;
            this.f327922h = i18;
            return null;
        }
        e11.f fVar = new e11.f();
        fVar.f327918d = i17;
        fVar.f327920f = j17;
        fVar.f327921g = j18;
        fVar.f327922h = i18;
        if (this.f327922h != i18) {
            fVar.f327924m = true;
        }
        if (j19 > e11.g.b() + 20000) {
            fVar.f327923i = false;
        }
        return fVar;
    }

    /* renamed from: toString */
    public java.lang.String m126702x9616526c() {
        return java.lang.String.format("pid:%s,startServerTime:%s,startTime:%s,endTime:%s,normalExecute:%s,changedNetworkStatus:%s,networkStatus:%s", java.lang.Integer.valueOf(this.f327918d), e11.b.c(this.f327919e), e11.b.c(this.f327920f), e11.b.c(this.f327921g), java.lang.Boolean.valueOf(this.f327923i), java.lang.Boolean.valueOf(this.f327924m), java.lang.Integer.valueOf(this.f327922h));
    }
}
