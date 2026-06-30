package mi1;

/* loaded from: classes7.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f408213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f408214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f408215f;

    public r2(mi1.n2 n2Var, int i17, boolean z17) {
        this.f408215f = n2Var;
        this.f408213d = i17;
        this.f408214e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        mi1.n2 n2Var = this.f408215f;
        int i17 = this.f408213d;
        n2Var.f408172i = i17;
        if (n2Var.a()) {
            mi1.g gVar = (mi1.g) n2Var.f408175o;
            gVar.f408091h = i17;
            if (gVar.p()) {
                return;
            }
            gVar.f408089f.f(i17, this.f408214e);
        }
    }
}
