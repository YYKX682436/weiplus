package fn4;

/* loaded from: classes15.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f346069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f346070g;

    public g1(fn4.i1 i1Var, java.lang.String str, long j17, long j18) {
        this.f346070g = i1Var;
        this.f346067d = str;
        this.f346068e = j17;
        this.f346069f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.i1 i1Var = this.f346070g;
        fn4.c1 c1Var = i1Var.f346090f.f346106b;
        if (c1Var != null) {
            c1Var.f(this.f346067d, this.f346068e, this.f346069f);
        }
        long j17 = this.f346068e;
        long j18 = (100 * j17) / this.f346069f;
        i1Var.f346090f.getClass();
        if (j18 >= 50 || j17 > 5242880) {
            i1Var.a();
        }
    }
}
