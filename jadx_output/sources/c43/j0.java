package c43;

/* loaded from: classes2.dex */
public class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f38443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f38444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c43.x f38446g;

    public j0(c43.x xVar, long j17, boolean z17, int i17) {
        this.f38446g = xVar;
        this.f38443d = j17;
        this.f38444e = z17;
        this.f38445f = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 11) {
            c43.x xVar = this.f38446g;
            gm0.j1.d().g(new v33.u(xVar.S, this.f38443d, this.f38444e));
            xVar.y(this.f38445f, 2);
        }
    }
}
