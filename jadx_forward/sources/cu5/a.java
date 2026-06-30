package cu5;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju5.h f304014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eu5.b f304015f;

    public a(android.content.Context context, ju5.h hVar, eu5.b bVar) {
        this.f304013d = context;
        this.f304014e = hVar;
        this.f304015f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ju5.n0 n0Var = new ju5.n0(this.f304013d, this.f304014e);
        n0Var.f383621a = this.f304015f;
        if (ju5.n.c().a(n0Var, new eu5.d())) {
            return;
        }
        zt5.h.b("Soter.SoterWrapperApi", "soter: add init task failed.", new java.lang.Object[0]);
    }
}
