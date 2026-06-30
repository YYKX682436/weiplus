package c43;

/* loaded from: classes2.dex */
public class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f119976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f119978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c43.x f119979g;

    public j0(c43.x xVar, long j17, boolean z17, int i17) {
        this.f119979g = xVar;
        this.f119976d = j17;
        this.f119977e = z17;
        this.f119978f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 11) {
            c43.x xVar = this.f119979g;
            gm0.j1.d().g(new v33.u(xVar.S, this.f119976d, this.f119977e));
            xVar.y(this.f119978f, 2);
        }
    }
}
