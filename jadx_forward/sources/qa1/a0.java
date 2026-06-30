package qa1;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f442493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f442494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceHolder f442495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f442496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qa1.o f442497h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f442498i;

    public a0(qa1.f0 f0Var, int i17, int i18, android.view.SurfaceHolder surfaceHolder, int i19, qa1.o oVar) {
        this.f442498i = f0Var;
        this.f442493d = i17;
        this.f442494e = i18;
        this.f442495f = surfaceHolder;
        this.f442496g = i19;
        this.f442497h = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.f0 f0Var = this.f442498i;
        ms0.c cVar = f0Var.f442521i;
        int i17 = this.f442494e;
        int i18 = this.f442493d;
        if (cVar != null) {
            cVar.t(i18, i17);
            f0Var.f442521i.u(i18, i17);
        }
        f0Var.f442523n.getAndSet(true);
        f0Var.getClass();
        f0Var.f442516d.d(this.f442495f, this.f442496g, i18, i17);
        f0Var.f442516d.b(this.f442497h);
    }
}
