package k41;

/* loaded from: classes11.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f385532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f385533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f385535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.gk3 f385536i;

    public g1(java.lang.String str, int i17, int i18, java.lang.String str2, k41.g0 g0Var, r45.gk3 gk3Var) {
        this.f385531d = str;
        this.f385532e = i17;
        this.f385533f = i18;
        this.f385534g = str2;
        this.f385535h = g0Var;
        this.f385536i = gk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k41.h1.f385542f.remove(this.f385531d);
        java.util.ArrayList arrayList = (java.util.ArrayList) k41.h1.f385543g.remove(this.f385531d);
        ((ku5.t0) ku5.t0.f394148d).B(new k41.f1(arrayList, this.f385532e, this.f385533f, this.f385534g, this.f385535h, this.f385536i));
    }
}
