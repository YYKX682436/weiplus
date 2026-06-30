package a50;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1516g;

    public n(a50.a0 a0Var, int i17, boolean z17, boolean z18) {
        this.f1513d = a0Var;
        this.f1514e = i17;
        this.f1515f = z17;
        this.f1516g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.g(new a50.m(this.f1513d, this.f1514e, this.f1515f, this.f1516g, e17));
        }
    }
}
