package fn4;

/* loaded from: classes15.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f346040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f346041g;

    public f1(fn4.i1 i1Var, java.lang.String str, long j17, long j18) {
        this.f346041g = i1Var;
        this.f346038d = str;
        this.f346039e = j17;
        this.f346040f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.c1 c1Var = this.f346041g.f346090f.f346106b;
        if (c1Var != null) {
            c1Var.mo48220x9bb59ea0(this.f346038d, this.f346039e, this.f346040f);
        }
    }
}
