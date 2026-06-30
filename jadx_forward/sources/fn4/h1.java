package fn4;

/* loaded from: classes15.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f346083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn4.i1 f346084f;

    public h1(fn4.i1 i1Var, java.lang.String str, int i17) {
        this.f346084f = i1Var;
        this.f346082d = str;
        this.f346083e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.b bVar;
        fn4.i1 i1Var = this.f346084f;
        fn4.l1 l1Var = i1Var.f346090f;
        if (l1Var.f346106b == null || (bVar = l1Var.f346114j) == null) {
            return;
        }
        rm4.d dVar = bVar.o4().f346012f;
        if (dVar != null && dVar.f478997m == 0) {
            dVar.f478997m = java.lang.System.currentTimeMillis() - dVar.f478985a;
        }
        fn4.c1 c1Var = i1Var.f346090f.f346106b;
        java.lang.String str = this.f346082d;
        int i17 = this.f346083e;
        c1Var.o(str, i17);
        if (i17 != 0) {
            uu4.a.a(9);
        } else {
            uu4.a.a(27);
        }
    }
}
